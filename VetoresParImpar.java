import javax.swing.JOptionPane;

public class VetoresParImpar {
	public static void main(String[] args) {
	    
		
		int [] numPar = new int[5];
		int [] numImpar = new int[5];
		 
		int cont,num;
		 
		String aux; 
		 
		 for(cont = 0; cont < 4; cont++) {
			 aux = JOptionPane.showInputDialog("Entre com "+ (cont + 1) + " numero");
			 num = Integer.parseInt(aux);
			 
			 if(num % 2 == 0) {
			 numPar[cont] = num;
			 System.out.println("o numero " + numPar[cont] + " e par" );
			 }
			 else {
				 numImpar[cont] = num;
				 System.out.println("o numero " + numImpar[cont] + " e impar" );
				 
			 }	
		}	
		 
		 
	}
}
