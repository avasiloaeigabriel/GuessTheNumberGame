package petShopSimulator;

public class PetShopActions {

    Animals animals = new Animals();
    private int quantity;
    private String userAnswerAnimalKind;

    public int buyDog(int quantity) {
        this.quantity = quantity;
        int remainingDogs = animals.getDogs() - quantity;
        //System.out.println("Sorry, we have only have " + animals.getDogs() + " remaining");
        return remainingDogs;
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

