/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Rentalconsolegame extends catatan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // This is object
        silver sm   = new silver();
        gold gm     = new gold();
        platinum pm = new platinum();
        
        
        // To do insert data member
        insertMembership();
        
        
        // This is attribute
        String idMembership;
        int dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned;
        Scanner input = new Scanner(System.in);
    
        
        // To do input
        System.out.println("____________----  Rental Console Game ____________----");
        
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
        System.out.println("| Lama Sewa                         | : " + rentalForDuration + " hari");
       
        
        String memberType = getMemberType(idMembership);
        if(null == memberType) {
            System.out.println("\nTotal Sewa                           : Rp. " + pm.costAmount(rentalForDuration));
            System.out.println("Jumlah Poin                            : " + pm.toGetPoint(rentalForDuration));
            System.out.println("Jumlah Cashback                        : " + pm.cashback);
            System.out.println("Bonus Pulsa                            : " + pm.toGetBenefit(rentalForDuration));
        } else switch (memberType) {
            case "Silver":
                System.out.println("\nTotal Sewa                       : Rp. " + sm.costAmount(rentalForDuration));
                System.out.println("Jumlah Poin                        : " + sm.toGetPoint(rentalForDuration));
                break;
            case "Gold":
                System.out.println("\nTotal Sewa                       : Rp. " + gm.costAmount(rentalForDuration));
                System.out.println("Jumlah Poin                        : " + gm.toGetPoint(rentalForDuration));
                System.out.println("Jumlah Cashback                    : " + gm.cashback);
                break;
            default:
                System.out.println("\nTotal Sewa                       : Rp. " + pm.costAmount(rentalForDuration));
                System.out.println("Jumlah Poin                        : " + pm.toGetPoint(rentalForDuration));
                System.out.println("Jumlah Cashback                    : " + pm.cashback);
                System.out.println("Bonus Pulsa                        : " + pm.toGetBenefit(rentalForDuration));
                break;
        }
    }
}
