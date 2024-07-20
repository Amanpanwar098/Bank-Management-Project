
package bank.management.system;
import javax.swing.*;
import java.sql.*;

public class Ministatement extends JFrame {
   Ministatement(String  pinNumber){
       setTitle("Mini Statement");
       
       setLayout(null);
       
       JLabel mini = new JLabel();
       mini.setBounds(20,140,400,200);
       add(mini);
       
       JLabel bank = new JLabel("SBI Bank");
       bank.setBounds(150,20,100,20);
       add(bank);
       
       
       JLabel card = new JLabel();
       card.setBounds(20,80,300,25);
       add(card);
       
       JLabel balance = new JLabel();
       balance.setBounds(20,400,300,20);
       add(balance);
       
       try{
           
           Conn c = new Conn();
          ResultSet rs =  c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
          while(rs.next()){
              card.setText("Card Number" + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString(12));
          }
           
       }
       
   
       catch(Exception e){
           System.out.println(e);
       }
       
       
       try {
           Conn  c = new Conn();
           int bal = 0;
           ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
           
           while(rs.next()){
               mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                   bal+= Integer.parseInt(rs.getString("amount"));
               }
               else{
                   bal -= Integer.parseInt(rs.getString("amount"));
               }
           }
          balance.setText("Your current account balance is Rs" + bal);
       }
       
       catch(Exception e){
           System.out.println(e);
       }
       
       
       
        setSize(400, 600);
        setLocation(20,20);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Ministatement("");
    }
}