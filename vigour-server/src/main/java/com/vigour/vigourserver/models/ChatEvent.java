package com.vigour.vigourserver.models;

import java.time.LocalDateTime;

public class ChatEvent {
    private EventType type;
    private String content;
    private String owner;
    private String recipient;
    private LocalDateTime dateTime = LocalDateTime.now();

    public enum EventType {
        CHAT,
        JOIN,
        LEAVE,
        TYPING
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
