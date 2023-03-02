package com.mycompany.s2pbo;

public class Transaks1 {

    private int jumlahBeli;
    private int totalBelanja;
    private int sisaSaldo;

    public int totalBelanja(int harga, int jumlah) {
        int totalBelanja = harga * jumlah;
        return totalBelanja;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getSisasaldo(int sisaSaldo) {
        return sisaSaldo;
    }
}
