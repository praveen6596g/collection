package Inheritance;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher te=new Teacher();
		te.name="praveen";
		te.age=26;
		te.gender="male";
		System.out.println("name="+te.name+",age="+te.age+",gender="+te.gender);
		System.out.println(te.sleepingHours(8));
		System.out.println(te.eating(3));
	}

}
