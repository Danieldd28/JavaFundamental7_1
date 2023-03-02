package com.mycompany.s2pbo;

import java.util.ArrayList;

public class Penunjuk {

    public ArrayList<String> namaBarang = new ArrayList<String>();
    public ArrayList<Integer> harga = new ArrayList<Integer>();
    public ArrayList<Integer> stok = new ArrayList<Integer>();

    public Penunjuk() {
        namaBarang.add("Pulpen");
        harga.add(69000);
        stok.add(40);

        namaBarang.add("Buku");
        harga.add(6000);
        stok.add(50);

        namaBarang.add("Topi");
        harga.add(9000);
        stok.add(20);

        namaBarang.add("Kuas");
        harga.add(10000);
        stok.add(45);

        namaBarang.add("Pensil");
        harga.add(25000);
        stok.add(60);
    }

    public int getJumlahBarang() {
        return namaBarang.size();
    }

    public int sisaStok(int stokAwal, int jumlahBeli) {
        return stokAwal - jumlahBeli;
    }

    public int totalBarang(int jumlah, int harga) {
        return jumlah * harga;
    }
}
