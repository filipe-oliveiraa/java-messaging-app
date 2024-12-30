package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Room {

    private String roomId;
    private List<Message> listOfMessages;

    // Constructor
    public Room(String roomId) {
        this.roomId = roomId;
        this.listOfMessages = new ArrayList<>(); // Initialize an empty list
    }

    // Method to add a message to the list
    public void addMessageToRoom(Message message) {
        this.listOfMessages.add(message); // Add message to the list
    }

    // Method to retrieve all messages from room list
    public List<Message> retrieveAllRoomMessages() {
        return List.copyOf(this.listOfMessages);
    }

    // Method to all details from room
    public Map<String, Object> getRoomDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("roomId", this.roomId); // Add roomId as a string
        details.put("messages", this.listOfMessages); // Add messages list
        return details;
    }

     // Method to clear all list room messages
    public void clearRoomMessages() {
       
        this.listOfMessages.clear();
    }

    // Getter for roomId
    public String getRoomId() {
        return roomId;
    }

    // Getter for listOfMessages
    public List<Message> getListOfMessages() {
        
        return new ArrayList<>(this.listOfMessages);
    }
}
