class Satellitetst{
	
	public static void main(String s[]){															
	 
		Satellite satellite = new Satellite();
		satellite.orbit = "meo";
		satellite.mass = "tons";
		satellite.power = "sunlight";
		satellite.communication = "antennas";
		satellite.lifespan = "short";
		satellite.toLanuch();
		System.out.println(satellite.orbit + ", "+ satellite.mass + ", "+ satellite.power + ", "+ satellite.communication + ", "+ satellite.lifespan);
		
		
	Satellite satellite2 = new Satellite();
		satellite2.orbit = "geo";
		satellite2.mass = "tons";
		satellite2.power = "fuel";
		satellite2.communication = "antennas";
		satellite2.lifespan = "long";
		satellite2.toLanuch();
		System.out.println(satellite2.orbit + ", "+ satellite2.mass + ", "+ satellite2.power + ", "+ satellite2.communication + ", "+ satellite2.lifespan);
    }
}