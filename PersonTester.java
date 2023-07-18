class PersonTester{

	public static void main(String test[]){
	
		Person person = new Person();
		person.name = "xyz";
		person.type = "stable";
		person.character = "good";
		person.gender = "male";
		person.age = 25;
		person.details();
		System.out.println(person.name + ", " + person.type + ", " + person.character + ", " + person.gender + ", " + person.age);
	
	
		Person person1 = new Person();
		person1.name = "abc";
		person1.type = "mental";
		person1.character = "super";
		person1.gender = "female";
		person1.age = 20;
		person1.details();
		System.out.println(person1.name + ", " + person1.type + ", " + person1.character + ", " + person1.gender + ", " + person1.age);
	
    }
}