public class LAB1 {
    public static void main(String[] args) {
        int[] angka = { 22, 67, 31, 11, 5 };
        int hasil = hitungTotal(angka);
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static int hitungTotal(int[] array) {
        int hasil = 0;
        for (int i = 0; i < array.length; i++) { // Start from 0 and go up to array.length
            hasil += array[i];
        }
        return hasil;
    }
}

