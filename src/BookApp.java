public class BookApp {
    public static void main(String[] args) {
        Book bookDB= new Book("Java1001");
        bookDB.setTitle("Head First Java");
        bookDB.setAuthor("Kathy Sierra and Bert Bates");
        bookDB.setDescription("Easy to read Java workbook");
        bookDB.setPrice(20);
        System.out.println(bookDB.getDisplayText());
    }
}

