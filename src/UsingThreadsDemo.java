public class UsingThreadsDemo
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 1000; i++)
		{
//			NoThreads noThreads = new NoThreads();
//			noThreads.run();
			
			//Thread aThread = new Thread(new UsingThreadImplement());
			
			
			Thread aThread = new Thread(new UsingThreadImplement());
			aThread.start();
			
			//aThread.interrupt();
		}
	}
}
