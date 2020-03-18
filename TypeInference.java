import java.util.*;

public class GenericClass<X>
{
     X name;
     
     public void setName(X name)
     {
    	 this.name = name;
     }
     
     public void getName()
     {
    	 return name;
     }
     
     public String genericMethod(GenericClass<String> t)
     {
    	 t.setName("Rakesh");
    	 return t.name;   	 
     }

     public static void main(String args[])
     {
    	 GenericClass<String> gc = new GenericClass<String>();
    	 gc.setName("Hello");
    	 System.out.println("\nBefore JDK 7.0  : "+gc.getName());
    	 
    	 GenericClass<String> gc1 = new GenericClass<>();
    	 gc1.setName("World !!");
    	 System.out.println("\nJDK 7.0  : "+gc1.getName());
    	 
    	 System.out.println("JDK 8.0 : "+gc1.genericMethod(new GenericClass<>()));
    	 
     }
      
     
     
     
}