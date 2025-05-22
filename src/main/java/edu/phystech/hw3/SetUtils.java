package edu.phystech.hw3;

import java.util.*;

public class SetUtils {
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> set = new TreeSet();
        set.addAll(s1);
        set.addAll(s2);
        return set;
    }

    public static <E> Set<E> intersection(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> set = new TreeSet();
        set.addAll(s1);
        set.retainAll(s2);
        return set;
    }

    public static <E> Set<E> difference(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> set = new TreeSet();
        set.addAll(s1);
        set.removeAll(s2);
        return set;
    }

    public static <E> Set<E> symmetricDifference(Set<? extends E> s1, Set<? extends E> s2) {
        return difference(union(s1, s2), intersection(s1, s2));
    }

}
