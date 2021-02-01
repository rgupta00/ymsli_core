package com.blogpost;
import java.util.*;
import java.util.stream.Collectors;
public class Demo {
	
	public static void main(String[] args) {
		List<String> commentsName=getBlogs()
				.stream()
				.flatMap(blog-> blog.getPost().stream())
				.flatMap(post-> post.getComments().stream())
				.map(c->c.getName())
				.distinct()
				.collect(Collectors.toList());
		commentsName.forEach(name-> System.out.println(name));
	}

	public static List<Blog> getBlogs(){
		//List<Blog>--->List<Post>-->List<Comment> --> name
		List<Blog> blogs=new ArrayList<>();
		
		Blog blog1=new Blog();
		blog1.setSiteName("times of india");
		
		Post post1=new Post();
		post1.setSubject("pollution");
		post1.getComments().add(new Comment("rajat", "going hell due to pullution"));
		post1.getComments().add(new Comment("ravi", "u can not close all factories due to pullution"));
		
		blog1.getPost().add(post1);
		blogs.add(blog1);
		
		return blogs;
	}
}
