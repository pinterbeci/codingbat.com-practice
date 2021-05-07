package main.map2;

import java.util.HashMap;
import java.util.Map;

public class MethodsOfMap2 {

    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> returnMap = new HashMap<>();
        for (String currentString : strings) {
            if (!returnMap.containsKey(currentString)) {
                returnMap.put(currentString, 0);
            }
        }
        return returnMap;
    }

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> returnMap = new HashMap<>();
        for (String currentString : strings) {
            if (!returnMap.containsKey(currentString)) {
                returnMap.put(currentString, currentString.length());
            }
        }
        return returnMap;
    }

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> returnmap = new HashMap<>();
        for (String currentString : strings) {

            String firstChar = Character.toString(currentString.charAt(0));
            String lastChar = Character.toString(currentString.charAt(currentString.length() - 1));

            if (!returnmap.containsKey(firstChar)) {
                returnmap.put(firstChar, lastChar);
            } else if (returnmap.containsKey(firstChar)) {
                returnmap.replace(firstChar, lastChar);
            }
        }
        return returnmap;
    }

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> returnMap = new HashMap<>();

        for (String currentString : strings) {

            if (!returnMap.containsKey(currentString)) {
                returnMap.put(currentString, 1);
            } else if (returnMap.containsKey(currentString)) {
                int countOfOccKey = returnMap.get(currentString);
                countOfOccKey += 1;
                returnMap.replace(currentString, countOfOccKey);
            }
        }
        return returnMap;
    }

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> separatedByFirstChar = new HashMap<>();
        for (String currentString : strings) {
            String currentFistChar = currentString.substring(0, 1);

            //optional case: no difference between lower and uppercase
            if (Character.isUpperCase(currentString.charAt(0)))
                currentFistChar = Character.toString(Character.toLowerCase(currentString.charAt(0)));

            if (!separatedByFirstChar.containsKey(currentFistChar)) {
                separatedByFirstChar.put(currentFistChar, currentString);
            } else {
                String currentValue = separatedByFirstChar.get(currentFistChar);
                separatedByFirstChar.replace(currentFistChar, currentValue + currentString);
            }
        }
        return separatedByFirstChar;
    }

    public String wordAppend(String[] strings) {

        String returnValue = "";
        Map<String, Integer> occurenceOfStrings = new HashMap<>();

        for (String currentString : strings) {

            if (!occurenceOfStrings.containsKey(currentString)) {
                occurenceOfStrings.put(currentString, 1);
            } else {

                int currentValue = occurenceOfStrings.get(currentString) + 1;

                if (currentValue % 2 == 0)
                    returnValue += currentString;

                occurenceOfStrings.replace(currentString, currentValue);
            }
        }
        return returnValue;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> hasOccurence = new HashMap<>();

        for (String currentString : strings) {
            if (!hasOccurence.containsKey(currentString)) {
                hasOccurence.put(currentString, false);
            } else {
                hasOccurence.replace(currentString, true);
            }
        }
        return hasOccurence;
    }

    public String[] allSwap(String[] strings) {

        String[] swappedArray = new String[strings.length];
        Map<String, Integer> swappingItems = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (!swappingItems.containsKey(strings[i].substring(0, 1))) {
                swappingItems.put(strings[i].substring(0, 1), i);
                swappedArray[i] = strings[i];
            } else {

                int firstOccIndex = swappingItems.get(strings[i].substring(0, 1));
                int currentIndex = i;

                //mivel itt removeolok egy itemet, ezért csak mindig
                //a tömben az egymás után következő azonos betűvel keződődő elemeket
                //cseréli meg!!!

                swappingItems.remove(strings[i].substring(0, 1), i);
                swappedArray[i] = swappedArray[firstOccIndex];
                swappedArray[firstOccIndex] = strings[i];

            }
        }
        return swappedArray;
    }

    public String[] firstSwap(String[] strings) {

        String[] swappedArray = new String[strings.length];
        Map<String, Integer> items = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {

            if (!items.containsKey(strings[i].substring(0, 1))) {
                items.put(strings[i].substring(0, 1), i);
                swappedArray[i] = strings[i];
            } else {

                int firstIndexOfOcc = items.get(strings[i].substring(0, 1));
                int indexOfOldItm = i;

                if (firstIndexOfOcc > -1) {
                    swappedArray[indexOfOldItm] = swappedArray[firstIndexOfOcc];
                    swappedArray[firstIndexOfOcc] = strings[i];
                } else {
                    swappedArray[i] = strings[i];
                }
                items.replace(strings[i].substring(0, 1), -1);

            }
        }
        return swappedArray;
    }
}
