import java.io.*;
class Ex_throws {
	void div(int a, int b) throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException();
		}
		else{
			int c=a/b;
			System.out.println(c);
		}
				
	}
	
public static void main (String args[]) {
	Ex_throws E=new Ex_throws();
	E.div(20,0);
	
}
	
}