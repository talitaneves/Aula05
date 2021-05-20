import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		int resultado;
		
		System.out.println("Digite o valor que você deseja a tabuada: ");
		numero = leitor.nextInt();
		
		for(int i=1; i<=10; i++) {
			resultado = i *  numero;
		
			System.out.println(numero + " x " + i + " = " + resultado);
			
		}
		leitor.close();
		
	}

}
