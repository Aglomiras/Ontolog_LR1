package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

public class TopologicalNode {
    public static RdfResource convert(String id) {
        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.topologicalNode)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .builder();
    }
}
