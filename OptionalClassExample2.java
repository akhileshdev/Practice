
import java.util.*;

public class OptionalClassExample2
{
    public static void main(String args[])
    {
        String str[] = new String[10];
        
        Optional<String> checknull = Optional.ofNullable(str[5]);
        
                
        if(checknull.isPresent())
           System.out.println("Value is present");
        else
           System.out.println("There is no value in str[5]");
        
        System.out.println("we were able to avoid abnormal termination of program"); 
        
        
        System.out.println("Testing Revert git Command");
                
        
    }
	
}