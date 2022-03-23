package com.prog;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.prog.SDemo.BackStack;

public class S1Demo {
	enum Level1 {
		OPT_1("1.ENGLISH"), OPT_2("0.EXIT");

		private final String text;

		Level1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11 {
		OPT_11_1("1.RECHARGE"), OPT_11_2("2.CALLERTUNES"), OPT_11_3("3.COMPLAINTS"), OPT_11_4("9.BACK"),
		OPT_2("0.EXIT");

		private final String text;

		Level11(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_1 {
		OPT_11_1_1("1.DATA PACKS\n" + "Recharge Rs.51 and Get 6GB Data   Validity: Existing Plan\n"),
		OPT11_1_2("2.UNLIMITED PACKS\n"
				+ "Recharge Rs.299 and Get Data 2GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 28 Days\n"),
		OPT_11_1_3("3.TALKTIME PACKS\n" + "Recharge Rs.220 and Get TalkTime of Rs.220   Validity: 120 Days\n"),
		OPT11_1_4("9.BACK"), OPT11_1_5("0.EXIT");

		private final String text;

		Level11_1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_1_1 {
		OPT_11_1_1_1("1.DATA PACK RECHARGE SUCCESSFUL"), OPT_11_1_1_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_1_1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_1_2 {
		OPT_11_1_2_1("2.UNLIMITED PACK RECHARGE SUCCESSFUL"), OPT_11_1_2_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_1_2(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_1_3 {
		OPT_11_1_3_1("3.TALKTIME PACK RECHARGE SUCCESSFUL"), OPT_11_1_3_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_1_3(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_2 {
		OPT11_2_1("4.TAMIL SONG\n" + "Arabic Kuthu from Beast"), OPT11_2_2("5.ENGLISH SONG\n" + "Believer"),
		OP11_2_3("6.HINDI SONG\n" + "Jai Jai ShivShankar from War"), OPT11_2_4("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_2(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_2_1 {
		OPT11_2_1_1("1.TAMIL SONG SET SUCCESSFULLY"), OPT11_2_1_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_2_1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_2_2 {
		OPT11_2_2_1("2.ENGLISH SONG SET SUCCESFULLY"), OPT11_2_2_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_2_2(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_2_3 {
		OPT11_2_3_1("3.HINDI SONG SET SUCCESSFULLY"), OPT11_2_3_2("9.BACK"), OPT_2("0.EXIT");

		private final String text;

		Level11_2_3(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_3 {
		OPT11_3_1("1.NET ISSUE\n" + "Plese Contact 198 for Network and Services Complaints\n"),
		OPT11_3_2("2.QUIERY CALL\n" + "Please Contact 199 for Plans related queries\n"),
		OPT11_3_3("3.BALANCE CHECK\n" + "Please Contact 1860-893-3333 for Customer Care\n"), OPT11_3_4("9.BACK"),
		OPT11_3_5("0.EXIT");

		private final String text;

		Level11_3(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	static Stack<BackStack> backStack = new Stack<BackStack>();

	public static void main(String[] args) {
		int option;
		do {

			if (backStack.isEmpty()) {
				backStack.push(new BackStack(0, 0));
				print(0, 0);
			}
			System.out.println();
			System.out.println("Stacktop" + backStack.peek().level);
			System.out.println();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your option : ");
			option = sc.nextInt();
			if (option == 9) {
				backStack.pop();

				if (backStack.isEmpty()) {
					break;
				}

			} else {

				backStack.push(new BackStack(backStack.peek().getLevel() + 1, option));

			}
			BackStack top = backStack.peek();
			print(top.level, top.option);

		} while (option != 0);
		System.out.println("Thanks of visiting us");

	}

	public static void print(int level, int option) {
		for (String i : getOptions(level, option)) {
			System.out.println(i);
		}
	}

	static class BackStack {
		int level;
		int option;

		public BackStack(int level, int option) {
			this.level = level;
			this.option = option;

		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getOption() {
			return option;
		}

		public void setOption(int option) {
			this.option = option;
		}
	}

	static ArrayList<String> getOptions(int level, int option) {
		ArrayList<String> optionList = new ArrayList<String>();
		if (level == 0) {
			optionList.add(Level1.OPT_1.toString());
			optionList.add(Level1.OPT_2.toString());
		} else if (level == 1) {
			switch (option) {
			case (1):
				optionList.add(Level11.OPT_11_1.toString());
				optionList.add(Level11.OPT_11_2.toString());
				optionList.add(Level11.OPT_11_3.toString());
				optionList.add(Level11.OPT_11_4.toString());
				optionList.add(Level11.OPT_2.toString());
				System.out.println("Which service you want?");
				break;

			}
		} else if (level == 2) {
			switch (option) {

			case (1):
				optionList.add(Level11_1.OPT_11_1_1.toString());
				optionList.add(Level11_1.OPT11_1_2.toString());
				optionList.add(Level11_1.OPT_11_1_3.toString());
				optionList.add(Level11_1.OPT11_1_4.toString());
				optionList.add(Level11_1.OPT11_1_5.toString());
				break;

			case (2):
				optionList.add(Level11_2.OPT11_2_1.toString());
				optionList.add(Level11_2.OPT11_2_2.toString());
				optionList.add(Level11_2.OP11_2_3.toString());
				optionList.add(Level11_2.OPT11_2_4.toString());
				optionList.add(Level11_2.OPT_2.toString());
				break;

			case (3):
				optionList.add(Level11_3.OPT11_3_1.toString());
				optionList.add(Level11_3.OPT11_3_2.toString());
				optionList.add(Level11_3.OPT11_3_3.toString());
				optionList.add(Level11_3.OPT11_3_4.toString());
				optionList.add(Level11_3.OPT11_3_5.toString());
				break;
			}
		} else if (level == 3) {

			switch (option) {

			case (1):
				optionList.add(Level11_1_1.OPT_11_1_1_1.toString());
				optionList.add(Level11_1_1.OPT_11_1_1_2.toString());
				optionList.add(Level11_1_1.OPT_2.toString());
				break;

			case (2):
				optionList.add(Level11_1_2.OPT_11_1_2_1.toString());
				optionList.add(Level11_1_2.OPT_11_1_2_2.toString());
				optionList.add(Level11_1_2.OPT_2.toString());
				break;
			
			case (3):
				optionList.add(Level11_1_3.OPT_11_1_3_1.toString());
				optionList.add(Level11_1_3.OPT_11_1_3_2.toString());
				optionList.add(Level11_1_3.OPT_2.toString());
				break;
			

			}

		} 
		

		return optionList;
	}

}
