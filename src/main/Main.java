package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import iterator.ApplicantIterator;
import model.Applicant;
import state.FinishState;

public class Main {
	
	public String codeGenerator() {
		StringBuilder code = new StringBuilder();
		String characters = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		String temp = "";
		for(int i = 0; i < 5; i++) {
			Integer index = random.nextInt(characters.length());
			code.append(characters.charAt(index));
		}
		temp = code.toString();
		return temp;
	}

	public Main() {
		int choice = -1;
		String name = "";
		Integer experience = -1;
		String preference = "";
		Scanner sc = new Scanner(System.in);
		String next = "";
		ArrayList<Applicant> applicants = new ArrayList<>();
		
		do {
			System.out.println("1. Register New Applicant Form");
			System.out.println("2. View Form");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				do {
					System.out.println("Enter your name: ");
					name = sc.nextLine();
				} while(name.equals(""));
				
				do {
					System.out.println("Enter your job experience [> 1]: ");
					experience = sc.nextInt();
					sc.nextLine();
				} while (experience < 1);
				
				do {
					System.out.println("Enter your job preference [Frontend Dev || Backend Dev]: ");
					preference = sc.nextLine();
				} while(!preference.equals("Frontend Dev") && !preference.equals("Backend Dev"));
				
				String code = codeGenerator();
				
				Applicant applicant = new Applicant(name, code, preference, experience);
				
				applicants.add(applicant);
			} else if(choice == 2) {
				if(applicants.isEmpty()) {
					System.out.println("Kosong bg");
				} else {
					ApplicantIterator iterator = new ApplicantIterator(applicants);
					while(iterator.hasNext()) {
						Applicant applicant = iterator.getNext();
						applicant.displayInformation();
						
						do {
							System.out.println("Preview next application form? [N for Next | Q to quit: ");
							next = sc.nextLine();
						}while(!next.equals("Q") && !next.equals("N"));
						
						if(next.equals("N")) {
							if(applicant.getState() instanceof FinishState) {
								applicants.remove(applicant);
							} else {
								applicant.getState().changeState();
							}
						}
					}
					
				}
			} else if(choice == 3) {
				System.out.println("Makasi bg");
			}
		}while(choice!=3);
	}

	public static void main(String[] args) {
		new Main();

	}

}
