package hitung;

public class Matematika {
    //Membuat variabel
    private double bil1,bil2;
    
    //Membuat Contructor
    public Matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat Methode setPemnjumlahan
    double setPenjumlahan () {
        return bil1 + bil2;
    }
    
    //Membuat Methode setPengurangan
    double setPengurangan () {
        return bil1 - bil2;
    }
    
    //Membuat Methode setPerkalian
    double setPerkalian () {
        return bil1 * bil2;
    }
    
    //Membuat Methode setPembagian
    double setPembagian () {
        return bil1 / bil2;
    }
}
