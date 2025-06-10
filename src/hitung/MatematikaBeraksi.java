package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek
        Matematika indriawan = new Matematika(3,9);
        
        System.out.println("Hasil Penjumlahan: "+indriawan.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+indriawan.setPengurangan());
        System.out.println("Hasil Perkalian: "+indriawan.setPerkalian());
        System.out.println("Hasil Pembagian: "+indriawan.setPembagian());
    }
    
}
