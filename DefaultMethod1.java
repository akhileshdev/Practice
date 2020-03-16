import java.util.*;

interface Sayable
{
	void say();           //abstract method of interface
	
	default void sayMore()    //default method of interface
	{
		System.out.println("Saying More using default method");
	}
	
}

public class DefaultMethod1 implements Sayable
{
    public void say()
    {
    	System.out.println("Implementing Abstract method in class");    	
    }
    
    public void sayMore() 
    {
    	System.out.println("Implementing default method in class");
    }
	
	
	public static void main(String args[])
	{
	    DefaultMethod1 df = new DefaultMethod1();	
	    
	    df.say();	    
	    df.sayMore();
	    
	}

}