/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author TUF
 */
public class Bus4 {

    public double penumpang;
    public double maxpenumpang;
    public int counter;
    public double penumpangbaru;

    public Bus4(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method mutator 
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Berat Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }

    public void getpenumpang(int password) {
        if (password == 48) {
            System.out.println("Password Benar");

        } else {
            System.out.println("Password Salah");
        }

    }

    public double getAverage() {
        double average;
        return penumpang / counter;

    }

    public void cetakpenumpang() {
        System.out.println("Berat Penumpang Bus Sekarang adalah = " + penumpang);
        System.out.println("Maksimum berat penumpang yang seharusnya adalah = " + maxpenumpang);

    }
}
