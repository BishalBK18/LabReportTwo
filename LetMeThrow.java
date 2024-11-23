package com.throwdemo;

public class LetMeThrow { 
	public void amIGood(int guessNumber) throws ArithmeticException,ClassNotFoundException{
		if(guessNumber== 9)
		{
			throw new ArithmeticException ();
			//System.out.println("Arithmetic exception caught");
			
		}
		else 
			throw new ClassNotFoundException("This is Random Example");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LetMeThrow obj= new LetMeThrow();
try {
	obj.amIGood(10);
} catch (ArithmeticException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
