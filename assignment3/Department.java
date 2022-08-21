package week3.day1.assignment3;

public class Department extends Students{
	
	public void getStudentInfo(int id,String name) {
		super.getStudentInfo();
		System.out.println("printing from child class: "+ id + name);
	}
	
	public static void main(String[] args) {
		Department d=new Department();
		d.getStudentInfo(4568, "Preetha");
	}

}
