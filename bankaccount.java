/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package labex2;
/**
 *
 * @author sksba
 */
public class bankaccount {
    
    /**
     * @param args the command line arguments 
     */
    public static void main(string[] args){
        //TODO code application logic here
        Account c1=new Account("pk520","jesh");
        Account c2=new Account("pk560","kamesh",c1.balance);
        system.out.println("\ncustomer 1 details:\n");
        system.out.println("\nID:"+(c1.getid()));
        system.out.println("\nNAME:"+(c1.getname()));
        system.out.println("\nIntial balance:Rs"+(c1.getbalance()));
        system.out.println("\n===========");
        system.out.println("\ncustomer 2 details:");
        system.out.println("\nID:"+(c2.getid()));
        system.out.println("\nName:"(c2.getname()));
        system.out.println("\nBalance after credit in customer 1's account:");
        system.out.println("Rs."+(c1.credit(2000)));
        system.out.println("\nbalance after debit customer 1's account:");
        system.out.println("Rs."+(c1.debit(500)));
        system.out.println("\n==============");
        system.out.println("\nbalance of customer"+(c1.getname()+"\Rs."(c1.getbalance())));
        c1.transferto(c2,450);
        
        system.out.println("\n==============");
        system.out.println("\nAfter Transaction customer details:");re
        
        system.out.println("\n===========");
        system.out.println("\nCustomer 2:");
        system.out.println(c2.tostring());
    }
}
class Account
{
    string id,Name;
    int balance=0;
    Account(string i,string n)
    {
        id=i;
        name=n;
    }
    Account(string i,string n,int b)
    {
        id=i;
        name=n;
        balance=b;
    }
    string getid()
    {
        return id;
    }
    string getname()
    {
        return name;
    }        
    int getbalance()
    {
        return balance();
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance=amount;
        else
            system.out.println("Amount exceeded balance!!");
        return balance;
    }
    int transferto (Account Acc1,int amount)
    {
        if(amount<=balance)
            Acc1.balance=amount;
        else
            system.out.println("Amount exceeded balance!!");
        return balance;
        
    }
    @override
    public string tostring()
    {
        return("\nID:"+id+"\nName:"+"name"\nbalance: Rs."+balance);
    }        
                
}            