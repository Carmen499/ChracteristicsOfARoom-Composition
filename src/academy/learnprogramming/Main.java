package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

       Room room = new Room("Pink", 4,
               new SquareFeet(25,25), new Furniture(2,
               1,1,2,3,2));


        room.charactersOfARoom();
    }
}
