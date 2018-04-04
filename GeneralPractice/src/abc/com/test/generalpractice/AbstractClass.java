package abc.com.test.generalpractice;

public abstract class AbstractClass {
	int z;
	
	public void addition(int a ,int b ){
		int c=a+b;
		System.out.println("Addition of a+b is : "  +c);
	}
	public void substraction(int a, int b){
		int c=a-b;
		System.out.println("Substraction of a-b is : "  +c);
	}
	public abstract void multiplication(int a,int b);
		
	}

	


