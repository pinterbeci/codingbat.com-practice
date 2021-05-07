package main.lambdaEx;

public class Lambda {

    public void letsDoThis(int a, Growl g){

        g.growling(a);
    }
    public void observed(){
        letsDoThis(2,a -> {
            System.out.println("Az értéke: "+ a);

            //a 'this' ebben az esetben, a külsejére értődik, nem magára a belső objektumra.
            System.out.println(this);
        });
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Program pr = new Program();

        pr.doSomething(dog);

        //így ebben az esetben magát az interfész ugye nem tudom példányosítani,
        // ezért létre kell hozzak, egy olyan osztályt, amely kiterjeszti azt, ha esetemben a 'doSomething'
        // metódus elvárja, hogy az adott interfész típusú 'példányt' adjak át neki, így végig kell zongorázni ezt
        // a folyamatot. VISZONT ebben az esetben tudjuk használni a lambda kifejezéseket.


        Growl growling = (int a) -> {
            System.out.println("Grrr, a korom  = "+ a);
        };

        pr.doSomething(growling);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("fuuuutoook!");
            }
        });

        Thread t2 = new Thread( ()-> {
            System.out.println("Én is futooook");
        });

        //kettő ugyanaz, annyi külömbséggel, hogy második rövidebb :)
        //a háttérben a kettő közötti különbség, az hogy lambda nem tekint magára külön objektumként,
        //azaz nem használható a 'this' kulcsszó. Az anoním osztály (melynek nincs, de van implementáció) segítségével
        //létrehozott példában viszont hivatkozhatunk a 'this'-re, mivel ott egy új objektum jön létre.

        Lambda lambda = new Lambda();
       /* lambda.letsDoThis(2,a -> {
            System.out.println("Az értéke: "+ a);

            //a 'this' ebben az esetben, a külsejére értődik, nem magára a belső objektumra.
            System.out.println(this);
        });

            //viszont felül az 'observed' metódusban megengedett lesz, mivel ott konkrétan
            //a Lambda osztály egy példányára utal majd, mert nem statikus környezetben lesz.
        */
    }
}
