public class Circle {
    private double radius;
    private String color;

    void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }else{
            System.out.println("Radius should be greater than 0");
        }
    }

    void setColor(String color) {
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle has [radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        System.out.println(" \n ----- Circle ----- \n");
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        circle1.setColor("Red");
        
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.toString());
    }
    
}
