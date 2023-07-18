class RocketTest{

	public static void main(String test[]){
	
		Rocket rocket = new Rocket();
		rocket.vehicle = "alpha";
		rocket.leo = 1000;
		rocket.origin = "us";
		rocket.manufacture = "firefly";
		rocket.failure = 2;
		rocket.currentRockets();
		System.out.println(rocket.vehicle + ", " + rocket.leo + ", " + rocket.origin + ", " + rocket.manufacture + ", " + rocket.failure);
	
		Rocket rocket1 = new Rocket();
		rocket1.vehicle = "angara a5";
		rocket1.leo = 24000;
		rocket1.origin = "russia";
		rocket1.manufacture = "khrunichev";
		rocket1.failure = 3;
		rocket1.currentRockets();
		System.out.println(rocket1.vehicle + ", " + rocket1.leo + ", " + rocket1.origin + ", " + rocket1.manufacture + ", " + rocket1.failure);
    }
}