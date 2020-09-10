public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5,"red");
        Cylinder cylinder = new Cylinder();
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        cylinder.setHeight(3.0);
        cylinder.setRadius(5.5);
        System.out.println(cylinder.getVolume());
    }
}
