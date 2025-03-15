public class Circle
{
    private double x, y, radius;

    public Circle()
    {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 0.0;
    }

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y)
    {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= this.radius;
    }

    public void print(double new_x, double new_y) {
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());

        if(new_x != 0.0 || new_y != 0.0)

        {
            System.out.println("New Coardinates Containes in Circle: " + this.contains(new_x, new_y));
        }
    }
}


