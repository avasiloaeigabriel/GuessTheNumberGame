package petShopSimulator;

public class Animals {
    static int dogs;
    static int cats;
    static int rabbits;
    static int iguanas;

    public void animalsList(){
        System.out.println("Here is the animals offer: "+"\nDogs: "+getDogs()+"\nCats: "+getCats()+"\nRabbits: "+getRabbits()+"\nIguanas: "+getIguanas());
    }
    public void dogs() {
        if (dogs == 0) {
            System.out.println("We ran out of dogs, please try again latter");
        }
    }

    public void cats() {
        if (cats == 0) {
            System.out.println("We ran out of cats,please try again latter");
        }
    }

    public void rabbits() {
        if (rabbits == 0) {
            System.out.println("We ran out of rabbits, please try again latter");
        }
    }

    public void iguanas() {
        if (iguanas == 0) {
            System.out.println("We ran out of iguanas, please try again latter");
        }
    }

    public int getDogs() {
        return dogs;
    }

    public int setDogs(int dogs) {
        this.dogs = dogs;
        return dogs;
    }

    public int getCats() {
        return cats;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }


    public int getRabbits() {
        return rabbits;
    }

    public void setRabbits(int rabbits) {
        this.rabbits = rabbits;
    }

    public int getIguanas() {
        return iguanas;
    }

    public void setIguanas(int iguanas) {
        this.iguanas = iguanas;
    }

}


