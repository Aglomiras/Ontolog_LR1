package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.classes.*;

public class CIMClasses {
    public static IdentifiedObject identifiedObject = new IdentifiedObject(
            CIMNameSpace.cim,
            "IdentifiedObject"
    );
    public static ACDCTerminal acdcTerminal = new ACDCTerminal(
            CIMNameSpace.cim,
            "ACDCTerminal"
    );
    public static ACLineSegment acLineSegment = new ACLineSegment(
            CIMNameSpace.cim,
            "ACLineSegment"
    );
    public static BaseFrequency baseFrequency = new BaseFrequency(
            CIMNameSpace.cim,
            "BaseFrequency"
    );
    public static BaseVoltage baseVoltage = new BaseVoltage(
            CIMNameSpace.cim,
            "BaseVoltage"
    );
    public static VoltageLevel voltageLevel = new VoltageLevel(
            CIMNameSpace.cim,
            "VoltageLevel"
    );
    public static Switch aswitch = new Switch(
            CIMNameSpace.cim,
            "Switch"
    );
    public static Diagram diagram = new Diagram(
            CIMNameSpace.cim,
            "Diagram"
    );
    public static ConductingEquipment conductingEquipment = new ConductingEquipment(
            CIMNameSpace.cim,
            "ConductingEquipment"
    );
    public static Conductor conductor = new Conductor(
            CIMNameSpace.cim,
            "Conductor"
    );
    public static LoadResponseCharacteristic loadResponseCharacteristic = new LoadResponseCharacteristic(
            CIMNameSpace.cim,
            "LoadResponseCharacteristic"
    );
    public static ConnectivityNode connectivityNode = new ConnectivityNode(
            CIMNameSpace.cim,
            "ConnectivityNode"
    );
    public static Equipment equipment = new Equipment(
            CIMNameSpace.cim,
            "Equipment"
    );
    public static DiagramObject diagramObject = new DiagramObject(
            CIMNameSpace.cim,
            "DiagramObject"
    );
    public static DiagramObjectPoint diagramObjectPoint = new DiagramObjectPoint(
            CIMNameSpace.cim,
            "DiagramObjectPoint"
    );
    public static EnergyConsumer energyConsumer = new EnergyConsumer(
            CIMNameSpace.cim,
            "EnergyConsumer"
    );
    public static PowerTransformer powerTransformer = new PowerTransformer(
            CIMNameSpace.cim,
            "PowerTransformer"
    );
    public static PowerTransformerEnd powerTransformerEnd = new PowerTransformerEnd(
            CIMNameSpace.cim,
            "PowerTransformerEnd"
    );
    public static SvVoltage svVoltage = new SvVoltage(
            CIMNameSpace.cim,
            "SvVoltage"
    );
    public static Terminal terminal = new Terminal(
            CIMNameSpace.cim,
            "Terminal"
    );
    public static TransformerEnd transformerEnd = new TransformerEnd(
            CIMNameSpace.cim,
            "TransformerEnd"
    );
    public static EquivalentInjection equivalentInjection = new EquivalentInjection(
            CIMNameSpace.cim,
            "EquivalentInjection"
    );
    public static RDFResourcesType substation = new RDFResourcesType(CIMNameSpace.cim, "Substation");
    public static RDFResourcesType line = new RDFResourcesType(CIMNameSpace.cim, "Line");
    public static RDFResourcesType breaker = new RDFResourcesType(CIMNameSpace.cim, "Breaker");
    public static RDFResourcesType busbarSection = new RDFResourcesType(CIMNameSpace.cim, "BusbarSection");
    public static RDFResourcesType powerTransformerType = new RDFResourcesType(CIMNameSpace.cim, "PowerTransformer");
    public static RDFResourcesType powerTransformerEndType = new RDFResourcesType(CIMNameSpace.cim, "PowerTransformerEnd");
    public static RDFResourcesType baseFrequency1 = new RDFResourcesType(CIMNameSpace.cim, "BaseFrequency");
    public static RDFResourcesType baseVoltage1 = new RDFResourcesType(CIMNameSpace.cim, "BaseVoltage");
    public static RDFResourcesType voltageLevel1 = new RDFResourcesType(CIMNameSpace.cim, "VoltageLevel");
    public static RDFResourcesType equivalentInjectionType = new RDFResourcesType(CIMNameSpace.cim, "EquivalentInjection");
    public static RDFResourcesType aclineSegment = new RDFResourcesType(CIMNameSpace.cim, "ACLineSegment");
    public static RDFResourcesType energyConsumerType = new RDFResourcesType(CIMNameSpace.cim, "EnergyConsumer");
    public static RDFResourcesType loadResponseCharacteristicType = new RDFResourcesType(CIMNameSpace.cim, "LoadResponseCharacteristic");
    public static RDFResourcesType terminalType = new RDFResourcesType(CIMNameSpace.cim, "Terminal");
    public static RDFResourcesType topologicalNode = new RDFResourcesType(CIMNameSpace.cim, "TopologicalNode");
    public static RDFResourcesType connectivityNodeType = new RDFResourcesType(CIMNameSpace.cim, "ConnectivityNode");
    public static RDFResourcesType svVoltageType = new RDFResourcesType(CIMNameSpace.cim, "SvVoltage");
    public static RDFResourcesType diagramType = new RDFResourcesType(CIMNameSpace.cim, "Diagram");
    public static RDFResourcesType diagramObjectType = new RDFResourcesType(CIMNameSpace.cim, "DiagramObject");
    public static RDFResourcesType diagramObjectPointType = new RDFResourcesType(CIMNameSpace.cim, "DiagramObjectPoint");

    public static class Some {

    }
}
