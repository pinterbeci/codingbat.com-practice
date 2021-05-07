package main.lambdaEx;

//az adott annotáció jelzi, hogy az adott interfésznek van egy absztrakt metódusa.
//és nem lehet hozzáadni újat, tehát ne változtassanak rajta.

@FunctionalInterface
public interface Growl {

    public void growling(int a);
}
