/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Percobaan;

class BentukWajah {
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

class Senyum extends BentukWajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return("Tertwawa karena gembira\n");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan bertengkar");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}
