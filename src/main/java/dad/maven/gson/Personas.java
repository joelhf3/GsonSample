package dad.maven.gson;

import java.util.Scanner;

public class Personas {

	public void RecogerDatos() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduzca nombre:");
		String name = scn.nextLine();
		
		System.out.println("Introduzca apellido:");
		String surname = scn.nextLine();
		
		System.out.println("Introduzca edad:");
		int age = Integer.parseInt(scn.nextLine());
	}
	
}
