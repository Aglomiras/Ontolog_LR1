package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

import java.util.List;

public class PowerTransformer {
    public static RdfResource convert(String id, RawEquipmentNodeDto valueSet) {

        List<RawEquipmentNodeDto.PortDto> ports = valueSet.getPorts();

        for (int i = 0; i < ports.size(); i++) {
            System.out.println(Terminal.convert(id, i + 1, valueSet));
        }

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.powerTransformer)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addDataProperty(CIMClasses.identifiedObject.name, valueSet.getName())
                .addDataProperty(CIMClasses.powerTransformer.isPartOfGeneratorUnit, "false")
                .addDataProperty(CIMClasses.transformerEnd.magBaseU,
                        valueSet.getFields().get(FieldLibId.MAGNETIZATION_VOLTAGE))
                .addDataProperty(CIMClasses.transformerEnd.bmagSat,
                        valueSet.getFields().get(FieldLibId.AIR_CORE_RESISTANCE))
                .addDataProperty(CIMClasses.transformerEnd.magSatFlux,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.SATURATION_COEFFICIENT)) * 100))
                .addObjectProperty(CIMClasses.conductingEquipment.BaseVoltage, new RDFResourcesId())
                .addObjectProperty(CIMClasses.equipment.EquipmentContainer, new RDFResourcesId())
                .builder();
    }
}
