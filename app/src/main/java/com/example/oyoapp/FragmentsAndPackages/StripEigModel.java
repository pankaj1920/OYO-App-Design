package com.example.oyoapp.FragmentsAndPackages;

public class StripEigModel {
    private int link;
    private String text;

    public StripEigModel(int link, String text) {
        this.link = link;
        this.text = text;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
