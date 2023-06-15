package org.example;

import lombok.Getter;
import lombok.Setter;

/**
 * Hello world!
 *
 */
@Getter
@Setter
public class Principle
{
    private static Principle instance;
    String msg;
    private Principle() {
         msg = "Welcome to Singleton Principle Instance";
    }

    public static Principle getInstance() {
        synchronized (Principle.class) {
            if (instance == null) {
                instance = new Principle();
            }
        }
        return instance;
    }

    public static void main(String[] args )
    {
        System.out.println( "Singleton Object LazyInitialization !!!" );
        Principle prince=new Principle();
        System.out.println("The String is:"+prince.getMsg());
    }
}
