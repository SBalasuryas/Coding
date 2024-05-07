package cse;
import java.util.Scanner;
public class maxminmid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			  int a,b,c,mx,mn,mid;
			  a=sc.nextInt();
			  b=sc.nextInt();
			  c=sc.nextInt();
			  if(a>b&&a>c) {
				  mx=a;
				  if(b<c) {
					 mn=b;
					 mid=c;
				  }else {
					  mn=c;
					  mid=b;
				  }
			  }else if(b>c&&b>a) {
				  mx=b;
				  if(c<a) {
					  mn=c;
					  mid=a;
				  }else {
					  mn=a;
					  mid=c;
				  }
			  }
			  else {
				  mx=c;
				  if(a<b) {
					  mn=a;
					  mid=b;
				  }else {
					  mn=b;
					  mid=a;
				  }
			  }
			  System.out.println(mn+"<"+mid+"<"+mx);
			
			 
		}
			
			
			
	}

