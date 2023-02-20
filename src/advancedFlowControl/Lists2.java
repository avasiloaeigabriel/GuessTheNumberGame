package advancedFlowControl;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Lists2 {
    public static void main(String[] args) {
        double b = 2.56;
        int a = 10;
        //BigDecimal bigDecimal1 = new BigDecimal("0.045");
        //BigDecimal bigDecimal2=new BigDecimal("3.5634");
        ArrayList myArrayList = new ArrayList();
        myArrayList.add("Caine");
        myArrayList.add("Pisica");
        myArrayList.add("Vaca");
        myArrayList.add(a);
        myArrayList.add('A');
        myArrayList.add(b);

        //myArrayList.add(bigDecimal1);
        //myArrayList.add(bigDecimal2);
        //myArrayList.add(bigDecimal1.add(bigDecimal2));
        //BigDecimal bigDecimal3=bigDecimal1.add(bigDecimal2);
        //System.out.println(bigDecimal3);
        System.out.println(myArrayList);
    }
}
