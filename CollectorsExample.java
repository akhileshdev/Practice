
import java.util.*;
import java.util.stream.Collectors;

class Product
{
	int id;
	float price;
	String name;
    
	Product(int id,String name,float price)
	{
		this.id = id;
		this.price = price;
		this.name = name;				
	}
    
	public int getId()
	{
		return id;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
}

public class CollectorsExample
{
    public static void main(String args[])
	{
		List<Product> lis = new ArrayList<Product>();
		
		lis.add(new Product(10,"Java",890.10f));
		lis.add(new Product(11,"Git",1000.50f));
		lis.add(new Product(12,"Spring",1200.70f));
		lis.add(new Product(13,"Spring Boot",1500.80f));
		lis.add(new Product(14,"Web-service",1890.10f));
				
		System.out.println("Average Price : "+lis.stream().collect(Collectors.averagingDouble(x->x.price)));
		
		System.out.println("List of IDs : "+lis.stream().map(Product::getId).collect(Collectors.toList()));			
		System.out.println("Set of Price : "+lis.stream().map(Product::getPrice).collect(Collectors.toSet()));
		
		System.out.println("Sum of IDs : "+lis.stream().collect(Collectors.summingInt(c->c.id)));
		System.out.println("Sum of Price : "+lis.stream().collect(Collectors.summingDouble(c->c.price)));
		
		System.out.println("Total Count of element : "+lis.stream().collect(Collectors.counting()));
		
	}	

}



