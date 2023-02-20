package accountCreatorSimulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class AccountSimulatorRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        UserDetails userDetails = new UserDetails();
        EmailCreator emailCreator = new EmailCreator();
        System.out.println("Please enter your first name:");
        userDetails.setFirstName(scanner.next());
        System.out.println("So your name is: " + userDetails.getFirstName());
        System.out.println("Please enter your last name:");
        userDetails.setLastName(scanner.next());
        System.out.println("And your last name is: " + userDetails.getLastName());
        System.out.println("Your full name is: " + userDetails.getFirstName() + " " + userDetails.getLastName());
        System.out.println("Where do you live?");
        userDetails.setCountry(scanner.next());
        System.out.println("So, " + userDetails.getFirstName() + " " + userDetails.getLastName() + ", " + "you live in: " + userDetails.getCountry());
        emailCreator.suggestedEmail();
        //System.out.println(emailCreator.getEmailNumber());
        //File csvFile = new File("userTest.csv");
        File csvFile = new File("C:\\Users\\avasiloaeig\\Desktop\\userTest.csv");
        PrintWriter out = new PrintWriter(csvFile);
        ArrayList userDetailsToPrint = new ArrayList();
        userDetailsToPrint.add(userDetails.getFirstName());
        userDetailsToPrint.add(userDetails.getLastName());
        userDetailsToPrint.add(userDetails.getCountry());


        out.println(userDetails.getFirstName());
        out.println(userDetails.getLastName());
        out.println(userDetails.getCountry());
        out.println(emailCreator.suggestedEmail().toLowerCase()+"@gmail.com");
        out.close();

    }
}
