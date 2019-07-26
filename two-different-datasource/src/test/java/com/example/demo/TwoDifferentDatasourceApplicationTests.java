package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TwoDifferentDatasourceApplicationTests {

	@Autowired
	private com.example.demo.mongo.repository.DocumentRepository DocumentRepository;

	@Autowired
	private com.example.demo.pg.repository.ArticleRepository ArticleRepository;

	@Test
	public void test() {
		System.out.println(DocumentRepository.count());
	}

	@Test
	public void test1() {
		System.out.println(ArticleRepository.count());
	}
}
