package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.proto.lib.field.FieldLibId;

import java.util.List;

public class EquivalentInjection {
    public static RdfResource convert(String id, RawEquipmentNodeDto valueSet) {

        List<RawEquipmentNodeDto.PortDto> ports = valueSet.getPorts();

        for (int i = 0; i < ports.size(); i++) {
            System.out.println(Terminal.convert(id, i + 1, valueSet));
        }

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.equivalentInjection)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addDataProperty(CIMClasses.identifiedObject.name, valueSet.getName())
                .addDataProperty(CIMClasses.equivalentInjection.r, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_POS_NEG_SEQ)) * Math.cos(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_POS_NEG_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.r2, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_POS_NEG_SEQ)) * Math.cos(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_POS_NEG_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.x, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_POS_NEG_SEQ)) * Math.sin(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_POS_NEG_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.x2, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_POS_NEG_SEQ)) * Math.sin(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_POS_NEG_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.r0, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_ZERO_SEQ)) * Math.cos(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_ZERO_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.x0, String.valueOf(
                        Double.parseDouble(valueSet.getFields().get(FieldLibId.IMPEDANCE_ZERO_SEQ)) * Math.sin(Math.toRadians(
                                Double.parseDouble(valueSet.getFields().get(FieldLibId.ANGLE_OF_IMPEDANCE_ZERO_SEQ))
                        ))
                ))
                .addDataProperty(CIMClasses.equivalentInjection.emfTimeConstant, valueSet.getFields().get(FieldLibId.EMF_TIME_CONSTANT))
                .addObjectProperty(CIMClasses.conductingEquipment.BaseVoltage, new RDFResourcesId())
                .addObjectProperty(CIMClasses.equipment.EquipmentContainer, new RDFResourcesId())
                .builder();
    }
}
