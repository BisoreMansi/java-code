



 class Calculator {
    int a=10;
    int b=10;
    int c=10;
    int d;
    public int addition(){
        d=a+b+c;
        return d;
    }
    public int average(){
        int av = addition()/3;
        return av;
    }
    public static void main(String[] args) {
    Calculator calo = new Calculator();
        System.out.println(calo.addition());
       System.out.println( calo.average());
    }

    
}
