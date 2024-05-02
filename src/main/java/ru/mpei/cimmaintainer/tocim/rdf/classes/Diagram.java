package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class Diagram extends RDFResourcesType {
    public Diagram(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty x1InitialView = new RDFResourcesProperty(this, "x1InitialView");
    public RDFResourcesProperty y1InitialView = new RDFResourcesProperty(this, "y1InitialView");
    public RDFResourcesProperty x2InitialView = new RDFResourcesProperty(this, "x2InitialView");
    public RDFResourcesProperty y2InitialView = new RDFResourcesProperty(this, "y2InitialView");
    public RDFResourcesProperty orientation = new RDFResourcesProperty(this, "orientation");
}
