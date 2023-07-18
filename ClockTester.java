public class ClockTester {
    
    public static void main(String[] args) {
        
        Clock clock =new Clock();
        clock.name = "Rolex";
        clock.type = "Analog";
        clock.price = 800000;
        clock.quantity = 1;

        System.out.println(clock.name +" "+ clock.type +" "+ clock.price +" "+ clock.quantity);

        Clock clock1 =new Clock();
        clock1.name = "Ajantha";
        clock1.type = "Analog";
        clock1.price = 500;
        clock1.quantity = 1;

        System.out.println(clock1.name +" "+ clock1.type +" "+ clock1.price +" "+ clock1.quantity);

    }
}
