 //Deep Copy
 class Code2 
{
    int x = 20;
    
}
class DeepCopyExample
{
    public static void main(String[] args) {
        Code2 c = new Code2();
        Code2 c1 = new Code2();
        c1.x = 30;
        System.out.println(c1.x);
    }
}
