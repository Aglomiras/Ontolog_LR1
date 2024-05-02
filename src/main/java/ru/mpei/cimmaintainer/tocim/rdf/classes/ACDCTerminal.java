package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class ACDCTerminal extends RDFResourcesType {
    public ACDCTerminal(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty sequenceNumber = new RDFResourcesProperty(this, "sequenceNumber");
}
