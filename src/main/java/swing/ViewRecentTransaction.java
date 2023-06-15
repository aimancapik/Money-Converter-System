
package swing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khairul Hakimi
 */
public class ViewRecentTransaction extends javax.swing.JFrame {

    /**
     * Creates new form ViewRecentTransactio
     */
    public ViewRecentTransaction() throws IOException{
        initComponents();
        ListAllCurrencyTable();
    }
    public void ListAllCurrencyTable() throws FileNotFoundException, IOException{ //display table of all transaction
         String[] columnName = new String[6];// declare the column's name and assign size
        columnName[0] = "Id";//first column is for user ID
        columnName[1] = "Username";//second column is for username
        columnName[2] = "From currency";//third column is for currency
        columnName[3] = "Amount";//fouth column is for amount that been change
        columnName[4] = "To currency";//fifth column is for currency
        columnName[5] = "Ammount Change";//sixth column is for ammount that been recieved
       
        jTable_Transaction.setRowHeight(30);
        File file = new File("History.txt");//Open History.txt file text
        File f = new File("userLogin.txt");//Open userLogin.txt file text
        BufferedReader bru = new BufferedReader(new FileReader(f));//to read the userLogin.txt file
        Object[] tableLinesUser = bru.lines().toArray();//gain data from the lines that has been in the file
        String lineUser = tableLinesUser[0].toString().trim();//to eliminated leading and trailing spaces from both ends of the strings
        String[] UserRow = lineUser.split(",:");//Split the data by including ,:
        BufferedReader br = new BufferedReader(new FileReader(file));//to read the History.txt file
        DefaultTableModel model = (DefaultTableModel) jTable_Transaction.getModel();
        model.setColumnIdentifiers(columnName);
        Object[] tableLines = br.lines().toArray();//gain data from the lines that has been in the file
        int i;

        for(i=0; i<tableLines.length;i++){
            String line = tableLines[i].toString().trim();//to eliminated leading and trailing spaces from both ends of the strings
            String[] tableRow = line.split(",:");//Split the data by including ,:
            
            //if both user id and Username is the same for both file then proceed with the instruction
            if(tableRow[0].equals(UserRow[0]) && tableRow[1].equals(UserRow[1])){
             model.addRow(tableRow);
            }
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //belows code is involving the management of the element use in the design interface (64-127)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Transaction = new javax.swing.JTable();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW RECENT TRANSACTION ");
        setPreferredSize(new java.awt.Dimension(700, 430));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(184, 226, 138));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel1.setText("HISTORY TRANSACTION");

        jTable_Transaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Transaction.setEnabled(false);
        jScrollPane1.setViewportView(jTable_Transaction);

        jButton_Back.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton_Back.setText("BACK");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // to proceed to the Manage menu page
        
       CustomerHomePage chp= new CustomerHomePage();
        chp.setVisible(true);// to open the new page
        this.setVisible(false);// to close the existing page
    }//GEN-LAST:event_jButton_BackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRecentTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecentTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecentTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecentTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewRecentTransaction().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ViewRecentTransaction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Transaction;
    // End of variables declaration//GEN-END:variables
}