import java.util.Scanner;

public class Book {
    String name;
    String author;
    int year;
    String publisherName;
    String genre;
    int pages;

    public Book() {
    }

    public Book(String name, String author, int year, String publisherName, String genre, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.publisherName = publisherName;
        this.genre = genre;
        this.pages = pages;
    }

    public void inputInfo(String bookName, String author, String genre) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        this.name = scanner.nextLine();

        System.out.print("Введіть автора: ");
        this.author = scanner.nextLine();

        System.out.print("Введіть жанр: ");
        this.genre = scanner.nextLine();
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        name = scanner.nextLine();

        System.out.print("Введіть автора: ");
        author = scanner.nextLine();

        System.out.print("Введіть рік випуску: ");
        year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть назву видання: ");
        publisherName = scanner.nextLine();

        System.out.print("Введіть жанр: ");
        genre = scanner.nextLine();

        System.out.print("Введіть кількість сторінок: ");
        pages = scanner.nextInt();
    }

    public void printInfo(String bookName, String author, String genre) {
        System.out.println("ПІБ: " + this.name);
        System.out.println("Дата народження: " + this.author);
        System.out.println("Контактний телефон: " + this.genre);
    }

    public void printInfo(){
        System.out.println("Назва книги: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Рік випуску: " + year);
        System.out.println("Видання: " + publisherName);
        System.out.println("Жанр: " + genre);
        System.out.println("Кількість сторінок: " + pages);
    }

    public void printInfo(boolean brief) {
        if (brief) {
            System.out.println("Назва книги: " + name);
            System.out.println("Автор: " + author);
            System.out.println("Жанр: " + genre);
        } else {
            printInfo();
        }
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
