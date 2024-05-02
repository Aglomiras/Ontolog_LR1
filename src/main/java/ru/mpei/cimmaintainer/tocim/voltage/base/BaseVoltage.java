package ru.mpei.cimmaintainer.tocim.voltage.base;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

import java.util.ArrayList;
import java.util.List;

public class BaseVoltage {
    public static List<RdfResource> convert() {
        List<RdfResource> resources = new ArrayList<>();
        RdfResource builder = new RDFResourcesBuilder(new RDFResourcesId("e6240428-fe41-4cb9-80d2-52bd2bbe2c03"), CIMClasses.baseVoltage1)
                .addDataProperty(CIMClasses.identifiedObject.mRID, "e6240428-fe41-4cb9-80d2-52bd2bbe2c03")
                .addDataProperty(CIMClasses.identifiedObject.name, "110кВ")
                .addDataProperty(CIMClasses.baseVoltage.nominalVoltage, "110.0")
                .builder();
        resources.add(builder);

        RdfResource builder1 = new RDFResourcesBuilder(new RDFResourcesId("9fd0eedd-2fbb-4160-86ba-5d577108df8d"), CIMClasses.baseVoltage1)
                .addDataProperty(CIMClasses.identifiedObject.mRID, "9fd0eedd-2fbb-4160-86ba-5d577108df8d")
                .addDataProperty(CIMClasses.identifiedObject.name, "10кВ")
                .addDataProperty(CIMClasses.baseVoltage.nominalVoltage, "10.0")
                .builder();
        resources.add(builder1);
        return resources;
    }
}

