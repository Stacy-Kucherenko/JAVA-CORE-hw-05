package lviv.lgs.ua.constructors;

public class SomeClass {

	 private int a;
	 private int b;
	 private int c;
	
	
	SomeClass(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	SomeClass(int a, int b, int c ){
		this(a, b);
		this.c = c;
	}
	
	public void show(){
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    System.out.println("c = " + c);
	  }
}
