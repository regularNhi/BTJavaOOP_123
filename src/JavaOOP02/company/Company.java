package JavaOOP02.company;

import JavaOOP02.person.Person;

public class Company {


    public static void main(String[] args) {
        Person person = new Person("Trung Bình Lý", "nam", 28, "TPHCM", "01923827192");

        System.out.println("Tên: " +  person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
    }
}
