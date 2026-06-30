public class PembayaranUKT {
    private Mahasiswa mahasiswa;
    private double nominal;
    private boolean lunas;
 
    public PembayaranUKT(Mahasiswa mahasiswa, double nominal) {
        this.mahasiswa = mahasiswa;
        this.nominal = nominal;
        this.lunas = false;
    }
 
    public void bayar() {
        this.lunas = true;
        System.out.printf("Pembayaran UKT sebesar Rp%.0f untuk %s berhasil. Status: LUNAS%n",
                nominal, mahasiswa.getNama());
    }
 
    public void tampilkanStatus() {
        System.out.println(mahasiswa.getNama() + " - UKT Rp" + (long) nominal + " - " +
                (lunas ? "LUNAS" : "BELUM LUNAS"));
    }
}
