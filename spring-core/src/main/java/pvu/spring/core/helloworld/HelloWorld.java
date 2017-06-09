package pvu.spring.core.helloworld;

/**
 * Created by vhphat on 6/9/2017.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hi there " + name);
    }
}
