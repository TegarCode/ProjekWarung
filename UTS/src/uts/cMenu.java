
package uts;

//induk dari class makanan dan class minuman
import java.util.Scanner;
public class cMenu {
    protected String nama;
    protected int harga;
    private cMakanan makanan[];
   private int jmkn,maksmkn,total;
   private Scanner sc = new Scanner(System.in);
cMenu(){
    maksmkn=5;
       makanan = new cMakanan[maksmkn];
       jmkn=0; total=0;
    nama="";harga=0; 
    System.out.println("Objek menu dibuat...");
}
cMenu(String n, int h){
    nama = n; harga = h;
    System.out.println("Objek "+nama+" dibuat...");
}
public void setNama(String n){
    nama=n;
}
public void setHarga(int h){
    harga = h;
}

public String getNama(){
    return nama;
}
public int getharga(){
    return harga;
}
public String ToString(){
    return "menu "+nama+" ["+harga+"] ";
}
}

    

