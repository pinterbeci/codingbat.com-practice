package main.rekurzio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {


        System.out.println("items in list = " + recursionWithList(31, 35));
        System.out.println("----------------------");
        //System.out.println(iteratorRecursion(1, 15));

        System.out.println(subsetThatSumTo(9, Arrays.asList(1, 2, 3, 4)));

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(list.stream().mapToInt(n -> n).sum());
    }

    public static int sum(int number) {

        if (number > 0) {
            return number + sum(number - 1);
        }
        return 0;
    }


    public static String iteratorRecursion(int firstValue, int lastValue) {
        String returnValue = "";
        if (firstValue != lastValue) {
            returnValue += firstValue + " " + iteratorRecursion(firstValue + 1, lastValue);
        }
        return returnValue;
    }

    public static ArrayList<Integer> recursionWithList(int firstItem, int lastItem) {
        ArrayList<Integer> items = new ArrayList<>();


        return null;
    }


    public static List<Integer> subsetThatSumTo(int total, List<Integer> list) {

        System.out.println("total = " + total);
        System.out.println("list = " + list);
        System.out.println("________");
        //---------------------------------

        System.out.println("total == sum(list)?");
        if (list.stream().mapToInt(n -> n).sum() == total) {
            System.out.println("igen!");
            return new ArrayList<>(list);
        }else{
            System.out.println("nem!");
            System.out.println("__________");
        }



        System.out.println("üres az adott paraméterek mellett a list?");
        if (list.isEmpty()) {

            System.out.println("igen!");

            System.out.println("total = " + total);
            System.out.println("list = " + list);
            System.out.println("visszatérési érték = null, a fent található total-ra és listre!");
            System.out.println("________");

            return null;
        }else{

            System.out.println("nem, mivel: ");
            System.out.println("list = " + list);
            System.out.println("______");
        }

        System.out.println("újabb hívás!");
        System.out.println("total = " + (total - list.get(0) ));
        System.out.println("list = " + list.subList(1, list.size()));
        System.out.println("______");
        List<Integer> result = subsetThatSumTo((total - list.get(0)), list.subList(1, list.size()));

        System.out.println("a result üres?");
        if (result != null) {
            System.out.println("nem, ezért: ");
            result.add(0, list.get(0));

            System.out.println("result = " + result);
            return result;

        } else {
            System.out.println("igen, ezért: ");
            System.out.println("total = " + total);
            System.out.println("list = " + list);
            System.out.println("________");

            return subsetThatSumTo(total, list.subList(1, list.size()));
        }
    }
}
