package Java.DoAn.DS_Class;

import java.util.Scanner;

import Java.DoAn.Class_chinh.Sach;
import Java.DoAn.Class_chinh.SachNuocNgoai;
import Java.DoAn.Class_chinh.TapChi;

interface InnerDSSach {
    void nhap();
    void xuat();
    void them();
    void tim();
    void sua();
    void xoa();
}

public class DSSach implements InnerDSSach {
    Sach[] ds;
    int n;

    private static Scanner sc = new Scanner(System.in);


    //Hàm thiết lập:
    public DSSach() {
        ds = new Sach[100];
        n = 0;
    }
    public DSSach(Sach[] ds, int n) {
        this.ds = ds;
        this.n = n;
    }
    public DSSach(DSSach s) {
        this.ds = s.ds;
        this.n = s.n;
    }

    //Nhập, xuất:
    public void nhap() {
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            System.out.println("Nhap sach binh thuong (1) hay sach nuoc ngoai (2) hay tap chi (3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                ds[i] = new Sach();
                ds[i].nhap();
            } else if (choice == 2) {
                ds[i] = new SachNuocNgoai();
                ds[i].nhap();
            } else if (choice == 3) {
                ds[i] = new TapChi();
                ds[i].nhap();
            } else {
                System.out.println("Lua chon khong hop le. Mac dinh nhap sach binh thuong.");
                ds[i] = new Sach();
            }
            ds[i].nhap();
        }
    }
    public void xuat() {
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println();
        }
    }

    //Thêm:
    public void them() {
        System.out.println("Nhap thong tin sach can them:");
        Sach newSach;
        System.out.println("Nhap sach binh thuong (1) hay sach nuoc ngoai (2) hay tap chi (3): ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            newSach = new Sach();
            newSach.nhap();
        } else if (choice == 2) {
            newSach = new SachNuocNgoai();
            newSach.nhap();
        } else if (choice == 3) {
            newSach = new TapChi();
            newSach.nhap();
        } else {
            System.out.println("Lua chon khong hop le. Mac dinh nhap sach binh thuong.");
            newSach = new Sach();
        }
        ds[n] = newSach;
        n++;
    }

    //Tìm:
    public void tim() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        tim(ma);
    }
    public Sach tim(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSach().equals(ma)) {
                System.out.println("Da tim thay sach co ma " + ma + ":");
                ds[i].xuat();
                return ds[i];
            }
        }
        System.out.println("Khong tim thay sach co ma " + ma);
        return null;
    }
    
    //Sửa:
    public void sua() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        sua(ma);
    }
    public void sua(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSach().equals(ma)) {               
                System.out.println("Chon thong tin can sua:");
                System.out.println("1. Ma sach");
                System.out.println("2. Ten sach");
                System.out.println("3. Tac gia");
                System.out.println("4. Ma the loai");
                System.out.println("4. Nha xuat ban");
                System.out.println("5. So luong");
                System.out.println("6. Don gia");
                System.out.println("0. Thoat");
                int choice = sc.nextInt();
                sc.nextLine();
                do {
                    switch (choice) {
                        case 1:
                            System.out.print("Nhap ma sach moi: ");
                            ds[i].setMaSach(sc.nextLine());
                            break;
                        case 2:
                            System.out.print("Nhap ten sach moi: ");
                            ds[i].setTenSach(sc.nextLine());
                            break;
                        case 3: 
                            System.out.print("Nhap tac gia moi: ");
                            ds[i].setTacGia(sc.nextLine());
                            break;
                        case 4:
                            System.out.print("Nhap ma the loai moi: ");
                            ds[i].setMaTL(sc.nextLine());
                            break;
                        case 5:
                            System.out.print("Nhap so luong moi: ");
                            ds[i].setSoLuong(sc.nextInt());
                            break;
                        case 6:
                            System.out.print("Nhap don gia moi: ");
                            ds[i].setDonGia(sc.nextDouble());
                            break;
                        }
                } while (choice != 0);   
                System.out.println("Da sua thong tin sach co ma " + ma);
                return;
            }
        }
    }

    //Xóa:
    public void xoa() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        xoa(ma);
    }
    public void xoa(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSach().equals(ma)) {
                for (int j = i; j < n - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                ds[n - 1] = null;
                n--;
                System.out.println("Da xoa sach co ma " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma " + ma);
    }
}
