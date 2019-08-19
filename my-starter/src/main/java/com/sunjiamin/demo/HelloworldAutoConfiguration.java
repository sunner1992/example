package com.sunjiamin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//�൱��һ����ͨ�� java ������
@Configuration
//�� HelloworldService ����·����������
@ConditionalOnClass({ HelloworldService.class })
//�� application.properties ����ص������ֶ������һһ��Ӧ�������� Bean
@EnableConfigurationProperties(HelloworldProperties.class)
public class HelloworldAutoConfiguration {

// ע��������
	@Autowired
	private HelloworldProperties hellowordProperties;

	@Bean
// ������û����� Bean ��ʱ��Ŵ������ Bean
	@ConditionalOnMissingBean(HelloworldService.class)
	public HelloworldService helloworldService() {
		HelloworldService helloworldService = new HelloworldService();
		helloworldService.setWords(hellowordProperties.getWords());
		return helloworldService;
	}
}
