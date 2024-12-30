package com.example.demo.models;

public class ImageMessage extends Message {
    private String imageUrl; // Changed to camelCase
    private String caption;

    // Constructor
    public ImageMessage(String senderId, long timestamp, String roomId, String imageUrl, String caption) {
        super(senderId, timestamp, roomId); // Call the superclass constructor
        this.imageUrl = imageUrl;
        this.caption = caption;
    }

    // Getter for imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    // Setter for imageUrl
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getter for caption
    public String getCaption() {
        return caption;
    }

    // Setter for caption
    public void setCaption(String caption) {
        this.caption = caption;
    }
}
