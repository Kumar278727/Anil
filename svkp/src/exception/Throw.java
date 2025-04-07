package exception;

public class Throw {
	void validate(int age) {
		
		if(age<18)
		{
			throw new ArithmeticException("they are not eligible for C2TC");
		}
		else
		{
			System.out.println("You are Eligible");
		}
		}
		
		
		public static void main(String[] args) {
			 Throw obj=new  Throw();
			 obj.validate(4);
			 System.out.println("welcome C2TC");

		}

	}


