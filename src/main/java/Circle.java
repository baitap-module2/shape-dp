public class Circle implements Shape {
    private double radius = 3.5;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("A circle has radius: "+ radius);
    }
}
