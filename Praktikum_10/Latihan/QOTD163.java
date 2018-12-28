/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Latihan;


class A{
    private final void Bergerak(){
        System.out.println("Animasi Berjalan");
    }
}
public class QOTD163 extends A {
    public final void Bergerak(){
        System.out.println("Bergerak");
    }
    public static void main(String args[]){
        new QOTD163().Bergerak();
    }
}
