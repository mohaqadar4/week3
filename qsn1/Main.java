public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book One", "Author One", "ISBN001", 3);
        Book book2 = new Book("Book Two", "Author Two", "ISBN002", 5);

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("John Doe", "M001");
        Member member2 = new Member("Jane Smith", "M002");

        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("ISBN001", "M001");
        library.lendBook("ISBN002", "M002");

        library.lendBook("ISBN001", "M001");
    }
}
