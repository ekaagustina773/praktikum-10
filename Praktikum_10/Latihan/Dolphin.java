/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Latihan;
class Animal{
    
}
class Mammal extends Animal{
    
}
class Cat extends Animal{
    
}
public class Dolphin extends Mammal{
    public static void main(String[]args){
        Mammal m = new Mammal();
        Animal a=m;
        Dolphin d = (Dolphin) a;
    }
}

//baris 18 object new Cat diganti new Mammal