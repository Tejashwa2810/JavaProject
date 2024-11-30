package package1;

public class Client {
    public String name;
    public int age;

    public Client(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Client() {

    }

    public void doSomething(){
        System.out.println("Hello");
    }

    public void get(){
        System.out.println("The name is: " + this.name + " And the age is: " + this.age);
    }
}
