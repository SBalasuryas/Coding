package cse;

import java.util.Scanner;

public class numbers {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		   
		int count=0,b=0;
		while(a!=0) {
			
			if((a=a/10)%2==0) {
				count++;
			}
			else {
				b++;
			}
		}System.out.println(count+"even");
		System.out.println(b+"odd");
		
		23456
		3even
		2odd
		
		
		 
		
		
		
		static int sumFun(int a) {
			int sum = 0;
			while(a!=0) {
				sum=sum+(a%10);
				a=a/10;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int ans=0;
			while(true) {
				int len=(a==0)?1:(int)Math.log10(a)+1;
				if(len!=1) {
					ans=sumFun(a);
					a=ans;
				}
				else {
					break;
				}
				System.out.println(ans);
			}
			
			
			
			
			
			if(n%9==0) {
			System.out.println("9");
		}
		else {
			System.out.println(n%9);
		}
		
		
		op
34
7
			
			
		
		public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int c2=0;
		for(int i=2;i<n;i++) 
		{
			
			if(n%i==0) {
				count++;
			}
			
			else {
				c2++;
			}
			
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		
		11
		prime

		
	
	tech==1
	
	static void isprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		isprime(n);
		
		
		
		100
		not a prime
		
		
		tech==2  - space complexity
	
	
	static void isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("prime");
	}
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		isprime(n);
	
	
	
	tech 3 --  time complexity
	
	static void isprime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("prime");
	}
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		isprime(n);
	
	
		
		
	
	
	tech 4 -- time complexity
	
	sqrt(n)===i*i
	static void isprime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("prime");
	}
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		isprime(n);
		
		
		
	
	static int flag{
		
	}
	
	
	
	
	static void isprime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return;
			}
		}if (flag==0) {
			System.out.println(n);
		}
		else {
			System.out.println(","+n);
		}
			
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			isprime(i);
			
		}
		
	to identify the prime numbers in the set of integers
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); 
		int d,count=0;
		while(n!=0) {
			d=n%10;
			if(d==1||d==2||d==3||d==5||d==7) 
				count++;
				n=n/10;	

		
			
			
		}
		System.out.println("no.of.primes "+count);
	
		
		*/

	
	static void isprime(int n) {
		int sum =0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				sum = sum+n;
				return;
			}
		}
		int flag =0;
		if (flag==0) {
			System.out.println(n);
		}

		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			isprime(i);
			
		}
	
		
		
		
	}

}
