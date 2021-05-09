

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/
package patternsJava.creationalPatternsJava.factory;

public class StaticFactoryMethodJava {
    public static void main(String[] args) {


        Aa a = new Aa("this is A");
        a.a();

        Bb.b("this is B");
        Bb bb = new Bb("str");
        Bb.b("qwe");
    }




}
class Aa {
    private String str;

    Aa(String str) {
        this.str = str;
    }

    public Aa a() {
        System.out.println(str);
        return new Aa(str);
    }
}

    class Bb {
        private String str;

        Bb(String str) {
            this.str = str;
        }


        static Bb b(String str) {
            System.out.println(str);
            return new Bb(str);
        }
    }
