package main;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {

        /*
         * ebben az esetben a 'String pool'-ba jön létre a megadott sztring és mindkét változó, objektum
         * ugyanarra mutat, így egyenlőek!!
         * */

        String a = "alma";
        String b = "alma";


        /*
         * Ebben az esetben két KÜLÖN objektum, változó jön létre, és
         * nem a 'String pool'-ba lesznek eltárolva, hanem külön-külön a memóriában!
         * */
        String v = new String("alma");
        String n = new String("alma");

        System.out.println("a == b ? = " + (a == b));
        System.out.println("a == v ? = " + (a == v));
        System.out.println("b == v ? = " + (b == v));
        System.out.println("n == v ? = " + (n == v));

        System.out.println("________________");

        /*
         * az 'equals' metódus, megvizsgálja hogy azonos típusúak-e az objektumok, és ha igen
         * akkor az értékük megegyezik, ha az is igazt ad vissza, akkor visszatér egy 'true'-val,
         * minden más esetben 'false'!
         * */

        System.out.println("a.equals(b) ? = " + (a.equals(b)));
        System.out.println("a.equals(v) ? = " + (a.equals(v)));
        System.out.println("b.equals(n) ? = " + (b.equals(n)));
        System.out.println("v.equals(n) ? = " + (v.equals(n)));


        System.out.println("________________________");

        /*
         * ezt az appendálást, hozzáfüzést végezzük el, akkor *
         * */
        String variable1 = "a";
        String variable2 = "b";
        String returnValue = "prefix " + variable1 + " middle " + variable2 + " end";
        System.out.println(returnValue);


        System.out.println("________________________");
        //* ez történik a háttérben
        String s;
        StringBuilder tmp;
        s = "prefix ";
        tmp = new StringBuilder();
        tmp.append(s);
        tmp.append(variable1);
        s = tmp.toString();
        tmp = new StringBuilder();
        tmp.append(s);
        tmp.append(" middle ");
        s = tmp.toString();
        tmp = new StringBuilder();
        tmp.append(s);
        tmp.append(variable2);
        s = tmp.toString();
        tmp = new StringBuilder();
        tmp.append(s);
        tmp.append(" end");
        s = tmp.toString();
        System.out.println(s);


        /*f
        * StringBuilder VS StringBuffer
        *
        * StringBuilder lesz a gyorsabb
        * */

        long starOfPartOfCode = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("almaaa");
        System.out.println(sb.toString());
        long endOfPartOfCode = System.currentTimeMillis();
        System.out.println(endOfPartOfCode);
        System.out.println(endOfPartOfCode - starOfPartOfCode + " sec, running time, if i use StringBuilder!");


        long starOfPartOfCodeStringBuf = System.currentTimeMillis();
        StringBuffer sBuf = new StringBuffer();
        sBuf.append("almaaa");
        sBuf.append(" ").append("korte");
        sBuf.append("almaaa");

        System.out.println(sBuf.toString());
        long endOfPartOfCodeStringBuf = System.currentTimeMillis();
        System.out.println(endOfPartOfCodeStringBuf - starOfPartOfCodeStringBuf + " sec, if i use StringBuffer!");
    }
}
