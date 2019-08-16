package org.sniper.jack.base.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo1 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        Student stu1 = new Student(1, 2);
        Student stu2 = new Student(3, 4);
        Student stu3 = new Student(3, 4);

        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        long sum = students.stream()
                .map(s -> {
                    s.setAllAge(s.getAge1() + s.getAge2());
                    return s;
                }).mapToInt(s -> s.getAllAge())
                .summaryStatistics().getSum();
        System.out.println(sum);
    }

}
