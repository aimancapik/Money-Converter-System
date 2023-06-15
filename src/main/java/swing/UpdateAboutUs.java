
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


/**
 *
 * @author Khairul Hakimi
 */
public class UpdateAboutUs extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAboutUs
     */
    public UpdateAboutUs() throws IOException {
        initComponents();
        jTextArea_AboutUs.setText("");
        jTextArea_AboutUsOld.setText("");
        showOld();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void showOld() throws IOException{
        File file = new File("AboutUs.txt");// it will open  the AboutUs.txt file
        BufferedReader br;
            br = new BufferedReader(new FileReader(file));//to read the AboutUs file
            jTextArea_AboutUsOld.read(br,null);
         br.close();
    }
    
    
    public void insertNewAboutUs() throws IOException{
        File file = new File("AboutUs.txt");// it will open  the AboutUs.txt file
        BufferedReader br;
        
        try{
            br = new BufferedReader(new FileReader(file));//to read the AboutUs file
                Object[] tableLines = br.lines().toArray();//gain data from the lines that has been in the file
                int i;// declare i
                               
                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); //it will write text  to character output stream
                        PrintWriter pwp = new PrintWriter(bwp)) {//format the content to be appended in the file
                          String aboutUs= jTextArea_AboutUs.getText();// get the aboutUs from the text field
                            pwp.println(aboutUs);
                    pwp.flush();//clear the stream of any element that may be or maybe not inside the stream
                    pwp.close();//flushes the characters from the stream and then closes it
                }           
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateCurrency.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    //belows code is involving the management of the element use in the design interface (155-270)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_AboutUs1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_AboutUs = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton_Update = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_AboutUsOld = new javax.swing.JTextArea();

        jTextArea_AboutUs1.setColumns(20);
        jTextArea_AboutUs1.setRows(5);
        jScrollPane2.setViewportView(jTextArea_AboutUs1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("OLD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABOUT US");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(184, 226, 138));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel1.setText("ABOUT US");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        jLabel2.setText("OLD");

        jTextArea_AboutUs.setColumns(20);
        jTextArea_AboutUs.setRows(5);
        jScrollPane1.setViewportView(jTextArea_AboutUs);

        jLabel4.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        jLabel4.setText("NEW");

        jButton_Update.setBackground(new java.awt.Color(94, 197, 126));
        jButton_Update.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton_Update.setText("UPDATE");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Back.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton_Back.setText("BACK");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jTextArea_AboutUsOld.setColumns(20);
        jTextArea_AboutUsOld.setRows(5);
        jTextArea_AboutUsOld.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea_AboutUsOld.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea_AboutUsOld);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 283, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        if(!"".equals(jTextArea_AboutUs.getText())){
                try{
                insertNewAboutUs();
                showOld();
                jTextArea_AboutUs.setText(null);
                }
                catch(IOException e){
                    System.out.println("FIle IO exception error");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please Fill All The Fields!");
            }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // to proceed to the Home page
        AdminHomePage ahm = new AdminHomePage();
        ahm.setVisible(true);// to open the new page
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
            java.util.logging.Logger.getLogger(UpdateAboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateAboutUs().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateAboutUs.class.getName()).log(Level.SEVERE, null, ex);
                }
        }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_AboutUs;
    private javax.swing.JTextArea jTextArea_AboutUs1;
    private javax.swing.JTextArea jTextArea_AboutUsOld;
    // End of variables declaration//GEN-END:variables


}

