package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class TransformerEnd extends RDFResourcesType {
    public TransformerEnd(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty magBaseU = new RDFResourcesProperty(this, "magBaseU");
    public RDFResourcesProperty bmagSat = new RDFResourcesProperty(this, "bmagSat");
    public RDFResourcesProperty magSatFlux = new RDFResourcesProperty(this, "magSatFlux");
    public RDFResourcesProperty endNumber = new RDFResourcesProperty(this, "endNumber");
    public RDFResourcesProperty grounded = new RDFResourcesProperty(this, "grounded");
    public RDFResourcesProperty Terminal = new RDFResourcesProperty(this, "Terminal");
}
