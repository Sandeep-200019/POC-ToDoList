import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	
	ArrayList<String> toDoList = new ArrayList<String>();
	Scanner input = new Scanner(System.in);


	public void Menu() {
		int option = 0;
		do {
			System.out.println("Select from the following Main Menu: ");
			System.out.println("1. Display the List");
			System.out.println("2. Add item to List");
			System.out.println("3. Remove item from List");
			System.out.println("4. Exit");
			option = input.nextInt();
		
			switch(option) {
			case 1:
				ListDisplay();
				break;
			
			case 2:
				AddToList();
				break;
			
			case 3:
				RemoveFromList();
				break;
			
			case 4:
				System.out.println("Exiting....");
				return;
			
			default:
				System.out.println("Invalid Choice");
			}
		
		} while(option < 4);
		
	}
	
	
	public void AddToList() {
		
		System.out.println("Enter the item to add to the List: ");
		String addItem = input.next();
		toDoList.add(addItem);
	}
	
	
	public void RemoveFromList() {
		
		System.out.println("Enter the index of the item to be removed: ");
		int index = input.nextInt();
		toDoList.remove(index - 1);
		
	}
	
	
	public void ListDisplay() {
		
		int number = 0;
		System.out.println("The List is: ");
		for(String item : toDoList) {
			System.out.println(++number+". " + item);
			System.out.println();
		}
	}
}
