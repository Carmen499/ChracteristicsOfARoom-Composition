package academy.learnprogramming;

public class Room {
    private String color;
    private int windows;
    private SquareFeet squareFeet;
    private Furniture furniture;

    public Room(String color, int windows,
                SquareFeet squareFeet, Furniture furniture) {
        this.color = color;
        this.windows = windows;
        this.squareFeet = squareFeet;
        this.furniture = furniture;
    }

    public void charactersOfARoom() {  // Method created - using Composition (Name of the class .getter methods)
        getSquareFeet().getArea();
        getFurniture().getItemsInARoom();
        colorSchemeNThings();


    }

    public void colorSchemeNThings() {   // void method created to output getters within the console
        System.out.println("The color of the room is " + getColor());
        System.out.println("The room has " + getWindows() + " Window(s).");


    }

    public String getColor() {
        return color;
    }

    public int getWindows() {
        return windows;
    }

    public SquareFeet getSquareFeet() {
        return squareFeet;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
