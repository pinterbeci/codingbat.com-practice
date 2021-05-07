package main.logic2;

import java.util.*;

public class MethodsOfLogic2 {

    public boolean makeBricks(int small, int big, int goal) {

        if (goal == 0)
            return true;

        if (goal >= 5 && big > 0 && goal > small)
            return makeBricks(small, big - 1, goal - 5);

        if (small >= goal)
            return makeBricks(small, big, 0);

        return false;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c)
            sum += a;

        if (b != a && b != c)
            sum += b;

        if (c != a && c != b)
            sum += c;

        return sum;
    }

    public int luckySum(int a, int b, int c) {

        if (a == 13)
            return 0;

        if (b == 13)
            return a;

        if (c == 13)
            return a + b;

        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {

        List<Integer> ageOfTeens = Arrays.asList(13, 14, 17, 18, 19);
        int sum = 0;
        if (!ageOfTeens.contains(a))
            sum += a;

        if (!ageOfTeens.contains(b))
            sum += b;

        if (!ageOfTeens.contains(c))
            sum += c;

        return sum;
    }

    public int roundSum(int a, int b, int c) {

        int sum = 0;

        if (a % 10 >= 5) {
            sum += a + (10 - (a % 10));
        } else {
            sum += (a / 10) * 10;
        }
        if (b % 10 >= 5) {
            sum += b + (10 - (b % 10));
        } else {
            sum += (b / 10) * 10;
        }

        if (c % 10 >= 5) {
            sum += c + (10 - (c % 10));
        } else {
            sum += (c / 10) * 10;
        }

        return sum;
    }

    public boolean closeFar(int a, int b, int c) {

        if (Math.abs(a - b) <= 1 && Math.abs(c - b) >= 2 && Math.abs(a - c) >= 2) {
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(c - b) >= 2 && Math.abs(a - b) >= 2)
            return true;

        return false;
    }

    public int blackjack(int a, int b) {

        if ((a - 21 <= 0) && (b - 21 <= 0))
            return Integer.max(a, b);

        return (a - 21 <= 0) ? a : (b - 21 <= 0) ? b : 0;
    }

    public boolean evenlySpaced(int a, int b, int c) {

        int maxVal = Integer.max(Integer.max(a, b), c);
        int minVal = Integer.min(Integer.min(a, b), c);
        int midVal = (a != minVal && a != maxVal) ? a
                : (b != minVal && b != maxVal) ? b : c;

        return Math.abs(maxVal - midVal) == Math.abs(midVal - minVal);
    }

    public int makeChocolate(int small, int big, int goal) {

        if (goal == 0)
            return 0;

        if (big > 0) {
            if ((big * 5) <= goal) {
                return makeChocolate(small, big - 1, goal - (big * 5));
            } else if (goal > small && (big * 5) > goal) {
                return makeChocolate(small, big - 1, goal - 5);
            }
        }

        if (small >= goal && goal > 0)
            return 1 + makeChocolate(small - 1, big, goal - 1);

        return -1;
    }


}
