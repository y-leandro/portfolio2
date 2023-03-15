// ESSA É A PRIMEIRA TELA QUE APARECE QUANDO FAZ LOGIN COMO USUÁRIO COMUM


package objetos;

import java.util.ArrayList;


public class telaOpcoes extends javax.swing.JFrame {
ArrayList<treinoalunos> listaTreino = new ArrayList<>();
  
    public telaOpcoes() {
        initComponents();
        setLocationRelativeTo(null);
       
        
    }
    


    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txttreinosT = new javax.swing.JTextPane();
        lblPesoAtual = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblPesoMeta = new javax.swing.JLabel();
        lblDataFim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizarTreino = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnAddTreino = new javax.swing.JButton();
        btnExibirAntigo = new javax.swing.JButton();
        ExitTelaOpcoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        txttreinosT.setEditable(false);
        txttreinosT.setBackground(new java.awt.Color(13, 13, 13));
        txttreinosT.setBorder(null);
        txttreinosT.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txttreinosT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, 280));

        lblPesoAtual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPesoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 61, 130, 20));

        lblDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 116, 130, 20));

        lblPesoMeta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPesoMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 61, 130, 20));

        lblDataFim.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 116, 130, 20));

        jLabel1.setBackground(new java.awt.Color(13, 13, 13));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objetos/imagens/tela opcoes (aluno) (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        btnAtualizarTreino.setText("Atualizar Treino");
        btnAtualizarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 365, 32, 30));

        btnA.setText("jButton1");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 45, -1, -1));

        btnB.setText("jButton2");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 45, -1, -1));

        btnC.setText("jButton3");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 45, -1, -1));

        btnD.setText("jButton4");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 45, -1, -1));

        btnAddTreino.setText("jButton1");
        btnAddTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 343, 145, -1));

        btnExibirAntigo.setText("jButton2");
        btnExibirAntigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirAntigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExibirAntigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 375, 145, -1));

        ExitTelaOpcoes.setText("jButton1");
        ExitTelaOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitTelaOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(ExitTelaOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 479, 50, 11));

        pack();
    }// </editor-fold>                        

    private void btnAddTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        alunoTela alunoForm = new alunoTela();
        alunoForm.setVisible(true);
         alunoTela.listagem = listaTreino;
       
        
    
    }                                            

    private void btnAtualizarTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                                   
         alunoTela.listagem = listaTreino;
            String pesoatual = "<html>";
            String pesometa = "<html>";
            String datainicio = "<html>";
            String datafinal = "<html>";
            String treino_a = "";

//            
//            
            
            for (treinoalunos a : listaTreino){
            pesoatual = a.getPesoAtual();
            pesometa = a.getPesoMeta();
            datainicio = a.getDataInicio();
            datafinal = a.getDataFinal();
            treino_a =  a.getTreino_A();

//            
//            
            }
            lblPesoAtual.setText(pesoatual);
            lblPesoMeta.setText(pesometa);
            lblDataInicio.setText(datainicio);
            lblDataFim.setText(datafinal);
            txttreinosT.setText(treino_a);
                    
            
            
            
    }                                                  

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String treino_a = "";
        for (treinoalunos a : listaTreino){
            treino_a = a.getTreino_A();
        }
        txttreinosT.setText(treino_a);
    }                                    

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String treino_b = "";
        for (treinoalunos a : listaTreino){
            treino_b = a.getTreino_B();
        }
        txttreinosT.setText(treino_b);
    }                                    

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String treino_c = "";
        for (treinoalunos a : listaTreino){
            treino_c = a.getTreino_C();
        }
        txttreinosT.setText(treino_c);
    }                                    

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String treino_d = "";
        for (treinoalunos a : listaTreino){
            treino_d = a.getTreino_D();
        }
        txttreinosT.setText(treino_d);
    }                                    

    private void btnExibirAntigoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        TreinosAntigos treinosAntes = new TreinosAntigos();
        treinosAntes.setVisible(true);
        TreinosAntigos.antigos = listaTreino;
        
        
    }                                               

    private void ExitTelaOpcoesActionPerformed(java.awt.event.ActionEvent evt) {                                               
        login logform = new login();
        logform.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(telaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaOpcoes().setVisible(true);
                
            }
        });
    }
    
     

                         
    private javax.swing.JButton ExitTelaOpcoes;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAddTreino;
    private javax.swing.JButton btnAtualizarTreino;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnExibirAntigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataFim;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblPesoAtual;
    private javax.swing.JLabel lblPesoMeta;
    private javax.swing.JTextPane txttreinosT;
}
