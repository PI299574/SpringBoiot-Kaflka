/*
 * Consumer file to listen all the topics .Subscribed all the Topic and getting those data.
 */

package com.kafka.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.bean.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "testTopic", groupId = "group_id")
	public void consumed(String message) {
		System.out.println("IN testTOPIC LISTNER*******************");
		System.out.println("Consumed message is>>>>>>>>>>>>>>" + message);
	}

	@KafkaListener(topics = "kafka-topic", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
	public void userConsumer(User user) {
		System.out.println("IN KAFKA-TOPIC LISTNER*******************");
		System.out.println("User is >>>>>>>>>>>>>>" + user);
	}
}
