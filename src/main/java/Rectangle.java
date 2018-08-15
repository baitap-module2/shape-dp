public class Rectangle implements Shape {
    private double weight = 2.5;
    private double height = 3.5;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("A rectangle has height: " + height + " and weight: " + weight);
    }
}
