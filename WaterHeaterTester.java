class WaterHeaterTester{

	public static void main(String test[]){
	
        WaterHeater waterHeater = new WaterHeater();
        waterHeater.brandName = "samsung";
        waterHeater.model= "htp model";
        waterHeater.controlType = "electronic";
        waterHeater.price = 5000;
        waterHeater.capacity = 60;
        waterHeater.toBuy();
        System.out.println(waterHeater.brandName + ", " + waterHeater.model + ", " + waterHeater.controlType + ", " + waterHeater.price + ", " + waterHeater.capacity);
        
        WaterHeater waterHeater1 = new WaterHeater();
        waterHeater1.brandName = "somy";
        waterHeater1.model= "risk model";
        waterHeater1.controlType = "electric";
        waterHeater1.price = 7000;
        waterHeater1.capacity = 59;
        waterHeater1.toBuy();
        System.out.println(waterHeater1.brandName + ", " + waterHeater1.model + ", " + waterHeater1.controlType + ", " + waterHeater1.price + ", " + waterHeater1.capacity);
    }
}