/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author User
 */
public class matematika_beraksi {
    public static void main(String[] args) {
        matematika andry = new matematika (5,6);
        System.out.println("hasil penjumlahan = "+andry.setPenjumlahan());
        System.out.println("hasil pengurangan = "+andry.setPengurangan());
        System.out.println("hasil perkalian = "+andry.setPerkalian());
        System.out.println("hasil pembagian = "+andry.setPembagian());
    }
}
