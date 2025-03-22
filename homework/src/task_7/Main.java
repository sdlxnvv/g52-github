package task_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        members.add("member1");
        members.add("member2");
        ImmutableLibrary immutableLibrary = new ImmutableLibrary(books,members);
        members.add("member3");
        books.add("book4");
        members.add("member4");
        System.out.println(immutableLibrary);
    }
}
