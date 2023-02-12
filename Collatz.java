import java.util.*;
public class Collatz
{
/*
	private long[] a; 
	private int items;
	private int size;
*/
	private int length;

	public Collatz()
	{
/*		items = 0;
		size = 100;
		a = new long[size];
*/
		length = 0;
	}

	public int collatzLength(long x)
	{
		// Find the Collatz length for x:
		// 	a. Start with any positive integer n.
		// 	b. if n == 1, STOP.
		// 	c. if n is even, n = n/2.
		// 	d. if n is odd, n = 3n + 1.
		//	e. go to step b.
		length++;
		if (x <= 1)
		{
			return length;
		}
		if ((x%2) == 0)
		{
			x = x/2;
		}
		else
		{
			x = (3*x + 1);
		}
		return collatzLength(x);
	}
/*
	public void insert(long x)
	{
		if (items == size)
		{
			long[] b = new long[size*2];
			for (int i = 0; i < size; i++)
			{
				b[i] = a[i];
			}
			a = b;
			size = size*2;
		}
		
		a[items] = x;
		items++;
	}
*/

	public void clear()
	{
/*		items = 0;
		size = 100;
		long[] b = new long[size];
		a = b;
*/
		length = 0;
	}

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the range: ");
	
		int a = kb.nextInt();
		int b = kb.nextInt();
		Collatz c = new Collatz();

		//Find number (x) in the range a-b (both inclusive) with the maximum Collatz length:

		int x = 0;
		int max = 0;
		int newMax;

		for (int i = a; i <= b; i++)
		{
			c.clear();
			newMax = c.collatzLength(i);
			if (newMax > max)
			{
				max = newMax;
				x = i;
			}
		}

		System.out.println("The number with the maximum Collatz length in the range: " + x + "\nIts Collatz length: " + max);
	}
}
