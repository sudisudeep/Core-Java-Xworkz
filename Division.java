class Division{
	
	public static void main(String[] args){
		System.out.println(sub(100,2));
		System.out.println(sub(120,3));
		System.out.println(sub(120,12,2));
		System.out.println(sub(140,6,2));
		
	}
	
	public static int sub(int a,int b){
		return a/b;
	}
	
	public static int sub(int a,int b, int c){
		return a/b/c;
	}
	
	
	
}