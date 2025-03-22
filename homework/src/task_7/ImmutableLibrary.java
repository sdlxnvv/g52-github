package task_7;

import java.util.List;
import java.util.Set;

public class ImmutableLibrary {
    private final List<String> books;
    private final Set<String> members;

    public ImmutableLibrary(List<String> books, Set<String> members) {
        this.books = List.copyOf(books);
        this.members = Set.copyOf(members);
    }

    public List<String> getBooks() {
        return books;
    }

    public Set<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "ImmutableLibrary{" +
                "books=" + books +
                ", members=" + members +
                '}';
    }
}
