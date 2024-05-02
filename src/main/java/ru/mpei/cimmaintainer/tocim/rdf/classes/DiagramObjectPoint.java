package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class DiagramObjectPoint extends RDFResourcesType {
    public DiagramObjectPoint(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty sequenceNumber = new RDFResourcesProperty(this, "sequenceNumber");
    public RDFResourcesProperty xPosition = new RDFResourcesProperty(this, "xPosition");
    public RDFResourcesProperty yPosition = new RDFResourcesProperty(this, "yPosition");
    public RDFResourcesProperty DiagramObject = new RDFResourcesProperty(this, "DiagramObject");
}
