package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class ACLineSegment extends RDFResourcesType {
    public ACLineSegment(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RDFResourcesProperty r = new RDFResourcesProperty(this, "r");
    public RDFResourcesProperty r0 = new RDFResourcesProperty(this, "r0");
    public RDFResourcesProperty x = new RDFResourcesProperty(this, "x");
    public RDFResourcesProperty x0 = new RDFResourcesProperty(this, "x0");
    public RDFResourcesProperty bch = new RDFResourcesProperty(this, "bch");
    public RDFResourcesProperty b0ch = new RDFResourcesProperty(this, "b0ch");
    public RDFResourcesProperty ratedActivePower = new RDFResourcesProperty(this, "ratedActivePower");
    public RDFResourcesProperty userConcentratedParameters = new RDFResourcesProperty(this, "userConcentratedParameters");
}
