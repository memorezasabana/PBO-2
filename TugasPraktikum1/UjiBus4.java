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
public class UjiBus4 {

    public static void main(String[] args) {
        Bus4 Bus = new Bus4(100);
        Bus.getpenumpang(48);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getpenumpang(20);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getpenumpang(48);
        Bus.addpenumpang(20);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getpenumpang(48);
        Bus.addpenumpang(23);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getpenumpang(20);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.getpenumpang(48);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
}
