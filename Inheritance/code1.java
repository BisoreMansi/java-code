package Inheritance;
//single class inheritance
class Shape
 {
    public void showdata()
    {
     
        System.out.println("Inside Shape");
    }
}
class Square extends Shape 
{
    public void shownewdata()
    {
        
        
        System.out.println("Inside Square");
    }
}
class Driver {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.showdata();
        sq.shownewdata();
    }
 
    
}