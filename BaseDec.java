import java.io.*;
import java.util.*;


public class BaseDec {

     public static void main (String[]args)throws IOException{
     	System.out.print("Enter the file name with extension:");
    	Scanner danni = new Scanner(System.in); //creates a scanner variable
 
    	File louie = new File(danni.nextLine()); //create and read file with the extension
    	danni = new Scanner(louie); 
    	String aquino = danni.nextLine();

		while(danni.hasNextLine()) 

		{

		String line = danni.nextLine(); 
		byte[] decodedBytes = Base64.getDecoder().decode(line); //create the decoder of the msg
		String decodedString = new String(decodedBytes); //decode the msg in this line
		System.out.println(decodedString); 

		}

    	danni.close(); //close the filewriter
    }


}