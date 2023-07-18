 class HelmetTester{
	
	
        public static void main(String s[]){															
         
            Helmet helmet = new Helmet();
            helmet.brandname = "lazer";
            helmet.thickness = "22-25mm";
            helmet.quality = "good quality foam";
            helmet. weight = "1.2kg";
            helmet.price = 500;
            helmet.toWear();
            System.out.println(helmet.brandname + ", "+ helmet.thickness + ", "+ helmet.quality + ", "+ helmet.weight + ", "+ helmet.price);
        
            Helmet helmet1 = new Helmet();
            helmet1.brandname = "Aral";
            helmet1.thickness = "22-25mm";
            helmet1.quality = "good quality foam";
            helmet1. weight = "1.2kg";
            helmet1.price = 600;
            helmet1.toWear();
            System.out.println(helmet1.brandname + ", "+ helmet1.thickness + ", "+ helmet1.quality + ", "+ helmet1.weight + ", "+ helmet1.price);
        }    
}
