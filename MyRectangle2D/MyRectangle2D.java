public class MyRectangle2D {
    private double x, y, width, height;

    public MyRectangle2D() {
        x = 0.0;
        y = 0.0;
        width = 1.0;
        height = 1.0;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width * height;
    }

    public boolean contains(double x, double y) {
        double leftX = this.x - width / 2;
        double rightX = this.x + width / 2;
        double topY = this.y + height / 2;
        double bottomY = this.y - height / 2;

        return x > leftX && x < rightX && y > bottomY && y < topY;
    }

    public boolean contains(MyRectangle2D r) {
        double leftX1 = this.x - width / 2;
        double rightX1 = this.x + width / 2;
        double topY1 = this.y + height / 2;
        double bottomY1 = this.y - height / 2;

        double leftX2 = r.x - r.width / 2;
        double rightX2 = r.x + r.width / 2;
        double topY2 = r.y + r.height / 2;
        double bottomY2 = r.y - r.height / 2;
        return leftX2 >= leftX1 && rightX2 <= rightX1 && topY2 <= topY1 && bottomY2 >= bottomY1;
    }

    public static void main(String[] args)
    {
        MyRectangle2D myRectangle2D = new MyRectangle2D();
        System.out.println("Area: " + myRectangle2D.getArea());
        System.out.println("Perimeter: " + myRectangle2D.getPerimeter());

        MyRectangle2D customRectangle = new MyRectangle2D(2, 3, 7, 5);
        System.out.println("Area: " + customRectangle.getArea());
        System.out.println("Perimeter: " + customRectangle.getPerimeter());

        double x = 4.5, y = 8.5;

        System.out.println(("x: " + x + ", y: " + y + ", Contains in customRectangle: " + myRectangle2D.contains(x, y)));

        System.out.println(("myRectangle2D.x: " + myRectangle2D.x + ", myRectangle2D.Y: " + myRectangle2D.y + ", Contains in customRectangle: " + myRectangle2D.contains(myRectangle2D)));

    }

}
