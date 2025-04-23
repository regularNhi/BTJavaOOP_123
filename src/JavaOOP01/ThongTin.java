package JavaOOP01;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Hường", 25,"Hà Nội","123455432" );
        NhanVien nhanVien2 = new NhanVien("Hùng", 30,"Hà Nội","123455432" );

        nhanVien.getInfo();
        nhanVien2.getInfo();
    }
}
