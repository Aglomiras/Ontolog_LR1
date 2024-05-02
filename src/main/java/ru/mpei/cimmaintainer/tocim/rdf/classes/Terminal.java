package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesType;
import ru.mpei.cimmaintainer.tocim.rdf.XmlNameSpace;

public class Terminal extends RDFResourcesType {
    public Terminal(XmlNameSpace nameSpace, String nameType) {
        super(nameSpace, nameType);
    }
    public RDFResourcesProperty phases = new RDFResourcesProperty(this, "phases");
    public RDFResourcesProperty ConductingEquipment = new RDFResourcesProperty(this, "ConductingEquipment");
    public RDFResourcesProperty TopologicalNode = new RDFResourcesProperty(this, "TopologicalNode");
    public RDFResourcesProperty ConnectivityNode = new RDFResourcesProperty(this, "ConnectivityNode");
}
