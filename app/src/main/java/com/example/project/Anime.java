package com.example.project;

public class Anime {
    private String id;
    private String name;
    private String company;

    public Anime(String id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCompany(){
        return company;
    }

}