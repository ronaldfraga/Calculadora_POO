/*Calculadora Orientada a objetos Java
*/

public class CalculadoraPoo {

	private int numero1, 
				numero2;
	
	public CalculadoraPoo() {
		// TODO Auto-generated method stub
		
		numero1 = 0;
		numero2 = 1;
		
	}
	
public void setNumero1 (int numero1) {
		
		this.numero1 = numero1;
	}

	
public void setNumero2 (int numero2) {
		
		this.numero2 = numero2;
	}

public int getNumero1() {
	
		return numero1;
}
public int getNumero2() {
	
		return numero2;
}

public int soma(){
	
		return numero1 + numero2;
}

public int sub() {
	
		return numero1 = numero2;
		
}

public int multi() {
	
		return numero1 * numero2;
}

public double divi() {
	
		return (double) numero1 / numero2;
}






}
