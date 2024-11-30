//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Book book = new Book("Ресспект Сигма момент", "Sigma boy", "Elzar", "77");
//        book.read("Sigma boy");
//        System.out.println(book);
//        EBook eBook = new EBook("5mb", "Ресспект Сигма момент", "Sigma Boy", "Elzar", "77");
//        eBook.downlad("5mb"+"Sigma boy");
//        System.out.println(eBook);

        Lion lion = new Lion("King", "Lion");
        lion.makeSound();
        System.out.println(lion);
        Elephant elephant = new Elephant("Big", "Elephent");
        elephant.makeSound();
        System.out.println(elephant);
        Monkey monkey = new Monkey("Smart", "Monkey");
        monkey.makeSound();
        System.out.println(monkey);
    }
}