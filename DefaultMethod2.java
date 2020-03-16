
interface Sayable
{
    void say();
    
    default void method()      //its default method implementation in interface
    {
    	System.out.println("Java 8");
    }
	
	static void sayMore()    //java8 feature of static method in interface
	{
		System.out.println("Saying More");
	}
	
}

class DefaultMethod2 implements Sayable
{
      public void say()
      {
    	 System.out.println("Hello"); 
      }
	  
      public void method()
      {
    	  System.out.println("spedific implementation of default method");
      }
      
      
      public static void main(String args[])
      {
           DefaultMethod2 df  = new DefaultMethod2();
           
           df.say();
           df.method();
           
           Sayable.sayMore();
      }

}