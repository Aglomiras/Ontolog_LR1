package ru.mpei.cimmaintainer.tocim.line;

import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.CIMClasses;
import ru.mpei.cimmaintainer.tocim.rdf.RDFResourcesId;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class Line {
    public static List<RdfResource> convert(RawSchemeDto scheme){
        return scheme.getTransmissionLines().stream()
                .map(e -> new RDFResourcesBuilder(new RDFResourcesId(e.getId()), CIMClasses.line)
                        .addDataProperty(CIMClasses.identifiedObject.mRID, e.getId())
                        .addDataProperty(CIMClasses.identifiedObject.name, e.getName())
                        .builder())
                .toList();
    }
}
