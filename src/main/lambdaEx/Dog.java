package main.lambdaEx;

public class Dog  implements Growl{
    @Override
    public void growling(int a) {
        System.out.println("Grrrrrrr! " + a);
    }
}
