public class FirstChallengeMethods {

    int couchPrice;
    int chairPrice;
    int tablePrice;

    public Object couch(int couchPrice, String brand) {
        System.out.println("1-Couch:\n" + "Price:" + couchPrice + "$" + "\nBrand:" + brand);
        this.couchPrice = couchPrice;
        return null;
    }

    public Object chair(int chairPrice, String brand) {
        System.out.println("2-Chair:\n" + "Price:" + chairPrice + "$" + "\nBrand:" + brand);
        this.chairPrice = chairPrice;
        return null;
    }

    public Object table(int tablePrice, String brand) {
        System.out.println("3-Table:\n" + "Price:" + tablePrice + "$" + "\nBrand:" + brand);
        this.tablePrice = tablePrice;
        return null;
    }
}
