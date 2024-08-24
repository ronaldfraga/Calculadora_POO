
import java.util.Scanner;


public class UsaCalculadoraComMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaSTR  = new Scanner(System.in);
		
		CalculadoraPoo calc = new CalculadoraPoo();	
		
		int opcao = 0;
		
		do {
			
	//Criando menu de opções:
			
			System.out.println("-----------------------------------------------");
			System.out.println("---Calculadora ----");
			System.out.println("-----------------------------------------------");
			System.out.println("1) Entre com o numero 1 (" +calc.getNumero1() +")");
			System.out.println("2) Entre com o numero 2 (" +calc.getNumero2() +")");
			System.out.println("3) Somar");
			System.out.println("3) Somar");
			System.out.println("4) Subtrair");
			System.out.println("5) Dividir");
			System.out.println("6) Multiplicar");
			System.out.println("7) Sair");
			System.out.println("-----------------------------------------------");
			System.out.println("Opção");
			opcao = leia.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.print("Digite o primeiro número: ");
				calc.setNumero1 ( leia.nextInt() );
				break;
			
			case 2:	
				System.out.print("Digite o segundo número: ");
				calc.setNumero2 ( leia.nextInt() );
				break;
				
			case 3:	
				System.out.println("A Soma é: "+ calc.soma());
				break;
				
			case 4:
				System.out.println("A Subtração é: "+ calc.sub());
				break;
				
			case 5:
				System.out.println("A Divisão é: "+ calc.divi());
				break;
				
			case 6:
				System.out.println("A Multiplicação é: "+ calc.multi());
				break;
				
			case 7:
				System.out.println("Fim do programa");
				break;
				
			default:
				System.out.println("Valor inválido, Tente novamente!");
				
			}
				
			
			
		} while( opcao != 7);
		
				
		
		
		
			
//Onde retornam os resultados dos calculos
			
			System.out.println("Numero1: "+ calc.getNumero1());
			System.out.println("Numero2: "+ calc.getNumero2());
			System.out.println("A soma: "+ calc.soma());
			System.out.println("A Subtração: "+ calc.sub());
			System.out.println("A Multiplicação: "+ calc.multi());
			System.out.println("A Divisão: "+ calc.divi());

}
}