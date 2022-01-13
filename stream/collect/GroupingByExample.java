package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import stream.collect.Student.City;
import stream.collect.Student.Sex;


public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("hong", 74, Sex.MALE, City.SEOUL),
            new Student("kong", 84, Sex.FEMALE, City.BUSAN),
            new Student("song", 92, Sex.FEMALE, City.SEOUL),
            new Student("dong", 52, Sex.MALE, City.SEOUL),
            new Student("bong", 81, Sex.MALE, City.BUSAN)
        );

        Map<Student.Sex, List<Student>> mapBySex = students.stream()
            .collect(Collectors.groupingBy(
                Student::getSex));

        mapBySex.get(Sex.MALE).stream()
            .forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        mapBySex.get(Sex.FEMALE).stream()
            .forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.City, List<Student>> mapByCity2 = students.stream()
            .collect(Collectors.groupingBy(
                Student::getCity));
        mapByCity2.get(City.SEOUL).forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.City, List<String>> mapByCity = students.stream()
            .collect(
                Collectors.groupingBy(
                Student::getCity,
                Collectors.mapping(Student::getName, Collectors.toList())
                )
            );
        mapByCity2.get(City.BUSAN).forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------");

        Map<Student.Sex, List<String>> mapBySex2 = students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSex,
                    Collectors.mapping(Student::getName, Collectors.toList())
                )
            );
        mapBySex2.get(Sex.MALE).forEach(System.out::println);

        System.out.println("----------------------------------------");

        Map<Student.Sex, Double> avgBySex = students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSex,
                    Collectors.averagingDouble(Student::getScore)
                )
            );
        System.out.println(avgBySex.get(Sex.FEMALE));
    }
}
