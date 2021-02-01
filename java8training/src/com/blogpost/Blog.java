package com.blogpost;
import java.util.*;
public class Blog {
	private String siteName;
	
	private List<Post> post=new ArrayList<>();

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	
	
}
