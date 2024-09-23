import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		int altura,teste;
		double pesoideal;
		String Sexo;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("Insira seu genero(f para feminino e m para masculino):");
			Sexo = ler.next();
			System.out.println("Insira sua altura em cm (apenas o numero):");
			altura = ler.nextInt();
			if(Sexo.equalsIgnoreCase("f")) {
				pesoideal = 52 + (0.67*(altura - 152.4));
			}
			else {
				pesoideal = 52 + (0.75*(altura - 152.4));
			}
			System.out.println("Seu peso ideal é " + Math.ceil(pesoideal) + "Kg");
				
			System.out.println("Deseja continuar executando o programa? (1-para Sim ou 2-para Não");
			teste = ler.nextInt();
			
			
		}
		while (teste == 1);
		
		
	ler.close();}

}
