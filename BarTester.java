public class BarTester {
    
    public static void main(String[] args) {
        Bar bar1 = new Bar();
        bar1.name = "Wine & dine";
        bar1.type = "Bar & Restorent";
        
        System.out.println(bar1.name + " " + bar1.type);

        Bar bar2 = new Bar();
        bar2.name = "Fox club";
        bar2.type = "Bar & Restorent";
        
        System.out.println(bar2.name + " " + bar2.type);
    }
}
