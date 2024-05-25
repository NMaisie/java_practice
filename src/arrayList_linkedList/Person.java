package arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Person(\""+ name+ "\","+ age +")";
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("bob",25));
        people.add(new Person("alice",30));
        people.add(new Person("Charlie",35));
        people.add(new Person("David",20));
        people.add(new Person("Eve",40));

//        people =filterAge(people);
//        people = alphOrder(people);
//        System.out.println(people);
        people = useStream(people);
        System.out.println(people);

    }
    public static ArrayList<Person> filterAge(ArrayList<Person> people ) {
        ArrayList<Person> filted = new ArrayList<>();
        int minAge = 20;
        int maxAge = 35;
        for (Person p : people) {
            if (p.age >= minAge && p.age <= maxAge) {
                filted.add(p);
            }
        }return filted;
    }
        public static ArrayList<Person> alphOrder(ArrayList<Person> people) {
            Collections.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
                }
            });
            return people;
        }
        public static ArrayList<Person> streamAPI (ArrayList<Person> people){

        return people.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge()>=20 && person.getAge()<=35;
            }
        }).sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().toLowerCase().compareTo((o2.getName().toLowerCase()));
            }
        }).collect(Collectors.toCollection(ArrayList:: new));
        }

    public static ArrayList<Person> useStream (ArrayList<Person> people){
        return people.stream()
                .filter(person -> person.age >=20 && person.age<=35)
                .sorted(Comparator.comparing(o-> o.getName().toLowerCase())).collect(Collectors.toCollection(ArrayList:: new));
    }
    }