import java.util.*;

public class TypeInference1
{      
	   public void showList(List<Integer> lis)
	   {
		   if(!lis.isEmpty())
		   {
			   lis.forEach(System.out::print);
		   }
		   else
			   System.out.println("List is Empty");
		   		   		   
	   }	
	
       public static void main(String args[])
       {
    	   TypeInference1 typ1 = new TypeInference1();
    	   List<Integer> lis1 = new ArrayList<Integer>();
    	   lis1.add(16);
    	   System.out.println("Older Java Version :");
    	   typ1.showList(lis1);
    	   
    	   List<Integer> lis2 = new ArrayList<>();
    	   lis2.add(25);
    	   System.out.println("\nUsing JDK 7.0 Version");
    	   typ1.showList(lis2);
    	   
    	   System.out.println("\nUsing JDK 8.0 Vesrion");
    	   typ1.showList(new ArrayList<>());               //Automatic type will be determined by  java 8 compiler
    	   System.out.println();
    	   
       }



}