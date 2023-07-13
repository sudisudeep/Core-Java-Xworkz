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
	System.out.println();
	//delete
	IceCream.deleteFlavour("Venila");
	IceCream.deleteFlavour("Chocolate");
	IceCream.deleteFlavour("Mango");
	IceCream.deleteFlavour("Cheery");
	IceCream.deleteFlavour("Strawberry");
	IceCream.deleteFlavour("Pineapple");

	//System.out.println(flavourName);

	IceCream.getDeletedFlavour(5);

	IceCream.searchIceCreamByflavourName("Venila");
    IceCream.searchIceCreamByflavourName("Chocolate");
	IceCream.searchIceCreamByflavourName("Mango");
	IceCream.searchIceCreamByflavourName("Cheery");
	IceCream.searchIceCreamByflavourName("Strawberry");
	IceCream.searchIceCreamByflavourName("Pineapple");
}  
}