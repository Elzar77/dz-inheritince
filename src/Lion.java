public class Lion extends Animal{
    public void makeSound(){
        System.out.println("RRR i am Lion");
    }
    private String king;

    public Lion(String king, String name) {
        super(name);
        this.king = king;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "king='" + king + '\'' +
                '}';
    }
}
