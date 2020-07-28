package javaPrograms;

public class FibonacciExampleRecursion {

	static int n1=0,n2=1,n3=0;
	static void printFibonacci(int count)
	{
		if(count>0)
		{
			System.out.println(" " +n3);
			n3= n1 + n2;
			n1 = n2;
			n2 = n3;
			printFibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count =10;
      System.out.println(n1 +" " +n2);
      printFibonacci(count-2);
	}

}
