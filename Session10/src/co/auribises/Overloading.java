package co.auribises;

/*
 * Polymorphism
------------

	Compile Time Polymorphism
	-------------------------
		Early Binding
		Static Binding


		Binding is linking of function call with its definition.


		void fun(){
			//...
		}

		void fun(int i){
			//...
		}

		o.fun();
		o.fun(10);

			- OVERLOADING
				1. Constructor
				2. Method

				Name should be same, and inputs should be different
				return type has no role

				Inputs should be DIFFERENT
					1. Number of Inputs
					2. Type Of Inputs
					3. Sequence of Inputs

				class Demo{
					void fun(){

					}

					void fun(int i){
					
					}

					int fun(int i, int k){
						
						return 0;
					}
				}	



 */

class FaceBookLogin{
	
}

public class Overloading {

	
	Overloading(){
		
	}
	
	Overloading(int i){
		
	}
	
	Overloading(int j, int k){
		
	}
	
	Overloading(FaceBookLogin fbRef){
		
	}
	
	//1. Number of Inputs
	void fun(){
		System.out.println("this is fun");
	}
	
	void fun(int i){
		System.out.println("this is fun: "+i);
	}
	
	void fun(int i, int j){
		System.out.println("this is fun: "+i+" - "+j);
	}
	
	//2. Type of Inputs
	void fun(float i, float j){
		System.out.println("this is fun: "+i+" - "+j);
	}
	
	//2. Sequence of Inputs
	void fun(int i1, float j1){
		System.out.println("this is a new fun: "+i1+" - "+j1);
	}
	
	void fun(float i1, int j1){
		System.out.println("this is a new fun: "+i1+" - "+j1);
	}
	
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.fun();
		oRef.fun(10);
		oRef.fun(10,20);
		oRef.fun(1.1F, 2.2F);
		oRef.fun(10,2.2F);
		oRef.fun(2.2F, 1);
		
		Overloading oRef1 = new Overloading(10);
		Overloading oRef2 = new Overloading(10,20);
		
		FaceBookLogin fb1 = new FaceBookLogin();
		Overloading oRef3 = new Overloading(fb1);
	}

}
