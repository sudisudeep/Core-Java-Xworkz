public class DoorTester {
    
    public static void main(String[] args) {
        
        System.out.println("Creating 1st copy of Door");
        Door door = new Door();
        door.Brand= "VOLO";	
        door.material = "Brass";
        door.price= 6700;
        door.lockType = "key lock";
        door.security();
        System.out.println(door.Brand+ " "+door.material+ "  "+door.material+ ""+door.lockType );

        System.out.println("Creating 2nd copy of Door");
        Door door1 = new Door();
        door1.Brand= "maxon door";	
        door1.material = "wood";
        door1.price= 2500;
        door1.lockType = "smart lock";
        door1.security();
        System.out.println(door1.Brand+ " "+door1.material+ "  "+door1.material+ ""+door1.lockType );
    }
}
