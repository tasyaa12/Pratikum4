public class Tugas1 {
    public static void main(String[] args) {
        Truck truk=new Truck(1000);
        System.out.println("Muatan maksismal = "+truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150");
        System.out.println("Muatan Sekarang = "+truk.getMuatan);
    }
}
