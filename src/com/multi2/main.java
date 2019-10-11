package com.multi2;

public class main
{

	public static void main(String[] args)
	{
		Runnable obj1 = () ->  {
			try {
				System.out.println("Thread");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread());
			}catch(Exception e) {}
		};
		
		Thread t1 = new Thread(obj1);
		t1.start();
	}
}
