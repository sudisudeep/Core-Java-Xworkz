class ShipTester{

	public static void main(String test[]){
	
		Ship ship = new Ship();
		ship.name = "rv john.martin";
		ship.length = "56ft";
		ship.horsepower = "1300hp";
		ship.capacity = 5000;
		ship.speed = "25kts";
		ship.toSail();
		System.out.println("the ship details are: ");
		System.out.println(ship.name + ", " + ship.length + ", " + ship.horsepower + ", " + ship.capacity + ", " + ship.speed);
	
		Ship ship1 = new Ship();
		ship1.name = "rv sheila b";
		ship1.length = "30ft";
		ship1.horsepower = "300hp";
		ship1.capacity = 250;
		ship1.speed = "20kts";
		ship1.toSail();
		System.out.println("the ship1 details are: ");
		System.out.println(ship1.name + ", " + ship1.length + ", " + ship1.horsepower + ", " + ship1.capacity + ", " + ship1.speed);
    }
}