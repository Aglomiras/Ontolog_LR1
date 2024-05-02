package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawSchemeDto;


public class Diagram {
    public static RdfResource convert(RawSchemeDto scheme) {
        RDFResourcesId rdfResourcesId = new RDFResourcesId();
        return new RDFResourcesBuilder(rdfResourcesId, CIMClasses.diagramType)
                .addDataProperty(CIMClasses.identifiedObject.mRID, rdfResourcesId.getId())
                .addDataProperty(CIMClasses.diagram.x1InitialView, "0")
                .addDataProperty(CIMClasses.diagram.y1InitialView, "0")
                .addDataProperty(CIMClasses.diagram.x2InitialView, String.valueOf(scheme.getOffsetX()))
                .addDataProperty(CIMClasses.diagram.y2InitialView, String.valueOf(scheme.getOffsetY()))
                .addObjectProperty(CIMClasses.diagram.orientation, new RDFResourcesId("http://iec.ch/TC57/2016/CIM-schema-cim#OrientationKind.negative"))
                .builder();
    }
}
