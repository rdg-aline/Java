	import java.io.IOException;
	import java.util.Scanner;

public class escolhendoTabuada {

	
		public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			 Scanner scanner = new Scanner(System.in);
		     
		       System.out.println("Informar um número, para saber a tabuada: ");
		       int tabuada = scanner.nextInt();
	      
		        for (int i = 0; i <=10; i++)
		        {
		            int resultado = tabuada * i;
		           
		            System.out.println(tabuada +" x " + i + " = " + resultado);   
		        }
	}

}
