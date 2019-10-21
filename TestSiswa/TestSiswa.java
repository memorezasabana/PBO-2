/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsiswa;

/**
 *
 * @author TUF
 */
public class TestSiswa {
    public static void main(String[] args) {
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(17);
        siswa.setAddress("Malang");
        
        System.out.println("Name    : " +siswa.getName());
        System.out.println("Age     : "+siswa.getAge());
        System.out.println("Address : "+siswa.getAddress());
    }
    
}
