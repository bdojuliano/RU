import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameInserirCardapio extends javax.swing.JFrame {

    private BancoCardapio bdc = new BancoCardapio();
    private Cardapio c = new Cardapio();
    
    public JFrameInserirCardapio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbProteina = new javax.swing.JLabel();
        cxProteina = new javax.swing.JTextField();
        lbProteinaVegetariana = new javax.swing.JLabel();
        cxProteinaVegetariana = new javax.swing.JTextField();
        lbArroz = new javax.swing.JLabel();
        cxArroz = new javax.swing.JTextField();
        cxFeijao = new javax.swing.JTextField();
        lbFeijao = new javax.swing.JLabel();
        cxAdicional = new javax.swing.JTextField();
        cxSalada1 = new javax.swing.JTextField();
        lbAdicional = new javax.swing.JLabel();
        cxSalada2 = new javax.swing.JTextField();
        lbSalada1 = new javax.swing.JLabel();
        cxBebidas = new javax.swing.JTextField();
        lbSalada2 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        lbBebidas = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        cxData = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbRefeicao = new javax.swing.JLabel();
        cxRefeicao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInserirCardapio = new javax.swing.JTable();
        lbCodigo_Refeicao = new javax.swing.JLabel();
        cxCodigo_Refeicao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbProteina.setText("Proteína");

        lbProteinaVegetariana.setText("Proteína Vegetariana");

        lbArroz.setText("Arroz");

        lbFeijao.setText("Feijão");

        lbAdicional.setText("Adicional");

        lbSalada1.setText("Salada 1");

        lbSalada2.setText("Salada 2");

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        lbBebidas.setText("Bebidas");

        lbData.setText("Data");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbRefeicao.setText("Refeição");

        cxRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRefeicaoActionPerformed(evt);
            }
        });

        tbInserirCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Refeição", "Data", "Proteína", "Proteína Vegetariana", "Arroz", "Feijão", "Adicional", "Salada 1", "Salada 2", "Bebidas"
            }
        ));
        jScrollPane1.setViewportView(tbInserirCardapio);

        lbCodigo_Refeicao.setText("Código da refeição");

        cxCodigo_Refeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodigo_RefeicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbProteinaVegetariana)
                                        .addComponent(lbArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbFeijao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbSalada2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbSalada1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbAdicional, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(lbBebidas))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxProteinaVegetariana)
                                        .addComponent(cxArroz)
                                        .addComponent(cxFeijao)
                                        .addComponent(cxAdicional)
                                        .addComponent(cxSalada1)
                                        .addComponent(cxSalada2)
                                        .addComponent(cxBebidas)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbProteina))
                                    .addGap(76, 76, 76)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cxData)
                                        .addComponent(cxProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbRefeicao)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxCodigo_Refeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCodigo_Refeicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodigo_Refeicao)
                        .addComponent(cxCodigo_Refeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btInserir)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRefeicao)
                    .addComponent(cxRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProteina)
                    .addComponent(cxProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProteinaVegetariana)
                    .addComponent(cxProteinaVegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbArroz)
                    .addComponent(cxArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFeijao)
                    .addComponent(cxFeijao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdicional)
                    .addComponent(cxAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalada1)
                    .addComponent(cxSalada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalada2)
                    .addComponent(cxSalada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBebidas)
                    .addComponent(cxBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose ();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        c = new Cardapio ();
        
        
        try{
            c.setCodigo_Refeicao(Integer.parseInt(cxCodigo_Refeicao.getText()));
            c.setRefeicao(cxRefeicao.getText());
            c.setDiaMes(cxData.getText());
            c.setProteina(cxProteina.getText());
            c.setProteina_Vegetariana(cxProteinaVegetariana.getText());
            c.setArroz(cxArroz.getText());
            c.setFeijao(cxFeijao.getText());
            c.setAdicional(cxAdicional.getText());
            c.setSalada_Um(cxSalada1.getText());
            c.setSalada_Dois(cxSalada2.getText());
            c.setBebidas(cxBebidas.getText());
            
            if (bdc.cadastro(c)== null){
                bdc.getBDC().add(c);
                JOptionPane.showMessageDialog(null, "Cárdapio inserido com sucesso.", "Inserir Cardápio", JOptionPane.INFORMATION_MESSAGE);
                cxCodigo_Refeicao.setText("");
                cxRefeicao.setText("");
                cxData.setText("");
                cxProteina.setText("");
                cxProteinaVegetariana.setText("");
                cxArroz.setText("");
                cxFeijao.setText("");
                cxAdicional.setText("");
                cxSalada1.setText("");
                cxSalada2.setText("");
                cxBebidas.setText("");
                cxCodigo_Refeicao.requestFocus();
                showTabelaInserirCardapio();
           
            }
            else{
                JOptionPane.showMessageDialog (null, "Código já existe.","Erro", JOptionPane.ERROR_MESSAGE);
                cxCodigo_Refeicao.setText("");
                cxCodigo_Refeicao.requestFocus();
            }
            
        }
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O código da refeição precisa ser um inteiro.","Erro", JOptionPane.ERROR_MESSAGE);
            cxCodigo_Refeicao.setText("");
            cxCodigo_Refeicao.requestFocus();
        }
        
        catch (CVRefeicaoException refeicao){
            JOptionPane.showMessageDialog (null, "O campo Refeição precisa ser almoço ou jantar.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxRefeicao.setText("");
            cxRefeicao.requestFocus();
        }
        catch (CVDataException data){
            JOptionPane.showMessageDialog (null, "O campo Data não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxData.setText("");
            cxData.requestFocus();
        }
        catch (CVProteinaException proteina){
            JOptionPane.showMessageDialog (null, "O campo Proteína não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxProteina.setText("");
            cxProteina.requestFocus();
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            JOptionPane.showMessageDialog (null, "O campo Proteína Vegetariana não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxProteinaVegetariana.setText("");
            cxProteinaVegetariana.requestFocus();
        }
        catch (CVArrozException arroz){
            JOptionPane.showMessageDialog (null, "O campo Código da Arroz não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxArroz.setText("");
            cxArroz.requestFocus();
        }
        catch (CVFeijaoException feijao){
            JOptionPane.showMessageDialog (null, "O campo Feijão não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxFeijao.setText("");
            cxFeijao.requestFocus();
        }
        catch (CVAdicionalException adicional){
            JOptionPane.showMessageDialog (null, "O campo Adicional não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxAdicional.setText("");
            cxAdicional.requestFocus();
        }
        catch (CVSalada1Exception salada1){
            JOptionPane.showMessageDialog (null, "O campo Salada 1 não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxSalada1.setText("");
            cxSalada1.requestFocus();
        }
        catch (CVSalada2Exception salada2){
            JOptionPane.showMessageDialog (null, "O campo Salada2 não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxSalada2.setText("");
            cxSalada2.requestFocus();
        }
        catch (CVBebidasException bebidas){
            JOptionPane.showMessageDialog (null, "O campo Bebidas não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxBebidas.setText("");
            cxBebidas.requestFocus();
        }
    }//GEN-LAST:event_btInserirActionPerformed

    private void cxRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRefeicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRefeicaoActionPerformed

    private void cxCodigo_RefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodigo_RefeicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodigo_RefeicaoActionPerformed

    public void showTabelaInserirCardapio(){
        Cardapio c = new Cardapio();
        DefaultTableModel modelTabelaInserirCardapio = new DefaultTableModel();
        modelTabelaInserirCardapio = (DefaultTableModel) tbInserirCardapio.getModel();
        modelTabelaInserirCardapio.setRowCount(0);

            for (int posLinha=0; posLinha < bdc.getBDC().size(); posLinha ++){
                c.setCodigo_Refeicao(bdc.getBDC().get(posLinha).getCodigo_Refeicao());
                try{
                    c.setRefeicao(bdc.getBDC().get(posLinha).getRefeicao());
                    c.setDiaMes(bdc.getBDC().get(posLinha).getDiaMes());
                    c.setProteina(bdc.getBDC().get(posLinha).getProteina());
                    c.setProteina_Vegetariana(bdc.getBDC().get(posLinha).getProteina_Vegetariana());
                    c.setArroz(bdc.getBDC().get(posLinha).getArroz());
                    c.setFeijao(bdc.getBDC().get(posLinha).getFeijao());
                    c.setAdicional(bdc.getBDC().get(posLinha).getAdicional());
                    c.setSalada_Um(bdc.getBDC().get(posLinha).getSalada_Um());
                    c.setSalada_Dois(bdc.getBDC().get(posLinha).getSalada_Dois());
                    c.setBebidas(bdc.getBDC().get(posLinha).getBebidas());
                }
                catch (CVRefeicaoException refeicao){
                
                }
                catch (CVDataException data){
                
                }
                catch (CVProteinaException proteina){
                
                }
                catch (CVProteinaVegetarianaException proteinavegetariana){
                
                }
                catch (CVArrozException arroz){
                
                }
                catch (CVFeijaoException feijao){
                
                }
                catch (CVAdicionalException adicional){
                
                }
                catch (CVSalada1Exception salada1){
                
                }
                catch (CVSalada2Exception salada2){
                
                }
                catch (CVBebidasException bebidas){
                
                }

                modelTabelaInserirCardapio.insertRow(posLinha, new Object[]{c.getCodigo_Refeicao(), c.getRefeicao(), c.getDiaMes(), c.getProteina(), c.getProteina_Vegetariana(), c.getArroz(), c.getFeijao(), c.getAdicional(), c.getSalada_Um(), c.getSalada_Dois(), c.getBebidas()});
            }
    }
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
            java.util.logging.Logger.getLogger(JFrameInserirCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInserirCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserir;
    private javax.swing.JTextField cxAdicional;
    private javax.swing.JTextField cxArroz;
    private javax.swing.JTextField cxBebidas;
    private javax.swing.JTextField cxCodigo_Refeicao;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxFeijao;
    private javax.swing.JTextField cxProteina;
    private javax.swing.JTextField cxProteinaVegetariana;
    private javax.swing.JTextField cxRefeicao;
    private javax.swing.JTextField cxSalada1;
    private javax.swing.JTextField cxSalada2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdicional;
    private javax.swing.JLabel lbArroz;
    private javax.swing.JLabel lbBebidas;
    private javax.swing.JLabel lbCodigo_Refeicao;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbFeijao;
    private javax.swing.JLabel lbProteina;
    private javax.swing.JLabel lbProteinaVegetariana;
    private javax.swing.JLabel lbRefeicao;
    private javax.swing.JLabel lbSalada1;
    private javax.swing.JLabel lbSalada2;
    private javax.swing.JTable tbInserirCardapio;
    // End of variables declaration//GEN-END:variables
}
