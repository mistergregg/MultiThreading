import java.util.Random;

public class NoThreads
{
	public void run()
	{
		Random rand = new Random();
		int amount = rand.nextInt(10000);
		
		System.out.println("Thread " + Thread.currentThread().getId()
				+ " started for " + amount + " milliseconds");
		
		try
		{
			Thread.sleep(amount);
		} 
		catch (InterruptedException e){}
		
		System.out.println("Thread " + Thread.currentThread().getId()
				+ " ended");
	}
}
