
package bank.management.system;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import  com.toedter.calendar.JDateChooser;
import  java.awt.event.*;

public class Signup1 extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JRadioButton male,female,others,married,unmarried;
    JButton next;
    JDateChooser dateChooser;
    
    Signup1()
    {
        setLayout(null);
        
        Random ran = new Random();
        random=Math.abs((ran.nextLong() % 9000L) +1000L);
        
        JLabel formNo=new JLabel("APPLICATION FORM NO. "+random);
        formNo.setFont(new Font("Raelway",Font.BOLD,38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("Raelway",Font.BOLD,22));
        personalDetails.setBounds(280, 80, 400, 30);
        add(personalDetails);
        
        
         JLabel Name=new JLabel("Name:");
          Name.setFont(new Font("Raelway",Font.BOLD,18));
           Name.setBounds(100, 140, 200, 30);
        add(Name);
        
        
       nameTextField=new JTextField();
         nameTextField.setFont(new Font("Raelway",Font.BOLD,18));
          nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
         JLabel fName=new JLabel("Father's name:");
          fName.setFont(new Font("Raelway",Font.BOLD,18));
           fName.setBounds(100, 190, 200, 30);
        add(fName);
        
        
        fTextField=new JTextField();
         fTextField.setFont(new Font("Raelway",Font.BOLD,18));
          fTextField.setBounds(300, 190, 400, 30);
        add(fTextField);
        
        
        JLabel dob=new JLabel("Date of Birth:");
          dob.setFont(new Font("Raelway",Font.BOLD,18));
           dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        
         dateChooser =new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
        JLabel gender=new JLabel("Gender:");
          gender.setFont(new Font("Raelway",Font.BOLD,18));
           gender.setBounds(100, 290, 200, 30);
        add(gender);
        
       
         male= new JRadioButton("Male:");
        male.setBounds(300, 290, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        female=new JRadioButton("Female:");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        
        
         JLabel Email=new JLabel("Email Address:");
          Email.setFont(new Font("Raelway",Font.BOLD,18));
           Email.setBounds(100, 340, 200, 30);
        add(Email);
        
        emailTextField=new JTextField();
         emailTextField.setFont(new Font("Raelway",Font.BOLD,18));
          emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        
            JLabel marital=new JLabel("Marital Status:");
          marital.setFont(new Font("Raelway",Font.BOLD,18));
           marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        
         married= new JRadioButton("Married:");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
         unmarried=new JRadioButton("Unmarried:");
        unmarried.setBounds(440, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        
         others=new JRadioButton("Others:");
        others.setBounds(620, 390, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(unmarried);
        bg1.add(married);
        bg1.add(others);
        
         JLabel address=new JLabel("Address:");
          address.setFont(new Font("Raelway",Font.BOLD,18));
           address.setBounds(100, 440, 150, 30);
        add(address);
        
        
         addressTextField=new JTextField();
         addressTextField.setFont(new Font("Raelway",Font.BOLD,18));
          addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        
         JLabel city=new JLabel("City:");
          city.setFont(new Font("Raelway",Font.BOLD,18));
           city.setBounds(100, 490, 100, 30);
        add(city);
        
        
         cityTextField=new JTextField();
         cityTextField.setFont(new Font("Raelway",Font.BOLD,18));
          cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        
         JLabel state=new JLabel("State:");
          state.setFont(new Font("Raelway",Font.BOLD,18));
           state.setBounds(100, 540, 100, 30);
        add(state);
        
        
        stateTextField=new JTextField();
         stateTextField.setFont(new Font("Raelway",Font.BOLD,18));
          stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        
         JLabel pincode=new JLabel("Pincode:");
          pincode.setFont(new Font("Raelway",Font.BOLD,18));
           pincode.setBounds(100, 590, 150, 30);
        add(pincode);
        
        
         pincodeTextField=new JTextField();
         pincodeTextField.setFont(new Font("Raelway",Font.BOLD,18));
          pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
        
       next=new JButton("Next");
       next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        add(next);
        next.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,850);
        setLocation(350,10);
        setVisible(true);
       
    }
    
   
    public void actionPerformed (ActionEvent ae){
    String formno = "" + random;
    String name = nameTextField.getText();
    String fname = fTextField.getText();
   String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected())
        gender="Male";
    
    else if(female.isSelected())
        gender="Female";
    
    String email=emailTextField.getText();
    String marital=null;
    
    if(married.isSelected())
         marital="Married";
    
    else if(unmarried.isSelected())
        marital="Unmarried";
    
    else if(others.isSelected())
        marital="Others";
    
    String address=addressTextField.getText();
    String city=cityTextField.getText();
    String state=stateTextField.getText();
    String pin=pincodeTextField.getText();
    
    
    try{
        if(name.equals(""))
            JOptionPane.showMessageDialog(null, "Name is Required");
        
        else if(fname.equals(""))
          JOptionPane.showMessageDialog(null,"Father's name is Required"); 
        
        else if(city.equals(""))
          JOptionPane.showMessageDialog(null," City name is Required"); 
        
        else if(state.equals(""))
          JOptionPane.showMessageDialog(null,"State name is Required"); 
        
        else if(pin.equals(""))
          JOptionPane.showMessageDialog(null,"state name is Required"); 
        
        else{
            Conn c= new Conn();
            String querry = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"', '"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(querry);
            
            setVisible(false);
            new Signup2(formno).setVisible(true);
            }
    }
    
    
    catch(Exception e){
        System.out.println(e);
    }
}
    public static void main(String args[])
    {
        new Signup1();
    }
    
}
