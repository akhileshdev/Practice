
import java.util.*;

public class OptionalClassExample2
{
    public static void main(String args[])
    {
        String str[] = new String[10];       
        Optional<String> checknull = Optional.ofNullable(str[5]);
        
        System.out.println("Checking Optional Class with No value");
        
        if(checknull.isPresent())
           System.out.println("Value is present");
        else
           System.out.println("There is no value in str[5]");        
        System.out.println("we were able to avoid abnormal termination of program"); 
        
        
        System.out.println("Checking Optional Class with Some value");
        
        str[2] = "Some value has been kept to test";
        str[3] = "India will overcome COVID-19 Health disaster";
        
        Optional<String> checkNull = Optional.ofNullable(str[3]);
        
        if(checkNull.isPresent())
        {
        	String st = str[2].toUpperCase();
        	System.out.println("After change --> "+st);
        }
        else
        	System.out.println("There is no value in str[3]");         
        
    }
	
}