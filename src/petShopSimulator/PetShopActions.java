package petShopSimulator;

import java.util.Scanner;

public class PetShopActions {


    Animals animals = new Animals();
    private int quantity;
    private String userAnswerAnimalKind;


    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        Scanner scanner = new Scanner(System.in);
        quantity = scanner.nextInt();
        this.quantity = quantity;
        return quantity;
    }


    public int buyDog(int quantity) {
        this.quantity = quantity;
        int remainingDogs = animals.getDogs() - quantity;
        return remainingDogs;
    }

    public int buyCat(int quantity) {
        this.quantity = quantity;
        int remainingCats = animals.getCats() - quantity;
        return remainingCats;
    }

    public int buyRabbit(int quantity) {
        this.quantity = quantity;
        int remainingRabbits = animals.getRabbits() - quantity;
        return remainingRabbits;
    }

    public int buyIguana(int quantity) {
        this.quantity = quantity;
        int remainingIguanas = animals.getIguanas() - quantity;
        return remainingIguanas;
    }

    public String getUserAnswerAnimalKind() {
        return userAnswerAnimalKind;
    }

    public String setUserAnswerAnimalKind(String userAnswerAnimalKind) {
        this.userAnswerAnimalKind = userAnswerAnimalKind;
        return userAnswerAnimalKind;
    }

    public void userAnswerAnimalKind() {
        switch (userAnswerAnimalKind) {
            case "Dog" -> System.out.println("You chose dog");
            case "Cat" -> System.out.println("You chose cat");
            case "Rabbit" -> System.out.println("You chose rabbit");
            case "Iguana" -> System.out.println("You chose iguana");
            default -> System.out.println("Sorry, we don't have that kind of animal");
        }
    }


}

