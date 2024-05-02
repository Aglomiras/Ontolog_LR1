package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RDFDataProperty {
    private final RDFResourcesProperty type;
    private final String value;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\t\t<")
                .append(type.getMRDI().getNameSpace().getAlias()).append(":")
                .append(type.getMRDI().getNameType())
                .append(".")
                .append(type.getName())
                .append(">")
                .append(value)
                .append("</")
                .append(type.getMRDI().getNameSpace().getAlias()).append(":")
                .append(type.getMRDI().getNameType())
                .append(".")
                .append(type.getName())
                .append(">");

        return stringBuilder.toString();
    }
}
