import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o enésimo");
		int n = entrada.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		
		for (int i = n; i > 0; i--) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
		}				
	}
}
