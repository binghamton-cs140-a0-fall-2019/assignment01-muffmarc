package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	
	Computer comp1 = new Computer();
	comp1.Computer("Asus", "i5", 8, 500, true, 850);
	System.out.println(comp1);
	Computer.comp2 = new Computer();
	comp2.Computer("Asus", "i7", 16, 1000, true, 1500);
	System.out.println(comp2);
	Computer.comp3 = new Computer();
	comp3.Computer("Asus", "i5", 8, 500, false, 600);
	System.out.println(comp3);
	Computer.comp4 = new Computer();
	comp4.Computer("Asus", "i7", 16, 2000, false, 800);
	System.out.println(comp4);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}