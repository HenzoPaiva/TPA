import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
	    int i = 1,b,e,r = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o numero que sera a base:");
		b = ler.nextInt();
		System.out.println("Insira o numero que sera o expoente:");
		e = ler.nextInt();
		
		    while (i <= e) {
                r = r*b;
                
                i = i+1;
		}
		System.out.print(r);
	ler.close();
	}

}
