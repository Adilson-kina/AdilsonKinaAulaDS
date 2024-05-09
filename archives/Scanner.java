import java.util.Scanner;
public class Scanner{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float nota1;
		System.out.printf("Digite uma nota:");
		nota1 = input.nextFloat();
		System.out.println(nota1);
	}
}
