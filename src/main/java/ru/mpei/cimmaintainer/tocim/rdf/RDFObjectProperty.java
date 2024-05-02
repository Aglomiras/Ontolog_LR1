package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RDFObjectProperty {
    private final RDFResourcesProperty type;
    private final RDFResourcesId resourceId;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (!resourceId.getId().contains("http")) {
            stringBuilder.append("\t\t<")
                    .append(type.getMRDI().getNameSpace().getAlias().toString()).append(":")
                    .append(type.getMRDI().getNameType())
                    .append(".")
                    .append(type.getName())
                    .append(" rdf:resource=\"#")
                    .append(resourceId)
                    .append("\"/>");
        } else {
            stringBuilder.append("\t\t<")
                    .append(type.getMRDI().getNameSpace().getAlias().toString()).append(":")
                    .append(type.getMRDI().getNameType())
                    .append(".")
                    .append(type.getName())
                    .append(" rdf:resource=\"")
                    .append(resourceId)
                    .append("\"/>");
        }
        return stringBuilder.toString();
    }
}
