package main.map2;

public class Main {
    public static void main(String[] args) {

        MethodsOfMap2 sample = new MethodsOfMap2();

        //System.out.println(sample.wordCount(new String[] {"a", "b", "c", "a", "b"}));
       //  System.out.println(sample.firstChar(new String[] {"aaa", "baba", "cabab", "AAA", "badsdas"}));
       /* System.out.println(sample.wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}));
       String[] givenTestArray2 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
        String[] givenTestArray3 = {"a", "b", "b", "a", "a"};
        String[] givenTestArray4 = {"a", "b", "b", "b", "a", "c", "a", "a"};

        System.out.println(sample.wordAppend(givenTestArray2));
        System.out.println(sample.wordAppend(givenTestArray3));
        System.out.println(sample.wordAppend(givenTestArray4));*/
        //acp will return value!!!!
/*
       */ String[] currentArray = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] currentArrayWrite = sample.allSwap(currentArray);

        for (String currentString : currentArrayWrite )
            System.out.print(currentString + " ");
    }
}
