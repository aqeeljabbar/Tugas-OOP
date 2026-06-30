class MataKuliah {
    // Atribut
    private String kodeMK;
    private String namaMK;
    private int jumlahSKS;

    // Konstruktor 1 (tanpa parameter)
    public MataKuliah() {
        this.kodeMK = " - ";
        this.namaMK = "Belum ada";
        this.jumlahSKS = 0;
    }

    // Konstruktor 2 (dengan 2 parameter)
    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.jumlahSKS = 0;
    }
    
    // Konstruktor 3 (dengan 3 parameter)
    public MataKuliah(String kodeMK, String namaMK, int jumlahSKS) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        setSksValid(jumlahSKS);
    }

    public String getKodeMk() { return kodeMK; }
    public String getNamaMk() { return namaMK; }
    public int getSks() { return jumlahSKS; }

    // Soal 9: validasi SKS pakai custom checked exception
    public void setSks(int jumlahSKS) throws SksTidakValidException {
        if (jumlahSKS < 1 || jumlahSKS > 6) {
            throw new SksTidakValidException("Jumlah SKS tidak valid: " + this.jumlahSKS + " (harus di antara 1 dan 6)");
        }
        this.jumlahSKS = jumlahSKS;
    }

    private void setSksValid(int jumlahSKS) {
        try {
            setSks(jumlahSKS);
        } catch (SksTidakValidException e) {
            System.out.println(e.getMessage());
            this.jumlahSKS = 0;
        }
    }

    @Override
    public String toString() {
        return "MataKuliah{" + kodeMK + ", " + namaMK + ", " + jumlahSKS + " SKS}";
    }

}