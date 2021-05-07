package main.functional1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodsOfFunc1 {

    public List<Integer> doubling(List<Integer> nums) {
/*
        //1. version
        List<Integer> retunedList = new ArrayList<>();

        for (Integer currentIndex:nums){
            retunedList.add(currentIndex*2);
        }

        return retunedList;
        */
/*
        //2. version
        // parameter -> expression (paraméter -> kifejezés)
        //replaceAll() metódus, kicseréli a nums adott elemeit,
        //mivel be tudja azt járni, az Iterator fősztálynak köszönhetően.
        nums.replaceAll(n -> n * 2);
        return nums;
*/
        //3. version
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());

    }

    public List<Integer> square(List<Integer> nums) {

      /*  List<Integer> returnedList = new ArrayList<>();

        for (Integer currentListItem : nums) {
            returnedList.add(currentListItem * currentListItem);
        }
        return returnedList;*/

       /* nums.replaceAll(currentListItem -> currentListItem * currentListItem);
        return nums;*/

        return nums.stream()
                .map(currentListItem -> currentListItem * currentListItem)
                .collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {

        return strings.stream()
                .map(currentString -> currentString + "*")
                .collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {

       /* List<String> returnStringList = new ArrayList<>();
        String copyOfCurrent = "";
        for (String currentString : strings) {

            copyOfCurrent = "";

            for (int i = 0; i < 3; i++) {

                copyOfCurrent += currentString;
            }

            returnStringList.add(copyOfCurrent);
        }

        return returnStringList;
*/
      /*  strings.replaceAll( n -> n + n +n );
        return  strings;*/

        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {

        return strings.stream()
                .map(currentItem -> ("y" + currentItem + "y"))
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {

        return nums.stream()
                .map(currentItem -> (currentItem + 1) * 10)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream()
                .map(currentItem -> currentItem % 10)
                .collect(Collectors.toList());
    }
    public List<String> lower(List<String> strings) {

        return strings.stream()
                .map(currentItem -> currentItem.toLowerCase())
                .collect(Collectors.toList());
    }
    public List<String> noX(List<String> strings) {

        return strings.stream()
                .map(currentItem -> currentItem.replaceAll("x", ""))
                .collect(Collectors.toList());
    }



}
