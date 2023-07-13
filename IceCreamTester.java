class IceCreamTester{

	public static void main(String args[]){
	
	IceCream.saveflavour("venila");
	IceCream.saveflavour("chocolate");
	IceCream.saveflavour("mango");
	IceCream.saveflavour("cherry");
	IceCream.saveflavour("strawberry");
	IceCream.saveflavour("pineapple");
	IceCream.getFlavours();
	
	IceCream.updateFlavour("venila","Venila");
	IceCream.updateFlavour("chocolate","Chocolate");
	IceCream.updateFlavour("mango","Mango");
	IceCream.updateFlavour("cherry","Cherry");
	IceCream.updateFlavour("strawberry","Strawberry");
	IceCream.updateFlavour("pineapple","Pineapple");
	
	IceCream.getFlavours();
	}
}