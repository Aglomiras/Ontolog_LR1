package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class DiagramObject extends RDFResourcesType {
    public DiagramObject(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty rotation = new RDFResourcesProperty(this, "rotation");
    public RDFResourcesProperty Diagram = new RDFResourcesProperty(this, "Diagram");
    public RDFResourcesProperty IdentifiedObject = new RDFResourcesProperty(this, "IdentifiedObject");
}
