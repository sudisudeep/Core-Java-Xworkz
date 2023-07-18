class ToyTester{

public static void main(String args[]){
        Toys toy1 = new Toys();
        toy1.name= "Super Speed Race Car";
        toy1.type= "Remote-Controlled Car";
        toy1.color= "Red";
        toy1.price= 1499;
        toy1.play();
        System.out.println(toy1.name+" "+toy1.type+" "+toy1.color+" "+toy1.price);

        Toys toy2 = new Toys();
        toy2.name= "Dancing Robot Buddy";
        toy2.type= "Interactive Robot";
        toy2.color= "Blue";
        toy2.price=   1999;
        System.out.println(toy2.name+" "+toy2.type+" "+toy2.color+" "+toy2.price);

    }
}