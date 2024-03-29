/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu
 */

package Tubes.Dump;

import java.util.Scanner;

public class Nasabah implements java.io.Serializable {

    private static final long serialVersionUID = 748864630665568472L;
    Integer norek, pin;
    String nama;
    Double saldo;

    public Nasabah() {
        this.norek = norek;
        this.pin = pin;
        this.nama = nama;
        this.saldo = saldo;
    }

    void BacaNasabah() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Norek : ");norek=Input.nextInt();
        System.out.println("Pin : ");pin=Input.nextInt();
        System.out.println("Nama : ");nama=Input.nextLine();
        Input.nextLine();
        System.out.println("Saldo : ");saldo=Input.nextDouble();
    }

    void TulisNasabah() {
        System.out.println(norek + ", " + pin + ", " + nama + ", " + saldo + ", ");
    }

     public Integer getNorek() {
        return norek;
    }

     public Integer getPin() {
        return pin;
    }

     public String getNama() {
        return nama;
    }

     public Double getSaldo() {
        return saldo;
    }

    public void setNorek(Integer norek) {
        this.norek = norek;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNewPin(Integer newPin) {
    }
}
