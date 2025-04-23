package JavaOOP02.person;

public class Infomation {

    public static void main(String[] args) {
        Person person = new Person("Trung Bình Lý", "nam", 28, "TPHCM", "01923827192");

        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " +  person.getGender());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Số điện thoại: " + person.getPhone());

    }
}



