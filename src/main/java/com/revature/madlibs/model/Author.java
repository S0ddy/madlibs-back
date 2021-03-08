package com.revature.madlibs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity 
@Table(name = "author_table")
public class Author {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "author_id")
	private int authorId;
	private String authorFirstName;
	private String authorLastName;
	@OneToMany(mappedBy = "incStoryAuthor", cascade = CascadeType.ALL)
	private List<IncStory> incStories = new ArrayList<>();
	
	@Autowired
	public Author(String authorFirstName, String authorLastName) {
		super();
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	
	

}
