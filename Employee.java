package com.prog;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	static class EmployeeInfo{
	
		int EmpId;
		String Name;
		String Doj;
		String Gender;

		public int getEmpId() {
			return EmpId;
		}

		public void setEmpId(int EmpId) {
			this.EmpId = EmpId;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getDoj() {
			return Doj; 
		}

		public void setDoj(String doj) {
			Doj = doj;
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
			System.out.print("Enter the Number of Employees : ");
			int EmpCount = Integer.parseInt(sc.nextLine());
			System.out.println();
		ArrayList<EmployeeInfo> Employees = new ArrayList<>();
			for (int i = 0; i < EmpCount; i++) {
				EmployeeInfo s = new EmployeeInfo();
				System.out.print("Enter the Name (ALPHAPET ONLY) :");
				s.setName(sc.nextLine());
				System.out.println();
				System.out.print("Enter the EmpId (NUMBERS ONLY) : ");
				s.setEmpId(Integer.parseInt(sc.nextLine()));
				System.out.println();

				System.out.print("Enter the DOJ (NUMBERS ONLY) : ");
				s.setDoj(sc.nextLine());
				System.out.println();
				System.out.print("Enter the Gender (ALPHAPET ONLY) : ");
				s.setGender(sc.nextLine());
				System.out.println();
				Employees.add(s);
			}
			System.out.println();
			System.out.println("+-------+-------+---------------+-------+");
			System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
			System.out.println("+-------+-------+---------------+-------+");
			for (int i = 0; i < Employees.size(); i++) {
				System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t" + "|"
						+ Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
				System.out.println("+-------+-------+---------------+-------+");

			}
			System.out.println();
			System.out.println("__________***********_________\n");
			System.out.println("Select the Option What you want to Modify "+"\n");
			System.out.println("If you want to add Employee details press 1\n");
			System.out.println("If you want to remove Employee details press 2\n");
			System.out.print("If you want to get Employee details press 3\n");
			System.out.println();
			System.out.println("If you want to close the tab press 4\n");
			System.out.print("Enter the option : ");
			int option = sc.nextInt();
			do {

				if (option == 1) {
					EmployeeInfo s = new EmployeeInfo();
					System.out.println();
					System.out.print("Enter the Position value to Add details : ");
					int Position = sc.nextInt();
					sc.nextLine();
					System.out.println();
					int index = Position - 1;

					System.out.print("Enter the Name (ALPHAPET ONLY) : ");
					s.setName(sc.nextLine());
					System.out.println();

					System.out.print("Enter the Employee Id (NUMBERS ONLY) : ");
					s.setEmpId(Integer.parseInt(sc.nextLine()));
					System.out.println();

					System.out.print("Enter the Doj (NUMBERS ONLY) : ");
					s.setDoj(sc.nextLine());
					System.out.println();
					System.out.print("Enter the Gender (ALPHAPET ONLY) : ");
					s.setGender(sc.nextLine());
					System.out.println();
					Employees.add(index, s);

					System.out.println("+-------+-------+---------------+-------+");
					System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
					System.out.println("+-------+-------+---------------+-------+");
					for (int i = 0; i < Employees.size(); i++) {
						System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t"
								+ "|" + Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
						System.out.println("+-------+-------+---------------+-------+");

					}
					System.out.println();
					System.out.println("If you want to add Employee details press 1\n");
					System.out.println("If you want to remove Employee details press 2\n");
					System.out.println("If you want to get Employee details press 3\n");
					System.out.println("If you want to close the tab press 4\n");
					System.out.print("Enter the option : ");
					option = sc.nextInt();
					System.out.println();
				}

				if (option == 2) {
					System.out.print("Enter the EmpId to Remove : ");
					int Empid = sc.nextInt();
					sc.nextLine();
					System.out.println();
					for (int i = 0; i < Employees.size(); i++) {
						if (Employees.get(i).getEmpId() == Empid) {
							Employees.remove(i);

						}

					}

					System.out.println("+-------+-------+---------------+-------+");
					System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
					System.out.println("+-------+-------+---------------+-------+");
					for (int i = 0; i < Employees.size(); i++) {
						System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t"
								+ "|" + Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
						System.out.println("+-------+-------+---------------+-------+");

					}
					System.out.println();
					System.out.println("If you want to add Employee details press 1\n");
					System.out.println("If you want to remove Employee details press 2\n");
					System.out.println("If you want to get Employee details press 3\n");
					System.out.println("If you want to close the tab press 4\n");
					System.out.print("Enter the option : ");
					option = sc.nextInt();
				}
				if(option ==3) {
					System.out.println();
					System.out.print("Enter the EmpId to Get the Details : ");
					int EmpId = sc.nextInt();
					sc.nextLine();
					System.out.println();
					for (int i = 0; i < Employees.size(); i++) {
						if (Employees.get(i).getEmpId() == EmpId) {
							System.out.println("+-------+-------+---------------+-------+");
							System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
							System.out.println("+-------+-------+---------------+-------+");
							
								System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t"
										+ "|" + Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
								System.out.println("+-------+-------+---------------+-------+");


						}

					}
					
						
					
					System.out.println();
					System.out.println("If you want to add Employee details press 1\n");
					System.out.println("If you want to remove Employee details press 2\n");
					System.out.println("If you want to get Employee details press 3\n");
					System.out.println("If you want to close the tab press 4\n");
					System.out.print("Enter the option : ");
					option = sc.nextInt();
				}
				if (option == 4) {
					sc.close();
					System.out.println("\n________***Scanner Closed***________ ");

				}

				if (option > 4) {
					System.out.println("*Check the Option* and **Retry**");
					System.out.println("If you want to add Employee details press 1\n");
					System.out.println("If you want to remove Employee details press 2\n");
					System.out.println("If you want to get Employee details press 3\n");
					System.out.println("If you want to close the tab press 4\n");

					System.out.print("Enter the option : ");
					option = sc.nextInt();
				}

			} while (option != 4);

		}
	

}
