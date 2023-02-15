import java.util.Scanner;

public class MultiThreading extends Thread {
    //@Override
    Scanner scanner = new Scanner(System.in);

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }

    public void sentence() {
        System.out.println("What is 2+2?");
        String answer=scanner.next();
        if(answer.equalsIgnoreCase("4"))
        {
            System.out.println("CORRECT ANSWER!");

        }else{
            System.out.println("WRONG ANSWER!");
        }
    }

}
