class ProjectorTester{

        public static void main(String args[]){

        Projector projector1 = new Projector();
        projector1.name= "Epson Home Cinema 2150";
        projector1.type= "Home Theater Projector";
        projector1.color= "Black";
        projector1.price=  55999;
        System.out.println(projector1.name+" "+projector1.type+" "+projector1.color+" "+projector1.price);

        Projector projector2 = new Projector();
        projector2.name= "Optoma HD146X";
        projector2.type= "1080p Home Theater Projector";
        projector2.color= "White";
        projector2.price=  49999;
        System.out.println(projector2.name+" "+projector2.type+" "+projector2.color+" "+projector2.price);
    }
}