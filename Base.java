import java.util.*;
import java.io.*;

public class Base {

public static void main(String[] args) throws IOException {
    Scanner danni = new Scanner(System.in); //creates a scanner variable
    System.out.println("Input file name: "); //to input the user's file name
    String userInput = danni.nextLine(); //to let the user receive the input
    FileWriter fw = new FileWriter(userInput+".louie"); //creates file writer variable

    while (userInput != null) { //looping so the user can enter as much as they want
        System.out.println("Enter text: ");
        userInput = danni.nextLine();  //pass to the userInput variable of what the users typed

        if (userInput.equals(":q")) //if the user want to end the program need to type ":q"
            break; //stop the loop

        String encodedString = Base64.getEncoder().encodeToString(userInput.getBytes()); //convert the word to base64
        System.out.println("User Input encoded: " + encodedString); //so the user can see the encoded word into base 64
        fw.write(encodedString + "\n"); //to write into the file of what the user's typed
    }
    danni.close(); //close the scanner
    fw.close(); //close the file writer
}


}