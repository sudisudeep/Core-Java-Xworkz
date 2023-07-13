class Hotel{
static String foodMenus[]={"Pizza","Burger","Biryani","Butter Chicken","Samosa","Tandoori Chicken","Masala Dosa","Palak Paneer","Rogan Josh","Chole Bhature",
"Aloo Tikki","aneer Tikka","Vada Pav","Pani Puri","Chicken Tikka Masala","Dal Makhani","Mutton Biryani","Pav Bhaji","Chicken Biryani","Hyderabadi Dum Biryani",
"Fish Curry","Malai Kofta","Chicken Korma","Rajma Chawal","Dahi Vada","Gulab Jamun","Jalebi","Chicken Curry","Prawn Curry","Bhindi Masala","Rasmalai","Gobi Manchurian",
"Pesarattu","Chicken","Aloo Paratha","Mysore Masala Dosa","Chicken Chettinad","Kheer","Bhel Puri","Chicken Biryani","Chicken Shawarma","Chicken Tandoori",
"Chicken Vindaloo","Baingan Bharta","Malabar Paratha","Kathi Roll","Rasgulla","Aloo Gobi","Chana Masala","Keema Paratha"};

public static void main(String args[]){

System.out.println(" ");
System.out.println("The foodMenu are = ");
//Foreach loop (Through this we can acces all the value at a time).

for(String foodMenu : foodMenus){
	System.out.println(foodMenu);
}

}


}