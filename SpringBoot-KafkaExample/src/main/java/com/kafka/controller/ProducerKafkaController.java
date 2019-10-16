
/*
 * This file produces thedata on Topics.
 */
package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.bean.User;

@RestController
@RequestMapping("/kafka")
public class ProducerKafkaController {

	private static final String KAFKA_TOPIC = "testTopic";
	@Autowired
	KafkaTemplate<String, User> KafkaTemplate;
	// KafkaTemplate<String, String> KafkaTemplate;

	@GetMapping("/publish/{name}")
	public String KafkaProcerMessage(@PathVariable("name") final String name) {

		System.out.println("Request came********************" + name);
		KafkaTemplate.send(KAFKA_TOPIC, new User("1", name, "CSE", "12000"));
		System.out.println("PRODUCED ON TESTTOPIC*****************");
		return "published successfully*********" + name;
	}
}
