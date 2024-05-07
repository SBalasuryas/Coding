package cse;

import java.util.Scanner;

public class array02 {
	static int size;
	static void display(int a[]) {
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
								
		}
	}
	static void insert(int arr[]) {
		Scanner sc =new Scanner(System.in);
		int pos,data;
		pos = sc.nextInt();
		pos = pos-1;
		data = sc.nextInt();
		sc.close();
		for(int i=size;i>pos;i--) {
			arr[i] = arr[i-1];
		}
		arr[pos]= data;
		size = size+1;
	}
	
	
	
	static void delete(int arr[]) {
		Scanner sc =new Scanner(System.in);
		int pos,data;
		pos = sc.nextInt();
		pos = pos-1;
		data = sc.nextInt();
		for(int i=pos;i>=size;i++) {
			arr[i] = arr[i+1];
		}
		arr[pos]= data;
		size = size-1;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            .
	
	
	static void search(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int key  = sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				System.out.println("Data is Found");
				return;
			}
		}
		System.out.println("data not found123 ");
	}
	
}
		//for(int i=0;i<size;i++) {
	//	isprime(arr[i]);}

	//}

