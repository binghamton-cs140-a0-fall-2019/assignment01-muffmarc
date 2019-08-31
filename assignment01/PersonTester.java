package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester{
	public static void main(String[] args) {
		DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		StreetUSAddress home = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		Person person1 = new Person("Marcus", "Muffoletto", "333-22-4444", dob, home);
		System.out.println(person1);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		StreetUSAddress home2 = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		Person person12 = new Person("Marcus", "Muffoletto", "333-22-4444", dob2, home2);
		output.println(person12);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}