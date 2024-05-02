package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class SvVoltage extends RDFResourcesType {
    public SvVoltage(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty v = new RDFResourcesProperty(this, "v");
    public RDFResourcesProperty angle = new RDFResourcesProperty(this, "angle");
    public RDFResourcesProperty TopologicalNode = new RDFResourcesProperty(this, "TopologicalNode");
}
