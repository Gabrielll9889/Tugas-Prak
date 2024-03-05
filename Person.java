/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak;

public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Polymorphism: Metode introduce dapat di-overridden oleh subclass
    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama + " dan saya berusia " + umur + " tahun.");
    }
}

