package Java.DoAn.DS_Class;

import Java.DoAn.Class_chinh.NhanVien;

public class DSNV {
    // Thuộc tính:
    NhanVien[] dsnv;
    int n;

    // Phương thức:

    // Hàm thiết lập:
    public DSNV() {
        dsnv = new NhanVien[100];
        n = 0;
    }
    public DSNV(NhanVien[] dsnv, int n) {
        this.dsnv = dsnv;
        this.n = n;
    }
    public DSNV(DSNV ds) {
        this.n = ds.n;
        this.dsnv = new NhanVien[100];
        for (int i = 0; i < n; i++) {
            this.dsnv[i] = new NhanVien(ds.dsnv[i]);
        }
    }

    // Nhập, xuất:
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }
    public void xuat() {
        System.out.printf("%-10s %-20s %-15s %-15s %-10s %-10s\n", "Ma NV", "Ho Ten", "SDT", "Ngay Sinh", "Gioi Tinh", "Luong");
        for (int i = 0; i < n; i++) {
            dsnv[i].xuat();
        }
    }

}
