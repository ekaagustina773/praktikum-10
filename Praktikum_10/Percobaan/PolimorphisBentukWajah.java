/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Percobaan;

public class PolimorphisBentukWajah {
    public static void main (String []args){
        System.out.println("\nProgram Polimorphis");
        System.out.println("======================");
        
        //membuat objek-objek raut (expresi) dari wajah
        BentukWajah objbentuk=new BentukWajah();
        Senyum objsenyum=new Senyum();
        Tertawa objtertawa= new Tertawa();
        Marah objmarah=new Marah();
        Sedih objsedih=new Sedih();
        
        //polimorfis dari bentuk wajah ada 5 dimulai dari 0-4
        BentukWajah[]Bentuk= new BentukWajah[5];
        Bentuk[0]=objbentuk;
        Bentuk[1]=objsenyum;
        Bentuk[2]=objtertawa;
        Bentuk[3]=objmarah;
        Bentuk[4]=objsedih;
        System.out.println("Bentuk[0] : "+Bentuk[0].respons());
        System.out.println("Bentuk[1] : "+Bentuk[1].respons());
        System.out.println("Bentuk[2] : "+Bentuk[2].respons());
        System.out.println("Bentuk[3] : "+Bentuk[3].respons());
        System.out.println("Bentuk[4] : "+Bentuk[4].respons());
    }
}
