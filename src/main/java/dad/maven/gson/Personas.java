package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class Personas {

	String name;
	String surname;
	int age;
	
	public Personas() {
	}

	public Personas(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public void RecogerDatos() {
		
		Scanner scn = new Scanner(System.in);
		
		try
		{				
			do
			{
				System.out.println("Introduzca nombre:");
				name = scn.nextLine();
				
			}while(name.equals(""));		
				
			do
			{
				System.out.println("Introduzca apellido:");
				surname = scn.nextLine();
				
			}while(surname.equals(""));
			
			do
			{
				try
				{
					System.out.println("Introduzca edad:");
					age = Integer.parseInt(scn.nextLine());
					break;
				}
				catch(Exception e)
				{
					continue;
				}
				
			}while(true);
			
			Personas person = new Personas(name, surname, age);
			
			String json = new GsonBuilder().setPrettyPrinting().create().toJson(person);
			System.out.println(json);
			
		}
		catch(Exception e)
		{
			System.out.println("Error " + e.getMessage().toString());
		}
		finally
		{
			scn.close();
		}		
	}	
}
