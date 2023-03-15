//  TELA PARA VER OS TREINOS ANTIGOS


package objetos;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TreinosAntigos extends javax.swing.JFrame {
static ArrayList<treinoalunos> antigos;

    
    public TreinosAntigos() {
        initComponents();
                setLocationRelativeTo(null);
                
    }

    
    
   
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdataini = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTreinosAntigos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTreinosInf = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ExitTreinosAntigos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdataini.setBackground(new java.awt.Color(54, 54, 54));
        txtdataini.setForeground(new java.awt.Color(255, 255, 255));
        txtdataini.setBorder(null);
        txtdataini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatainiActionPerformed(evt);
            }
        });
        jPanel1.add(txtdataini, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 56, 220, 20));

        jScrollPane1.setBackground(new java.awt.Color(13, 13, 13));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txtTreinosAntigos.setEditable(false);
        txtTreinosAntigos.setBackground(new java.awt.Color(13, 13, 13));
        txtTreinosAntigos.setColumns(20);
        txtTreinosAntigos.setForeground(new java.awt.Color(255, 255, 255));
        txtTreinosAntigos.setRows(5);
        txtTreinosAntigos.setBorder(null);
        jScrollPane1.setViewportView(txtTreinosAntigos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 290, 350));

        jScrollPane2.setBackground(new java.awt.Color(13, 13, 13));
        jScrollPane2.setBorder(null);

        txtTreinosInf.setEditable(false);
        txtTreinosInf.setBackground(new java.awt.Color(13, 13, 13));
        txtTreinosInf.setColumns(20);
        txtTreinosInf.setForeground(new java.awt.Color(255, 255, 255));
        txtTreinosInf.setRows(5);
        txtTreinosInf.setBorder(null);
        txtTreinosInf.setCaretColor(new java.awt.Color(13, 13, 13));
        jScrollPane2.setViewportView(txtTreinosInf);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 270, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objetos/imagens/tela treino antigo (alunos).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setText("buscar por data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 52, 35, 30));

        jButton1.setText("atualiza treino");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 420, 35, 30));

        ExitTreinosAntigos.setText("jButton1");
        ExitTreinosAntigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitTreinosAntigosActionPerformed(evt);
            }
        });
        jPanel1.add(ExitTreinosAntigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 15, 16, 15));

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
    }                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        mostrarTreinosAntigos();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String treinoInf = "";
        String dataTreino = txtdataini.getText();
        for (treinoalunos a : antigos)
        {
            if (dataTreino.equals(a.getDataInicio()))
            {
                treinoInf += "Peso atual: " + a.getPesoAtual() + "   Peso meta: " + a.getPesoMeta() + "\n" + "Data inicial: " + a.getDataInicio() + "   Data final: " + a.getDataFinal() + "\n" + "TREINO A:" + "\n" + a.getTreino_A() + "\n" + "TREINO B:" + "\n" + a.getTreino_B() + "\n" + "TREINO C:" + "\n" + a.getTreino_C() + "\n" + "TREINO D:" + "\n" + a.getTreino_D();
            }
        }
        
        txtTreinosInf.setText(treinoInf);
        
    }                                        

    private void txtdatainiActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void ExitTreinosAntigosActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        this.dispose();
    }                                                  

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TreinosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreinosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreinosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreinosAntigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreinosAntigos().setVisible(true);
            }
        });
    }
    
     public void mostrarTreinosAntigos(){
        String treinos = "";
        for (treinoalunos a : antigos){
            treinos += "Data inicial: " + a.getDataInicio() + "   Data final: " + a.getDataFinal() + "\n";
        }
        txtTreinosAntigos.setText(treinos);
    }
    

                      
    private javax.swing.JButton ExitTreinosAntigos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtTreinosAntigos;
    private javax.swing.JTextArea txtTreinosInf;
    private javax.swing.JTextField txtdataini;
                      
}
