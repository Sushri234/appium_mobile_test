package org.openqa.selenium.remote;

public class Javaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("text to be printed");
		
		String name="Sushrisangita";
		int n=name.length();
		System.out.println("length of string="+n);//
		
		String str1="www";
		String str2="mohs10";
		String str3= "com";
		String joined_string=str1.concat(".").concat(str2).concat(".").concat(str3);
		System.out.println(joined_string);//
		
		System.out.println(str1==str2);
		StringBuffer r=new StringBuffer("learn coding");
		System.out.println(r.reverse());//
		
		int a[]= {10,20,30};
	
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
		int a1[]=new int[3];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		
		for (int i=0;i<3;i++) {
			System.out.print(a[i]+"");
		}
		
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])min=a[i];
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i])min=a[i];
		}
		System.out.println();
		System.out.println("max value::"+max);
		System.out.println("min value::"+min);	
		}

	}


	


