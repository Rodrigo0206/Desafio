package meli;

	public class Numeros {

	public static void main(String[] args){
		int maxDigit = 6;
		
		for (int numeroGerado = 1000; numeroGerado <= 7770; numeroGerado++) {
			
			String numeroString = Integer.toString(numeroGerado);
			int total = 0;
			boolean valido = true;
			for (char ch: numeroString.toCharArray()) {
				String aux=Character.toString(ch);
				
				int numero = Integer.parseInt(aux);
			
				if (numero > maxDigit) {
					valido = false;
				}

				total += numero;				
			}
			if(total == 21 && valido) {
				System.out.println(numeroString);
			}
		}
	}
}

	
	
	