package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;

public class ConnectivityNode {
    public static RdfResource convert(String id, RDFResourcesId idTopolog) {

        System.out.println(TopologicalNode.convert(idTopolog.toString()));

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.connectivityNode)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addObjectProperty(CIMClasses.connectivityNode.TopologicalNode, idTopolog)
                .builder();
    }
}
