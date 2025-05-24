package com.neoteric.streams;

import java.util.ArrayList;
import java.util.List;

public class TestUsingList {
    public static void main(String[] args) {

        List<FamilyUsingList> childrenOfA = new ArrayList<>();
        childrenOfA.add(new FamilyUsingList("c"));
        childrenOfA.add(new FamilyUsingList("d"));

        List<FamilyUsingList> childrenOfB = new ArrayList<>();
        childrenOfB.add(new FamilyUsingList("e"));
        childrenOfB.add(new FamilyUsingList("f"));

        List<FamilyUsingList> kids = new ArrayList<>();
        kids.add(new FamilyUsingList("a",childrenOfA));
        kids.add(new FamilyUsingList("b",childrenOfB));

        FamilyUsingList gen1 = new FamilyUsingList("GF",kids);

        List<FamilyUsingList> gen1List = List.of(gen1);

        long countGen1 = gen1List.stream().count();
        long countGen2 = gen1List.stream()
                .flatMap(g1 -> g1.getFamilies().stream())
                .count();
        long countGen3 = gen1List.stream()
                .flatMap(g1 -> g1.getFamilies().stream())
                .flatMap(g2 -> g2.getFamilies().stream())
                .count();

        long totalFamilyMembers = countGen1 + countGen2 + countGen3;
        System.out.println("Total: " + totalFamilyMembers);
    }
}
