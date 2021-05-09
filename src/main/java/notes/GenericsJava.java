package notes;

public class GenericsJava<T> {
    public static void main(String[] args) {
        Generic<Integer> genericsJava = new Generic<Integer>();
        genericsJava.setInside(1);

        Generic<String> genericsJava1 = new Generic<String>();
        genericsJava1.setInside("HELLO");

        Integer inside = genericsJava.getInside();
        System.out.println(inside);

    }


}





class Generic<T> {

    private T inside;

    public T getInside() {
        return inside;
    }

    public void setInside(T inside) {
        this.inside = inside;
    }

}
