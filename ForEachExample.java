
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
		
		lis.stream().forEach(name->System.out.println(name));
		
	}	

}