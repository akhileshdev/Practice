
import java.util.*;

public class ForEachExample
{
    public static void main(String args[])
	{
		List<String> lis = new ArrayList<String>();
		
		lis.add("Akhilesh");
		lis.add("Arpit");
		lis.add("Baba");
		lis.add("lemon");
		
		System.out.println("Implementing forEach() method using lambda expression");
		lis.stream().forEach(name->System.out.println(name));   //pasing lambda expresion as an argument
		
		System.out.println("Implementing forEach method Passing method reference as anargument");
		lis.stream().forEach(System.out::println); //using method reference as an argument
		
		
		System.out.println("Implementing  forEachOrdered() method");
		lis.stream().forEachOrdered(name->System.out.println(name));
		
		
	}	

}