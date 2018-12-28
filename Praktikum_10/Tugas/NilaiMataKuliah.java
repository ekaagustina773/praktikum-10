/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Tugas;

public class NilaiMataKuliah extends Matakuliah {
    public Double bobot_uts;
    public Double bobot_uas;
    public Double bobot_lain2;
    public Double nilai_uts;
    public  Double nilai_uas;
    public  Double nilai_lain2;
    public  Double nilai_akhir;
    public  String grade;
   
     Mahasiswa mhs;
   

    public Double hitungNilai(){
        this.bobot_uts = 0.3;
        this.bobot_uas=0.3;
        this.bobot_lain2=0.4;
        this.nilai_uts=90.0;
        this.nilai_uas=80.0;
        this.nilai_lain2=90.0;
        
        this.nilai_akhir=((this.nilai_uts*this.bobot_uts)+(this.nilai_uas*this.bobot_uas)+(this.nilai_lain2*this.bobot_lain2));
        return this.nilai_akhir;
    }
    public void hitungGrade(){
       
        if (nilai_akhir >= 80 && nilai_akhir <=100){
            System.out.println("Grade A");
            this.grade="A";
        }else if (nilai_akhir >=76 || nilai_akhir <=79){
            System.out.println("Grade AB");
            this.grade="AB";
        }else if (nilai_akhir >=70 || nilai_akhir <=75){
            System.out.println("Grade B");
            this.grade="B";
        }else if (nilai_akhir >=66 || nilai_akhir <=69){
            System.out.println("Grade BC");
            this.grade="BC";
        }else if (nilai_akhir >=60 || nilai_akhir <=65){
            System.out.println("Grade C");
            this.grade="C";
        }else if (nilai_akhir >=56 || nilai_akhir <=59){
            System.out.println("Grade CD");
            this.grade="CD";
        }else if (nilai_akhir >=50 || nilai_akhir <=55){
            System.out.println("Grade D");
            this.grade="D";
        }else{
            System.out.println("Grade E");
            this.grade="E";
        }
    }

}
