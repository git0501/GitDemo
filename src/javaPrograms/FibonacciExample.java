package javaPrograms;

public class FibonacciExample {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,count=10;
		System.out.println(n1+" "+n2); //print 0 & 1
		
		for(int i=2;i<count;i++)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3 ;
			System.out.println("" + n3);
		}

	}

}
