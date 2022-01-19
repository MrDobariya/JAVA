class ThreadA extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++){
			System.out.println("From Thread A: " +i);
		}
		System.out.println("Exit from A");
	}
}

class ThreadB extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++){
			System.out.println("From Thread B: " +i);
		}
		System.out.println("Exit from B");
	}
}

class ThreadC extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++){
			System.out.println("From Thread C: " +i);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest
{
	public static void main(String args[])
	{
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
	}
}