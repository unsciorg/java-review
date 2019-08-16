package org.sniper.jack.base.steam;

public class Student {

    private int age1;

    private int age2;

    private int allAge = 0;

    public Student() {
    }

    public Student(int age1, int age2) {
        this.age1 = age1;
        this.age2 = age2;
    }

    public int getAllAge() {
        return allAge;
    }

    public void setAllAge(int allAge) {
        this.allAge = allAge;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}
