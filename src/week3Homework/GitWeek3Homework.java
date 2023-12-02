package week3Homework;

public class GitWeek3Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 ==2);
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 <= 5);
		System.out.println(2 == 2 && 1 < 5);
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(2 == 2 && 1 == 5);
		int ageRequiredToDrive = 16;
		int currentAge = 18;
		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
		System.out.println(canPersonDrive);
		
		String name = "Tom";
		
		if (name == "Sam") {
			System.out.println("Hello Sam");
		} else {	
			System.out.println("You are not Sam, " + name);
		}
		
		int age = 14;
		
		if(age >= 16) {
			System.out.println("You can get you license");
		} else {
			System.out.println("Please wait " + "years(s) to get your license.");
		}
		
		double costOfMilk = 2;
		
		if(costOfMilk <= 2) {
			System.out.println("Buying 2");
		} else if(costOfMilk <= 3)	{
			System.out.println("Buying 1");
		} else {
			System.out.println("Not buying any milk.");
		}
		
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			break;
		default:
			System.out.println("0%");
			
		}
		
		if (5 == 5) {
			if (4 == 3) {
				System.out.println("5 is 5");
			} else {
				System.out.println("5 is 5");
			}
		}
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
		
		int ageRequiredToDriveCar = 16;
		int ageNow = 14;
		boolean canPersonDriveNow = ageNow >= ageRequiredToDriveCar;
		if (canPersonDriveNow) {
			System.out.println("This person can drive");
		}
	}
}
