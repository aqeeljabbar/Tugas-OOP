public abstract class Pengguna {
    // Atribut
    private String id;
    private String nama;
    private String jenisKelamin;
    private String email;
    
    // Konstruktor
    Pengguna(String nama, String jenisKelamin, String email) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.email = email;
    }
    public String getId() { return id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Soal 6 : persiapan abstract untuk di-override nantinya
    // Soal 7 : Pembuatan abstract mmethod
    public abstract void tampilkanInformasi();
}