public class Admin extends Pengguna implements Autentikasi {
    private String status;
 
    public Admin(String nama, String jenisKelamin, String email, String status) {
        super(nama, jenisKelamin, email);
        this.status = status;
    }
 
    public String getStatus() { return status; }
 
    public void kelolaPengguna(Pengguna p) {
        System.out.println("Admin " + getNama() + " mengelola data pengguna: " + p.getNama());
    }
 
    @Override
    public void tampilkanInformasi() {
        System.out.println("[ADMIN] " + getNama() + " (Status " + status + ")");
    }

    @Override
    public boolean login(String password) {
        return password != null && password.equals("admin");
    }
}
