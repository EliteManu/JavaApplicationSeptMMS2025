public class MainApp{
	public static void main(String[] args){
		Student student1 = new Student (1, "John","Willy",'M');
		Student student2 = new Student (2, "Favour","Dick",'F');
		Student student3 = new Student (1, "Jon","Milly",'M');
		Student student4 = new Student (1, "Boaz","Willy",'M');
		Student student5 = new Student (1, "Utomi","Willy",'M');
	

		student1.displayStudentInfo();
		System.out.println("=================");
		
		student2.displayStudentInfo();
		System.out.println("=================");
		
		student3.displayStudentInfo();
		System.out.println("=================");
		
		student4.displayStudentInfo();
		System.out.println("=================");
		
		student5.displayStudentInfo();
		System.out.println("=================");
		
		
		
		
	}
}