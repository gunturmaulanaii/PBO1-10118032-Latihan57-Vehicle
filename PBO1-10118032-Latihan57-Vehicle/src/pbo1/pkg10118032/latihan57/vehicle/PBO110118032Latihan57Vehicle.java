/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan57.vehicle;

/**
 *
 * @author Guntur Maulana Ibrahim
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Membuat tampilan vehicle.
 */
public class PBO110118032Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        System.out.println("");
        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        System.out.println("Brand : "+skateboard.getMyBrand());
        System.out.println("Model : "+skateboard.getMyModel());
        System.out.println("Jumlah Gear : "+skateboard.getMyBoardLength());
    }
    
}
