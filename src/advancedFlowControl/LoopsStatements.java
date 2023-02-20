package advancedFlowControl;

public class LoopsStatements {
    public static void main(String[] args) {
        int c = 1;
        int d = 0;
        String[] myList = {"Unu", "Doi", "Trei", "Patru", "Cinci"};
        int[] myList2 = {1, 2, 3};
//for loop
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
        }
//enhanced for loop(or for each)
        for (String b : myList) {
            System.out.println(b);
        }

//while loop

        while (d > c) {
            System.out.println("It works");
        }

//do while loop

        do {
            System.out.println(c + d);
        } while (d > c);




    }
}

