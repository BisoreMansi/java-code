
import java.util.Scanner;
//area and perimeter of a circle
class ass1 {
    Scanner obj =  new Scanner (System.in);
    float radius = obj.nextFloat();

    
    public void area(){
        System.out.println("Area of Circle ="+ (2*Math.PI*radius));
    }
    public void perimeter(){
        System.out.println("Area of Circle ="+ (2*Math.PI*radius*radius));
    }
}
class driver{
    public static void main(String[] args) {
        ass1 ass = new ass1();
        ass.area();
        ass.perimeter();
    }
   

}