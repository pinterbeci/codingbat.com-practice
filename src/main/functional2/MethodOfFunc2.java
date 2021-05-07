package main.functional2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodOfFunc2 {

    public List<Integer> noNeg(List<Integer> nums) {

        List<Integer> returnedList = new ArrayList<>();
        for (Integer currentItem : nums) {
            if (currentItem >= 0)
                returnedList.add(currentItem);
        }

        return returnedList;
    }

    public List<Integer> no9(List<Integer> nums) {

        return nums.stream()
                .filter(currrentItem -> (currrentItem % 10) != 9)
                .collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {

        return nums.stream()
                .filter(currentItem -> currentItem <= 12 || currentItem >= 20)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {

        return strings.stream()
                .filter(currentListItem -> !(currentListItem.contains("z")))
                .collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {

        return strings.stream()
                .filter(currentListItem -> currentListItem.length() < 4)
                .collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {

        return strings.stream()
                .filter(currentListItem -> (currentListItem.length() != 3 && currentListItem.length() != 4))
                .collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {

        strings.replaceAll(currentListItem -> currentListItem.concat("y"));
        return strings.stream()
                .filter(currentListItem -> !currentListItem.contains("yy"))
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {

        List<Integer> returnList = nums;
        returnList.replaceAll(currentItem -> currentItem * 2);
        return returnList.stream()
                .filter(currentListItem -> (currentListItem % 10) != 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {

        List<Integer> returnList = nums;
        returnList.replaceAll(currentListItem -> (int) Math.pow(currentListItem, 2) + 10);
        return returnList.stream()
                .filter(currentListItem -> (currentListItem % 10 != 5 && currentListItem % 10 != 6))
                .collect(Collectors.toList());
    }

}
