public class Elephant extends Animal{
    public void makeSound(){
        System.out.println("PRPRPR i am elephant");
    }
    private String height;

    public Elephant(String height, String name) {
        super(name);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "height='" + height + '\'' +
                '}';
    }
}
