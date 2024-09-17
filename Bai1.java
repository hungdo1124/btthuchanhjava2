import java.util.Scanner;

class hinhchunhat {
    private double chieudai;
    private double chieurong;

    public hinhchunhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double tinhchuvi() {
        return 2 * (chieudai + chieurong);
    }

    public double tinhdientich() {
        return chieudai * chieurong;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        double chieudai = scanner.nextDouble();
        System.out.print("nhap chieu rong: ");
        double chieurong = scanner.nextDouble();
        hinhchunhat hcn = new hinhchunhat(chieudai, chieurong);
        double chuvi = hcn.tinhchuvi();
        double dientich = hcn.tinhdientich();
        System.out.println("chu vi cua hinh chu nhat la: " + chuvi);
        System.out.println("dien tich cua hinh chu nhat la: " + dientich);
        scanner.close();
    }
}
