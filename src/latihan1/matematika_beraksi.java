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
    double bil1,bil2;

    public matematika_beraksi(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    double setPenjumlahan (){
        return bil1+bil2;   
    }
    double setPengurangan (){
        return bil1-bil2;   
    }
    double setPerkalian(){
        return bil1*bil2;   
    }
    double setPembagian(){
        return bil1/bil2;   
    }
    
}
