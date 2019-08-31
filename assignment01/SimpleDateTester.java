package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate time1 = SimpleDate.of(1999,12,13);
		SimpleDate time2 = SimpleDate.of(2015,9,15);
		System.out.print(time1.before(time2));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		SimpleDate time12 = SimpleDate.of(1999,12,13);
		SimpleDate time22 = SimpleDate.of(2015,9,15);
		output.print(time12.before(time22));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}