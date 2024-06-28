package composition;

import java.util.ArrayList;
import java.util.List;

class Room {
	
	String type;
	String floor;
	
	public Room(String type, String floor)
	{
		this.type = type;
		this.floor = floor;
	}
	
}

class Building{
	
	String name;
	private List<Room> rooms;
	
	public Building(String name, List<Room> rooms)
	{
		this.name = name;
		this.rooms = rooms;
	}
	
	public List<Room> getTotalRoomsOfBuilding()
	{
		return rooms;
	}
	
}

public class Composition2 {

	public static void main(String[] args) {
		
		Room r1 = new Room("2BHK", "2");
		Room r2 = new Room("2BHK", "3");
		Room r3 = new Room("3BHK", "2");
		Room r4 = new Room("4BHK", "3");
		
		List<Room> rooms = new ArrayList<Room>();
		
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		
		Building building = new Building("shantiniketan", rooms);
		
		System.out.println(building.name+ " building");
		
		List<Room> data = building.getTotalRoomsOfBuilding();
		
		for(Room room : data) {
			
			System.out.println("Type: "+ room.type + " and " + "floor: "+ room.floor);
			
		}
		
		

	}

}
