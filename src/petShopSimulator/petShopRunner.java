package petShopSimulator;
import java.util.Scanner;

public class petShopRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Animals animals = new Animals();
        PetShopActions petShopActions = new PetShopActions();
        animals.setDogs(10);
        animals.setCats(5);
        animals.setRabbits(3);
        animals.setIguanas(7);
        animals.animalsList();
        System.out.println("What kind of animal would you like to buy?\nPlease type in your answer:");
        String userAnswerAnimalType= scanner.next();
        petShopActions.setUserAnswerAnimalKind(userAnswerAnimalType);
        petShopActions.userAnswerAnimalKind();
        System.out.println("From the initial dogs number of: "+animals.getDogs()+" dogs, the remaining dogs number is: "+petShopActions.buyDog(9  ));

    }
}
