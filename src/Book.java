public class Book {
    public void read(String name){
        System.out.println("Чтение книги: "+ name);
    }
    private String title;
    private String name;
    private String author;
    private String pages;

    public Book(String title, String name, String author, String pages) {
        this.title = title;
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
