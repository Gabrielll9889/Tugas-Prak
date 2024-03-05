/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak;

public class Student extends Person {
    private String nim;

    public Student(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public String getnim() {
        return nim;
    }

    // Polymorphism: Metode introduce di-overridden dari superclass
    public void introduce() {
        System.out.println("Hi, saya mahasiswa. nama saya " + getNama() + ", aged " + getUmur() +
                ", dan NIM saya adalah " + nim + ".");
    }
}

