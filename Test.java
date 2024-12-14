package encapsulation.example5;

public class Test {
	public static void main(String[] args) {
		
		Encapsulate obj=new Encapsulate();
		
		obj.setName("Harsh");
		obj.setAge(22);
		obj.setRoll(2);
		
		System.out.println("Name :"+" "+obj.getName());
		System.out.println("Age :"+" "+obj.getAge());
		System.out.println("Roll :"+" "+obj.getRoll());
	}
}
