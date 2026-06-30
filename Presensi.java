public class Presensi {
    private Mahasiswa mahasiswa;
    private String matakuliah;
    private String tanggal;
    private boolean hadir;
 
    public Presensi(Mahasiswa mahasiswa, String matakuliah, String tanggal, boolean hadir) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.tanggal = tanggal;
        this.hadir = hadir;
    }
 
    public void tampilkan() {
        System.out.println(tanggal + " | " + matakuliah + " | " + mahasiswa.getNama() +
                " | " + (hadir ? "HADIR" : "TIDAK HADIR"));
    }
}
