
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    JRadioButton savingAc,currentAc,fixedDepositAc,recurringSavingAc;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    Signup3(String formno){
        this.formno=formno;
        setLayout(null);
        
        JLabel acDetails= new JLabel("Page 3: Account Details");
        acDetails.setFont(new Font("Raleway",Font.BOLD,22));
        acDetails.setBounds(280, 40, 400, 40);
        add(acDetails);
        
        
        JLabel accountType = new JLabel("Account Type:");
         accountType.setFont(new Font("Raleway",Font.BOLD,22));
        accountType.setBounds(100, 120, 250, 40);
        add(accountType);
        
        
        savingAc=new JRadioButton("Saving Account");
         savingAc.setFont(new Font("Raleway",Font.BOLD,15));
        savingAc.setBounds(100, 170, 150, 20);
        savingAc.setBackground(Color.WHITE);
        add(savingAc);
        
        
        
        fixedDepositAc=new JRadioButton("FIxed Deposit Account");
         fixedDepositAc.setFont(new Font("Raleway",Font.BOLD,15));
        fixedDepositAc.setBounds(350, 170, 250, 20);
         fixedDepositAc.setBackground(Color.WHITE);
        add(fixedDepositAc);
        
        
        currentAc=new JRadioButton("Current Account");
         currentAc.setFont(new Font("Raleway",Font.BOLD,15));
        currentAc.setBounds(100, 210, 150, 20);
         currentAc.setBackground(Color.WHITE);
        add(currentAc);
        
        
        recurringSavingAc=new JRadioButton("Recurring Deposit Account");
         recurringSavingAc.setFont(new Font("Raleway",Font.BOLD,15));
        recurringSavingAc.setBounds(350, 210, 250, 20);
         recurringSavingAc.setBackground(Color.WHITE);
        add(recurringSavingAc);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(savingAc);
        bg.add(fixedDepositAc);
        bg.add(currentAc);
        bg.add(recurringSavingAc);
        
        
        JLabel cardNo = new JLabel("Card Number:");
         cardNo.setFont(new Font("Raleway",Font.BOLD,22));
        cardNo.setBounds(100,300, 250, 40);
        add(cardNo);
        
         JLabel cDetails = new JLabel("Your 16 Digit Card Number");
         cDetails.setFont(new Font("Raleway",Font.BOLD,12));
        cDetails.setBounds(100,320, 250, 40);
        add(cDetails);
        
         JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
         number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(320,300, 300, 40);
        add(number);
        
         JLabel pinNo = new JLabel("PIN:");
         pinNo.setFont(new Font("Raleway",Font.BOLD,22));
        pinNo.setBounds(100,380, 250, 40);
        add(pinNo);
        
        JLabel pDetails = new JLabel("Your Four Digit Pin Number");
         pDetails.setFont(new Font("Raleway",Font.BOLD,12));
        pDetails.setBounds(100,400, 250, 40);
        add(pDetails);
        
        JLabel pNo = new JLabel("XXXX");
         pNo.setFont(new Font("Raleway",Font.BOLD,22));
        pNo.setBounds(320,380, 250, 40);
        add(pNo);
        
        
         JLabel services = new JLabel("Services Required:");
         services.setFont(new Font("Raleway",Font.BOLD,22));
         services.setBounds(100,460, 250, 40);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBackground(Color.white);
        c1.setBounds(100,510,200,30);
        add(c1);
        
         c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBackground(Color.white);
        c2.setBounds(350,510,200,30);
        add(c2);
        
        
         c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBackground(Color.white);
        c3.setBounds(100,550,200,30);
        add(c3);
        
         c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBackground(Color.white);
        c4.setBounds(350,550,200,30);
        add(c4);
        
        
         c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBackground(Color.white);
        c5.setBounds(100,590,200,30);
        add(c5);
        
        
        
         c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBackground(Color.white);
        c6.setBounds(350,590,200,30);
        add(c6);
        
        
         c7 = new JCheckBox("I hereby decalares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(Color.white);
        c7.setBounds(100,670,600,30);
        add(c7);
        
        
        submit =new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,20));
        submit.setBounds(250,730,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel =new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,20));
        cancel.setBounds(430,730,100,30);
        cancel.addActionListener(this);
        add(cancel);
  
        
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit){
            String accountType=null;
            if(savingAc.isSelected())
                accountType = "Saving Account"  ;
            else if(fixedDepositAc.isSelected())
                accountType = "Fixed Deposit Account";
            else if(currentAc.isSelected())
                accountType = "Current Account";
            
            else if(recurringSavingAc.isSelected())
                accountType =  "Recurring Deposit Account";
            
            Random random = new Random();
            String   cardnumber = "" + Math.abs((random.nextLong() % 90000000L) +  5040936000000000L);
            
            String pinnumber= ""+ Math.abs((random.nextLong() % 9000L)+1000L);
            
            String facility = "";
            
            if(c1.isSelected())
                facility = facility + " ATM CARD ";
            
            if(c2.isSelected())
                facility = facility + " Internet Banking ";
            
             if(c3.isSelected())
                facility = facility + " Mobile Banking ";
            
             if(c4.isSelected())
                facility = facility + " Email & SMS Alerts ";
            
             if(c2.isSelected())
                facility = facility + " Cheque Book ";
            
             if(c2.isSelected())
                facility = facility + " E-Statement ";
            
             try{
                 if(accountType.equals("")){
                     JOptionPane.showMessageDialog(null, "Account Type is Required!");
                 }
                 
                 else{
                     Conn c= new Conn();
                     String querry1 = "insert into signupthree values('"+formno+"', '"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                     String querry2 = "insert into login values(   '"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                     c.s.executeUpdate(querry1);
                     c.s.executeUpdate(querry2);
                     
                     JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:" + pinnumber);
                     new Deposit(pinnumber).setVisible(true);
                 }
                    
            
        }catch(Exception e){
            System.out.println(e);
        }
        }
        
        
        else if(ae.getSource() == cancel){
             setVisible(false);
             new Login().setVisible(true);
             
        }
    }
    public static void main(String args[])
    {
        new Signup3("");
    }
    
}
