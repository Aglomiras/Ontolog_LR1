package ru.mpei.cimmaintainer.tocim.equipment;

import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.nti.dtps.dto.scheme.RawEquipmentNodeDto;

public class Terminal {
    public static RdfResource convert(String id, int count, RawEquipmentNodeDto valueSet) {
        RDFResourcesId rdfResourcesIdConnect = new RDFResourcesId();
        RDFResourcesId rdfResourcesIdTopolog = new RDFResourcesId();

        System.out.println(ConnectivityNode.convert(rdfResourcesIdConnect.toString(), rdfResourcesIdTopolog));

        return new RDFResourcesBuilder(new RDFResourcesId(id), CIMClasses.terminal)
                .addDataProperty(CIMClasses.identifiedObject.mRID, id)
                .addDataProperty(CIMClasses.identifiedObject.name, valueSet.getName() + " " + count)
                .addDataProperty(CIMClasses.acdcTerminal.sequenceNumber, count + "")
                .addObjectProperty(CIMClasses.terminal.phases, new RDFResourcesId("http://iec.ch/TC57/2016/CIM-schema-cim#PhaseCode.ABC"))
                .addObjectProperty(CIMClasses.terminal.ConductingEquipment, new RDFResourcesId())
                .addObjectProperty(CIMClasses.terminal.TopologicalNode, rdfResourcesIdTopolog)
                .addObjectProperty(CIMClasses.terminal.ConnectivityNode, rdfResourcesIdConnect)
                .builder();
    }
}
