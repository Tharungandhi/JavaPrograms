package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.Inventory;
import com.bridgelabz.util.InventoryList;
import com.bridgelabz.util.ObjectOrientedPrograms;

public class JSONInventory {

	@SuppressWarnings("static-access")
	static
	
	String str = "/home/admin1/Desktop/JSONInventoryDataManagement.json";
	static ObjectMapper objectMapper = new ObjectMapper();
	static List<InventoryList> originfile = new ArrayList<InventoryList>();
	static InventoryList inventoryList = new InventoryList();
	static List<Inventory> listOFInventories = new ArrayList<Inventory>();
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String reference = "";
		int z= 0;
		do {
			System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
			int choice = ObjectOrientedPrograms.readInteger();
			switch (choice)
			{
			case 1:
				reference = ObjectOrientedPrograms.readFile(str);
				try {
					originfile = objectMapper.readValue(reference, new TypeReference<List<InventoryList>>() {});
					ObjectOrientedPrograms.display(originfile);
				} catch (Exception e) {
					System.out.println("oops nothing is present in the file !! first add inputs on to file or select second choice");
				}
				break;
			case 2:
				String [] arr= {"","rice","wheat","pulses"};
				int ref = 1, flag = 0;
				while (ref == 1) {
				System.out.println("Select the inventory name \n 1.rice 2.wheat 3.pulses");
				int inventoryname=ObjectOrientedPrograms.readInteger();
				
				 
					for (InventoryList nameList : originfile) {
						if (arr[inventoryname].equals(nameList.getInventoryName())) {
							listOFInventories = nameList.getListOfInventories();
							Inventory inventory = ObjectOrientedPrograms.getInventories();
							listOFInventories.add(inventory);
							flag = 1;
						}
					}
					if (flag == 0) {
						Inventory inventory = ObjectOrientedPrograms.getInventories();
						listOFInventories.add(inventory);
						inventoryList = ObjectOrientedPrograms.insertNewInventory(arr[inventoryname], listOFInventories);
						originfile.add(inventoryList);
					}
					System.out.println("wish to add some more inventorry(1 or 0)");
					ref = ObjectOrientedPrograms.readInteger();
					
					
				}
				System.out.println("Entered elements has been added to list");
				String json = objectMapper.writeValueAsString(originfile);
				ObjectOrientedPrograms.writelist(json);
				System.out.println("Inventory list has been written on to file");
				break;
			case 3:
				reference = ObjectOrientedPrograms.readFile(str);
				originfile = objectMapper.readValue(reference, new TypeReference<List<InventoryList>>() {});
				ObjectOrientedPrograms.priceOFInventory(originfile);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("please select valid input");
				break;
			}
			System.out.println("Press 1 to continue");
			z=ObjectOrientedPrograms.readInteger();
			z++;
		}  while (z<100);
	}


}
