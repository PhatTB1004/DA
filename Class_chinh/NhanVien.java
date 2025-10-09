package Java.DoAn.Class_chinh;

public class NhanVien {
    // Thuộc tính:
    String manv, hoten, sdt, ngaysinh, gioitinh;
    double luong;

    // Phương thức:

    //Hàm thiết lập:
    public NhanVien() {
    }
    public NhanVien(String manv, String hoten, String sdt, String ngaysinh, String gioitinh, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }
    public NhanVien(NhanVien n) {
        this.manv = n.manv;
        this.hoten = n.hoten;
        this.sdt = n.sdt;
        this.ngaysinh = n.ngaysinh;
        this.gioitinh = n.gioitinh;
        this.luong = n.luong;
    }

    // Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        manv = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-10s %-20s %-15s %-15s %-10s %-10.2f\n", manv, hoten, sdt, ngaysinh, gioitinh, luong);
    }

    // Get, set:
    public String getMaNV() {
        return manv;
    }   
    public void setMaNV(String manv) {
        this.manv = manv;
    }
    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }
    public String getSDT() {
        return sdt;
    }
    public void setSDT(String sdt) {
        this.sdt = sdt;
    }
    public String getNgaySinh() {
        return ngaysinh;
    }
    public void setNgaySinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getGioiTinh() {
        return gioitinh;
    }
    public void setGioiTinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
