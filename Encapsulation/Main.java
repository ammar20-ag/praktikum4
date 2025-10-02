public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("fikri", 20);

        // akses lewat getter
        System.out.println("Nama: " + m1.getNama());
        System.out.println("Umur: " + m1.getUmur());

        // ubah data lewat setter
        m1.setNama("Amar");
        m1.setUmur(22);

        System.out.println("Nama baru: " + m1.getNama());
        System.out.println("Umur baru: " + m1.getUmur());
    }
}
