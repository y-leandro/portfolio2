// TELA DE ADICIONAR TREINOS 


package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class alunoTela extends javax.swing.JFrame {
static ArrayList<treinoalunos> listagem;
    
     
     
    
    public alunoTela() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    public void addtreinolista() {
        
        String  treino_A = txtAtreino.getText();
        String  treino_B = txtBtreino.getText();
        String  treino_C = txtCtreino.getText();
        String  treino_D = txtDtreino.getText();
        String  pesoAtual = txtPesoAtual.getText();
        String  pesoMeta = txtPesoMeta.getText();
        String  dataInicio = txtDataInicio.getText();
        String  dataFinal = txtDataFim.getText();
            
        if(pesoAtual.equals("") || pesoMeta.equals("") || dataInicio.equals("") || dataFinal.equals("") || treino_A.equals("")){
           JOptionPane.showMessageDialog(this,"Preencha os campos!"); 
        }
        
        else{    
            try{
                treinoalunos a = new treinoalunos(treino_A, treino_B, treino_C, treino_D, pesoAtual, pesoMeta, dataInicio, dataFinal);
                JOptionPane.showMessageDialog(this, "Treino adicionado!");
                listagem.add(a);
                txtAtreino.setText("");
                txtBtreino.setText("");
                txtCtreino.setText("");
                txtDtreino.setText("");
                txtPesoAtual.setText("");
                txtPesoMeta.setText("");
                txtDataInicio.setText("");
                txtDataFim.setText("");

            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Verifique as informações");
            }
    }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDataFim = new javax.swing.JTextField();
        txtPesoMeta = new javax.swing.JTextField();
        txtDataInicio = new javax.swing.JTextField();
        txtPesoAtual = new javax.swing.JTextField();
        txtDtreino = new javax.swing.JTextArea();
        txtCtreino = new javax.swing.JTextArea();
        txtBtreino = new javax.swing.JTextArea();
        txtAtreino = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAddTreino = new javax.swing.JButton();
        ExitAlunoTela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDataFim.setBackground(new java.awt.Color(54, 54, 54));
        txtDataFim.setForeground(new java.awt.Color(255, 255, 255));
        txtDataFim.setBorder(null);
        jPanel1.add(txtDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 299, 140, 20));

        txtPesoMeta.setBackground(new java.awt.Color(54, 54, 54));
        txtPesoMeta.setForeground(new java.awt.Color(255, 255, 255));
        txtPesoMeta.setBorder(null);
        jPanel1.add(txtPesoMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 178, 140, 20));

        txtDataInicio.setBackground(new java.awt.Color(54, 54, 54));
        txtDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtDataInicio.setBorder(null);
        jPanel1.add(txtDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 239, 140, 20));

        txtPesoAtual.setBackground(new java.awt.Color(54, 54, 54));
        txtPesoAtual.setForeground(new java.awt.Color(255, 255, 255));
        txtPesoAtual.setBorder(null);
        jPanel1.add(txtPesoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 121, 140, 20));

        txtDtreino.setBackground(new java.awt.Color(13, 13, 13));
        txtDtreino.setColumns(20);
        txtDtreino.setForeground(new java.awt.Color(255, 255, 255));
        txtDtreino.setRows(5);
        txtDtreino.setBorder(null);
        jPanel1.add(txtDtreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 286, 190, 155));

        txtCtreino.setBackground(new java.awt.Color(13, 13, 13));
        txtCtreino.setColumns(20);
        txtCtreino.setForeground(new java.awt.Color(255, 255, 255));
        txtCtreino.setRows(5);
        txtCtreino.setBorder(null);
        jPanel1.add(txtCtreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 286, 190, 155));

        txtBtreino.setBackground(new java.awt.Color(13, 13, 13));
        txtBtreino.setColumns(20);
        txtBtreino.setForeground(new java.awt.Color(255, 255, 255));
        txtBtreino.setRows(5);
        txtBtreino.setBorder(null);
        jPanel1.add(txtBtreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 83, 190, 155));

        txtAtreino.setBackground(new java.awt.Color(13, 13, 13));
        txtAtreino.setColumns(20);
        txtAtreino.setForeground(new java.awt.Color(255, 255, 255));
        txtAtreino.setRows(5);
        txtAtreino.setBorder(null);
        jPanel1.add(txtAtreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 83, 190, 155));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objetos/imagens/tela treino (alunos) (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAddTreino.setText("jButton1");
        btnAddTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTreinoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 85, -1));

        ExitAlunoTela.setText("jButton1");
        ExitAlunoTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitAlunoTelaActionPerformed(evt);
            }
        });
        jPanel1.add(ExitAlunoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 15, 16, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnAddTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        addtreinolista();
        
    }                                            

    private void ExitAlunoTelaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.dispose();
    }                                             

    
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
            java.util.logging.Logger.getLogger(alunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alunoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alunoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ExitAlunoTela;
    private javax.swing.JButton btnAddTreino;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea txtAtreino;
    private javax.swing.JTextArea txtBtreino;
    private javax.swing.JTextArea txtCtreino;
    private javax.swing.JTextField txtDataFim;
    private javax.swing.JTextField txtDataInicio;
    private javax.swing.JTextArea txtDtreino;
    private javax.swing.JTextField txtPesoAtual;
    private javax.swing.JTextField txtPesoMeta;
    // End of variables declaration                   
}
