class Factorial {

	public static void main(String[] args){
	
	int number = Factorial.getFact(5);
	System.out.println(number);
	}
	int a[] = {89,67,45,3,1};
	
		for(int index = 0;index<a.length;index++){
		if(a[index]<a[index+1]){
		a[index] = a[index+1];
		}
	
	}
}