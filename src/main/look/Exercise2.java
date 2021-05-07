package main.look;

public class Exercise2 {

    public static void main(String[] args) {

        String value = "1";
        for (int i = 0; i < 5  ; i++) {

            System.out.println(lookAndSay(value));
            value = lookAndSay(value);
        }
    }

    public static String lookAndSay(String number){

        if( number.equals(null) || number.isEmpty() )
            return  "";

        int firstCharIndex = 0 ;
        int countOfCurrentChar = 0 ;
        String retuurnValue = "" ;

        for (int i = 0; i < number.length(); i++) {
            if( number.charAt(firstCharIndex) != number.charAt(i)){
                retuurnValue += number.charAt(firstCharIndex) + "" + countOfCurrentChar;
                countOfCurrentChar = 1 ;
                firstCharIndex = i;
            }else {
                    countOfCurrentChar ++ ;
            }
        }
        retuurnValue += number.charAt(firstCharIndex) + "" + countOfCurrentChar;
        return retuurnValue;
    }
}
