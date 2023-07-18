class ChairTester{

    public static void main(String[] args){
        
        // Object creation in java
        Chair chair = new Chair();
        //ClassName referenceVariable = new ClassName();
        chair.name="Nirmala";
        chair.type="plastic";
        chair.color="Red";
        chair.price = 300.00;
        chair.toSit();

        //From here we can create a multiple copies by create a object to create a object we use new variable.

        Chair chair1 = new Chair();
        chair1.name = "NATION";
        chair1.type = "Plastic";
        chair1.color = "Green";
        chair1.price = 400.00;
        chair1.toSit();
    }
}
