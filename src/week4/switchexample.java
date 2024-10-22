package week4;
import java.util.Random;

public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(10);
		
		switch(num){
			case 0:
				System.out.println("Zero");
				break;
			case 1: 
				System.out.println("one");
				break;
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
			case 4: 
				System.out.println("four");
				break;
			case 5: 
				System.out.println("five");
				break;
			case 6: 
				System.out.println("six");
				break;
			case 7: 
				System.out.println("seven");
				break;
			case 8: 
				System.out.println("eight");
				break;
			case 9: 
				System.out.println("nine");
				break;
			default: 
				System.out.println("Unknown Number");
				break;
		}
	}

}
