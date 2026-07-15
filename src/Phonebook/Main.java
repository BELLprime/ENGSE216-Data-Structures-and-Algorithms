package Phonebook;

import java.util.Scanner;

public class Main {
	static int sizeData;
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List list;
			String fname,lname,tel;
			int index;

			showInit();
			while(true) {
				System.out.print("Enter phonebook size or press Enter for default(5): ");
				String sizeStr = scanner.nextLine().trim();
				if (sizeStr.isEmpty()) {list = new List();sizeData = 5;break; }
				try {sizeData = Integer.parseInt(sizeStr);list = new List(sizeData);break;} 
				catch (NumberFormatException e) {System.out.println("Invalid size.Please enter a number or press Enter for default(5).");}
			} 
			/*setup in database*/list.setUp();
			while(true) {
				System.out.print("> ");
				String input = scanner.nextLine().toLowerCase().trim();
				if (input.equals("exit")) {
					System.out.println("Exit program.");
					break;
				}
				switch (input) {
				    case "add" -> {
						System.out.print("First name : ");fname = scanner.nextLine().trim();
						System.out.print("Last name  : ");lname = scanner.nextLine().trim();
						System.out.print("Tel.       : ");tel = scanner.nextLine().trim();
				        list.add(fname, lname, tel);
					}
				    case "delete" -> {
						index = indexInput(scanner);
				        list.delete(index-1);
					}
				    case "edit" -> {
				        index = indexInput(scanner);
						System.out.print("First name : "); fname = scanner.nextLine().trim();
						System.out.print("Last name  : "); lname = scanner.nextLine().trim();
						System.out.print("Tel.       : "); tel = scanner.nextLine().trim();
				        list.edit(index-1, fname, lname, tel);
					}
				    case "insert" -> {
				        index = indexInput(scanner);
						System.out.print("First name : "); fname = scanner.nextLine().trim();
						System.out.print("Last name  : "); lname = scanner.nextLine().trim();
						System.out.print("Tel.       : "); tel = scanner.nextLine().trim();
				        list.insert(index-1, fname, lname, tel);
					}
				    case "sort" -> list.sort();
					case "show" -> list.show();
					case "datasize" -> list.showCreateCount();
				    default -> System.out.println("Please try again.");
				}
			}
		}  catch (Exception e) {System.out.println("something went wrong.");}
	}
	static void showInit() {
		System.out.printf("%-6s %-10s %-10s\n", "Cmd :", "1.add", "2.delete");
		System.out.printf("%-6s %-10s %-10s\n", "", "3.edit", "4.insert");
		System.out.printf("%-6s %-10s %-10s\n", "", "5.sort", "6.show");
		System.out.printf("%-6s %-10s %-10s\n", "", "7.datasize", "8.exit");
	}
	static int indexInput(Scanner scanner) {
    	int target = -1;
    	boolean check = true;
    	while (check) {
    	    System.out.print("Target No. : ");
    	    try {
    	        int inputInt = Integer.parseInt(scanner.nextLine().trim());  
    	        if (inputInt >= 1 && inputInt <= sizeData) {
					target = inputInt;
					check = false;
    	        } else {System.out.println("Range is out of data size.");}
    	    } catch (NumberFormatException e) {System.out.println("Input numeric only."); }
    	}
    	return target;
	}
}
