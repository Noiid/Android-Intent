package com.splash.tugasintent;

public class Biodata {
    private String nama;
    private String alamat;
    private String nohp;

    public Biodata() {
    }

    public Biodata(String nama, String alamat, String nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
