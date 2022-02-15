import java.util.Scanner;

class App{
	public static void main (String [] args){
		System.out.println("Szalai Alexandra, 2022-02-15");
		System.out.println("Feladat 0301");
		System.out.println("Kor alapu kup terfogata");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sugar: ");
		int sugar = sc.nextInt();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terfogat =
		1.0/2.0 *
		Math.pow(sugar, 2) *
		Math.PI *
		magassag;
		
		System.out.println("Terfogat: " + terfogat);
		
		
		
		
	}
}

