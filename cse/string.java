package cse;

import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(str.hashCode());
		String str1= "hello";
		System.out.println(str1.hashCode());
		/*
		String str  = new String("hello");
		System.out.println(str);
		System.out.println(str.hashCode());
		String str1  = new String("hello");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		Scanner sc = new Scanner(System.in);
		String str = "hello";
		System.out.println(str.charAt(0));  
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String str = "1230";
		int n = Integer.parseInt(str);
		System.out.print(n+1);
		sc.close();
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] strArr = new String[size];
		for(int i=0;i<size;i++) {
			strArr[i] = sc.next();
		}
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		String[] sa = str.split("/");
		int y= Integer.parseInt(sa[2]);
		int m= Integer.parseInt(sa[1]);
		int d= Integer.parseInt(sa[0]);
		System.out.println("year : "+sa[2]);

		System.out.println("month : "+sa[1]);

		System.out.println("day : "+sa[0]);
		*/
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("non fibonacci");
		int a = sc.nextInt();
		int[] arr = new int[a];
		if(a<5) {
			System.out.println("no ");
		}
		else {
			int f1 = 0;
			int f2 = 1,sum=0,j=0;
			for(int i=2;i<a;i++) {
				sum = f1+f2;
				arr[j]=sum;
				f2 = f1;
				f1 = sum;
				j++;
			}
			
			for(int i=0;i<a;i++) {
				if(arr[i]==i) {
					System.out.println(i);
				}
				
			}
			sc.close();
//			
//			non fibonacci
//			20
//			1
//			1
//			2
//			3
//			5
//			8
//			13
//			21
//			34
//			55
//			89
//			144
//			233
//			377
//			610
//			987
//			1597
//			2584

		}
		
	}

}
