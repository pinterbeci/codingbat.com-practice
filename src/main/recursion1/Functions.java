package main.recursion1;

public class Functions {

    public static String changeXY(String str) {

        if (str.length() == 0)
            return "";

        String xToy = str.substring(0, 1);

        if (str.toLowerCase().charAt(0) == 'x') {
            xToy = "y";
        }


        return xToy + changeXY(str.substring(1, str.length()));
    }

    public static int bunnyEars2(int bunnies) {

        int ears = 0;

        if (bunnies == 0)
            return 0;
        if (bunnies % 2 == 0)
            ears = 3;
        if (bunnies % 2 == 1)
            ears = 2;
        return ears + bunnyEars2(bunnies - 1);
    }

    public String changePi(String str) {

        if (str.length() == 0)
            return "";
        int nextStepTo = 0;
        String changedPi = "";


        if (str.charAt(0) == 'p' && str.length() >= 2) {
            if (str.charAt(1) == 'i') {
                changedPi = "3.14";
                nextStepTo = str.indexOf('i') + 1;
            } else {
                nextStepTo = str.indexOf(str.charAt(0)) + 1;
                changedPi = "" + str.charAt(0);
            }
        } else {
            nextStepTo = str.indexOf(str.charAt(0)) + 1;
            changedPi = "" + str.charAt(0);
        }

        return changedPi + changePi(str.substring(nextStepTo, str.length()));
    }


    public String noX(String str) {

        if (str.length() == 0)
            return "";
        String changedXToEmpty = "";

        if (str.charAt(0) != 'x') {

            changedXToEmpty = "" + str.charAt(0);
        }

        return changedXToEmpty + noX(str.substring(1, str.length()));
    }

    public boolean array6(int[] nums, int index) {

        if (nums.length == 0)
            return false;

        if (nums[index] == 6)
            return true;
        else if (index < nums.length - 1) {
            return array6(nums, index + 1);
        }

        return false;
    }

    public int array11(int[] nums, int index) {

        if (nums.length == 0)
            return 0;

        int countOf11 = 0;
        if (nums[index] == 11) {
            countOf11++;
        }

        if (index + 1 < nums.length) {
            return countOf11 + array11(nums, index + 1);
        }

        return countOf11;
    }

    public boolean array220(int[] nums, int index) {

        if (nums.length == 0)
            return false;

        if (index + 1 < nums.length) {
            if (nums[index] * 10 == nums[index + 1]) {

                return true;
            }

            return array220(nums, index + 1);
        }

        return false;
    }

    public String allStar(String str) {

        if (str.length() == 0)
            return "";

        String takeAStar = "*";
        if (str.substring(1, str.length()).length() == 0) {
            takeAStar = "";

        }
        return str.charAt(0) + takeAStar + allStar(str.substring(1, str.length()));
    }

    public String pairStar(String str) {

        if (str.length() == 0)
            return "";

        String putAStar = "";
        int startTo = 1;

        if (str.substring(0, str.length()).length() > 1) {

            if (str.charAt(0) == str.charAt(1)) {
                putAStar = str.charAt(0) + "*";
            } else {
                putAStar = "" + str.charAt(0);
            }

            return putAStar + pairStar(str.substring(1, str.length()));
        }

        return "" + str.charAt(0);
    }

    public String endX(String str) {

        if (str.length() == 0)
            return "";

        if (str.charAt(0) == 'x') {
            return endX(str.substring(1, str.length())) + str.charAt(0);
        } else {
            return str.charAt(0) + endX(str.substring(1, str.length()));
        }


    }

    public int countPairs(String str) {

        if (str.length() == 0)
            return 0;

        int countOfPairs = 0;
        String charactersThatHasPair = "";

        for (int i = 0; i < str.length(); i++) {

            if (charactersThatHasPair.contains(Character.toString(str.charAt(i)))) {
                charactersThatHasPair += Character.toString(str.charAt(i));
            } else {
                countOfPairs++;
            }
        }

        return countOfPairs;
    }

    public int countOfRepeatedChars(String text, char character) {
        // End case
        if (text.length() == 1) {
            if (character == text.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            String part1 = text.substring(0, text.length() - 1);
            String part2 = text.substring(text.length() - 1);

            return countOfRepeatedChars(part1, character) +
                    countOfRepeatedChars(part2, character);
        }
    }


    public int countPairs2(String str) {

        /*  System.out.println(str);*/
        if (str.length() == 0)
            return 0;

        if (str.length() <= 2)
            return 0;

        int countOfPairs = 0;

        if (str.charAt(0) == str.charAt(2))
            countOfPairs++;

        return countOfPairs + countPairs2(str.substring(1, str.length()));

    }

    public int countAbc(String str) {

        if (str.length() <= 0)
            return 0;

        int countOfAbc = 0;

        if (str.length() > 2) {

            if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
                countOfAbc++;
        }

        return countOfAbc + countAbc(str.substring(1, str.length()));
    }


    public int count11(String str) {

        if (str.length() < 2)
            return 0;

        int occurenceOf11 = 0;
        int startIndex = 1;

        if (str.substring(0, 2).equals("11")) {

            if (str.length() == 2) {
                occurenceOf11++;
                startIndex = 1;
            }

            if (str.length() > 2) {

                if (str.substring(0, 3).equals("111")) {
                    occurenceOf11++;
                    startIndex = 2;
                }
                if (str.substring(0, 2).equals("11") && !str.substring(2, 3).equals("1")) {

                    startIndex = 1;
                    occurenceOf11++;
                }
            }
        }
        return occurenceOf11 + count11(str.substring(startIndex, str.length()));
    }

    public String stringClean(String str) {

        if (str.length() == 0)
            return "";

        if (str.length() == 1)
            return str;

        if (str.length() == 2) {

            if (str.charAt(0) == str.charAt(1)) {
                return Character.toString(str.charAt(0));
            }
        }


        String firstChar = Character.toString(str.charAt(0));
        int nextCharIndex = 1;
        String nextChar = Character.toString(str.charAt(nextCharIndex));
        int lastCharIndex = str.length();

        while (firstChar.equals(nextChar)) {

            if (lastCharIndex == nextCharIndex + 1) {

                return firstChar;
            }

            nextCharIndex++;
            nextChar = Character.toString(str.charAt(nextCharIndex));

        }

        return firstChar + stringClean(str.substring(nextCharIndex, str.length()));
    }

    public int countHi2(String str) {

        if (str.length() < 2)
            return 0;

        if (str.length() == 2 && str.equals("hi"))
            return 1;

        int countOfHi = 0;
        int startIndex = 1;
        if (str.length() > 2) {

            if (str.substring(0, 2).equals("hi")) {

                if (str.length() == 3) {
                    return 1;
                } else {

                    countOfHi++;
                    startIndex = 2;
                }

            } else if (str.substring(1, 3).equals("hi")) {

                if (str.substring(0, 1).equals("x") && str.length() > 3) {
                    countOfHi = 0;
                    startIndex = 2;
                } else if (str.substring(0, 1).equals("x") && str.length() == 3) {

                    return 0;
                }
            }
        }


        return countOfHi + countHi2(str.substring(startIndex, str.length()));
    }


    public String parenBit(String str) {

        if (str.length() == 0)
            return "";

        String firstChar = Character.toString(str.charAt(0));
        String returnedSubstr = "";
        int currentSubStrLength = str.length();
        int startIndex = 1;

        int firstCharIndex = 0;
        if (firstChar.equals("(")) {

            while (!firstChar.equals(")")) {

                if (currentSubStrLength - 1 == firstCharIndex) {
                    return "";
                }

                returnedSubstr += firstChar;
                firstCharIndex++;
                firstChar = Character.toString(str.charAt(firstCharIndex));

                if (firstChar.equals("(")) {
                    startIndex = firstCharIndex;
                    returnedSubstr = "";
                    break;
                }

                if (firstChar.equals(")")) {
                    returnedSubstr += ")";
                }

            }
        }

        return returnedSubstr + parenBit(str.substring(startIndex));
    }

    public boolean nestParen(String str) {

        if (str.length() == 0)
            return true;

        if (str.equals("()"))
            return true;

        if (str.charAt(1) == '(' && str.charAt(str.length() - 2) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }

        return false;

    }

    public int strCount(String str, String sub) {

        if (str.length() == 0)
            return 0;

        if (sub.length() > str.length())
            return 0;

        int countOfSubOcc = 0;
        int nextCheckIndex = 1;

        if (str.indexOf(sub) == 0) {

            countOfSubOcc++;
            nextCheckIndex = sub.length();
        }

        return countOfSubOcc + strCount(str.substring(nextCheckIndex, str.length()), sub);

    }

    public boolean strCopies(String str, String sub, int n) {

        if (n == 0)
            return true;

        if (str.length() == 0)
            return false;

        if (sub.length() > str.length())
            return false;

        int countOfSubOcc = n;
        int nextCheckIndex = 1;


        if (str.indexOf(sub) == 0) {

            countOfSubOcc--;
            nextCheckIndex = sub.indexOf(sub) + 1;

        }

        return strCopies(str.substring(nextCheckIndex, str.length()), sub, countOfSubOcc);
    }


    public int strDist(String str, String sub) {

        if (str.length() == 0)
            return 0;

        if (sub.length() > str.length())
            return 0;

        int subStrlength = 0;
        int nextStep = 1;
        if (str.substring(0, sub.length()).equals(sub)) {

            subStrlength += str.lastIndexOf(sub) + sub.length();
            nextStep = subStrlength;
        }

        return subStrlength + strDist(str.substring(nextStep, str.length()), sub);
    }


}