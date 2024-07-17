/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author marve
 */
public class myFirstGui extends JFrame{
    
    //panels
    private JPanel name;
    private JPanel surname;
    private JPanel nameAndSurname;
    private JPanel greeting;
    private JPanel btn1;
    private JPanel main;
    private JPanel heading;
    
    //labels
    private JLabel nameLB;
    private JLabel surnameLB;
    private JLabel headingLB;
    
    //textfield
    private JTextField nameTextField;
    private JTextField surnameTextField;
    
    //textarea
    private JTextArea fieldTextAreaa;
    
    //buttons
    private JButton exitButton;
    private JButton clearButton;
    private JButton greetButton;
    
    public myFirstGui(){
      
        setLayout(new BorderLayout());
        setTitle("Greeting UI");
        setSize(710, 740);
        setBackground(Color.yellow);
        
        //create pannels
        name = new JPanel(new FlowLayout());
        surname = new JPanel(new FlowLayout());
        
        nameAndSurname = new JPanel(new GridLayout(2,1));
        greeting = new JPanel(new FlowLayout());
        greeting.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Greetings"));
        btn1 = new JPanel(new FlowLayout());
        main = new JPanel(new FlowLayout());
        heading = new JPanel(new FlowLayout(FlowLayout.CENTER));
        heading.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //creating labels
        nameLB = new JLabel("Name");
        surnameLB = new JLabel("Surname");
        headingLB = new JLabel("Batho Ba Modimo");
        
        //text field creation
        nameTextField = new JTextField(20);
        surnameTextField = new JTextField(20);
        
        //text field area
        fieldTextAreaa = new JTextArea(40,45);
        fieldTextAreaa.setEditable(false);
        fieldTextAreaa.setText("Hello [name] [surname]");
        
        //buttons
        exitButton = new JButton("EXIT");
        clearButton = new JButton("CLEAR");
        greetButton = new JButton("GREET");
        
        name.add(nameLB);
        name.add(nameTextField);
        
        surname.add(surnameLB);
        surname.add(surnameTextField);
        
        nameAndSurname.add(name);
        nameAndSurname.add(surname);
        
        greeting.add(fieldTextAreaa);
        
        btn1.add(exitButton);
        btn1.add(clearButton);
        btn1.add(greetButton);
        
        main.add(nameAndSurname, BorderLayout.NORTH);
        main.add(greeting, BorderLayout.CENTER);
        main.add(btn1, BorderLayout.SOUTH);
        
        add(heading, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);
        
        setVisible(true);
                
    }
}
