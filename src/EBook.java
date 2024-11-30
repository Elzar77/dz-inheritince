public class EBook extends Book{
    public void downlad(String fileSize){
        System.out.println("Скачивание книги: "+ getName());
    }
    private String fileSize;

    public EBook(String fileSize, String title, String name, String author, String pages) {
        super( title,  name,  author,  pages);
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "fileSize='" + fileSize + '\'' +
                '}';
    }
}
