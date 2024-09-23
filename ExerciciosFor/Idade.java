import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,at,an,idade,velho = 0,novo = 1000;
		System.out.println("Insira o ano atual:");
		at = ler.nextInt();
		for(i=1;i<11;i++) {
			System.out.println("Insira o ano que de nascimento do usuario:");
			an = ler.nextInt();
			idade = at-an;
			if (idade > velho) {
				velho = idade;
			}
			if (novo > idade) {
				novo = idade;
			}
				
			System.out.println("O usuario tem " + idade + " Anos");
		}
		System.out.println("O mais novo tem " + novo + " e o mais velho tem "+ velho );
		

	}
	
}
