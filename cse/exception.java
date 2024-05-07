package cse;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				String str = "123";
				int num = Integer.parseInt(str);
				// this statement will execute
				// as no any exception is raised by above statement
				System.out.println("try block fully executed");
				
			}
			
			 catch(NumberFormatException ex)
			{
					
				System.out.println("catch block executed...");
					
			}
			
			finally
			{
				System.out.println("finally block executed");
			}

			System.out.println("Outside try-catch-finally clause");
			}
	}

