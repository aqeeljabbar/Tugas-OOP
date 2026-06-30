import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        soal1();
        soal2();
        soal3();
        soal4();
        soal5();
        soal6();
        soal7();
        soal8();
        soal9();
        soal10();
    }

    // Soal 1 - Class dan Object
    static void soal1() {
        System.out.println("=== Soal 1: Class & Object ===");
        Mahasiswa mahasiswa1 = new Mahasiswa("2301001", "James", "S1 Sistem Informasi", "Laki-laki", "james@campus.ac.id", 3.8);
        Mahasiswa mahasiswa2 = new Mahasiswa("2301002", "Jessselyn", "S1 Sistem Informasi", "Perempuan", "jesse@campus.ac.id", 3.75);
        Mahasiswa mahasiswa3 = new Mahasiswa("2701001", "Robert", "S1 Teknik Informatika", "Laki-laki", "robert@campus.ac.id", 3.6);
        for (Mahasiswa mhs : List.of(mahasiswa1, mahasiswa2, mahasiswa3)) {
            mhs.tampilkanData();
        }
    }

    // Soal 2 - Constructor dan Overloading
    static void soal2() {
        System.out.println("\n=== Soal 2: Constructor dan Overloading ===");
         // Objek Mata Kuliah tanpa data parameter terisi
        MataKuliah mataKuliah1 = new MataKuliah();

        // Objek Mata Kuliah dengan 2 data parameter terisi
        MataKuliah mataKuliah2 = new MataKuliah("IS001", "Sistem Basis Data");

        // Objek Mata Kuliah dengan 3 data parameter terisi
        MataKuliah mataKuliah3 = new MataKuliah("IS005", "Matematika Diskrit", 3);

        for (MataKuliah mk : List.of(mataKuliah1, mataKuliah2, mataKuliah3)) {
            System.out.println(mk);
        }
    }

    // Soal 3: Access Modifier
    static void soal3() {
        System.out.println("\n=== Soal 3: Access Modifier ===");
        Mahasiswa mahasiswa4 = new Mahasiswa("2301004", "Jan", "Teknik Informatika", "Laki-laki", "jan@campus.ac.id", 3.8);
        // mahasiswa4.setIpk(3.75);
        mahasiswa4.tampilkanData();
    }

    // Soal 4 - Encapsulation
    static void soal4() {
        System.out.println("\n=== Soal 4: Encapsulation ===");
        Mahasiswa mahasiswa5= new Mahasiswa("2301008", "Lucas", "Teknik Informatika", "Laki-laki", "lucas@campus.ac.id", 3.8);
        mahasiswa5.setIpk(3.95);   
        mahasiswa5.setIpk(4.50);   
    }

    // Soal 5 - Inheritance
    static void soal5() {
        System.out.println("\n=== Soal 5: Inheritance ===");
        Dosen dosen1 = new Dosen("123456", "Dr. Smith", "S1 Sistem Informasi", "Laki-laki", "smith@campus.ac.id", "Dekan", "S3");
        dosen1.tampilkanInformasi();
    }

    // Soal 6 - Polymorphism (Overriding)
    static void soal6() {
        System.out.println("\n=== Soal 6: Polymorphism (Overriding) ===");
        List<Pengguna> daftarPengguna = new ArrayList<>();
        daftarPengguna.add(new Mahasiswa("2301001", "James", "S1 Sistem Informasi", "Laki-laki", "james@campus.ac.id", 3.8));
        daftarPengguna.add(new Dosen("123456", "William", "S1 Sistem Informasi", "Laki-laki", "smith@campus.ac.id", "Dekan", "S3"));
        daftarPengguna.add(new Admin("Admin1", "-", "superadmin@campus.ac.id", "Super Admin"));
        for (Pengguna p : daftarPengguna) {
            p.tampilkanInformasi();
        }
    }

    static void soal7() {
        System.out.println("\n=== Soal 7: Interface Autentikasi ===");
        Mahasiswa mahasiswa6 = new Mahasiswa("2601001", "Christopher", "S1 Sistem Informasi", "Laki-laki", "christoper@campus.ac.id", 3.66);
        Dosen dosen2 = new Dosen("123456", "David", "Teknik Industri", "Laki-laki", "david@campus.ac.id", "Lektor", "S3");

        List<Autentikasi> daftarLogin = new ArrayList<>();
        daftarLogin.add((Autentikasi) mahasiswa6);
        daftarLogin.add((Autentikasi) dosen2);
        for (Autentikasi a : daftarLogin) {
            a.login("dummy-credential");
        }
    }

    // SOAL 8 - Collection
    static void soal8() {
        System.out.println("\n=== SOAL 8: Collection ===");
        List<MataKuliah> daftarMk = new ArrayList<>();
        daftarMk.add(new MataKuliah("IF101", "Algoritma & Pemrograman", 3));
        daftarMk.add(new MataKuliah("IF202", "Pemrograman Berorientasi Objek", 3));
        daftarMk.add(new MataKuliah("IF303", "Basis Data", 4));
 
        System.out.println("-- Seluruh mata kuliah --");
        for (MataKuliah mk : daftarMk) {
            System.out.println(mk);
        }
 
        System.out.println("-- Cari mata kuliah kode IF202 --");
        MataKuliah hasil = cariMataKuliah(daftarMk, "IF202");
        System.out.println(hasil != null ? "Ditemukan: " + hasil : "Tidak ditemukan");
    }
 
    static MataKuliah cariMataKuliah(List<MataKuliah> daftar, String kode) {
        for (MataKuliah mk : daftar) {
            if (mk.getKodeMk().equalsIgnoreCase(kode)) {
                return mk;
            }
        }
        return null;
    }

    // SOAL 9 - Exception Handling
    static void soal9() {
        System.out.println("\n=== SOAL 9: Exception Handling ===");
        int[] percobaanSks = { 3, 0, 8, 6 };
        for (int sks : percobaanSks) {
            try {
                MataKuliah matakuliah4 = new MataKuliah("IE002", "Pengantar Ekonomi Teknik");
                matakuliah4.setSks(sks);
                System.out.println("SKS " + sks + " valid -> " + matakuliah4);
            } catch (SksTidakValidException e) {
                System.out.println("Gagal set SKS " + sks + " -> " + e.getMessage());
            }
        }
    }

    // SOAL 10 - Pengembangan Sistem: Presensi & Pembayaran UKT
    static void soal10() {
        System.out.println("\n=== SOAL 10: Fitur Baru - Presensi & Pembayaran UKT ===");
        Mahasiswa mahasiswa7 = new Mahasiswa("26010999", "Marco", "Teknik Industri", "Laki-laki", "marco@campus.ac.id", 3.86);
 
        // --- Presensi ---
        List<Presensi> daftarPresensi = new ArrayList<>();
        daftarPresensi.add(new Presensi(mahasiswa7, "Gambar Teknik", "2026-06-29", true));
        daftarPresensi.add(new Presensi(mahasiswa7, "Kalkulus 2", "2026-06-30", false));
        System.out.println("-- Riwayat Presensi --");
        for (Presensi p : daftarPresensi) {
            p.tampilkan();
        }
 
        // --- Pembayaran UKT ---
        System.out.println("-- Pembayaran UKT --");
        PembayaranUKT ukt = new PembayaranUKT(mahasiswa7, 5_000_000);
        ukt.tampilkanStatus();
        ukt.bayar();
        ukt.tampilkanStatus();
    }
}

