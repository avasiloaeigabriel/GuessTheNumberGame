package accountCreatorSimulator;

import java.util.Random;

public class EmailCreator {
    UserDetails userDetails = new UserDetails();
    String suggestedEmail;

    public String getSuggestedEmail() {
        return suggestedEmail;
    }

    public void setSuggestedEmail(String suggestedEmail) {
        this.suggestedEmail = suggestedEmail;
    }


    public int getEmailNumber() {
        return emailNumber;
    }

    public void setEmailNumber(int emailNumber) {
        this.emailNumber = emailNumber;
    }

    Random random = new Random();
    private int emailNumber = random.nextInt(0, 300);


    public String suggestedEmail() {
        this.suggestedEmail = suggestedEmail;
        userDetails.getLastName();
        String suggestedEmail = userDetails.getFirstName()+ "." + userDetails.getLastName() + emailNumber;
        System.out.println("Here is an e-mail suggestions:");
        System.out.println(userDetails.getFirstName().toLowerCase() + "." + userDetails.getLastName().toLowerCase() + emailNumber + "@gmail.com");
        return suggestedEmail;
    }
}
