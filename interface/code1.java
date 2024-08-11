interface Shape {
    int age =34;//final
    String area = "mumbai";//static
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;

    }
}

class Rectangle implements Shape {
    
        double l;
        double w;
        public Rectangle(double l, double w) {
          
            this.l = l;
            this.w = w;
    
        }
    
        public double calculateArea() {
            return l * w;
        }

    
  
}
class Driver
{
    public static void main(String[] args) {
        Circle c = new Circle(8);
       System.out.println("Area of circle"+ c.calculateArea());

       Rectangle r = new Rectangle(5, 6);
       System.out.println("area of rectangle"+r.calculateArea());
    

       System.out.println(Shape.area);
    }
}