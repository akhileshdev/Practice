
abstract class AbstractClass
{
    abstract int add(int a,int b);
    
    int sub(int a,int b)     
    {
    	return (a-b);
    }
	
	static int multiply(int a,int b)    
	{
		return a*b;
	}
	
}

class AbstractClassTest extends AbstractClass
{
      public int add(int a,int b)
      {
    	 return (a+b);
      }     
      
      public static void main(String args[])
      {
           AbstractClassTest ab = new AbstractClassTest();
           
           int sum = ab.add(5,7);
           int diff = ab.sub(10,7);
           
           int mult = ab.multiply(78,56);
           
           System.out.println("Sum : "+sum);           
           System.out.println("Subtract : "+diff);           
           System.out.println("Multiplication : "+mult);
           
           
      }

}