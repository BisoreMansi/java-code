package method;

 class Driver {
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.mod());
    }
}
