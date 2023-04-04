package org.openqa.selenium.remote;

public class Loop {

	private static int i;

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum +=i;
		}
		System.out.println("sum:"+sum);
		
		//multiplication table of 8
		int num=8;
		//System.out.println("multiplication table of"+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
		//factorial
		int num1=75;
		int fact=1;
		for(int i=1;i<=num;i++);
		{
			fact*= i;
		}
		System.out.println("factorial:"+fact);
		
		//two number one is the power of another number
		int base=9;
		int power=3;
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result*=base;
		}
		System.out.println("result:"+result);
		
//print starTriangle
		StringBuilder stars=new StringBuilder();
		for(int i1=0;i1<=10;i1++) {
			
			stars.append("*");
			System.out.println(stars);
		}
		
	}
		
}
		

	


