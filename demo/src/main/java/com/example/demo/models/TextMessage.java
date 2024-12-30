package com.example.demo.models;

// Subclass of Message representing a text message
public class TextMessage extends Message {
	private String content; // Specific field for text content

	// Constructor
	public TextMessage(String senderId, long timestamp, String roomId, String content) {
		// Initialize the superclass fields
		super(senderId, timestamp, roomId);
		this.content = content;
	}

	// Getter for content
	public String getContent() {
		return content;
	}

	// Setter for content
	public void setContent(String content) {
		this.content = content;
	}
}
