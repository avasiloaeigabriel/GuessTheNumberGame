package petShopSimulator;

import java.util.Scanner;

public class petShopRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals animals = new Animals();
        PetShopActions petShopActions = new PetShopActions();
        animals.setDogs(10);
        animals.setCats(5);
        animals.setRabbits(3);
        animals.setIguanas(7);
        animals.animalsList();
        System.out.println("What kind of animal would you like to buy?\nPlease type in your answer:");
        String userAnswerAnimalType = scanner.next();
        petShopActions.setUserAnswerAnimalKind(userAnswerAnimalType);
        petShopActions.userAnswerAnimalKind();
        System.out.println("How many of them would you like to buy?");

        if (userAnswerAnimalType.equalsIgnoreCase("Dog")) {
            System.out.println("From the initial number of: " + animals.getDogs() + " , the remaining number is: " + petShopActions.buyDog(petShopActions.setQuantity(petShopActions.getQuantity())));

        } else if (userAnswerAnimalType.equalsIgnoreCase("Cat")) {
            System.out.println("From the initial number of: " + animals.getCats() + " , the remaining number is: " + petShopActions.buyCat(petShopActions.setQuantity(petShopActions.getQuantity())));

        } else if (userAnswerAnimalType.equalsIgnoreCase("Rabbit")) {
            System.out.println("From the initial number of: " + animals.getRabbits() + " , the remaining number is: " + petShopActions.buyRabbit(petShopActions.setQuantity(petShopActions.getQuantity())));

        } else if (userAnswerAnimalType.equalsIgnoreCase("Iguana")) {
            System.out.println("From the initial number of: " + animals.getIguanas() + " , the remaining number is: " + petShopActions.buyIguana(petShopActions.setQuantity(petShopActions.getQuantity())));

        }
    }
}
