import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
	    int i = 1,n,r = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o numero que você deseja saber o fatorial:");
		n = ler.nextInt();
		
		    while (i <= n) {
                r = r*i;
                i = i+1;
		}
		System.out.print(r);
	ler.close();
	}

}
