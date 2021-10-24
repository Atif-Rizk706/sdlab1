/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.work.sction1;

/**
 *
 * @author Atif
 */
public class MyWorkSction1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Account myacount =new Account(1122,20000.0);
        myacount.setAnnualInterestRate(4.5);
        myacount.withdraw(2500);
        myacount.deposit(3000);
        myacount.print();
    }
    
}
