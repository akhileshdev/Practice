
interface Sayable
{
    void say();
    
    default void method()
    {
    	System.out.println("Java 8");
    }
	
	static void sayMore()
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
	
      public static void main(String args[])
      {
           DefaultMethod2 df  = new DefaultMethod2();
           
           df.say();
           df.method();
           
           Sayable.sayMore();
      }

}