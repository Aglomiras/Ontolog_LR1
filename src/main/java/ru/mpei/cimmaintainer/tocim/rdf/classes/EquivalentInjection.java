package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class EquivalentInjection extends RDFResourcesType {
    public EquivalentInjection(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty r = new RDFResourcesProperty(this, "r");
    public RDFResourcesProperty r2 = new RDFResourcesProperty(this, "r2");
    public RDFResourcesProperty x = new RDFResourcesProperty(this, "x");
    public RDFResourcesProperty x2 = new RDFResourcesProperty(this, "x2");
    public RDFResourcesProperty r0 = new RDFResourcesProperty(this, "r0");
    public RDFResourcesProperty x0 = new RDFResourcesProperty(this, "x0");
    public RDFResourcesProperty emfTimeConstant = new RDFResourcesProperty(this, "emfTimeConstant");

}
