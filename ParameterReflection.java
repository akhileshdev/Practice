import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

class Calculate
{
	public int add(int a,int b)
	{
		return (a+b);
	}
	
	public int mult(int x,int y)
	{
		return (x*y);
	}
	
}

public class ParameterReflection
{       
	public static void main(String args[])
	{   
		
		Calculate calculate = new Calculate();		
		Class cls = calculate.getClass();
		
		Method method[] = cls.getDeclaredMethods();
		
		for(Method meth : method)
		{   
			System.out.print("\nMethod Name : "+meth.getName());			
			Parameter parameter[] = meth.getParameters();
			
			for(Parameter prm : parameter)
			{
				System.out.print(" "+ prm.getParameterizedType());
				System.out.print(" "+prm.getName());
			}
			
			
		}
		
				
		
	}
		
}