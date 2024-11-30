package package1;

public class student extends Client {
    public student(String name, int age) {
        super(name, age);
    }

    public student() {
        super();
    }

    public void doSomething(){
        System.out.println("Bye");
    }
}
