/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimprove;

/**
 *
 * @author asus
 */
public class gold extends silver{
  private int cashback;
    
    public void setCashback (int cb){
        this.cashback = cb;
    }
    
    public int getCashback (){
        return this.cashback ;
    }
    
    gold() {
        setRentalCost  (30000);
        setPoint       (5);
        setDiscount    (2);
        setCashback    (5000);
    }  

}
