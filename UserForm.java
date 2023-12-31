package com.mycompany.project;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;*/
/**
 *
 * @author ishma
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public UserForm() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Company ICON.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstNamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LastNamefield = new javax.swing.JTextField();
        Emailfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Passfield = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        ConfirmPassfield = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        Agefield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DOBfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Phonefield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TermsConditions = new javax.swing.JCheckBox();
        Submitbtn = new javax.swing.JButton();
        Genderbox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Questionfield = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Email :");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("What is your Hobby? :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 234, 234));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("First Name :");

        FirstNamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FirstNamefieldKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Last Name :");

        LastNamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastNamefieldKeyPressed(evt);
            }
        });

        Emailfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailfieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Email :");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Password :");

        Passfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassfieldKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Confirm Password :");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Age :");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Date Of Birth :");

        DOBfield.setText("YYYY - MM - DD");
        DOBfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBfieldActionPerformed(evt);
            }
        });
        DOBfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DOBfieldKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Phone Number :");

        Phonefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhonefieldKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Gender :");

        TermsConditions.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TermsConditions.setText("Agree to Terms of Service and Privacy Policy Agreement");
        TermsConditions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TermsConditionsMouseClicked(evt);
            }
        });

        Submitbtn.setBackground(new java.awt.Color(255, 204, 204));
        Submitbtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Submitbtn.setText("SUBMIT");
        Submitbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        Genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female", "Third Gender", "Rather not answer" }));
        Genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderboxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("What is your Hobby? :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TermsConditions)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ConfirmPassfield)
                        .addComponent(Passfield)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Emailfield))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(DOBfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(Agefield, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(Phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(19, 19, 19)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LastNamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(FirstNamefield)))
                        .addComponent(Submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(Genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Questionfield))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstNamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LastNamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DOBfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Agefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPassfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Questionfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(TermsConditions)
                .addGap(18, 18, 18)
                .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DOBfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBfieldActionPerformed
        int age;
        if (!DOBfield.getText().isBlank()) {
            age = Account.getAge(DOBfield.getText());
            Agefield.setText(String.valueOf(age));
        }
    }//GEN-LAST:event_DOBfieldActionPerformed

    private void FirstNamefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNamefieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            LastNamefield.requestFocus();
        }
    }//GEN-LAST:event_FirstNamefieldKeyPressed

    private void LastNamefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNamefieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            DOBfield.requestFocus();
        }
    }//GEN-LAST:event_LastNamefieldKeyPressed

    private void DOBfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DOBfieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Phonefield.requestFocus();
        }
    }//GEN-LAST:event_DOBfieldKeyPressed

    private void GenderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderboxActionPerformed

    }//GEN-LAST:event_GenderboxActionPerformed

    private void PhonefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhonefieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Genderbox.requestFocus();
        }
    }//GEN-LAST:event_PhonefieldKeyPressed

    private void EmailfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailfieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Passfield.requestFocus();
        }
    }//GEN-LAST:event_EmailfieldKeyPressed

    private void PassfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassfieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            ConfirmPassfield.requestFocus();
        }
    }//GEN-LAST:event_PassfieldKeyPressed

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        /*  boolean conditions = true;

        int age = 0;
        String DOB = null;
        String gender = null;
        String phone = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = "";

        if (DOBfield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Date Of Birth");
        } else {
            age = Account.getAge(DOBfield.getText());
            Agefield.setText(String.valueOf(age));
        }

        if (Emailfield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Email");
        } else if (Genderbox.getSelectedItem().equals("Choose")) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Choose Gender");
        } else if (Phonefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Phone number");
        } else if (LastNamefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Last Name");
        } else if (FirstNamefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter First Name");
        }

        if (Arrays.equals(Passfield.getPassword(), ConfirmPassfield.getPassword())) {
            password = new String(Passfield.getPassword());
            JOptionPane.showMessageDialog(UserForm.this, password);
        } else {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Password Does Not Match");
        }

        if (!TermsConditions.isSelected()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Terms & Conditions Not Checked");
        }

        if (conditions) {
            firstName = FirstNamefield.getText();
            lastName = LastNamefield.getText();
            phone = Phonefield.getText();
            email = Emailfield.getText();
            DOB = DOBfield.getText();
            gender = Genderbox.getSelectedItem().toString();
            Account newUser = new Account(age, DOB, gender, phone, firstName, lastName, email, password);
            System.out.println(newUser.getGender());
            System.out.println(newUser.getDOB());
            System.out.println(newUser.getPassword());
            System.out.println(newUser.getEmail());
            System.out.println(newUser.getPhone());
            System.out.println(newUser.getUserID());
            System.out.println(newUser.getFirstName());
            System.out.println(newUser.getLastName());

            ArrayList<Account> accounts = new ArrayList<>();

            try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("user_database.dat"))) {
                accounts = (ArrayList<Account>) oos.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Creating a new file.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

            accounts.add(newUser);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user_database.dat"))) {
                oos.writeObject(accounts);
                System.out.println("Writing done");
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                FileInputStream fos = new FileInputStream("user_database.dat");
                ObjectInputStream oos = new ObjectInputStream(fos);
                ArrayList<Account> account2 = new ArrayList<>();
                account2 = (ArrayList<Account>) oos.readObject();
                System.out.println("File read");
                for (int i = 0; i < account2.size(); i++) {
                    Account user = account2.get(i);
                    System.out.println(user.getGender());
                    System.out.println(user.getDOB());
                    System.out.println(user.getPassword());
                    System.out.println(user.getEmail());
                    System.out.println(user.getPhone());
                    System.out.println(user.getUserID());
                    System.out.println(user.getFirstName());
                    System.out.println(user.getLastName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dispose();
         */
        boolean conditions = true;

        int age = 0;
        String DOB = null;
        String gender = null;
        String phone = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = "";
        String question = "";

        if (DOBfield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Date Of Birth");
        } else {
            age = Account.getAge(DOBfield.getText());
            Agefield.setText(String.valueOf(age));
        }
        List<Account> accounts = null;
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("user_database.dat"))) {
            accounts = (ArrayList<Account>) oos.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating a new file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (Emailfield.getText().equals((account.getEmail()))) {
                JOptionPane.showMessageDialog(UserForm.this, "Email already taken");
                conditions = false;
            }
        }
        if(Questionfield.getText().isBlank()){
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Answer to the Question");
        }
        if (Emailfield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Email");
        } else if (Genderbox.getSelectedItem().equals("Choose")) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Choose Gender");
        } else if (Phonefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Phone number");
        } else if (LastNamefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter Last Name");
        } else if (FirstNamefield.getText().isBlank()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Enter First Name");
        }
        if (Passfield.getPassword().length < 8) {
            JOptionPane.showMessageDialog(UserForm.this, "Password must be 8 characters");
            conditions = false;
        }

        if (Arrays.equals(Passfield.getPassword(), ConfirmPassfield.getPassword())) {
            password = new String(Passfield.getPassword());
        } else {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Password Does Not Match");
        }
        boolean hasDigits = false, hasUppercase = false, hasLowercase = false, hasPunctuation = false;

        for (char ch : Passfield.getPassword()) {
            if (Character.isDigit(ch)) {
                hasDigits = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (!Character.isWhitespace(ch)) {
                hasPunctuation = true;
            }
        }

        if (!hasDigits || !hasUppercase || !hasLowercase || !hasPunctuation) {
            StringBuilder message = new StringBuilder("Password must contain:");
            if (!hasDigits) {
                message.append(" digits,");
            }
            if (!hasUppercase) {
                message.append(" uppercase letters,");
            }
            if (!hasLowercase) {
                message.append(" lowercase letters,");
            }
            if (!hasPunctuation) {
                message.append(" special characters,");
            }
            message.deleteCharAt(message.length() - 1); // Remove trailing comma
            JOptionPane.showMessageDialog(UserForm.this, message.toString());
            conditions = false;
        }

        if (!TermsConditions.isSelected()) {
            conditions = false;
            JOptionPane.showMessageDialog(UserForm.this, "Terms & Conditions Not Checked");
        }

        if (conditions) {
            firstName = FirstNamefield.getText();
            lastName = LastNamefield.getText();
            phone = Phonefield.getText();
            email = Emailfield.getText();
            DOB = DOBfield.getText();
            gender = Genderbox.getSelectedItem().toString();
            question = Questionfield.getText();
            Account newUser = new Account(age, DOB, gender, phone, firstName, lastName, email, password,question);
            /*System.out.println(newUser.getGender());
            System.out.println(newUser.getDOB());
            System.out.println(newUser.getPassword());
            System.out.println(newUser.getEmail());
            System.out.println(newUser.getPhone());
            System.out.println(newUser.getUserID());
            System.out.println(newUser.getFirstName());
            System.out.println(newUser.getLastName());*/
            accounts.add(newUser);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user_database.dat"))) {
                oos.writeObject(accounts);
                System.out.println("Writing done");
                        dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void TermsConditionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TermsConditionsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TermsConditionsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agefield;
    private javax.swing.JPasswordField ConfirmPassfield;
    private javax.swing.JTextField DOBfield;
    private javax.swing.JTextField Emailfield;
    private javax.swing.JTextField FirstNamefield;
    private javax.swing.JComboBox<String> Genderbox;
    private javax.swing.JTextField LastNamefield;
    private javax.swing.JPasswordField Passfield;
    private javax.swing.JTextField Phonefield;
    private javax.swing.JTextField Questionfield;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JCheckBox TermsConditions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
