package src.main.java;

public class Faktorial {
    public int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}

