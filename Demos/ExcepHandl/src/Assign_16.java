//to check Exception handling with method overriding. Means, 
//If super class method don�t declare exception then subclass overridden method can declare exception or not

class Parent
{
	 void move(int s)
	{
		 System.out.println("in parent");
		 int k=s/0;
		
	}
}

class Child extends Parent
{
	public void move(int d)
	{
		System.out.println("in child");
		try 
		{
			int k= d/6;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		
		}
		finally
		{
		   
		}
	}
}

public class Assign_16 
{
	public static void main(String[] args) 
	{
		try 
		{
			Child ch= (Child) new Parent();   // ClassCast exception occures at downcasting

		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());	
		}
		//Parent pt = new Parent(); // parent class method call by parent class object
		//pt.move(4)
		//Child ch = new Child();   // Child class method call by child class object
		//ch.move(4);
		Parent pt= new Child();  // child class method call by parent class object
		pt.move(4);
		
		
	}

}
