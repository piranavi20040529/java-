import java.util.Scanner;
class Switchcase{
		public static void main(String args[]){
			//int day = 5;
			System.out.println("Enter your day");
			Scanner input = new Scanner(System.in);
			int day =input.nextInt();
			switch(day){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wenesday");
					break;
				case 4:
					System.out.println("Thursday");
					break; 			
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Starusday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Fail");
					break;
			}
	    }
	}