import java.util.Scanner;
public class Escolinha {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		System.out.println("Insira a idade do aluno para saber a qual categoria ele pertence:");
		a = ler.nextInt();
		switch(a) {
		case 6:
			System.out.println("O aluno � dente de leite");
			break;
		case 7:
			System.out.println("O aluno � j�nior");
			break;
		case 8:
			System.out.println("O aluno � j�nior max");
			break;
		case 9:
			System.out.println("O aluno � j�nior master");
			break;
		case 10:
			System.out.println("O aluno � master");
			break;
		default:
			System.out.println("idade invalidade");
			break;
		}
	}

}
