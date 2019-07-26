package com.example.demo.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.mongo.model.Document;

public interface DocumentRepository extends MongoRepository<Document, String> {

}
