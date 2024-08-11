package Inheritance;

//hyrarichal inheritance
class fruits {
    void sweet() {
        System.out.println("Sweet");
    }
}

class mango extends fruits {
    void colour() {
        System.out.println("yellow");
    }
}

class watermelon extends fruits{
    void fiber() {
        System.out.println("fiber with red colour");

    }

}
class Driver
{
    public static void main(String[] args) 
    {
        watermelon w = new watermelon();
        w.fiber();
        w.sweet();
        
        
    }

}
