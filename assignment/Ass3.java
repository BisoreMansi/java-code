class A
{
    String name;
    int age ;
    public void showdata(){
        System.out.println("my name is"+ name);
        System.out.println("my age is"+ age);
        System.out.println("my age is"+ (age+10));
    }
}
class driver1{
    public static void main(String[] args) {
        A obj = new A();
        obj.showdata();
         String str = obj.name ;
         str= "mansi";
         System.out.println("my age is"+ str);

    }
}