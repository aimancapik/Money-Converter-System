
package swing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.AddMyCurrency;

/**
 *
 * @author Khairul Hakimi
 */
public class AddCurrency extends javax.swing.JFrame {

    /**
     * Creates new form AddCurrency
     */
    public AddCurrency() {
        initComponents();
    }
    public void setData(){ //function to set new data of the currency
        AddMyCurrency amc= new AddMyCurrency(); //it will refer the AddMyCurrency's class 
        String Name = jTextField_Currency.getText();    // get the name at the text field 
        String symbol = jTextField_CurrencySymbol.getText();
        double rate;   //declare rate
        boolean check;  //declare the check (true or false)
        try{
        rate = Double.parseDouble(jTextField_Rate.getText()); //return an integer from any decimal number as input
        amc.setRate(rate);  //get the access to the AddMyCurrency's class to set the rate
        amc.setCurrencyName(Name);   //get the access to the AddMyCurrency's class to set the currency name
        amc.setCurrencySymbol(symbol); 
        check = true;   //assign check as true 
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Numeric Value!");
            check = false;  //assign check as false
        }
        if (check == true){ //if the check is true it will go to the currency file's funtion and display successful message
            currencyFile(amc);
            JOptionPane.showMessageDialog(this, "Currency Registered Successfully!");
            jTextField_Currency.setText(null);  //empty back the text field
            jTextField_Rate.setText(null);  //empty back the text field
            jTextField_CurrencySymbol.setText(null);
        }
    }
    
    public void currencyFile(AddMyCurrency amc) { //the currency file's function which to store data in the Currency.txt file
        File f = new File("Currency.txt");   // it will directed to the Currency.txt file
        try {
            if (!f.exists()){   //if the file does not exist in the folder it will create a new file named Currency.txt
                f.createNewFile();
            }
            int i=0;    //initiate i to 0
            int id = 0; ////initiate id to 0
            BufferedReader br = new BufferedReader(new FileReader(f));  //to read the file's content that has been declare 
            Object[] tableLines = br.lines().toArray(); //gain data from the lines that has been in the file
                                
                for(i=0; i<tableLines.length;i++){
                    String line = tableLines[i].toString().trim(); //to eliminated leading and trailing spaces from both ends of the strings
                    String[] tableRow = line.split(",:"); //Split the data by including ,:
                    try{
                    id = Integer.parseInt(tableRow[0]); //to return id as integer at the first row
                    }
                    catch(NumberFormatException e){
                        System.out.println("NO ID Is been found");     //error will be printed
                    }
                }
                amc.setCurrencyId(id+1); //get the access to the AddMyCurrency's class to set the Currency ID and plus 1

            try (FileWriter fw = new FileWriter(f,true); //it will create a FileWriter object using specified File Object
                BufferedWriter bw = new BufferedWriter(fw); //it will write text  to character output stream
                PrintWriter pw = new PrintWriter(bw)) { //format the content to be appended in the file
                    //it will write the information needed by refering to the AddMyCurrency's class and place it in the file
                    pw.println(amc.getCurrencyId()+",:"+amc.getCurrencyName() +",:"+amc.getCurrencySymbol() + ",:" + String.format("%.2f",amc.getRate()));
                    pw.flush(); //clear the stream of any element that may be or maybe not inside the stream
                    bw.close(); //flushes the characters from the stream and then closes it
                    fw.close();// to close the open Currency.txt file
                }
            } 
            catch (FileNotFoundException ex) {
                Logger.getLogger(AddCurrency.class.getName()).log(Level.SEVERE, null, ex);
            } 
        catch (IOException ex) {
            Logger.getLogger(AddCurrency.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Successfully Added New Currency In The File!");// display successful message
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")//belows code is involving the management of the element use in the design interface (109-228)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Currency = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Rate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_CurrencySymbol = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD CURRENCY");
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(184, 226, 138));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel1.setText("ADD CURRENCY");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel2.setText("NAME:");

        jTextField_Currency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CurrencyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel4.setText("RATE:");

        jTextField_Rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_RateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel3.setText("SYMBOL  / UNIT:");

        jTextField_CurrencySymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CurrencySymbolActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton_Add.setText("ADD");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Add1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton_Add1.setText("BACK");
        jButton_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_CurrencySymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Currency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Rate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Currency, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CurrencySymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        //when the admin click on the add button it will follow the instruction in this function
        //if any of the text field is empty it will display an error message and if all text field is been field it will go to setData's funtion
        if(!"".equals(jTextField_Currency.getText()) && !"".equals(jTextField_Rate.getText()) && !"".equals(jTextField_CurrencySymbol.getText()) ){
            setData();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Fill All Fields!");
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add1ActionPerformed
        // to proceed to the Manage user page
        AdminHomePage ahp= new AdminHomePage();
        ahp.setVisible(true);//to open the new page
        this.setVisible(false);// to close the existing page
    }//GEN-LAST:event_jButton_Add1ActionPerformed

    private void jTextField_RateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_RateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_RateActionPerformed

    private void jTextField_CurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CurrencyActionPerformed

    private void jTextField_CurrencySymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CurrencySymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CurrencySymbolActionPerformed

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
            java.util.logging.Logger.getLogger(AddCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCurrency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Add1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Currency;
    private javax.swing.JTextField jTextField_CurrencySymbol;
    private javax.swing.JTextField jTextField_Rate;
    // End of variables declaration//GEN-END:variables
}

