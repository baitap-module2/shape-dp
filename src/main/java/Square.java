public class Square implements Shape {
    private double side = 2.5;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("A square has side: " + side);
    }
}
