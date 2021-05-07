package main.functional1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MethodsOfFunc1 sample = new MethodsOfFunc1();
        List<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(89);
        nums.add(21);
        nums.add(0);
        nums.add(-9);
        nums.add(32);

        System.out.println(nums);
        System.out.println(sample.doubling(nums));

        List listOfCopies = Collections.nCopies(3, "alma");
        System.out.println(listOfCopies);
    }
}
