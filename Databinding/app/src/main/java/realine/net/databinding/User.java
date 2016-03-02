package realine.net.databinding;

import java.util.Random;

/**
 * Created by YangLong on 3/2/2016.
 */

public class User {
    private static final int YOUNG_LIMIT = 30;
    private static final int AGE_LIMIT = 100;

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void newAge(){
        int age = new Random().nextInt((AGE_LIMIT - 1) + 1) + 1;
        this.age = age;
    }

    public boolean isYoung(){
        return age < YOUNG_LIMIT;
    }
}
