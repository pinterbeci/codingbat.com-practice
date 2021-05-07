package main.logic1;

import java.sql.Array;
import java.sql.Struct;
import java.util.*;

public class MethodOfLogic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (cigars >= 40 && isWeekend)
            return true;

        if (!isWeekend && (cigars >= 40 && cigars <= 60))
            return true;

        return false;
    }

    public int dateFashion(int you, int date) {

        if (you <= 2 || date <= 2)
            return 0;

        if (you >= 8 || date >= 8)
            return 2;

        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (isSummer && (temp <= 100 && temp >= 60))
            return true;

        if (temp <= 90 && temp >= 60)
            return true;

        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday)
            speed -= 5;

        if (speed > 60 && speed <= 80)
            return 1;
        if (speed >= 81)
            return 2;

        return 0;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19)
            return 20;

        return a + b;
    }

    public String alarmClock(int day, boolean vacation) {

        if (vacation) {

            if (day >= 1 && day <= 5)
                return "10:00";
            else
                return "off";
        }

        if (day == 0 || day == 6)
            return "10:00";

        return "7:00";
    }

    public boolean love6(int a, int b) {

        if (a == 6 || b == 6)
            return true;

        if ((a + b) == 6 || Math.abs(a - b) == 6)
            return true;

        return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode)
            return (n < 2 || n > 9);

        return (n > 0 && n < 11);
    }

    public boolean specialEleven(int n) {

        return (n % 11 == 0 || n % 11 == 1);
    }

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;

        return (tea >= candy * 2 || candy >= tea * 2) ? 2 : 1;
    }

    public String fizzString(String str) {

        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b"))
            return "FizzBuzz";

        return str.substring(str.length() - 1).equals("b") ? "Buzz" :
                str.substring(0, 1).equals("f") ? "Fizz" : str;
    }

    public String fizzString2(int n) {

        if (n % 5 == 0 && n % 3 == 0)
            return "FizzBuzz!";

        return (n % 5 == 0) ? "Buzz!" : (n % 3 == 0) ? "Fizz!"
                : Integer.toString(n) + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {

        a = (a < 0) ? a *= -1 : a;
        b = (b < 0) ? b *= -1 : b;
        c = (c < 0) ? c *= -1 : c;

        int maxValue = Integer.max(Integer.max(a, b), c);

        return 2 * maxValue == ((Integer.sum(Integer.sum(a, b), c)));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {

        return (c > b && a < b) ? true : (bOk && b < c) ? true : false;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        if (equalOk) {
            return ((Integer.max(Integer.max(a, b), c) == c)
                    && (Integer.max(a, b) == b)) ? true : false;
        }
        return (a < b && b < c) ? true : false;
    }

    public boolean lastDigit(int a, int b, int c) {

        Set<Integer> rightmostDigits = new HashSet<>();
        rightmostDigits.add((a %= 10));
        rightmostDigits.add((b %= 10));
        rightmostDigits.add((c %= 10));

        return rightmostDigits.size() < 3 ? true : false;
    }

    public boolean lessBy10(int a, int b, int c) {

        return Math.abs(a - c) >= 10 || Math.abs(a - b) >= 10
                || Math.abs(b - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        return (noDoubles && (die1 == die2 && die1 == 6)) ? die1 + 1 :
                (noDoubles && (die1 == die2)) ? die1 + die2 + 1 :
                        die1 + die2;
    }

    public int maxMod5(int a, int b) {
        return a == b ? 0 : (a % 5 == b % 5) ? Integer.min(a, b)
                : Integer.max(a, b);
    }

    public int redTicket(int a, int b, int c) {

        return (Integer.compare(b, a) != 0 && Integer.compare(c, a) != 0) ? 1 :
                (a == b && b == c && c == 2) ? 10 : (a == b && b == c) ? 5 : 0;
    }


    public int greenTicket(int a, int b, int c) {

        Set<Integer> tickets = new HashSet<>();

        tickets.addAll(Arrays.asList(a, b, c));
        return tickets.size() == 3 ? 0 : tickets.size() == 2 ? 10 : 20;
    }

    public int blueTicket(int a, int b, int c) {

        if (Integer.sum(a, b) == 10 || Integer.sum(a, c) == 10 || Integer.sum(c, b) == 10)
            return 10;

        if ((Integer.sum(a, b) - Integer.sum(c, b)) >= 10
                || (Integer.sum(a, b) - Integer.sum(c, a)) >= 10)
            return 5;

        return 0;
    }

    public boolean shareDigit(int a, int b) {

        return ((Integer.compare(a / 10, b / 10) == 0)
                || (Integer.compare(a % 10, b % 10) == 0)
                || (Integer.compare(a % 10, b / 10)) == 0
                || (Integer.compare(a / 10, b % 10) == 0)) ?
                true : false;
    }

    public int sumLimit(int a, int b) {

        return String.valueOf(Integer.sum(a, b)).length() > String.valueOf(a).length()
                ? a : Integer.sum(a, b);

    }

}
