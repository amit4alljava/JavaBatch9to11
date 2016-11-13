package com.srivastava.apps;
interface IProducer{
	public void callMe();
}
class FasterProducer implements IProducer{
	@Override
	public void callMe(){
		System.out.println("Call Me Faster");
		consumerDontCallMe(90);
	}
	public void consumerDontCallMe(int x){
		System.out.println("Consumer Don't Call Me Faster"+x);
	}
}
public class Producer implements IProducer{
	@Override
	public void callMe(){
		System.out.println("Call Me");
		consumerDontCallMe(90);
	}
	public void consumerDontCallMe(int x){
		System.out.println("Consumer Don't Call Me "+x);
	}
}
