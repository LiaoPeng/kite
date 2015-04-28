package com.galaxy.kite.tutorial.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class Chat implements MessageListener{
	

	public Chat(String topicFactory, String topicName, String username) throws NamingException, JMSException{
		
		InitialContext ctx = new InitialContext();
		TopicConnectionFactory conFactory =(TopicConnectionFactory) ctx.lookup(topicFactory);
		TopicConnection connection = conFactory.createTopicConnection();
		
		TopicSession pubSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSession subSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Topic chatTopic = (Topic) ctx.lookup(topicName);
		
	}

	@Override
	public void onMessage(Message arg0) {
		
	}

}
