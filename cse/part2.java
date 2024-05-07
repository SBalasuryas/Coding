package cse;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		String str = "hello";
		String str1 = "hello";
		System.out.println(str==str1);
		String str2 = new String("hello");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		System.out.println(str.indexOf('o'));
		
		
		StringBuffer str = new StringBuffer ("hello");
		StringBuffer str1 = new StringBuffer ("hello");
		str.append(str1);
		str.insert(0, 'h');
		str.insert(1, 'i');
		System.out.println(str.length());
		System.out.println(str);

		
		
		
		
		int arr[] = {10,20,30,40,50};
		int size = 5,r=75,t;
		r=r%size;
		while(r!=0) {
			t = arr[size-1];
			for(int i=size-1;i>0;i++) //or i--
			 {
				arr[i] = arr[i-1];
				}
				arr[0]= t;
				r--;
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		int arr[] = {10,20,50,60,53,44};
		int s= 6;
		int max = arr[s-1];
		System.out.println(max);
		for(int i=s-2;i>=0;i--) {
			if(max<arr[i]) {
				max= arr[i];
				System.out.println(max);
			}
		}
		//o/p :44
		//53
		//60

		
		
		
		int arr[] = {1,8,2,3,4};
		int s= 5;
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				if(arr[i]>arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
		
		
		
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int len = scanner.nextInt();
		        int[] arr = new int[len];

		        for (int i = 0; i < len; i++) {
		            arr[i] = scanner.nextInt();
		        }

		    
		*/
		
		Scanner sc = new Scanner (System.in);
		char str = sc.next().charAt(0);
		sc.nextLine();
		String str1 = sc.next();
		sc.nextLine();
		int n = sc.nextInt();
		System.out.println(str+"  "+str1+" "+n);
		
		
		
		

		    }
}
