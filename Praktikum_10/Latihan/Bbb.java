/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Latihan;

  class QOTD161 {
    int xxx;
    void yyy(){
        xxx=1;
    }
}
class Bbb extends QOTD161{
    final Bbb finalref=new Bbb();
    final void yyy(){
    System.out.println("method yyy");
    finalref.xxx=12345;
    }
}
    


//FINAL MIRIP DENGAN KONSTANTA
//Final merupakan modifier non access
//baris 12 modifier final dihilangkan.