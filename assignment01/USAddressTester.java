package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
	public static void main(String[] args) {
		StreetUSAddress house1 = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		StreetUSAddress house2 = new StreetUSAddress("50 Maple Lane", "", "Albany", "NY", "67891" );
		System.out.println(house1);
		System.out.println(house2);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress house12 = new StreetUSAddress("12 Front Street", "11 Back Street", "Binghamton", "NY", "12345");
		StreetUSAddress house22 = new StreetUSAddress("50 Maple Lane", "", "Albany", "NY", "67891" );
		output.println(house12);
		output.println(house22);  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}