package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class RDFResourcesId {
    private final String Id;

    public RDFResourcesId() {
        this.Id = createId();
    }

    @Override
    public String toString() {
        return Id;
    }

    private String createId() {
        String alphavit = "abcdefghijklmnopqrstuvwxyz0123456789";
        String str1 = setStr(alphavit, 8);
        String str2 = setStr(alphavit, 4);
        String str3 = setStr(alphavit, 4);
        String str4 = setStr(alphavit, 4);
        String str5 = setStr(alphavit, 12);
        return str1 + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;

    }

    private String setStr(String first, int number) {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            str.append(first.charAt(random.nextInt(first.length())));
        }
        return str.toString();
    }

}
