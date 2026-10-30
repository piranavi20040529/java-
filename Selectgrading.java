import java.util.Scanner;
class Selectgrading{
	public static void main(String args[]){
		System.out.println("Enter your selectgrading");
			Scanner input = new Scanner(System.in);
			char selectgrading =input.nextChar();
			switch(selectgrading){
				case 'A' :
					System.out.println("Excellect");
					break;
				case 'B' : 
					System.out.println("Very good");
					break;
				case 'C' : 
					System.out.println("Good");
				break;
				case 'F':
					System.out.println("Tryagain");
				break;
				default:
					System.out.println("It is Invalid");
				break;
	}
}
}