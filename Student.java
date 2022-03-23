package com.prog;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	static class StudentInfo {
		int rollNumber;
		String Name;
		int Age;
		String Gender;

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Students : ");
		int StuCount = Integer.parseInt(sc.nextLine());
		System.out.println();
		ArrayList<StudentInfo> Students = new ArrayList<>();
		for (int i = 0; i < StuCount; i++) {
			StudentInfo s = new StudentInfo();
			System.out.print("Enter the Name (ALPHAPET ONLY) :");
			s.setName(sc.nextLine());
			System.out.println();
			System.out.print("Enter the Roll Number (NUMBERS ONLY) : ");
			s.setRollNumber(Integer.parseInt(sc.nextLine()));
			System.out.println();

			System.out.print("Enter the Age (NUMBERS ONLY) : ");
			s.setAge(Integer.parseInt(sc.nextLine()));
			System.out.println();
			System.out.print("Enter the Gender (ALPHAPET ONLY) : ");
			s.setGender(sc.nextLine());
			System.out.println();
			Students.add(s);
		}
		System.out.println();
		System.out.println("+-------+-------+-------+-------+");
		System.out.println("|Name\t|Roll\t|Age\t|Gender\t|");
		System.out.println("+-------+-------+-------+-------+");

		for (int i = 0; i < Students.size(); i++) {
			System.out.println(Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollNumber() + "\t" + "|"
					+ Students.get(i).getAge() + "\t" + "|" + Students.get(i).getGender() + "\t" + "|");
			System.out.println("+-------+-------+-------+-------+");
		}
		System.out.println();
		System.out.println("__________***********_________\n");
		System.out.println("Select the Option What you want to Modify " + "\n");
		System.out.println("If you want to add details press 1\n");
		System.out.println("If you want to remove details press 2\n");
		System.out.println("If you want to close the tab press 3\n");

		int option = sc.nextInt();
		do {

			if (option == 1) {
				StudentInfo s = new StudentInfo();
				System.out.print("Enter the Position value to Add details : ");
				int Position = sc.nextInt();
				sc.nextLine();
				System.out.println();
				int index = Position - 1;

				System.out.print("Enter the Name (ALPHAPET ONLY) : ");
				s.setName(sc.nextLine());
				System.out.println();

				System.out.print("Enter the Roll Number (NUMBERS ONLY) : ");
				s.setRollNumber(Integer.parseInt(sc.nextLine()));
				System.out.println();

				System.out.print("Enter the Age (NUMBERS ONLY) : ");
				s.setAge(Integer.parseInt(sc.nextLine()));
				System.out.println();
				System.out.print("Enter the Gender (ALPHAPET ONLY) : ");
				s.setGender(sc.nextLine());
				System.out.println();
				Students.add(index, s);

				System.out.println("+-------+-------+-------+-------+");
				System.out.println("|Name\t|Roll\t|Age\t|Gender\t|");
				System.out.println("+-------+-------+-------+-------+");
				for (int i = 0; i < Students.size(); i++) {
					System.out.println(Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollNumber() + "\t"
							+ "|" + Students.get(i).getAge() + "\t" + "|" + Students.get(i).getGender() + "\t" + "|");
					System.out.println("+-------+-------+-------+-------+");

				}
				System.out.println();
				System.out.println("If you want to add details press 1\n");
				System.out.println("If you want to remove details press 2\n");
				System.out.println("If you want to close the tab press 3\n");

				System.out.print("Enter the option : ");
				option = sc.nextInt();
				System.out.println();
			}

			if (option == 2) {
				System.out.print("Enter the RollNumber to Remove : ");
				int Roll = sc.nextInt();
				sc.nextLine();
				System.out.println();
				for (int i = 0; i < Students.size(); i++) {
					if (Students.get(i).getRollNumber() == Roll) {
						Students.remove(i);

					}

				}

				System.out.println("+-------+-------+-------+-------+");
				System.out.println("|Name\t|Roll\t|Age\t|Gender\t|");
				System.out.println("+-------+-------+-------+-------+");
				for (int i = 0; i < Students.size(); i++) {
					System.out.println(Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollNumber() + "\t"
							+ "|" + Students.get(i).getAge() + "\t" + "|" + Students.get(i).getGender() + "\t" + "|");
					System.out.println("+-------+-------+-------+-------+");

				}
				System.out.println();
				System.out.println("If you want to add details press 1\n");
				System.out.println("If you want to remove details press 2\n");
				System.out.println("If you want to close the tab press 3\n");

				System.out.print("Enter the option : ");
				option = sc.nextInt();
			}
			if (option == 3) {
				sc.close();
				System.out.println("\n________***Scanner Closed***________ ");

			}

			if (option > 3) {
				System.out.println("*Check the Option* and **Retry**");
				System.out.println();
				System.out.println("If you want to add details press 1\n");
				System.out.println("If you want to remove details press 2\n");
				System.out.println("If you want to close the tab press 3\n");

				System.out.print("Enter the option : ");
				option = sc.nextInt();
			}

		} while (option != 3);

	}
}
