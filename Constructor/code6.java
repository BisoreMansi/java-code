package Constructor;

//parametirized condtructor
class A {
    String name;
    int id;

    A(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        A a = new A("mansi", 10032);
        System.out.println("employee name :" + a.name + "ID " + a.id);

    }
}
