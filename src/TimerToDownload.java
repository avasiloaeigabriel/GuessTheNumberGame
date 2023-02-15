import java.util.Scanner;

public class TimerToDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please insert the desired seconds number to count\n");
        //int timerSeconds = scanner.nextInt();
        int timerSeconds = 10;
        do {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            timerSeconds = timerSeconds - 1;
            System.out.println(timerSeconds);
        } while (timerSeconds >= 1);
        if (timerSeconds == 0) {
            System.out.println("Time is up!!!");
        }
        System.out.println("QUESTION: What is 2+2?");
        String userAnswer = scanner.next();
        String correctAnswer = "4";
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("CORRECT ANSWER!");
        } else {
            System.out.println("WRONG ANSWER!");

        }
    }

}

