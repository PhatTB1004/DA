package Java.DoAn.Class_chinh;

public class Sach {
    // Thuộc tính:
    String maSach, tenSach, tacGia, maTL, maNXB;
    int soLuong;
    double donGia;

    // Phương thức:

    //Hàm thiết lập:
    public Sach() {
    }
    public Sach(String maSach, String tenSach, String tacGia, String maTL, String maNXB, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.maTL = maTL;
        this.maNXB = maNXB;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public Sach(Sach s) {
        this.maSach = s.maSach;
        this.tenSach = s.tenSach;
        this.tacGia = s.tacGia;
        this.maTL = s.maTL;
        this.maNXB = s.maNXB;
        this.soLuong = s.soLuong;
        this.donGia = s.donGia;
    }

    // Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap ma the loai: ");
        maTL = sc.nextLine();
        System.out.print("Nhap ma nha xuat ban: ");
        maNXB = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-10s %-20s %-20s %-10s %-10s %-10d %-10.2f\n", maSach, tenSach, tacGia, maTL, maNXB, soLuong, donGia);
    }

    // Get, set:
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public String getMaTL() {
        return maTL;
    }
    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
