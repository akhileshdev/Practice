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
    	
    	 System.out.println("filtering value : "+checkvalue.orElse("No value"));
    	 System.out.println("filteting value : "+check.orElse("No value"));
    	 
    	 
    	 
     }

}