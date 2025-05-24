package com.neoteric.streams;

public class TestUsingArray {
    public static void main(String[] args) {

        FamilyUsingArray[] childrenOfB =new FamilyUsingArray[2];

        FamilyUsingArray child1OfB = new FamilyUsingArray("d");
        FamilyUsingArray child2OfB = new FamilyUsingArray("e");
        childrenOfB[0]=child1OfB;
        childrenOfB[1]=child2OfB;

        FamilyUsingArray[] childrenOfC = new FamilyUsingArray[2];

        FamilyUsingArray child1OfC = new FamilyUsingArray("f");
        FamilyUsingArray child2OfC = new FamilyUsingArray("g");
        childrenOfC[0]=child1OfC;
        childrenOfC[1]=child2OfC;

        FamilyUsingArray[] kids = new FamilyUsingArray[2];

        FamilyUsingArray kid1 = new FamilyUsingArray("b",childrenOfB);
        FamilyUsingArray kid2 = new FamilyUsingArray("c",childrenOfC);
        kids[0]=kid1;
        kids[1]=kid2;

        FamilyUsingArray gen1 = new FamilyUsingArray("GF",kids);

    }
}
