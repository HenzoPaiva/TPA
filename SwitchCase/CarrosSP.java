import java.util.Scanner;
public class CarrosSP {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("Insira o ultimo numero da placa do seu carro para saaber que dia da semana seu carro n�o pode circular:");
		n = ler.nextInt();
		switch(n) {
		case 1:
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
		case 4:
			System.out.println("Ter�a");
			break;
		case 5:
		case 6:
			System.out.println("Quarta");
			break;
		case 7:
		case 8:
			System.out.println("Quinta");
			break;
		case 9:
		case 0:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Numero Invalido");
		//1 2 na segunda, 3 4 na ter�a, 56 na quarta, 78 na quinta, 90 na sexta
		
		}
				
	}

}

 