/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Tegar Oktavianto
 */
import java.util.Scanner;
public class UTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner inputLogin = new Scanner (System.in);
        int lanjut=0;
        do{
        System.out.print("USERNAME : ");
        String username = inputLogin.next();
        System.out.print("PASSWORD : ");
        int password = inputLogin.nextInt();
        if(password ==123){
            lanjut = 3;
        }
        else {
            System.out.println("USSERNAME atau PASSWORD salah");
        }
        }while(lanjut != 3);
       int pilih = 0;
       int makspbl=1,x=0,pembelian=0;
       String pbl[];
       pbl=new String[x];
       cPembeli pbli = new cPembeli();
       cTransaksiPenjualan beli =new cTransaksiPenjualan();
       cMakanan menu[] = new cMakanan[7];
       menu[0]=new cMakanan("Expresso",10000);
       menu[1]=new cMakanan("Capuchino",9000);
       menu[2]=new cMakanan("KopiJoss",8000);
       menu[3]=new cMakanan("Taro",10000);
       menu[4]=new cMakanan("Kopi",5000);
       menu[5]= new cMakanan("Kosong Silahkan Tambah",0);
       menu[6]= new cMakanan("Kosong Silahkan Tambah",0);
      
       cMinuman menu2[] = new cMinuman[2];
       menu2[0]=new cMinuman("Mielorr",9000);
       menu2[1]=new cMinuman("Kentang",5000);
       
       
        
        
        System.out.println("-----------------------------------");
        System.out.println("   SELAMAT DATANG DI JOKER CAFE    ");
        System.out.println("         SELAMAT BERBELANJA        ");
        System.out.println("-----------------------------------");
    
        do{
           System.out.println("\nAPP WARUNG");
           System.out.println("1. Master Barang");
           System.out.println("2. Master Pembeli");
           System.out.println("3. Transaksi Penjualan");
           System.out.println("4. Selesai");
           System.out.print("Pilih: ");
           pilih= sc.nextInt();
           switch(pilih){
               case 1 :
                   System.out.println("--------------------------------");
                   System.out.println("--------MASTER BARANG-----------");
                   System.out.println("--------------------------------");
                   int pilih2 = 0;
                   System.out.println("Dafatar Menu");
                   for(int i=0;i<=4;i++){
                   System.out.println(menu[i].ToString());
                   }
                   for(int i=0;i<menu2.length;i++){
                    System.out.println(menu2[i].ToString());
                   }
                    
                   do{
                      System.out.println("1. Tambah Menu");
                      System.out.println("2. Ubah Menu");
                      System.out.println("3. Hapus Menu");
                      System.out.println("4. Lihat Menu");
                      System.out.println("5. Selesai");
                      System.out.print(" Pilih= ");
                      pilih2=sc.nextInt();
                      switch(pilih2){
                          case 1 :
                              String pilih3;
                              for(int i=5;i<menu.length;i++){
                              System.out.print("Nama Minuman : ");
                              String n = sc.next();
                              System.out.print("Harga = ");
                              int h = sc.nextInt();
                              menu[i]=new cMakanan(n,h);
                                if(i>=5){
                                  int pilihan;
                                   do{ 
                                System.out.println(" Selesai ? "); 
                                System.out.println(" 1. Ya");
                                System.out.println(" 2. Tidak");
                                System.out.print(" pilih = ");
                                pilihan = sc.nextInt();
                                    switch (pilihan){
                                         case 1 :
                                             i=menu.length;
                                             
                                             break;
                                         case 2 :
                                             System.out.println("Silahkan lanjut");
                                             break;
                                             
                                         default : 
                                             System.out.println("Ulangi");      
                                 }
                                   }while( pilihan!=1);
                                     }
                                     }   
                              break;
                          case 2 : 
                              System.out.print("Nama Minuman yang Diubah : ");
                              String mkn=sc.next();
                              System.out.println("Yakin ingin di Ubah?");
                              System.out.println(" 1. Ya");
                              System.out.println(" 2. Tidak");
                              System.out.print(" pilih = ");
                              int pilihan = sc.nextInt();
                              if(pilihan==1){
                              boolean ada1 = false;
                              for(int i = 0;i<menu.length;i++){
                                    if(mkn.equalsIgnoreCase(menu[i].getNama())){
                                        ada1=true;
                                        menu[i]=null;
                                        System.out.print("Nama Baru : ");
                                        String n = sc.next();
                                        System.out.print("Harga Baru : ");
                                        int h = sc.nextInt();
                                        menu[i]=new cMakanan(n,h);
                                    }
                                    
                              }
                               if(ada1==false){
                                               System.out.println("Makanan tidak ada");   
                                              }
                              }
                              else{
                                  System.out.println("Oprasi dibatalkan...");
                              }
                              break;
                          case 3 :
                              int jmkn=menu.length;
                              System.out.print(" Minuman yang ingin di hapus : ");
                              String mkn2 = sc.next();
                              System.out.println(" Yakin ingin dii Hapus ? "); 
                                System.out.println(" Ya");
                                System.out.println(" Tidak");
                                System.out.print(" pilih = ");
                                pilih3 = sc.next();
                                    switch (pilih3){
                                         case "Ya" :
                                           boolean benar = false;
                              
                                           for(int i = 0;i<menu.length;i++){
                                              if(mkn2.equalsIgnoreCase(menu[i].getNama())){
                                              benar = true;
                                              menu[i]=null;
                                              //geser elemen array
                                              int p=i;
                                              for(int j=p;j<menu.length;j++){
                                                 if (j==menu.length-1){
                                                 menu[j]=null;  
                                                        }
                                                 else{
                                                 
                                                 menu[j]=menu[j+1];
                                                          }
                                              }

                                                jmkn--;
                                                menu[6]= new cMakanan("Kosong Silahkan Tambah",0);
                                                System.out.println("Penghapusan sukses");
                                                break;
                                                  }
                                              }
                                              if(benar==false){
                                               System.out.println("Makanan tidak ada");   
                                              }
                                            
                      
                                         
                                             break;
                                         case "Tidak" :
                                             System.out.println("Rencana di batalkan");
                                             break;
                                             
                                         default : 
                                             System.out.println("Ulangi");   }   
                      
                   
                              
                              break;
                          case 4 :
                              System.out.println("Dafatar Menu");
                              System.out.println("Minuman");
                              for(int i=0;i<menu.length;i++){
                              System.out.println(menu[i].ToString());
                              }
                              System.out.println("Makanan");
                              for(int i=0;i<menu2.length;i++){
                                 System.out.println(menu2[i].ToString());
                   }
                              break;
                          case 5 :
                              System.out.println("");
                              System.out.println("Kembali Kemenu utama");
                              break;
                      }
                   }while(pilih2!=5); 
                   
                break;
               case 2:
                   pilih2=0;
                   do{
                      System.out.println("1. Tambah Pelanggan");
                      System.out.println("2. Ubah Pelanggan");
                      System.out.println("3. Hapus Pelanggan");
                      System.out.println("4. Lihat Pelanggan");
                      System.out.println("5. Selesai");
                      System.out.print(" Pilih= ");
                      pilih2=sc.nextInt();
                      switch(pilih2){
                          case 1 :
                              String selesai="";
                              String pilih3 ;
                              x=0;
                                    
                              do{
                                  cPembeli pembeli []=  new cPembeli [makspbl]; 
                                  if(x>=1){
                                 System.out.println(" Selesai ? "); 
                                 System.out.println(" Ya");
                                 System.out.println(" Tidak");
                                 System.out.print("pilih = ");
                                 pilih3 = sc.next();
                                 switch (pilih3){
                                         case "Ya" :
                                             selesai="ya";
                                             
                                             break;
                                         case "Tidak" :
                                             System.out.println("Silahkan lanjut");
                                             break;
                                             
                                         default : 
                                             System.out.println("Ulangi");
                                                 
                                             
                                 }
                                 
                              }
                                  if (selesai != "ya"){
                                   
                              makspbl++;  
                              System.out.print(" nama = ");
                              String mn=sc.next();
                              boolean ada=false;
                              for(int i=0;i<pbl.length;i++){
                                  if(mn.equalsIgnoreCase(pbl[i])){
                                      ada=true;
                                      System.out.print("Buat Code Pelaggan : ");
                                      int code=sc.nextInt();
                                      pembeli[i]=new cPembeli(mn,code);
                                     beli.tambahPelanggan(pembeli[i]);
                                  
                                      break;
                                  }
                                
                              }
                              if(ada==false){
                                  System.out.print("Buat Code Pelaggan : ");
                                  int code=sc.nextInt();
                                  pembeli[pembelian]=new cPembeli(mn,code);
                                  beli.tambahPelanggan(pembeli[pembelian]);
                                  
                              }
                                  }
                              pembelian++;
                              makspbl++;
                              x++;
                              
                              }while (selesai!="ya");
                              makspbl--;
                              break;
                          case 2 :
                              beli.ubahPelanggan();
                              break;
                          case 3 :
                              beli.hapusPelanggan();
                              
                              break;
                          case 4 :
                             beli.lihatPelanggan();
                              System.out.println("");
                              break;
                          case 5 :
                               System.out.println("Kembali Ke menu utama");
                              break;
                      }
                   }while(pilih2!=5);
                   break;
               case 3 :
                   beli.isiPembeli(pbli);
                   System.out.print(" Nama Pembeli : ");
                   String nm =  sc.next();
                   //pbli.setNama(nm);
                   
                   do{
                      System.out.println("1. Tambah Minuman");
                      System.out.println("2. Tambah Makanan");
                      System.out.println("3. Hapus Minuman");
                      System.out.println("4. Lihat Pesanan");
                      System.out.println("5. Selesai");
                      System.out.print(" Pilih= ");
                      pilih2=sc.nextInt();
                      switch(pilih2){
                          case 1 :
                              System.out.println("");
                              String selesai="";
                              int pilih3 ;
                              int n=0;
                                System.out.println("Dafatar Menu");
                                System.out.println("Minuman");
                                for(int i=0;i<menu.length;i++){
                                if(menu[i].getharga()==0){
                                    i=menu.length+1;
                                }
                                else{
                                System.out.println(menu[i].ToString());
                                }
                                   
                                    }
                                System.out.println("Makanan");
                                for(int i=0;i<menu2.length;i++){
                                System.out.println(menu2[i].ToString());
                                    }     
                              do{
                                  if(n>=1){
                                 System.out.println(" Selesai ? "); 
                                 System.out.println(" 1. Ya");
                                 System.out.println(" 2. Tidak");
                                 System.out.print(" pilih = ");
                                 pilih3 = sc.nextInt();
                                 switch (pilih3){
                                         case 1 :
                                             selesai="ya";
                                             
                                             break;
                                         case 2 :
                                             System.out.println("Silahkan lanjut");
                                             break;
                                             
                                         default : 
                                             System.out.println("Ulangi");
                                                 
                                             
                                 }
                                 
                              }
                                  if (selesai != "ya"){
                                   
                                 
                              System.out.print(" Menu = ");
                              String mnu=sc.next();
                              boolean ada=false;
                              for(int i=0;i<menu.length;i++){
                                  if(mnu.equalsIgnoreCase(menu[i].getNama())){
                                      ada=true;
                                      beli.tambahMakanan(menu[i]);
                                  
                                      break;
                                  }
                                
                              }
                              if(ada==false){
                                  System.out.println("Menu tidak ada");
                              }
                                  }
                              n++;
                              }while (selesai!="ya");
                              System.out.println("");
                              break;
                          case 2 :
                              System.out.println("");
                              String selesai2="";
                              int pilih4;
                              int n2=0;
                                System.out.println("Dafatar Menu");
                                for(int i=0;i<menu.length;i++){
                                if(menu[i].getharga()==0){
                                    i=menu.length+1;
                                }
                                else{
                                System.out.println(menu[i].ToString());
                                }
                                    }
                                for(int i=0;i<menu2.length;i++){
                                System.out.println(menu2[i].ToString());
                                    }     
                              do{
                                  if(n2>=1){
                                 System.out.println(" Selesai ? "); 
                                 System.out.println(" 1. Ya");
                                 System.out.println(" 2. Tidak");
                                 System.out.print(" pilih = ");
                                 pilih4 = sc.nextInt();
                                 switch (pilih4){
                                         case 1 :
                                             selesai2="ya";
                                             
                                             break;
                                         case 2 :
                                             System.out.println("Silahkan lanjut");
                                             break;
                                             
                                         default : 
                                             System.out.println("Ulangi");
                                                 
                                             
                                 }
                                 
                              }
                                  if (selesai2 != "ya"){
                                   
                                 
                              System.out.print(" Menu = ");
                              String mnu=sc.next();
                              boolean ada=false;
                              for(int i=0;i<menu2.length;i++){
                                  if(mnu.equalsIgnoreCase(menu2[i].getNama())){
                                      ada=true;
                                      beli.tambahMinuman(menu2[i]);
                                  
                                      break;
                                  }
                                
                              }
                              if(ada==false){
                                  System.out.println("Menu tidak ada");
                              }
                                  }
                              n2++;
                              }while (selesai2!="ya");
                              System.out.println("");
                              break;
                          case 3 :
                              System.out.println("");
                              beli.hapusMakanan();
                              System.out.println("");
                              break;
                          case 4 :
                              System.out.println("");
                              System.out.println("Nama Pembeli : "+nm);
                              beli.lihatPembelian();
                              System.out.println("");
                              break;
                          case 5 :
                              System.out.println("");
                              System.out.println("Kembali Ke menu utama");
                              break;
                      }
                   }while(pilih2!=5);
                   System.out.println("");
                   break;
                   
               case 4 :
                   int exit;
                   do{
                   System.out.println("");
                   System.out.println(" Yakin ingin keluar ?");
                   System.out.println(" 1. Ya");
                   System.out.println(" 2. Tidak");
                   System.out.print(" Pilih : ");
                   exit=sc.nextInt();
                   switch(exit){
                       case 1 :
                           pilih=5;
                           exit= 3;
                           System.out.println("--------------------------------");
                           System.out.println("----------Terima Kasih----------");
                           System.out.println("-----Telah Mengunjungi Kami-----");
                           System.out.println("--------------------------------");
                           
                           System.out.println("Laporan Pemasukan :");
                           beli.laporanHarian();
                           break;
                       case 2 :
                           exit=3;
                           System.out.println("Oprasi Dibatalkan......");
                           break;
                                   
                   }
                   }while(exit!=3);
                   
                   
                   
                   break;
           }
           
                   }while(pilih!=5);
        
    }
}
