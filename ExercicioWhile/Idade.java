import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);
		int i = 1, a,n,id;
		System.out.println("Insira o ano atual:");
		a = ler.nextInt();
		
		while (i<7) {
			System.out.println("Insira seu ano de nascimento");
			n = ler.nextInt();
			id = (a - n);
			if (18>id)
				System.out.println("Você tem " + id + " Anos e é Menor de Idade");
			else
				System.out.println("Você tem " + id + " Anos e é Maior de idade");
			System.out.println(" ");
			
			i = (i+1);
			;
		}
		ler.close();
	}
}
