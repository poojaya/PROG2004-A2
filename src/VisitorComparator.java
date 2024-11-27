package src;

import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by name, then by age if names are equal
        int nameComparison = v1.getName().compareTo(v2.getName());
        if (nameComparison == 0) {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
        return nameComparison;
    }
}
