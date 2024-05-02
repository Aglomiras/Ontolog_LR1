package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

import java.util.List;

public class EnergyConsumer {
    public static RdfResource convert(String id, RawEquipmentNodeDto valueSet) {

        List<RawEquipmentNodeDto.PortDto> ports = valueSet.getPorts();

        for (int i = 0; i < ports.size(); i++) {
            System.out.println(Terminal.convert(id, i + 1, valueSet));
        }

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.energyConsumer)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addDataProperty(CIMClasses.identifiedObject.name, valueSet.getName())
                .addDataProperty(CIMClasses.energyConsumer.grounded, String.valueOf(!valueSet.getFields().get(FieldLibId.GROUNDED).equals("disabled")))
                .addDataProperty(CIMClasses.energyConsumer.pfixed, valueSet.getFields().get(FieldLibId.ACTIVE_POWER))
                .addDataProperty(CIMClasses.energyConsumer.p, valueSet.getFields().get(FieldLibId.ACTIVE_POWER))
                .addDataProperty(CIMClasses.energyConsumer.qfixed, valueSet.getFields().get(FieldLibId.REACTIVE_POWER))
                .addDataProperty(CIMClasses.energyConsumer.q, valueSet.getFields().get(FieldLibId.REACTIVE_POWER))
                .addDataProperty(CIMClasses.energyConsumer.ratedVoltage, valueSet.getFields().get(FieldLibId.RATED_VOLTAGE_LINE_TO_LINE))
                .addObjectProperty(CIMClasses.conductingEquipment.BaseVoltage, new RDFResourcesId("#9fd0eedd-2fbb-4160-86ba-5d577108df8d"))
                .addObjectProperty(CIMClasses.equipment.EquipmentContainer, new RDFResourcesId("#e0a21a60-5d62-48f5-8b8e-4d3a6fb9795b"))
                .addObjectProperty(CIMClasses.energyConsumer.LoadResponse, new RDFResourcesId("#8ce25b1d-045a-438a-a6b7-641023339471"))
                .builder();
    }
}
