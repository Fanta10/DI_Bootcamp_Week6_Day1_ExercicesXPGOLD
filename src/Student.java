
public class Student {
	
	private String name;
	private int age;
	private String course;
	private char grade;
	
	
	public Student() {
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String course, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.grade = grade;
	}
	
	public void displayStudentInfoName(){
		System.out.println("Name : " + this.name + " , Age : " + this.age + 
				" , Course : " + this.course + " , Grade : " + this.grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student("Yasmine" , 15);
		Student student3 = new Student("Yasmine" , 15, "mathematiqyes", 'A');
		
		student1.displayStudentInfoName();
		student2.displayStudentInfoName();
		student3.displayStudentInfoName();

	}

}
