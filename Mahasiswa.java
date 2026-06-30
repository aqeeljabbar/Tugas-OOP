class Mahasiswa extends Pengguna implements Autentikasi {
    private String nim;
    private double ipk;
    private String programStudi;

    Mahasiswa(String nim, String nama, String programStudi, String jenisKelamin, String email, double ipk) {
        super(nama, jenisKelamin, email);
        this.programStudi = programStudi;
        this.nim = nim;
        this.ipk = 0.0;
        setIpk(ipk);
    }

    // Soal 4 (Getter)
    public String getNim() { return nim; }
    public double getIpk() { return ipk; }
    public String getprogramStudi() { return programStudi; }

    public void setNim(String nim) { this.nim = nim; }

    // Soal 4 (Setter)
    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK tidak valid! Harus berada pada rentang 0.00 - 4.00. " +
                    ipk + " ditolak.");
            return;
        }
        this.ipk = ipk;
    }
    
    // Soal 1: method untuk menampilkan data lewat getter saja
    public void tampilkanData() {
        System.out.println("Nama :" + getNama() + " (NIM: " + nim + ", Program Studi " + getprogramStudi() +
                ", IPK " + ipk );
    }

    // Soal 6: override method abstrak dari Pengguna
    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama :" + getNama() + " (NIM: " + nim + ", Program Studi " + getprogramStudi() +
                ", IPK " + String.format("%.2f", ipk) + ")");
    }

    // Soal 7: Mahasiswa login pakai username/password
    public boolean login(String credential) {
        // System.out.println(getNama() + " login menggunakan Username & Password.");
        // return true;
        return credential.equals(nim);
    }
    
}
