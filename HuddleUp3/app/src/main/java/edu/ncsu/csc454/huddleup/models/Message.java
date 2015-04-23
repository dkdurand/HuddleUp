package edu.ncsu.csc454.huddleup.models;

public class Message {

    public final String recipients;
    public final String lastMessageText;
    public final String lastMessageDate;

    public Message(String recipients, String lastMessageText, String lastMessageDate) {
        this.recipients = recipients;
        this.lastMessageText = lastMessageText;
        this.lastMessageDate = lastMessageDate;
    }
}
