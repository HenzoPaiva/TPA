import java.util.Scanner;
public class DiasMes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m;
		System.out.println("Insira o numero mês para saber quantos dias ele tem");
		m = ler.nextInt();
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("O mês tem 31 dias ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("O mês tem 30 dias");
			break;
		case 2:
			System.out.println("O mês tem 29 dias ");
			break;
		default:
			System.out.println("Numero de mês invalido");
		
			
			
			
	
		
		
		
		// Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro (31)
		// Abril,Junho,Setembro,Noverembro (30)
		
		}
	}
}
