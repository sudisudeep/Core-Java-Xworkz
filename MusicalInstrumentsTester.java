class MusicalInstrumentsTester{
    public static void main(String[] args){
		
        MusicalInstruments instrument1 = new MusicalInstruments();
        instrument1.name = "Guitar";
        instrument1.strings = "Fender";
        instrument1.material = "gold";
        instrument1.shape = "Acoustic Lane";
        instrument1. price= 50;
        instrument1.music();
        System.out.println(instrument1.name + ", "+ instrument1.strings + ", "+ instrument1.material + ", "+ instrument1.shape + ", "+ instrument1.price);
       
	    MusicalInstruments instrument2 = new MusicalInstruments();
        instrument2.name = "piano";
        instrument2.strings = "no";
        instrument2.material = "wood";
        instrument2.shape = "Acoustic Lane";
        instrument2. price= 4000;
        instrument2.music();
        System.out.println(instrument2.name + ", "+ instrument2.strings + ", "+ instrument2.material + ", "+ instrument2.shape + ", "+ instrument2.price);	
    }
}