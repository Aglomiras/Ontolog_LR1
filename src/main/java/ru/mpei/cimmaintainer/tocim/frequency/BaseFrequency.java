package ru.mpei.cimmaintainer.tocim.frequency;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

import java.util.ArrayList;
import java.util.List;

public class BaseFrequency {
    public static List<RdfResource> convert() {
        List<RdfResource> resources = new ArrayList<>();
        RdfResource builder = new RDFResourcesBuilder(new RDFResourcesId("44828d3c-9052-4599-b79d-bbe0ecb86d06"), CIMClasses.baseFrequency1)
                .addDataProperty(CIMClasses.identifiedObject.mRID, "44828d3c-9052-4599-b79d-bbe0ecb86d06")
                .addDataProperty(CIMClasses.baseFrequency.frequency, "50")
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("dd37e29c-ae81-4a50-8874-18685ab97609"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("441d88ad-1a0a-4fbd-b3ef-a2e89ef74d9f"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("9bc42144-8d2a-4de4-b350-9a5d59b878e1"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("58649e1b-d9f6-41a6-9f98-85219024408c"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("58649e1b-d9f6-41a6-9f98-85219024408c"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("7f0cfb80-9b99-431e-a217-c4bfeaab269d"))
                .addObjectProperty(CIMClasses.identifiedObject.DiagramObjects, new RDFResourcesId("5407225f-190a-4eb4-a4a4-9456fb902ab7"))
                .builder();
        resources.add(builder);
        return resources;

    }
}
