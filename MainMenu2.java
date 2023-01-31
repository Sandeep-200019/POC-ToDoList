import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Iterator;

public class MainMenu2 {

	int number = 0;
	Scanner input = new Scanner(System.in);
	HashMap<Integer,String> data = new HashMap<Integer,String>();
	
	public void Menu() {
		int option = 0;
		do {
			System.out.println("Select from the following Main Menu: ");
			System.out.println("1. Display the List");
			System.out.println("2. Add item to List");
			System.out.println("3. Remove item from List");
			System.out.println("4. Display a particular item int he list");
			System.out.println("5. Exit");
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
				ParticularItem();
				break;
				
			
			case 5:
				System.out.println("Exiting....");
				return;
			
			default:
				System.out.println("Invalid Choice");
			}
		
		} while(option < 5);
		
	}
	
	public void AddToList() {
		
		System.out.println("Enter the item to be added to the list");
		String addItem = input.next();
		
		
			data.put(++number,addItem);
		
		
	}
	
	public void RemoveFromList() {
		System.out.println("Enter the index of the item to be removed from the list");
		int removeItem = input.nextInt();
		
		data.replace(removeItem,"");
	}
	
	public void ListDisplay() {
		for(Map.Entry<Integer,String> entry : data.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}
	}
	
	public void ParticularItem() {
		System.out.println("Enter the index of the item you want to display");
		int partitem = input.nextInt();
		
		Iterator it = (Iterator) data.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if((Integer.valueOf((int)pair.getKey()) == partitem)) {
				if(data.containsValue("")) {
					System.out.println(partitem);
				}
				else {
					System.out.println(pair.getKey() + ". " + pair.getValue());
				}
				
				
			}
			
		}
		
		
		
	}
}
