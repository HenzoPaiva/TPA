
public class Tabuada {
	public static void main(String[] args) {
		int i=1,n=1,r;
		while(11>i) {
			while(11>n) {
				r = (i*n);
				System.out.println(i+" X "+n+" = "+r);
				n = n+1;
				}
			System.out.println();
				i=1+i;
				n = 1;
			
		}

	}
}
