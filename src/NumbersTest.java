import java.util.Scanner;
public class NumbersTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please insert your age:\n");
        int ageSpan = 84;
        int age = scanner.nextInt();
        if(age<=12) {
            System.out.println("You are a kid");
        }else if (age<=18)
        {
            System.out.println("You're a teenager");
        } else if (age>=18)
        {
            System.out.println("You're an adult!");
        }
    do {
        age=age+1;
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
        System.out.println(age);
    }while(age<=29);
    }
    }



