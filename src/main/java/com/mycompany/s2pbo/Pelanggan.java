package com.mycompany.s2pbo;

import java.util.ArrayList;

/**
 *
 * author DANIEL DHANISWARA
 */
public class Pelanggan {

    public ArrayList<String> namaPlg = new ArrayList<String>();
    public ArrayList<String> alamat = new ArrayList<String>();
    public ArrayList<String> jenisKelamin = new ArrayList<String>();
    public ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Pelanggan() {
        this.namaPlg.add("Ahmad Yusuf");
        this.alamat.add("Dinoyo");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(250000);

        this.namaPlg.add("Muhammad Aldino");
        this.alamat.add("Malang");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(300000);

        this.namaPlg.add("Hudan Islah ");
        this.alamat.add("Prigen");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(100000);

        this.namaPlg.add("Muhammad Syafiq");
        this.alamat.add("Lawang");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(400000);

        this.namaPlg.add("Muhammad Aditya");
        this.alamat.add("Malang");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(420000);

        this.namaPlg.add("Daniel Dhanis");
        this.alamat.add("Sby");
        this.jenisKelamin.add("Laki-laki");
        this.saldo.add(200000);

    }

    public int getJumlahPlg() {
        return namaPlg.size();
    }

    public int sisaSaldo(int saldo, int totalBelanja) {
        return saldo - totalBelanja;
    }

    public ArrayList<String> getNamaPlg() {
        return namaPlg;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public ArrayList<String> getJenisKelamin() {
        return jenisKelamin;
    }

    public ArrayList<Integer> getSaldo() {
        return saldo;
    }
}
