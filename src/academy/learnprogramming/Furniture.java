package academy.learnprogramming;

public class Furniture {
    private int LampsAndNightstands;
    private int sofa;
    private int bed;
    private int mirrors;
    private int wallDecor;
    private int dresser;

    public Furniture(int lampsAndNightstands, int sofa, int bed,
                     int mirrors, int wallDecor, int dresser) {
        LampsAndNightstands = lampsAndNightstands;
        this.sofa = sofa;
        this.bed = bed;
        this.mirrors = mirrors;
        this.wallDecor = wallDecor;
        this.dresser = dresser;
    }

    public void getItemsInARoom() { // // void method created to output getters within the console
        System.out.println("The room has " + getLampsAndNightstands() + " Lamps and Nightstands");
        System.out.println("The room has " + getSofa() + " sofa(s)");
        System.out.println("The room also includes " + getBed() +
                " Bed(s), " + getMirrors() + " Mirrors, " + getWallDecor() + " Wall Decor(s) and "
                + getDresser() + " Dressers. ");
    }


    private int getLampsAndNightstands() {
        return LampsAndNightstands;
    }

    private int getSofa() {
        return sofa;
    }

    private int getBed() {
        return bed;
    }

    private int getMirrors() {
        return mirrors;
    }

    private int getWallDecor() {
        return wallDecor;
    }

    private int getDresser() {
        return dresser;
    }
}
