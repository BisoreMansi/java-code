//Anonymous Inner class
interface Person {//abstact interface normal class
    void show();

}

class Anonymous {
    public static void main(String[] args) {
        Person p = new Person() {
            public void show() {
                System.out.println("show");
            }

        };
        p.show();
    }

}