public class Dosen extends Pengguna implements Autentikasi {
    // Atribut
    private String nip;
    private String jabatanAkademik;
    private String pendidikanTerakhir;
    private String programStudi;

    // Konstruktor
    public Dosen(String nip, String nama, String programStudi, String jenisKelamin, String email, 
                String jabatanAkademik, String pendidikanTerakhir) {
        super(nama, jenisKelamin, email);
        this.nip = nip;
        this.programStudi = programStudi;
        this.jabatanAkademik = jabatanAkademik;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    // Getter dan Setter
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public String getJabatanAkademik() { return jabatanAkademik; }
    public void setJabatanAkademik(String jabatanAkademik) { this.jabatanAkademik = jabatanAkademik; }

    public String getPendidikanTerakhir() { return pendidikanTerakhir; }
    public void setPendidikanTerakhir(String pendidikanTerakhir) { this.pendidikanTerakhir = pendidikanTerakhir; }

    public String getProgramStudi() { return programStudi; }

    // Implementasi method abstrak dari Pengguna
    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama: " + getNama() + " (NIP " + nip + ", Program Studidi " + getProgramStudi() +
                ", Jabatan Akademik " + jabatanAkademik + ", Pendidikan Terakhir " + pendidikanTerakhir + ")");
    }

    // Implementasi method dari interface Autentikasi
    @Override
    public boolean login(String credential) {
        // Implementasi login sederhana (misalnya menggunakan NIP sebagai credential)
        return credential.equals(nip);
    }
}

