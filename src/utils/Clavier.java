package utils;

import java.util.Scanner;

public class Clavier {

	public static void main(String[] args) {
		int numberInteger = readInt();
		double numberDouble = readDouble();
		String yourString = readString();
		System.out.println("*******************************");
		System.out.println("*********   your data     *****");
		System.out.println("*******************************");
		System.out.println("integer = " + numberInteger);
		System.out.println("double = " + numberDouble);
		System.out.println("String = " + yourString);

	}
	
	public static int readInt() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		while (flag) {
			try {
				flag = false;
				System.out.println();
				System.out.println("Give me an Integer..:");
				String nombre1 = scanner.nextLine();
				i = Integer.parseInt(nombre1);
				scanner.close();
			} 
			catch(Exception e){
				System.out.println("It must be an Integer");
				flag = true;
			}
		}
		System.out.println("integer = " + i);
		return i;
	}
	
	public static double readDouble() {
		Scanner scanner = new Scanner(System.in);
		double i = 0;
		boolean flag = true;
		while (flag) {
			try {
				flag = false;
				System.out.println();
				System.out.println("Give me a Double..:");
				String nombre1 = scanner.nextLine();
				i = Double.parseDouble(nombre1);
				scanner.close();
			} 
			catch(Exception e){
				System.out.println("It must be a double");
				flag = true;
			}
		}
		System.out.println("double = " + i);
		return i;
	}
	
	public static String readString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me an String..:");
		String i = scanner.nextLine();
		scanner.close();
		
		System.out.println("String = " + i);
		return i;
	}

}
