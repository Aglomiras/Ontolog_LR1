package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

import java.util.List;

public class ACLineSegment {
    public static RdfResource convert(String id, RawEquipmentNodeDto valueSet) {

        List<RawEquipmentNodeDto.PortDto> ports = valueSet.getPorts();

        for (int i = 0; i < ports.size(); i++) {
            System.out.println(Terminal.convert(id, i + 1, valueSet));
        }

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.acLineSegment)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addDataProperty(CIMClasses.identifiedObject.name, valueSet.getName())
                .addDataProperty(CIMClasses.conductor.length,
                        valueSet.getFields().get(FieldLibId.LENGTH))
                .addDataProperty(CIMClasses.acLineSegment.r,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.RESISTANCE_PER_LENGTH_POS_NEG_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.r0,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.RESISTANCE_PER_LENGTH_ZERO_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.x,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.REACTANCE_PER_LENGTH_POS_NEG_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.x0,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.REACTANCE_PER_LENGTH_ZERO_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.bch,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.SUSCEPTANCE_PER_LENGTH_POS_NEG_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.b0ch,
                        Double.toString(Double.parseDouble(valueSet.getFields().get(FieldLibId.LENGTH)) *
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.SUSCEPTANCE_PER_LENGTH_ZERO_SEQ))))
                .addDataProperty(CIMClasses.acLineSegment.ratedActivePower,
                        valueSet.getFields().get(FieldLibId.RATED_ACTIVE_POWER))
                .addDataProperty(CIMClasses.acLineSegment.userConcentratedParameters, "false")
                .addObjectProperty(CIMClasses.conductingEquipment.BaseVoltage, new RDFResourcesId("e6240428-fe41-4cb9-80d2-52bd2bbe2c03"))
                .addObjectProperty(CIMClasses.equipment.EquipmentContainer, new RDFResourcesId("99ca703f-7615-45aa-afaf-fb95c4e4b327"))
                .builder();
    }
}
