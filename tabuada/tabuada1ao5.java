	import java.io.IOException;
	import java.util.Scanner;

public class tabuadaUmAoCinco {

	
		public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			System.out.println("Tabuada do 1 ao 5 ");
			 
	        for (int num = 1; num <=5; num++)
	        {
	        	System.out.println ("\n Tabuada do: "+ num  );

	        	 for (int x = 0; x <=10; x++)
	 	        {
	 	            int resultado = num * x;
	 	          	 System.out.println( num + " x " +  x +" = " + resultado );	 	        	 
	 	        }	       	

	        }
	}

}
