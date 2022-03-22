package com.solvd.laba.RealStateAgency;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Customer cust1 = new Customer(42189423, "Keith Denysiuk", "3735404649");
		Owner own1 = new Owner(42222597, "Bruno Diaz", "3773508669");
		House how1 = new House(11111, "58 Matheu St, Cnel Du Graty, Chaco", 150);
		Apartment apt1 = new Apartment(21112, "1150 Las Heras Avenue, Resistencia, Chaco", 50);
		Apartment apt2 = new Apartment(21113, "545 Jose Marmol St, Resistencia, Chaco", 30);
		
		int properties;
		properties = 3;
		
		int[] arrP = new int[properties];
		String[] arrN = new String[properties];
		boolean[] arrO = new boolean[properties];
		
		//I set some values for testing:
		how1.setZone(500);
		how1.setZone2(200);
		how1.setHasHouseYard(true);
		how1.setRentPriceH(how1.getSuperface());
		arrP[0] = how1.getRentPriceH();
		arrN[0] = how1.getAdress();
		arrO[0] = how1.getHasHouseYard();
		apt1.setZone(500);
		apt1.setRentPriceA(apt1.getSuperface());
		apt1.setUniqueRoom(false);
		arrP[1] = apt1.getRentPriceA();
		arrN[1] = apt1.getAdress();
		arrO[1] = apt1.getUniqueRoom();
		apt2.setZone(750);
		apt2.setRentPriceA(apt1.getSuperface());
		apt2.setUniqueRoom(true);
		arrP[2] = apt2.getRentPriceA();
		arrN[2] = apt2.getAdress();
		arrO[2] = apt2.getUniqueRoom();
		
		int choise;
		String choise2;
		boolean choise3 = false;
		
		boolean flag;
		flag = true;
		
		System.out.println("Which type of building you want to choose?:"+"\nOption 1: Apartment"+"\nOption 2: House"+"\nOption 3: Office"+"\nOption 4: Premises");
		while(flag == true) {
			choise = input.nextInt();
			switch(choise) {
			case 1:
				System.out.println("Do you want a unique room apartment? (y/n)");
				while(flag == true) {
					choise2 = input.next();
					if (choise2.equalsIgnoreCase("y")) {
						System.out.println("You chose an Apartment with a unique room.");
						flag = false;
						choise3= true;
					} else if (choise2.equalsIgnoreCase("n")){
						System.out.println("You chose an Apartment with two or more rooms.");
						flag = false;
						choise3= false;
					} else {
						System.out.println("Invalid option, try again.");
					}
				}
				break;
			case 2:
				System.out.println("Do you want to have houseyard too? (y/n)");
				while(flag == true) {
					choise2 = input.next();
					if (choise2.equalsIgnoreCase("y")) {
						System.out.println("You chose an house with houseyard.");
						flag = false;
						choise3= true;
					} else if (choise2.equalsIgnoreCase("n")){
						System.out.println("You chose an house without houseyard.");
						flag = false;
						choise3= false;
					} else {
						System.out.println("Invalid option, try again.");
					}
				}
				break;
			case 3:
				System.out.println("Do you want a multi-office room? (y/n)");
				while(flag == true) {
					choise2 = input.next();
					if (choise2.equalsIgnoreCase("y")) {
						System.out.println("You chose a multi-office room.");
						flag = false;
						choise3= true;
					} else if (choise2.equalsIgnoreCase("n")){
						System.out.println("You a only office.");
						flag = false;
						choise3= false;
					} else {
						System.out.println("Invalid option, try again.");
					}
				}
				break;
				
			case 4:
				System.out.print("Do you want an industries premises? (y/n)");
				while(flag == true) {
					choise2 = input.next();
					if (choise2.equalsIgnoreCase("y")) {
						System.out.println("You chose an industries premises.");
						flag = false;
						choise3= true;
					} else if (choise2.equalsIgnoreCase("n")){
						System.out.println("You chose an non industries premises.");
						flag = false;
						choise3= false;
					} else {
						System.out.println("Invalid option, try again.");
					}
				}
				break;
				
			default:
				System.out.println("Invalid option, try again.");
			}
			
		}
		
		
		
		System.out.println("Enter your salary in AR$: ");
		cust1.setSalary(input.nextInt());
		System.out.println("The available properties for you are: ");
		for (int i=0; i<properties; i++) {
			if (cust1.getSalary() * 0.5 >=arrP[i] && arrO[i]==choise3) {
				System.out.println("Adress: "+arrN[i]+" Price per month: AR$ "+arrP[i]);
			}
		}
		
		
	}

}
