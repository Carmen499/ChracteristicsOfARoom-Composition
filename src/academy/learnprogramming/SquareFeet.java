package academy.learnprogramming;

public class SquareFeet {

    private double width;
    private double length;

    public SquareFeet(double width, double length) {
        if (width < 0) {
            width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            length = 0;
        } else {
            this.length = length;
        }
    }

    public void getArea() {
        System.out.println("The Square footage of the room is " + getWidth() * getLength() + " Sqft");
    }

    private double getWidth() {
        return width;
    }

    private double getLength() {
        return length;
    }
}