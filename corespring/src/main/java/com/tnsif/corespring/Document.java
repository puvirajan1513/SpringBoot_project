package com.tnsif.corespring;

public class Document {
	
	 private String title;
	    private String content;

	    // Constructor
	    public Document(String title, String content) {
	        this.title = title;
	        this.content = content;
	    }

	    // Display method
	    public void display() {
	        System.out.println("Document Title: " + title);
	        System.out.println("Document Content: " + content);
	    }

}
