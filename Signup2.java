
package bank.management.system;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import  com.toedter.calendar.JDateChooser;
import  java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener{
    
   
    JTextField panNo,aadharNo;
    JRadioButton sYes,sNo,eYes,eNo;
    JButton next;
    JComboBox religion,category,occupation,education,income;
    String formno;
    Signup2(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
      
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raelway",Font.BOLD,22));
        additionalDetails.setBounds(280, 80, 400, 30);
        add(additionalDetails);
        
        
         JLabel Name=new JLabel("Religion:");
          Name.setFont(new Font("Raelway",Font.BOLD,18));
           Name.setBounds(100, 140, 200, 30);
        add(Name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh" ,"Christian","Others"};
        religion = new JComboBox(valReligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
        
         JLabel fName=new JLabel("Category:");
          fName.setFont(new Font("Raelway",Font.BOLD,18));
           fName.setBounds(100, 190, 200, 30);
        add(fName);
        
        
        String valCategory[]= {"Genral","OBC","SC","ST","Other"};
        category=new JComboBox(valCategory);
          category.setBounds(300, 190, 400, 30);
          category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob=new JLabel("Income:");
          dob.setFont(new Font("Raelway",Font.BOLD,18));
           dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        
         String valIncome[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         income=new JComboBox(valIncome);
          income.setBounds(300, 240, 400, 30);
          income.setBackground(Color.WHITE);
        add(income);
         
        
        
        JLabel gender=new JLabel("Educational:");
          gender.setFont(new Font("Raelway",Font.BOLD,18));
           gender.setBounds(100, 290, 200, 30);
        add(gender);
       
        
         JLabel Email=new JLabel("Qualification:");
          Email.setFont(new Font("Raelway",Font.BOLD,18));
           Email.setBounds(100, 315, 200, 30);
        add(Email);
        
          String valEdu[]= {"Non-Graduate","Graduate","Graduation","Post-Graduation","Post-Graduate","Others"};
       education=new JComboBox(valEdu);
          education.setBounds(300, 315, 400, 30);
          education.setBackground(Color.WHITE);
        add(education);
        
  
        
        
            JLabel marital=new JLabel("Occupation:");
          marital.setFont(new Font("Raelway",Font.BOLD,18));
           marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        
         String valOccupation[]= {"Salaried","Self-Employed","Business","Student","Retired","Others"};
       occupation=new JComboBox(valOccupation);
          occupation.setBounds(300, 390, 400, 30);
          occupation.setBackground(Color.WHITE);
        add(occupation);
        
       
        
         JLabel address=new JLabel("PAN Number:");
          address.setFont(new Font("Raelway",Font.BOLD,18));
           address.setBounds(100, 440, 200, 30);
        add(address);
        
        
         panNo=new JTextField();
         panNo.setFont(new Font("Raelway",Font.BOLD,18));
          panNo.setBounds(300, 440, 400, 30);
        add(panNo);
        
        
         JLabel city=new JLabel("Aadhar Number:");
          city.setFont(new Font("Raelway",Font.BOLD,18));
           city.setBounds(100, 490, 200, 30);
        add(city);
        
        
         aadharNo=new JTextField();
         aadharNo.setFont(new Font("Raelway",Font.BOLD,18));
          aadharNo.setBounds(300, 490, 400, 30);
        add(aadharNo);
        
        
         JLabel state=new JLabel("Senior Citizen:");
          state.setFont(new Font("Raelway",Font.BOLD,18));
           state.setBounds(100, 540, 200, 30);
        add(state);
        
          sYes=new JRadioButton("Yes");
        sYes.setBounds(300, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);
        
        
         sNo=new JRadioButton("No");
        sNo.setBounds(400, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);
        
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(sYes);
        bg1.add(sNo);
       
        
        
         JLabel pincode=new JLabel("Exisiting Account :");
          pincode.setFont(new Font("Raelway",Font.BOLD,18));
           pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eYes=new JRadioButton("Yes");
        eYes.setBounds(300, 590, 100, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);
        
        eNo=new JRadioButton("No");
        eNo.setBounds(400, 590, 100, 30);
        eNo.setBackground(Color.WHITE);
        add(eNo);
       
          ButtonGroup bg2=new ButtonGroup();
        bg2.add(eYes);
        bg2.add(eNo);
        
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   
    public void actionPerformed (ActionEvent ae){
 
    String sreligion = (String)religion.getSelectedItem();
    String scategory  =  (String) category.getSelectedItem();
    String sincome  =   (String)income.getSelectedItem();
    String seducation =  (String) education.getSelectedItem();
    String soccupation =   (String)occupation.getSelectedItem();
   String seniorCitizen = null;
    
    if(sYes.isSelected())
        seniorCitizen="Yes";
    
    else if(sNo.isSelected())
        seniorCitizen="No";
    
    String existingAc=null;
    
    if(eYes.isSelected())
         existingAc="Yes";
    
    else if(eNo.isSelected())
        existingAc="No";
    
    
    String pan=panNo.getText();
    String aadhar= aadharNo.getText();

    
    
   try{
       
           Conn c= new Conn();
           String querry = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"', '"+pan+"','"+aadhar+"','"+seniorCitizen+"','"+existingAc+"')";
           c.s.executeUpdate(querry);
           
           setVisible(false);
            new Signup3(formno).setVisible(true);
           
           }
   

   catch(Exception e){
        System.out.println(e);
   }
}
    public static void main(String args[])
    {
        new Signup2("");
    }
    
}



