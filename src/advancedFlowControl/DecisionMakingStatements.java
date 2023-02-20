package advancedFlowControl;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        //if Statement

        if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is greater than b");
        }

        //switch Statement;

        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            case 4:
                System.out.println("a si 4");
                break;
            case 5:
                System.out.println("a is 5");
                break;
            default:
                System.out.println("a is other number");
                break;
        }

        // switch Statement with lambdas:
        switch (a) {
            case 1 -> System.out.println("a is 1");
            case 2 -> System.out.println("a is 2");
            case 3 -> System.out.println("a is 3");
            case 4 -> System.out.println("a si 4");
            case 5 -> System.out.println("a is 5");
            default -> System.out.println("a is other number");
        }
    }
}
