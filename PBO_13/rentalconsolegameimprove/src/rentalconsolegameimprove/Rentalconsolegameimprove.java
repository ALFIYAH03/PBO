/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimprove;

import java.util.Scanner;


/**
 *
 * @author asus
 */
public class Rentalconsolegameimprove extends catatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        
        // This is object
        silver sm   = new silver();
        gold gm     = new gold();
        platinum pm = new platinum();
        
        insertMembership();
        
        String idMembership;
        int dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned;
        Scanner input = new Scanner(System.in);
    
        
 System.out.println("____________----  Rental Console Game ----____________");
        
        System.out.print("\nMasukkan ID Member              : ");
        idMembership = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam  (1 - 31) : ");
        dateRental = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam    (1 - 12) : ");
        monthRental = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam     (xxxx)  : ");
        yearRental = input.nextInt();
        
        System.out.print("Masukkan Tanggal Kembali (1-31)   : ");
        dateReturned = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali   (1-12)   : ");
        monthReturned = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali  (xxxx)    : ");
        yearReturned = input.nextInt();
        
        System.out.println("\n_______________________________________________________");
        searchMembership(idMembership);
        
        
        System.out.println("\n_______________________________________________________");
        System.out.println("\nTanggal Pinjam                          : " + dateRental + " - " + monthRental + " - " + yearRental);
        System.out.println("Tanggal Kembali                           : " + dateReturned + " - " + monthReturned + " - " + yearReturned);

        int rentalForDuration = rentDuration(dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned);
       System.out.println(" Lama Sewa                          : " + rentalForDuration + " hari");
        
        String memberType = getMemberType(idMembership);
        if("Silver".equals(memberType)) {
            System.out.println("\n| Total Sewa                        : Rp. " + sm.costAmount(rentalForDuration));
            System.out.println(" Jumlah Poin                          : " + sm.toGetPoint(rentalForDuration));
        
        } else if("Gold".equals(memberType)) {
            System.out.println("\n  Total Sewa                        : Rp. " + gm.costAmount(rentalForDuration));
            System.out.println(" Jumlah Poin                          : " + gm.toGetPoint(rentalForDuration));
            System.out.println(" Jumlah Cashback                      : " + gm.getCashback());
            
        } else {
            System.out.println("\n Total Sewa                         : Rp. " + pm.costAmount(rentalForDuration));
            System.out.println(" Jumlah Poin                          : " + pm.toGetPoint(rentalForDuration));
            System.out.println(" Jumlah Cashback                      : " + pm.getCashback());
            System.out.println(" Bonus Pulsa                          : " + pm.toGetBenefit(rentalForDuration));
        }
    }
    }

