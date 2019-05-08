package main;
import java.util.Scanner;

class Courses {
	public String displayCourseDetails(String dept) {
			
			return "You have chosen "+dept+" department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
		}
}

class ECE extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		// write or edit your code here 
		Courses cou = new Courses();
		String commonSubjects = cou.displayCourseDetails("ECE");
		String subject1 = "Microprocessor"; //write the specific subjects name here
		String subject2 = "Linear Integrated Circuits"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;
		
	}
}
class Mechanical extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		Courses cou1 = new Courses();
		String commonSubjects = cou1.displayCourseDetails("Mechanical");
		String subject1 = "Fluid Mechanics"; //write the specific subjects name here
		String subject2 = "Thermodynamics"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;	
	
	}

}
class CSE extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		
		// write or edit your code here 
		Courses cou2 = new Courses();
		String commonSubjects = cou2.displayCourseDetails("CSE");
		String subject1 = "Network Theory";
		String subject2 = "Operating Systems"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;		
	}
}

public class Question1 {
	public static void main(String[] args){
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		//Question1 mn=new Question1();
		switch(choice) {
		case 1:
		{
			ECE ece = new ECE();
			System.out.println(ece.displayCourseDetails("ECE"));
			break;
		}
		case 2:
		{
			Mechanical mechanical = new Mechanical();
			System.out.println(mechanical.displayCourseDetails("Mechanical"));
			break;
		}
		case 3:
		{
			CSE cse = new CSE();
			System.out.println(cse.displayCourseDetails("CSE"));
			break;
		}
		default:
			System.out.println("Invalid input!");
		break;
		}
	}
}