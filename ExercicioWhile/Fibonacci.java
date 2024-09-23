import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
	    int i = 1,anterior = 0,n, temp ,atual = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira até qual termo da sequencia de fibonacci você deseja saber:");
		n = ler.nextInt();
	    while(i<=n){
	        System.out.println(atual);
	            temp = atual;
	            atual = atual+anterior;
	            anterior = temp;
	            i = i+1;}
	   ler.close();
	    }

}
