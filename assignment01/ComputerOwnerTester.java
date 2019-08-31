package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester{
	public static void main(String[] args) {
		DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		StreetUSAddress home = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		Person person1 = new Person("Marcus", "Muffoletto", "333-22-4444", dob, home);
		Computer comp1 = new Computer("Asus", "i5", 8, 500, true, 850);
		Computer comp2 = new Computer("Asus", "i7", 16, 1000, true, 1500);
		Computer comp3 = new Computer("Asus", "i5", 8, 500, false, 600);
		Computer comp4 = new Computer("Asus", "i7", 16, 2000, false, 800);
		ComputerOwner owner = new ComputerOwner(person1);
		owner.addComputer(comp1);
		owner.addComputer(comp2);
		owner.addComputer(comp3);
		owner.addComputer(comp4);
		System.out.println(owner);
		owner.removeComputer(0);
		owner.removeComputer(2);
		System.out.println(owner);
		
		try(var output =new PrintWriter(new FileOutputStream(
	    new File("output.txt"), true /* true means append to file */))) {
		output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		StreetUSAddress home2 = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		Person person12 = new Person("Marcus", "Muffoletto", "333-22-4444", dob2, home2);
		Computer comp12 = new Computer("Asus", "i5", 8, 500, true, 850);
		Computer comp22 = new Computer("Asus", "i7", 16, 1000, true, 1500);
		Computer comp32 = new Computer("Asus", "i5", 8, 500, false, 600);
		Computer comp42 = new Computer("Asus", "i7", 16, 2000, false, 800);
		ComputerOwner owner2 = new ComputerOwner(person1);
		owner2.addComputer(comp12);
		owner2.addComputer(comp22);
		owner2.addComputer(comp32);
		owner2.addComputer(comp42);
		output.println(owner2);
		owner2.removeComputer(0);
		owner2.removeComputer(2);
		output.println(owner2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}		