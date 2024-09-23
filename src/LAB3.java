public class LAB3 {

    public int perhitunganGaji(int jamKerja, int gajiPerJam) {
        int gajiTotal = 0;
        for (int i = 0; i < jamKerja; i++) {
            gajiTotal += gajiPerJam;
        }
        return gajiTotal;
    }

    public static void main(String[] args) {
        LAB3 hitung = new LAB3();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}