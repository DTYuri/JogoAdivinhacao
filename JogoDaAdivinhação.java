import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numberSorteado;
		int attempts;
		int number;
		
		do {
			System.out.println("Ao desenhar um número, digite 0 ... 100\n");
			Random numeroAleatorio = new Random();
			numberSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("O jogo começou, boa sorte!");
			attempts = 0;
			
		do {
				attempts++;
				System.out.printf("tentativa %d:", attempts);
				number = entrada.nextInt();
				
				if(number > numberSorteado) {
					System.out.printf("O numerp é menor que %d... \n\n", number);
				} else if (number < numberSorteado) {
					System.out.printf("O numero é maior que %d \n\n", number);
				} else {
					System.out.printf("\n\n Parabéns, você acertou! %d Tentativas\n\n", attempts);
				}
				
		}while (number != numberSorteado);
				System.out.println("Tecle 0 para sair ou qualquer outro número para continuar:");
				continuar = entrada.nextInt();
				
		}while (continuar != 0);
		entrada.close();
		
	}

}