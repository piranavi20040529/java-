import java.util.Scanner;
class Selectdrink{
	public static void main(String args[]){
		System.out.println("Enter your selectdrink");
			Scanner input = new Scanner(System.in);
			int selectdrink =input.nextInt();
			switch(selectdrink){
				case 1 :
					System.out.println("Tea");
					break;
				case 2 : 
					System.out.println("Coffee");
					break;
				case 3 : 
					System.out.println("Juice");
				break;
				case 4:
					System.out.println("It is Invalid");
				break;
			}
	}
}