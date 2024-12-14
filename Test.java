package encapsulation.example4;

public class Test {
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		
		obj.setEmpName("Martin");
		obj.setEmpAge(34);
		obj.setSsn(112233);
		
		System.out.println("Employee Name"+" "+obj.getEmpName());
		System.out.println("Employee Age"+" "+obj.getEmpAge());
		System.out.println("Employee SSN"+" "+obj.getSsn());
	}
}
