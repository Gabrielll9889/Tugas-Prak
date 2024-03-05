/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Student("Bayu", 20, "123456789");

        displayPersonInfo(person1);
    }

    private static void displayPersonInfo(Person person) {
        // Polymorphism: Memanggil metode introduce dari objek yang memiliki tipe Person
        person.perkenalan();

        // Encapsulation: Mengakses atribut dengan menggunakan metode getter
        System.out.println("Nama: " + person.getNama());
        System.out.println("Umur: " + person.getUmur());

        if (person instanceof Student) {
            Student student = (Student) person;
            // Encapsulation: Mengakses atribut dengan menggunakan metode getter
            System.out.println("NIM: " + student.getnim());
        }

        System.out.println();
    }
}

