import java.util.*;

public class OptionalClass
{
     public static void main(String args[])
     {
         String str[] = new String[10];     
    	 
    	 str[5] = "Go Corona";
    	 str[3] = "Corona Go";
    	 str[7] = "COVID-19";
    	 
    	 Optional<String> check = Optional.empty();    	 
    	 System.out.println("Checking empty method of Optional Class : "+check);
    	 
    	 Optional<String> checkvalue = Optional.of(str[3]);
    	 System.out.println("Printing value using Optional of() method : "+checkvalue);
    	 System.out.println("Printing value : "+checkvalue.get());
    	
    	 System.out.println("OrElse Method : "+checkvalue.orElse("No value"));
    	 System.out.println("OrElse Method : "+check.orElse("No value"));
    	 
    	 System.out.println("value hash code : "+checkvalue.hashCode());
    	 System.out.println("String representational : "+checkvalue.toString());
    	 
    	 System.out.println("value : "+checkvalue.equals("Corona Go"));
    	 
    	 Optional<String> opp = Optional.ofNullable(str[7]);
    	 
    	if(opp.isPresent())
    	{
    		System.out.println("opp.isEmpty return value : "+opp.isEmpty());    		
    		System.out.println("Trying to print COVID-19 : "+opp.filter((p)->p.endsWith("19")).get());
    	}
    	 
    	 
     }

}