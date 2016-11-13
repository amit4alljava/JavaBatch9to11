package com.srivastava.apps;

public class Consumer {
	public static void main(String[] args) {
		//IProducer producer =new Producer();
		Factory factory = new Factory();
		IProducer producer = factory.createObject();
		producer.callMe();
		//producer.consumerDontCallMe();
	}

}
