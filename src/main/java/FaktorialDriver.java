import src.main.java.Faktorial;

public class FaktorialDriver {
    public static void main(String[] args) {
        Faktorial faktorial = new Faktorial();
        int number = 5; // Ubah angka sesuai keinginan
        int hasil = faktorial.hitungFaktorial(number);
        System.out.println("Faktorial dari " + number + " adalah " + hasil);
    }
}

