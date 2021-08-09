
import java.util.Scanner;


public class SomaValores {

	
	
	
public static void main(String args[]) {


    int numero1;

    int numero2;

    int soma;


    Scanner leitor = new Scanner(System.in);


    System.out.println("Programa Soma– Este programa calculará a soma entre dois números");

    System.out.println("Digite o PRIMEIRO valor");


    numero1 = leitor.nextInt();

    System.out.println("Digite o SEGUNDO valor");


    numero2 = leitor.nextInt();


     soma = numero1 + numero2;


    System.out.println("O resultado da soma é " + soma);

}

}