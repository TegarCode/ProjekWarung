/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
public class cPembeli {
    private String nama;
    private int codepbl;
    cPembeli(){
        nama=""; codepbl=0;
        System.out.println("Objek Pembeli dibuat...");
    }
    cPembeli(String n,int c){
        nama = n; codepbl=c;
        System.out.println("Objek "+nama+" di buat....");
    }
    public void setNama(String n){
        nama = n;
    }
    public void setCodepbl(int c){
        codepbl=c;
    }
    
    public String getNama(){
        return nama;
    }
    public int getCodepbl(){
      return codepbl;
}
    public String ToString(){
        return "Pembeli: "+nama+" ["+codepbl+"]";
    }
}
