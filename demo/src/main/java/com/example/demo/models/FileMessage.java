package com.example.demo.models;

public class FileMessage extends Message {
    private String fileName; // File name
    private long fileSize;   // File size in bytes

    // Constructor
    public FileMessage(String senderId, long timestamp, String roomId, String fileName, long fileSize) {
        super(senderId, timestamp, roomId); // Initialize superclass fields
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    // Getter for fileName
    public String getFileName() {
        return fileName;
    }

    // Setter for fileName
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Getter for fileSize
    public long getFileSize() {
        return fileSize;
    }

    // Setter for fileSize
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
