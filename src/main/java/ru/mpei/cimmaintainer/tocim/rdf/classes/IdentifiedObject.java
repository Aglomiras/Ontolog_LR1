package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class IdentifiedObject extends RDFResourcesType {
    public IdentifiedObject(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }

    public RDFResourcesProperty mRID = new RDFResourcesProperty(this, "mRID");
    public RDFResourcesProperty name = new RDFResourcesProperty(this, "name");
    public RDFResourcesProperty DiagramObjects = new RDFResourcesProperty(this, "DiagramObjects");

}
