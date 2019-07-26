package com.example.demo.mongo.model;

import javax.persistence.Id;

@org.springframework.data.mongodb.core.mapping.Document(collection = "document")
public class Document {

	@Id
	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
