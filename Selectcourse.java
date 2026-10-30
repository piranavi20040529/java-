import java.util.Scanner;
class Selectcourse{
	public static void main(String args[]){
		System.out.println("Enter your course");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
			switch(course){
				case "Java" :
					System.out.println("Java Selected");
					break;
					
				case "python" :
					System.out.println("Python Selected");
					break;
					
				default :
					System.out.println("Unknown course");
					break;
			}
	}
}