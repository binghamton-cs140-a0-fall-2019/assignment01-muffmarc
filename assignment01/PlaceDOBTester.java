package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	public static void main(String[] args) {
		DateAndPlaceOfBirth one = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		DateAndPlaceOfBirth two = new DateAndPlaceOfBirth(2000,12,13,"Dallas","Texas","USA");
		DateAndPlaceOfBirth three = new DateAndPlaceOfBirth(1999,12,13,"New York","New York","USA");
		DateAndPlaceOfBirth four = new DateAndPlaceOfBirth(1950,3,27,"Rome","Italy");
		DateAndPlaceOfBirth five = new DateAndPlaceOfBirth(1980,1,15,"Paris","France");
		
		//hasSameBirthDateAs
		System.out.println(one.hasSameBirthDateAs(two));
		System.out.println(one.hasSameBirthDateAs(three));
		System.out.println(one.hasSameBirthDateAs(four));
		System.out.println(one.hasSameBirthDateAs(five));
		System.out.println(two.hasSameBirthDateAs(one));
		System.out.println(two.hasSameBirthDateAs(three));
		System.out.println(two.hasSameBirthDateAs(four));
		System.out.println(two.hasSameBirthDateAs(five));
		System.out.println(three.hasSameBirthDateAs(one));
		System.out.println(three.hasSameBirthDateAs(two));
		System.out.println(three.hasSameBirthDateAs(four));
		System.out.println(three.hasSameBirthDateAs(five));
		System.out.println(four.hasSameBirthDateAs(one));
		System.out.println(four.hasSameBirthDateAs(two));
		System.out.println(four.hasSameBirthDateAs(three));
		System.out.println(four.hasSameBirthDateAs(five));
		System.out.println(five.hasSameBirthDateAs(one));
		System.out.println(five.hasSameBirthDateAs(two));
		System.out.println(five.hasSameBirthDateAs(three));
		System.out.println(five.hasSameBirthDateAs(four));
		//hasSameBirthDayAs
		System.out.println(one.hasSameBirthDayAs(two));
		System.out.println(one.hasSameBirthDayAs(three));
		System.out.println(one.hasSameBirthDayAs(four));
		System.out.println(one.hasSameBirthDayAs(five));
		System.out.println(two.hasSameBirthDayAs(one));
		System.out.println(two.hasSameBirthDayAs(three));
		System.out.println(two.hasSameBirthDayAs(four));
		System.out.println(two.hasSameBirthDayAs(five));
		System.out.println(three.hasSameBirthDayAs(one));
		System.out.println(three.hasSameBirthDayAs(two));
		System.out.println(three.hasSameBirthDayAs(four));
		System.out.println(three.hasSameBirthDayAs(five));
		System.out.println(four.hasSameBirthDayAs(one));
		System.out.println(four.hasSameBirthDayAs(two));
		System.out.println(four.hasSameBirthDayAs(three));
		System.out.println(four.hasSameBirthDayAs(five));
		System.out.println(five.hasSameBirthDayAs(one));
		System.out.println(five.hasSameBirthDayAs(two));
		System.out.println(five.hasSameBirthDayAs(three));
		System.out.println(five.hasSameBirthDayAs(four));
		//olderThan
		System.out.println(one.olderThan(two));
		System.out.println(one.olderThan(three));
		System.out.println(one.olderThan(four));
		System.out.println(one.olderThan(five));
		System.out.println(two.olderThan(one));
		System.out.println(two.olderThan(three));
		System.out.println(two.olderThan(four));
		System.out.println(two.olderThan(five));
		System.out.println(three.olderThan(one));
		System.out.println(three.olderThan(two));
		System.out.println(three.olderThan(four));
		System.out.println(three.olderThan(five));
		System.out.println(four.olderThan(one));
		System.out.println(four.olderThan(two));
		System.out.println(four.olderThan(three));
		System.out.println(four.olderThan(five));
		System.out.println(five.olderThan(one));
		System.out.println(five.olderThan(two));
		System.out.println(five.olderThan(three));
		System.out.println(five.olderThan(four));
		//youngerThan
		System.out.println(one.youngerThan(two));
		System.out.println(one.youngerThan(three));
		System.out.println(one.youngerThan(four));
		System.out.println(one.youngerThan(five));
		System.out.println(two.youngerThan(one));
		System.out.println(two.youngerThan(three));
		System.out.println(two.youngerThan(four));
		System.out.println(two.youngerThan(five));
		System.out.println(three.youngerThan(one));
		System.out.println(three.youngerThan(two));
		System.out.println(three.youngerThan(four));
		System.out.println(three.youngerThan(five));
		System.out.println(four.youngerThan(one));
		System.out.println(four.youngerThan(two));
		System.out.println(four.youngerThan(three));
		System.out.println(four.youngerThan(five));
		System.out.println(five.youngerThan(one));
		System.out.println(five.youngerThan(two));
		System.out.println(five.youngerThan(three));
		System.out.println(five.youngerThan(four));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		  //hasSameBirthDateAs
		DateAndPlaceOfBirth one2 = new DateAndPlaceOfBirth(1999,12,13,"Buffalo","New York","USA");
		DateAndPlaceOfBirth two2 = new DateAndPlaceOfBirth(2000,12,13,"Dallas","Texas","USA");
		DateAndPlaceOfBirth three2 = new DateAndPlaceOfBirth(1999,12,13,"New York","New York","USA");
		DateAndPlaceOfBirth four2 = new DateAndPlaceOfBirth(1950,3,27,"Rome","Italy");
		DateAndPlaceOfBirth five2 = new DateAndPlaceOfBirth(1980,1,15,"Paris","France");
		  
		output.println(one2.hasSameBirthDateAs(two));
		output.println(one2.hasSameBirthDateAs(three));
		output.println(one2.hasSameBirthDateAs(four));
		output.println(one2.hasSameBirthDateAs(five));
		output.println(two2.hasSameBirthDateAs(one));
		output.println(two2.hasSameBirthDateAs(three));
		output.println(two2.hasSameBirthDateAs(four));
		output.println(two2.hasSameBirthDateAs(five));
		output.println(three2.hasSameBirthDateAs(one));
		output.println(three2.hasSameBirthDateAs(two));
		output.println(three2.hasSameBirthDateAs(four));
		output.println(three2.hasSameBirthDateAs(five));
		output.println(four2.hasSameBirthDateAs(one));
		output.println(four2.hasSameBirthDateAs(two));
		output.println(four2.hasSameBirthDateAs(three));
		output.println(four2.hasSameBirthDateAs(five));
		output.println(five2.hasSameBirthDateAs(one));
		output.println(five2.hasSameBirthDateAs(two));
		output.println(five2.hasSameBirthDateAs(three));
		output.println(five2.hasSameBirthDateAs(four));
		//hasSameBirthDayAs
		output.println(one2.hasSameBirthDayAs(two));
		output.println(one2.hasSameBirthDayAs(three));
		output.println(one2.hasSameBirthDayAs(four));
		output.println(one2.hasSameBirthDayAs(five));
		output.println(two2.hasSameBirthDayAs(one));
		output.println(two2.hasSameBirthDayAs(three));
		output.println(two2.hasSameBirthDayAs(four));
		output.println(two2.hasSameBirthDayAs(five));
		output.println(three2.hasSameBirthDayAs(one));
		output.println(three2.hasSameBirthDayAs(two));
		output.println(three2.hasSameBirthDayAs(four));
		output.println(three2.hasSameBirthDayAs(five));
		output.println(four2.hasSameBirthDayAs(one));
		output.println(four2.hasSameBirthDayAs(two));
		output.println(four2.hasSameBirthDayAs(three));
		output.println(four2.hasSameBirthDayAs(five));
		output.println(five2.hasSameBirthDayAs(one));
		output.println(five2.hasSameBirthDayAs(two));
		output.println(five2.hasSameBirthDayAs(three));
		output.println(five2.hasSameBirthDayAs(four));
		//olderThan
		output.println(one2.olderThan(two));
		output.println(one2.olderThan(three));
		output.println(one2.olderThan(four));
		output.println(one2.olderThan(five));
		output.println(two2.olderThan(one));
		output.println(two2.olderThan(three));
		output.println(two2.olderThan(four));
		output.println(two2.olderThan(five));
		output.println(three2.olderThan(one));
		output.println(three2.olderThan(two));
		output.println(three2.olderThan(four));
		output.println(three2.olderThan(five));
		output.println(four2.olderThan(one));
		output.println(four2.olderThan(two));
		output.println(four2.olderThan(three));
		output.println(four2.olderThan(five));
		output.println(five2.olderThan(one));
		output.println(five2.olderThan(two));
		output.println(five2.olderThan(three));
		output.println(five2.olderThan(four));
		//youngerThan
		output.println(one2.youngerThan(two));
		output.println(one2.youngerThan(three));
		output.println(one2.youngerThan(four));
		output.println(one2.youngerThan(five));
		output.println(two2.youngerThan(one));
		output.println(two2.youngerThan(three));
		output.println(two2.youngerThan(four));
		output.println(two2.youngerThan(five));
		output.println(three2.youngerThan(one));
		output.println(three2.youngerThan(two));
		output.println(three2.youngerThan(four));
		output.println(three2.youngerThan(five));
		output.println(four2.youngerThan(one));
		output.println(four2.youngerThan(two));
		output.println(four2.youngerThan(three));
		output.println(four2.youngerThan(five));
		output.println(five2.youngerThan(one));
		output.println(five2.youngerThan(two));
		output.println(five2.youngerThan(three));
		output.println(five2.youngerThan(four));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}