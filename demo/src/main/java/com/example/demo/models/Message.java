package com.example.demo.models;

public class Message {
    private String senderId; 
    private long timestamp;
    private String roomId; 

    // Constructor | Initializes a new Message object with the provided senderId, timestamp, and roomId
    public Message(String senderId, long timestamp, String roomId) {
        this.senderId = senderId;
        this.timestamp = timestamp;
        this.roomId = roomId;
    }

    // Getters and Setters

    // Getter for senderId
    public String getSenderId() {
        return senderId;
    }

    // Setter for senderId
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    // Getter for timestamp
    public long getTimestamp() {
        return timestamp;
    }

    // Setter for timestamp
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    // Getter for roomId
    public String getRoomId() {
        return roomId;
    }

    // Setter for roomId
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
