import java.util.Scanner;
import javax.swing.JOptionPane;

public class numeroMaiorOuMenorDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int numero;
		    String aux; 
		    
		    aux = JOptionPane.showInputDialog("Entre com um numero");
		
		    numero = Integer.parseInt(aux);
		    
              if (numero < 10) { 
	                JOptionPane.showMessageDialog(null, "O número digitado é menor que 10");
	              }else {
	              JOptionPane.showMessageDialog(null, "O número digitado é maior ou igual a 10");
	              }
		
	}

}
