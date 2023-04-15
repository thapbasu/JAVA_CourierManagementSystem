/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagingStaff;

import java.awt.Image;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author thapa
 */
public class CreateOrder extends javax.swing.JFrame {
    String StoreName,UID;
    /**
     * Creates new form CreateOrder
     */
    public CreateOrder() {
        initComponents();
        backspace();
    }

    CreateOrder(String StoreName, String UID) {
       this.StoreName = StoreName;
       this.UID = UID;
       initComponents();
         backspace();
    }
         private void backspace(){
        ImageIcon icon = new ImageIcon("E:\\3rd sem\\java\\Assignment work\\images for GUI\\previous.PNG");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        back.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txt_firstname4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        txt_customerfirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_ordername = new javax.swing.JTextField();
        txt_customernumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_deliveryaddress = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_customerlastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        jLabel13.setText("Address");

        txt_firstname4.setBackground(new java.awt.Color(255, 255, 255));
        txt_firstname4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_firstname4.setForeground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(25, 118, 211));
        btn_save.setText("Create Order");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        txt_customerfirstname.setBackground(new java.awt.Color(255, 255, 255));
        txt_customerfirstname.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_customerfirstname.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Order Name");

        txt_ordername.setBackground(new java.awt.Color(255, 255, 255));
        txt_ordername.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_ordername.setForeground(new java.awt.Color(0, 0, 0));

        txt_customernumber.setBackground(new java.awt.Color(255, 255, 255));
        txt_customernumber.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_customernumber.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Customer Number");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("Delivery Address");

        txt_deliveryaddress.setBackground(new java.awt.Color(255, 255, 255));
        txt_deliveryaddress.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_deliveryaddress.setForeground(new java.awt.Color(0, 0, 0));

        txt_email.setBackground(new java.awt.Color(255, 255, 255));
        txt_email.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 0, 0));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel14.setText("Email Address");

        year.setBackground(new java.awt.Color(255, 255, 255));
        year.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(0, 0, 0));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022" }));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Y");

        month.setBackground(new java.awt.Color(255, 255, 255));
        month.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        month.setForeground(new java.awt.Color(0, 0, 0));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("M");

        day.setBackground(new java.awt.Color(255, 255, 255));
        day.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        day.setForeground(new java.awt.Color(0, 0, 0));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("D");

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel18.setText("Order Date:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setText("CREATE ORDER");

        txt_customerlastname.setBackground(new java.awt.Color(255, 255, 255));
        txt_customerlastname.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_customerlastname.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_customernumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ordername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_customerlastname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_customerfirstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_deliveryaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_customerfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_customerlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ordername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_customernumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_deliveryaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 462));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public int GenerateID(){
    Random rand = new Random();
  
        // Generate random integers in range 0 to 99
        int rand_int1 = rand.nextInt(100);
        return rand_int1;

    
    }
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
                //Getting the current date value
      LocalDate currentdate = LocalDate.now();
      //Getting the current day
      int currentDay = currentdate.getDayOfMonth();
//      System.out.println("Current day: "+currentDay);h
       int currentMonth = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
//      System.out.println("Current month: "+currentMonth);
      //getting the current year
      int currentYear = currentdate.getYear();
//      System.out.println("Current month: "+currentYear);
        
        
     int rand_int1 = GenerateID();

     String firstname = txt_customerfirstname.getText();
     String lastname = txt_customerlastname.getText();
     String OrderName = txt_ordername.getText();
     String CustomerNum = txt_customernumber.getText();
     String DeliveryAddress = txt_deliveryaddress.getText();
     String Email = txt_email.getText();
     String Day= day.getSelectedItem().toString();
     String Month= month.getSelectedItem().toString();
     String Year= year.getSelectedItem().toString();
     
        try {
              
           
            FileWriter Writer = new FileWriter("C:\\Java\\OrderList.txt",true);
            if(firstname.isEmpty() || lastname.isEmpty() || OrderName.isEmpty() || CustomerNum.isEmpty() || DeliveryAddress.isEmpty() || Email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields first");
            
            }
            else{
            Writer.write(rand_int1 + " " + firstname+ " " + lastname + " " + OrderName + " " + CustomerNum + " " + DeliveryAddress + " " + Email + " "+ Day + "-" + Month + "-" + Year + " " + currentDay + " " + currentMonth + " " + currentYear);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Order Created Successfully");
            setVisible(false);
            new ViewOrder(StoreName,UID).setVisible(true);
            }
              
              
    
             
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, " Signed up failed");
        
        }
     
     
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        new ViewOrder(StoreName, UID).setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField txt_customerfirstname;
    private javax.swing.JTextField txt_customerlastname;
    private javax.swing.JTextField txt_customernumber;
    private javax.swing.JTextField txt_deliveryaddress;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname4;
    private javax.swing.JTextField txt_ordername;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}