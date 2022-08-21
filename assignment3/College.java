package week3.day1.assignment3;

public class College extends Students{
	
	public void getStudentInfo() {
		super.getStudentInfo();
		System.out.println("The Student details are Preetha, ECE");
	}
	public void getStudentInfo(int id) {
		System.out.println("The Student ID "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student id and name are "+id+" "+ name);
	}
	public void getStudentInfo(long phno,String email) {
		System.out.println("The Student's phone number "+ phno);
		System.out.println("The Student's email: "+ email);
	}

	public static void main(String[] args) {
		College c=new College();
		c.getStudentInfo();
		c.getStudentInfo(4568);
		c.getStudentInfo(4568, "Preetha");
		c.getStudentInfo(9999999999l, "xyz@gmail.com");
	}

}
