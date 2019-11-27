package com.example.testphonefirebase.model;

public class Recipe {
    private String name;
    private String describe;
    private String linkimg;
    private String linkdetail;
    private String idauthor;
    private String nameauthor;

    public Recipe(String name, String describe, String linkimg, String linkdetail, String idauthor, String nameauthor) {
        this.name = name;
        this.describe = describe;
        this.linkimg = linkimg;
        this.linkdetail = linkdetail;
        this.idauthor = idauthor;
        this.nameauthor = nameauthor;
    }

    public Recipe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getLinkimg() {
        return linkimg;
    }

    public void setLinkimg(String linkimg) {
        this.linkimg = linkimg;
    }

    public String getLinkdetail() {
        return linkdetail;
    }

    public void setLinkdetail(String linkdetail) {
        this.linkdetail = linkdetail;
    }

    public String getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(String idauthor) {
        this.idauthor = idauthor;
    }

    public String getNameauthor() {
        return nameauthor;
    }

    public void setNameauthor(String nameauthor) {
        this.nameauthor = nameauthor;
    }
}
