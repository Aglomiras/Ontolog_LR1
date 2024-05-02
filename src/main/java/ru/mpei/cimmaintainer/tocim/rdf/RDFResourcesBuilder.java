package ru.mpei.cimmaintainer.tocim.rdf;

import java.util.ArrayList;
import java.util.List;

public class RDFResourcesBuilder {
    private final RDFResourcesId id;
    private final RDFResourcesType type;
    private List<RDFDataProperty> dataProperties = new ArrayList<>();
    private List<RDFObjectProperty> objectProperties = new ArrayList<>();


    public RDFResourcesBuilder(RDFResourcesId id, RDFResourcesType type) {
        this.id = id;
        this.type = type;
    }
    public RDFResourcesBuilder addDataProperty(
            RDFResourcesProperty rdfDataProperty,
            String value
    ) {
        this.dataProperties.add(new RDFDataProperty(rdfDataProperty, value));
        return this;
    }
    public RDFResourcesBuilder addObjectProperty(
            RDFResourcesProperty objectProperty,
            RDFResourcesId resourceId
    ) {
        this.objectProperties.add(new RDFObjectProperty(objectProperty, resourceId));
        return this;
    }

    public RdfResource builder() {
        return new RdfResource(id, type, dataProperties, objectProperties);
    }

}
