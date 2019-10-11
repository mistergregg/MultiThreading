import java.util.Random;

public class UsingThreadImplement implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			Random rand = new Random();
			int amount = rand.nextInt(10000);
			
			System.out.println("Thread " + Thread.currentThread().getId()
					+ " started for " + amount + " milliseconds");
			
			Thread.sleep(amount);
			
			System.out.println("Thread " + Thread.currentThread().getId()
					+ " ended");
		} 
		catch (InterruptedException e)
		{
			System.out.println("Thread " + Thread.currentThread().getId()
					+ " was cancelled");
		}
	}

}