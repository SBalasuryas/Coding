package cse;

import seminartopics.abs1;
import seminartopics.abs3;

/*
 * 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=7;
//		it(a,b);
		it key= new it(a,b);
		key.sum();

	}
	}

	
	
	
	
	class it{
		int x,y;
		//constructor
		it(int x,int y){
			this.x=x;
			this.y=y;
		}
		void display() {
			System.out.println("hello");
		}
		void sum(){
			System.out.println("sum "+ (x+y));
		}
	}


public class contructorandothers {
	
	void fun() {
		System.out.println("single inheritance");
	}
	void csedisplay() {
		System.out.println("class in parent");
	}
	
	//main
	public static void main(String[] args) {
		it key = new it();
		key.display();
	}
	}
	
class it extends contructorandothers{
	void display(){
		System.out.println("child 1");
		csedisplay();
		fun();
		
	}
}
	
	
	
	


public class contructorandothers {
	
	void fun() {
		System.out.println("class in parent called from c1");
	}
	void csedisplay() {
		System.out.println("class in parent called from c1");
	}
	
	//main
	public static void main(String[] args) {
		aids key = new aids();
		key.aids1();
	}
	}
	
class it extends contructorandothers{
	void display(){
		System.out.println("child 1");
		csedisplay();
		fun();
		aids key1 = new aids();
		key1.display2(); 
		
	}
}
class aids extends it{
	void aids1() {
		System.out.println(" multi inheritance child2");
		display();
	}
	void display2() {
		System.out.println("this is multi inheritance");
	}
}


*/

public class contructorandothers {

	void csedisplay() {
		System.out.println("class in parent called from c1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("parent class call c2");
		aids key = new aids();
		key.aids1();
		
	}
	}
	
class it extends contructorandothers{
	void it1() {
		System.out.println("c1 of the inheritance");
	}
	
}
class aids extends contructorandothers{
	void aids1(){
		System.out.println ("c2 inheritance");
		csedisplay();
	}
	
	
}
















class abs1{
	public static void abs2(){
	System.out.println("hello 1st extended class");
	}
	static void abs3(){
		System.out.println("hello 2st extended class");
	}
}

class abs3 extends abs1{
	static void abb(){
		System.out.println("2nd extended");
		abs1 key = new abs1();
		key.abs2();
		key.abs3();
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello this is main class");
			abs3 ab = new abs3();
			ab.abb();
			
	}

}
