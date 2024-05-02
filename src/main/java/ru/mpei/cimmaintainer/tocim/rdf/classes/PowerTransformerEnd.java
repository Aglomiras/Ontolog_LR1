package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class PowerTransformerEnd extends RDFResourcesType {
    public PowerTransformerEnd(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty phaseAngleClock = new RDFResourcesProperty(this, "phaseAngleClock");
    public RDFResourcesProperty ratedU = new RDFResourcesProperty(this, "ratedU");
    public RDFResourcesProperty ratedS = new RDFResourcesProperty(this, "ratedS");
    public RDFResourcesProperty g = new RDFResourcesProperty(this, "g");
    public RDFResourcesProperty b = new RDFResourcesProperty(this, "b");
    public RDFResourcesProperty doesSaturationExist = new RDFResourcesProperty(this, "doesSaturationExist"); //Не то пространство имен
    public RDFResourcesProperty x = new RDFResourcesProperty(this, "x");
    public RDFResourcesProperty r = new RDFResourcesProperty(this, "r");
    public RDFResourcesProperty connectionKind = new RDFResourcesProperty(this, "connectionKind");
    public RDFResourcesProperty PowerTransformer = new RDFResourcesProperty(this, "PowerTransformer");
}
