public class Monkey extends Animal {
    public void makeSound(){
        System.out.println("WWW i am monkey");
    }
    private String smart;

    public Monkey(String smart, String name) {
        super(name);
        this.smart = smart;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "smart='" + smart + '\'' +
                '}';
    }
}
