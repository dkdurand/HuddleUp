package edu.ncsu.csc454.huddleup.models;

public class Contact {
    public String name;
    public String status;
    public boolean sharing = false;
    public boolean viewing = false;
    public boolean message = false;

    public Contact(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Contact(String name, String status, boolean sharing, boolean viewing, boolean message) {
        this.name = name;
        this.status = status;
        this.sharing = sharing;
        this.viewing = viewing;
        this.message = message;
    }
}
