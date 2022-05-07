/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.util.Scanner;
public class cTransaksiPenjualan {
   private cPembeli pembelian;
   private cPembeli pembeli[];
   private int makspbl;
   private int jpbl;
   private int ins;
   private cMakanan makanan[];
   private cMinuman minuman[];
   private int jmkn,maksmkn,total,jmnm;
   private int pilihan,pilihan2;
   private int h[],h2[],kode[];
   private int jumlah[],jumlah2[];
   private int x;
   
   //private int h=0;
   Scanner sc = new Scanner(System.in);
   cTransaksiPenjualan(){
        makspbl=5;
       pembeli = new cPembeli[makspbl];
       jpbl=0; total=0;
       ins=jpbl;
       maksmkn=5;
       makanan = new cMakanan[maksmkn];
       minuman = new cMinuman[maksmkn];
       jumlah = new int[maksmkn];
       jumlah2= new int[maksmkn];
       h= new int [maksmkn];
       h2=new int [maksmkn];
       kode=new int [makspbl];
       jmkn=0; total=0; jmnm=0;
       
       
       System.out.println("objek pembelian dibuat...");
   }
   public void isiPembeli(cPembeli p){
       pembelian=p;
       System.out.println("isi pembeli sukses");
   }
   public void tambahPelanggan(cPembeli p){
       if(jpbl>makspbl){
           System.out.println("Kapasitas Penuh");
       }
       else {
           pembeli[jpbl]=p;
           System.out.println("Penambahan Sukses");
           jpbl++;
           ins=jpbl;
       }
    
   }
   
   
  public void ubahPelanggan(){
      System.out.print("Nama Pelanggan yang Diubah : ");
                              String mkn=sc.next();
                              boolean ada1 = false;
                              for(int i = 0;i<jpbl;i++){
                                    if(mkn.equalsIgnoreCase(pembeli[i].getNama())){
                                        ada1=true;
                                        pembeli[i]=null;
                                        System.out.print("Nama Baru : ");
                                        String n = sc.next();
                                         System.out.print("Code Pelanggan Baru : ");
                                         int c =sc.nextInt();
                                        pembeli[i]=new cPembeli (n,c);
                                    }
                                    
                              }
                               if(ada1==false){
                                               System.out.println("Pembeli Tidak ada");   
                                              }
  }
   public void hapusPelanggan(){
       if(jpbl<0){
           System.out.println("Pelanggan Kosong");
       }
       else{
         System.out.print("Pelanggan dihapus = ");
         String mkn = sc.next();
         boolean ada = false;
         for(int i = 0;i<jpbl;i++){
             if(mkn.equalsIgnoreCase(pembeli[i].getNama())){
                 ada=true;
                 pembeli[i]=null;
                 //geser elemen array
                 int p=i;
                 for(int j=p;j<jpbl;j++){
                     if (j==jpbl-1){
                       pembeli[j]=null;  
                     }
                     else{
                         pembeli[j]=pembeli[j+1];
                     }
                 }
                 jpbl--;
                 ins=jpbl;
                 System.out.println("Penghapusan sukses");
                 break;
             }
         }
         if(ada=false){
          System.out.println("Nama Pelanggan tidak ada");   
         }
       }
   }
   
   public void lihatPelanggan(){
       System.out.println("Data Pelanggan");
       int h=0;
       for(int i =0;i<jpbl;i++){
           System.out.println((i+1)+"."+pembeli[i].ToString());
          
       }
      
       
   }
   public void tambahMakanan(cMakanan m){
       System.out.print(" Jumlah = ");
           int jml=sc.nextInt();
           jumlah[jmkn]=jml;
           makanan[jmkn]=m;
       if(jmkn>=maksmkn){
           System.out.println("Kapasitas Penuh");
       }
       else {
           System.out.println("Penambahan Sukses");
         
           jmkn++;
           ;
       }
         
         
           for(int i = 0;i<jmkn;i++){
           
              
           h[i]=(makanan[i].getharga()*jumlah[i]);
          
       }
           int totalhar=0;
           for (int i = 0; i <h.length; i++) {
           totalhar=totalhar+h[i];
       }
           
           System.out.println("Jumlah Biaya = "+totalhar);
   }
   public void tambahMinuman(cMinuman mn){
       System.out.print(" Jumlah = ");
           int jml=sc.nextInt();
           jumlah2[jmnm]=jml;
           minuman[jmnm]=mn;
       if(jmnm>=maksmkn){
           System.out.println("Kapasitas Penuh");
       }
       else {
           System.out.println("Penambahan Sukses");
         
           jmnm++;
           ;
       }
         
         
           for(int i = 0;i<jmnm;i++){
           
              
           h2[i]=(minuman[i].getharga()*jumlah2[i]);
          
       }
           int totalhar2=0;
           for (int i = 0; i <h.length; i++) {
           totalhar2=totalhar2+h2[i];
       }
           
           System.out.println("Jumlah Biaya = Rp"+totalhar2);
   }
   public void hapusMakanan(){
       
       if(jmkn<0){
           System.out.println("Makanan Kosong");
       }
       else{
         System.out.print("Minuman dihapus = ");
         String mkn = sc.next();
         System.out.println("Yakin ingin di Hapus?");
         System.out.println(" 1. Ya");
         System.out.println(" 2. Tidak");
         System.out.print(" pilih = ");
         pilihan = sc.nextInt();
         if(pilihan ==1){
         boolean ada = false;
         for(int i = 0;i<jmkn;i++){
             if(mkn.equalsIgnoreCase(makanan[i].getNama())){
                 ada=true;
                 
                 makanan[i]=null;
                 jumlah[i]=0;
                 //geser elemen arraywdc
                 int p=i;
                 for(int j=p;j<jmkn;j++){
                     if (j==jmkn-1){
                       makanan[j]=null;
                       jumlah[j]=0;
                       h[i]=0;
                     }
                     else{
                         makanan[j]=makanan[j+1];
                         jumlah[j]=jumlah[j+1];
                         h[i]=0;
                     }
                 }
                 jmkn--;
                 System.out.println("Penghapusan sukses");
                 break;
             }
         }
         if(ada==false){
          System.out.println("Minuman tidak ada");   
         }
       }
         else{
             System.out.println("Oprasi dibatalkan..");
         }
         
       }
   }
   public void lihatPembelian(){
       System.out.println("");
       System.out.println("Data Pembelian");
       //System.out.println(pembelian.ToString());
       for(int i =0;i<jmkn;i++){
           System.out.println((i+1)+"."+makanan[i].ToString()+" x"+jumlah[i]);
       }
       int totalhar=0;
           for (int i = 0; i <h.length; i++) {
           totalhar=totalhar+h[i];
       }
           for(int i =0;i<jmnm;i++){
           System.out.println((i+1)+"."+minuman[i].ToString()+" x"+jumlah2[i]);
       }
       int totalhar2=0;
           for (int i = 0; i <h2.length; i++) {
           totalhar2=totalhar2+h2[i];
       }
           int total = 0;
           total=totalhar+totalhar2;
           System.out.println("Total Biaya Keseluruhan = Rp"+total);
           System.out.println("Punya Kode Pelanggan ?");
           System.out.println("1. Ya");
           System.out.println("2. Tidak");
           System.out.print("Pilih : ");
           int pilih = sc.nextInt();
           if(pilih==1){
               System.out.print("Masukkan Kode Pelanggan : ");
               int kode=sc.nextInt();
               boolean ada2=false;
               for (int i = 0; i < jpbl; i++) {
                   if(kode==pembeli[i].getCodepbl()){
                       ada2=true;
                       System.out.println("Anda Berhak Mendapat Diskon 10%");
                       double total2=(double) (total*0.1);
                       System.out.println("Total Biaya Keseluruhan Menjadi : Rp"+(total-total2));
                   }
               }
                   
               
               if(ada2==false){
                   System.out.println("Kode salah/Anda Belum Terdaftar");
                   System.out.println("Silahkan daftar di menu Master Pembeli");
               }
           }
       
   }
   public void laporanHarian(){
       int temp=0;
       String tamp;
       System.out.println("Minuman :");
       for (int i = 0; i < jmkn; i++) {
           for (int j = i+1; j < jmkn; j++) {
               if(h[i]<h[j]){
                  temp = h[i];
                  tamp= makanan[i].getNama();
                  h[i]=h[j];
                  makanan[i].setNama(makanan[j].getNama());
                  h[j]=temp;
                  makanan[j].setNama(tamp);
               }
               
           }
           System.out.println(makanan[i].getNama()+"   :"+" Rp"+h[i]); 
       }
       temp=0;
       tamp="";
       System.out.println("Makanan :");
       for (int i = 0; i < jmnm; i++) {
           for (int j = i+1; j < jmnm; j++) {
               if(h2[i]<h2[j]){
                  temp = h2[i];
                  tamp= minuman[i].getNama();
                  h2[i]=h2[j];
                  minuman[i].setNama(minuman[j].getNama());
                  h2[j]=temp;
                  minuman[j].setNama(tamp);
               }
               
           }
           System.out.println(minuman[i].getNama()+"   :"+" Rp"+h2[i]); 
       }
   }
}