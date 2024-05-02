package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class Equipment extends RDFResourcesType {
    public Equipment(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty EquipmentContainer = new RDFResourcesProperty(this, "EquipmentContainer");
}
