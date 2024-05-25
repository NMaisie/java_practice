package leetcode.utils;

import java.util.List;

public class Assertion <T extends Comparable<T>>{
    public void assertEqual(T expected, T actual){
        if (expected.compareTo(actual) != 0)
            throw new AssertionError(String.format("Expected %s but actual %s", expected, actual));
    }

    public void assertEqual(List<T> expected, List<T> actual){
        if(expected.size() != actual.size() || !expected.equals(actual)){
            throw new AssertionError(String.format("Expected %s but actual %s", expected, actual));
        }
    }


}
