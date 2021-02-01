package com.blogpost;

public class Comment {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Comment(String name, String message) {
		this.name = name;
		this.message = message;
	}
	public Comment() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [name=");
		builder.append(name);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
