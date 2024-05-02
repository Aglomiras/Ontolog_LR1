package ru.mpei.cimmaintainer;

import kotlin.NotImplementedError;
import ru.mpei.cimmaintainer.tocim.equipment.*;
import ru.mpei.cimmaintainer.tocim.frequency.BaseFrequency;
import ru.mpei.cimmaintainer.tocim.line.Line;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.substation.Substation;
import ru.mpei.cimmaintainer.tocim.voltage.base.BaseVoltage;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;
import ru.nti.dtps.dto.scheme.RawSchemeDto;
import ru.nti.dtps.proto.lib.equipment.EquipmentLibId;

import java.util.List;
import java.util.Map;

public class CimConverter {
    public static String toCim(RawSchemeDto scheme) {
//        List<RdfResource> resources = Substation.convert(scheme);
//        System.out.println(resources);
//
//        List<RdfResource> resources1 = Line.convert(scheme);
//        System.out.println(resources1);
//
//        List<RdfResource> resources2 = BaseFrequency.convert();
//        System.out.println(resources2);
//
//        List<RdfResource> resources3 = BaseVoltage.convert();
//        System.out.println(resources3);

//        throw new NotImplementedError();
//

//        List<RdfResource> rdfResources41 = Substation.convert(scheme);

//        return resources.toString();

        List<RdfResource> resources = Substation.convert(scheme);
        for (int i = 0; i < resources.size(); i++) {
            System.out.println(resources.get(i));
        }
        List<RdfResource> resources1 = Line.convert(scheme);
        for (int i = 0; i < resources1.size(); i++) {
            System.out.println(resources1.get(i));
        }

        Map<String, RawEquipmentNodeDto> nodes = scheme.getNodes();
        for (Map.Entry<String, RawEquipmentNodeDto> entry : nodes.entrySet()) {
            String key = entry.getKey();
            RawEquipmentNodeDto value = entry.getValue();
            if(value.getLibEquipmentId() == EquipmentLibId.TRANSMISSION_LINE_SEGMENT){
                System.out.println(ACLineSegment.convert(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.CIRCUIT_BREAKER){
                System.out.println(Breaker.convert(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.POWER_SYSTEM_EQUIVALENT){
                System.out.println(EquivalentInjection.convert(key, value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.BUS){
                System.out.println(BusbarSection.convert(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.TWO_WINDING_POWER_TRANSFORMER){
                System.out.println(PowerTransformer.convert(key,value));
            }
            if(value.getLibEquipmentId() == EquipmentLibId.LOAD){
                System.out.println(EnergyConsumer.convert(key,value));
            }
        }


//        throw new NotImplementedError();
        return resources.toString();
    }
}
