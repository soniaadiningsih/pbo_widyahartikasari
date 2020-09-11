/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsegitiga;

/**
 *
 * @author puput
 */
class Luas{
    
  int alas;
  int tinggi;
  double luas;
  
  
  void setAlas(int alas)
  {
   this.alas=alas;
}

int getAlas(){
    return this.alas;
}

void setTinggi(int tinggi)
{
this.tinggi=tinggi;
}

int getTinggi (){
return this.tinggi;
}

double getLuas(){
    return 0.5*this.alas*this.tinggi;
    
}



}
        
        
public class Lsegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Luas Segitiga = new Luas ();
    Segitiga.setAlas(4);
    Segitiga.setTinggi(5);
    
    System.out.println("Alasnya adalah : "+Segitiga.getAlas());
    System.out.println("Tingginya adalah : "+Segitiga.getTinggi());
    System.out.println("Luasnya adalah : "+Segitiga.getLuas());
    
    
    }
    
}
