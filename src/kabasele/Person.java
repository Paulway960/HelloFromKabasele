package kabasele;

public class Person extends Greeter {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void getName() {
        this.name = name;
    }
    public String sayHello() {
        return String.format("Hello, my name is %s", this.name);
    }
}
