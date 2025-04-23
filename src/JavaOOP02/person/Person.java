package JavaOOP02.person;

public class Person {

    public String name;
    public String gender;
    public int age;

    //protected truy cập cùng package và kế thừa
    protected String address;
    protected String phone;

    public Person(String name, String gender, int age, String address, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

//    public void showInfo(){
//
//        System.out.println("Tên: " + name);
//        System.out.println("Giới tính: " + gender);
//        System.out.println("Tuổi: " + age);
//        System.out.println("Địa chỉ: " + address);
//        System.out.println("Số điện thoại: " + phone);
//
//    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    protected String getAddress() {
        return address;
    }

    protected String getPhone() {
        return phone;
    }
}