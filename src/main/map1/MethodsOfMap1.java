package main.map1;

import java.util.Collections;
import java.util.Map;

public class MethodsOfMap1 {

    public Map<String, String> mapBully(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("a")) {

            returnMap.put("b", returnMap.get("a"));
            returnMap.put("a", "");
        }

        return returnMap;

    }

    public Map<String, String> mapShare(Map<String, String> map) {

        Map<String, String> returnMap = map;
        if (returnMap.containsKey("c"))
            returnMap.remove("c");

        if (returnMap.containsKey("a"))
            returnMap.put("b", returnMap.get("a"));

        return returnMap;
    }

    public Map<String, String> mapAB(Map<String, String> map) {

        Map<String, String> returnmap = map;

        if (returnmap.containsKey("a") && returnmap.containsKey("b")) {
            returnmap.put("ab", returnmap.get("a") + returnmap.get("b"));
        }

        return returnmap;
    }

    public Map<String, String> topping1(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("ice cream")) {
            returnMap.remove("ice cream");
            returnMap.put("ice cream", "cherry");
        }
        returnMap.put("bread", "butter");
        return returnMap;
    }

    public Map<String, String> topping2(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("ice cream")) {
            returnMap.put("yogurt", returnMap.get("ice cream"));
        }

        if (returnMap.containsKey("spinach")) {

            returnMap.remove("spinach");
            returnMap.put("spinach", "nuts");
        }

        return returnMap;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("potato"))
            returnMap.put("fries", returnMap.get("potato"));

        if (returnMap.containsKey("salad"))
            returnMap.put("spinach", returnMap.get("salad"));

        return returnMap;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("a") && returnMap.containsKey("b")) {

            if (returnMap.get("a").equals(returnMap.get("b"))) {
                returnMap.remove("a");
                returnMap.remove("b");
            }
        }

        return returnMap;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("a") || returnMap.containsKey("b")) {

            if (!returnMap.containsKey("b")) {
                returnMap.put("b", returnMap.get("a"));
            } else if (!returnMap.containsKey("a")) {
                returnMap.put("a", returnMap.get("b"));
            }
        }

        return returnMap;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {

        Map<String, String> returnMap = map;

        if (returnMap.containsKey("a") && returnMap.containsKey("b")) {
            if ((returnMap.get("a").length() - returnMap.get("b").length()) > 0) {
                returnMap.put("c", returnMap.get("a"));
            } else if (returnMap.get("a").length() == returnMap.get("b").length()) {
                returnMap.replace("a", "");
                returnMap.replace("b", "");
            } else if ((returnMap.get("a").length() - returnMap.get("b").length()) < 0) {
                returnMap.put("c", returnMap.get("b"));
            }
        }

        return returnMap;
    }
}
