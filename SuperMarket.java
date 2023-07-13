class SuperMarket{

//Vegetables items - 5

static String vegetables[]={"potato","tomato","onion","ladiesfinger","Beans"};

//Biscutes items - 10

static String biscutes[]={"oreo","parleG","biskform","sunfeast","darkfantasy","chaskamaska","Goodday","marie","Britania","mcvitie"};

//Perfumes items - 10

static String perfumes[]={"KS","fog","beardo","gucci","maison","bvlgari","creedaventus","shot","givenchy","chanel"};

//Groceries items - 10

static String groceries[]={"rice","oil","Cereals","Soups","Frozenfoods","wheat","milk","cheese","eggs","meat"};

public static void main(String args[]){

getvegetables();
getperfumes();
getbiscutes();
getgroceries();

	
}

public static void getvegetables(){
System.out.println(" ");
for(String sudeep : vegetables){
System.out.println(sudeep);
}
}

public static void getbiscutes(){
System.out.println(" ");
for(String dell : biscutes){
System.out.println(dell);
}
}

public static void getperfumes(){
System.out.println(" ");
for(String rudresh : perfumes){
System.out.println(rudresh);
}
}

public static void getgroceries(){
System.out.println(" ");
for(String ganesh : groceries){
System.out.println(ganesh);
}
}
}