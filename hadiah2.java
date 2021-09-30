import java.util.Scanner;
public class hadiah2 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		double fah,cel;
		int a;
		
		System.out.println("1. Fahrenheit to Celcius");
		System.out.println("2. Celcius to Fahrenheit");
		System.out.println();
		System.out.print("Pilih yang mana (1/2) : ");
		a = input.nextInt();
		if (a == 1) {
			System.out.print("Fahrenheit = ");
			fah = input.nextInt();
			cel = (fah - 32) * 5 / 9 ; 	
			System.out.println("Celcius = " +cel);	
		} else if (a == 2) {
			System.out.print("Celcius = ");
			cel = input.nextInt();
			fah = cel * 9 / 5 + 32 ;
			System.out.println("Fahrenheit = " +fah);
		} else {
			System.out.println("Masukkan nomor 1 atau 2 ya!");
		}
		
		
		}
		}
		