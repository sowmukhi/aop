package com.neoteric.streams;

import java.util.List;

public class FamilyUsingList {
    private String name;
    private List<FamilyUsingList> families;

    public FamilyUsingList(String name, List<FamilyUsingList> families) {
        this.name = name;
        this.families = families;
    }

    public FamilyUsingList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FamilyUsingList> getFamilies() {
        return families;
    }

    public void setFamilies(List<FamilyUsingList> families) {
        this.families = families;
    }
}
