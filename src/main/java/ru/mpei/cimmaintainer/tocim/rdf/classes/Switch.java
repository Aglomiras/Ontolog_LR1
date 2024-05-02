package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class Switch extends RDFResourcesType {
    public Switch(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty open = new RDFResourcesProperty(this, "open");
    public RDFResourcesProperty ratedCurrent = new RDFResourcesProperty(this, "ratedCurrent");
}
