import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		int i=1,n,p=0,r;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero que você deseja saber se é primo:");
		n = ler.nextInt();
		if (n<2) {
			System.out.println("Não é primo");
		}
		else {
			while(i<=n) {
				r = n % i;
				if(r>0){
					p = p+0;
					
				}
				else { p = p+1;}
				i = i+1;
				
			}
		if(p<2 || p>2){
			System.out.println("Não é primo");
			
			}
		else {
			System.out.println("É Primo");
		 }
			
		}
	ler.close();}

}
