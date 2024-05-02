package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class EnergyConsumer extends RDFResourcesType {
    public EnergyConsumer(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty grounded = new RDFResourcesProperty(this, "grounded");
    public RDFResourcesProperty pfixed = new RDFResourcesProperty(this, "pfixed");
    public RDFResourcesProperty p = new RDFResourcesProperty(this, "p");
    public RDFResourcesProperty qfixed = new RDFResourcesProperty(this, "qfixed");
    public RDFResourcesProperty q = new RDFResourcesProperty(this, "q");
    public RDFResourcesProperty ratedVoltage = new RDFResourcesProperty(this, "ratedVoltage");
    public RDFResourcesProperty LoadResponse = new RDFResourcesProperty(this, "LoadResponse");
}
