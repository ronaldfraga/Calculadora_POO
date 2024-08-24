
public class UsaCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculadoraPoo calc = new CalculadoraPoo();		
			calc.setNumero1(10);
			calc.setNumero2(2);
			
			System.out.println("Numero1: "+ calc.getNumero1());
			System.out.println("Numero2: "+ calc.getNumero2());
			System.out.println("A soma: "+ calc.soma());
			System.out.println("A Subtração: "+ calc.sub());
			System.out.println("A Multiplicação: "+ calc.multi());
			System.out.println("A Divisão: "+ calc.divi());

}
}