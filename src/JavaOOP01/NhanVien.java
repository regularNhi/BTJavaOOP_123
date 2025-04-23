package JavaOOP01;

public class NhanVien {

    public String name;
    public int age;
    public String address;
    public String phone;

    public NhanVien(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void getInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: "+ age);
        System.out.println("Địa Chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }
}
