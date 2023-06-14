import java.util.ArrayList;
import java.util.List;

public class Main {

  // Используйте класс Book (книга) из домашнего задания к уроку 43 (см. Book.java).
  // Создайте список книг и отсортируйте книги по названию, (при одинаковых названиях - по автору)
  // при помощи лямбда-функции на месте компаратора.
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Пушкин", "Собрание сочинений", 527));
    books.add(new Book("Пушкин", "Руслан и Людмила", 350));
    books.add(new Book("Лермонтов", "Собрание сочинений", 435));
    System.out.println(books);

    books.sort((o1, o2) -> {
      int titleComparator = o1.getTitle().compareTo(o2.getTitle());
      if (titleComparator == 0) {
        titleComparator = o1.getAuthor().compareTo(o2.getAuthor());
      }
      return titleComparator;
    });
    System.out.println(books);
  }
}
