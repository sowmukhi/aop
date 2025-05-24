package com.neoteric.streams;

public class FamilyUsingArray {
    private String name;
    private FamilyUsingArray[] families;

    public FamilyUsingArray(String name) {
        this.name = name;
    }

    public FamilyUsingArray() {
    }

    public FamilyUsingArray(String name, FamilyUsingArray[] families) {
        this.name = name;
        this.families = families;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FamilyUsingArray[] getFamilies() {
        return families;
    }

    public void setFamilies(FamilyUsingArray[] families) {
        this.families = families;
    }
}
