
package autobomb.menu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.lang.*;
import static java.lang.System.exit;
/**
 *
 * @author XxgatesxX
 */
public class ClassMenu extends javax.swing.JFrame implements Runnable {

// MENU
    public ClassMenu() {
        initComponents();
        
               String nove = "9000";
      this.clickDelay.addItem(nove);
       
      String dez = "10000";
      this.clickDelay.addItem(dez);
      
      String onze = "11000";
      this.clickDelay.addItem(onze);
      
      String doze = "12000";
      this.clickDelay.addItem(doze);
      
      String treze = "13000";
      this.clickDelay.addItem(treze);

      String quartoze = "14000";
      this.clickDelay.addItem(quartoze);
      
        
      String quinze_min = "3";
      this.timeDescanso.addItem(quinze_min);
       
      String quarenta_min = "6";
      this.timeDescanso.addItem(quarenta_min);
       
      String uma_hora_meia = "9";
      this.timeDescanso.addItem(uma_hora_meia);
       



    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        clickDelay = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        timeDescanso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cxReso1 = new javax.swing.JCheckBox();
        cxReso2 = new javax.swing.JCheckBox();
        iniciar = new javax.swing.JButton();
        parar_aplicacao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amazonBox = new javax.swing.JCheckBox();
        tesouroBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 51, 204));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(350, 262));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 262));
        jPanel1.setName(""); // NOI18N
        jPanel1.setRequestFocusEnabled(false);

        clickDelay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELAY DO CLICK" }));
        clickDelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickDelayActionPerformed(evt);
            }
        });

        timeDescanso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCANSO DOS BOMBERS" }));
        timeDescanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeDescansoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TEMPO DO JOGO");

        jButton1.setText("ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ajuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("SELECIONE A RESOLUÇÃO");

        cxReso1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        cxReso1.setText("1080P");
        cxReso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxReso1ActionPerformed(evt);
            }
        });

        cxReso2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        cxReso2.setText("720p");
        cxReso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxReso2ActionPerformed(evt);
            }
        });

        iniciar.setBackground(new java.awt.Color(153, 255, 153));
        iniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iniciar.setText("INICIAR");
        iniciar.setToolTipText("");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        parar_aplicacao.setBackground(new java.awt.Color(255, 102, 102));
        parar_aplicacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        parar_aplicacao.setText("PARAR");
        parar_aplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parar_aplicacaoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SELECIONE O MODO DE JOGO");

        amazonBox.setText("AMAZON");
        amazonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amazonBoxActionPerformed(evt);
            }
        });

        tesouroBox.setText("TESOURO");
        tesouroBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesouroBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(amazonBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tesouroBox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cxReso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cxReso2))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clickDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(timeDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parar_aplicacao)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clickDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxReso1)
                    .addComponent(cxReso2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amazonBox)
                    .addComponent(tesouroBox))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar)
                    .addComponent(parar_aplicacao)))
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autobomb/menu/Imagens/images.jpg"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amazonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amazonBoxActionPerformed
        // TODO add your handling code here:
                tesouroBox.setSelected(false);

    }//GEN-LAST:event_amazonBoxActionPerformed

    private void parar_aplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parar_aplicacaoActionPerformed
        // TODO add your handling code here:

        Thread t1 = new Thread(new SairClass());
        t1.run();

    }//GEN-LAST:event_parar_aplicacaoActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

        
        
        
        //TRATAMENTO DE EXEÇÕES / ERROS AO NÃO SELECIONAR OPÇÕES.

        //RESOLUÇÃO
        if(cxReso1.isSelected()){}
        else if(cxReso2.isSelected()){}
        else {JOptionPane.showMessageDialog(null,"Selecione uma resolução","",JOptionPane.ERROR_MESSAGE);
        }
        
        //DELAY E DESCANSO
        if(clickDelay.getSelectedItem().equals("DELAY DO CLICK")){
            JOptionPane.showMessageDialog(null, "Selecione o delay do Click",null,JOptionPane.ERROR_MESSAGE);}
        else if(timeDescanso.getSelectedItem().equals("DESCANSO DOS BOMBERS"))
        JOptionPane.showMessageDialog(null, "Selecione o tempo de descanso",null,JOptionPane.ERROR_MESSAGE);
        else {}
        
        //MODO DE JOGO
        if (amazonBox.isSelected()){}
        else if (tesouroBox.isSelected()){}
        else {JOptionPane.showMessageDialog(null,"Selecione o modo de jogo","",JOptionPane.ERROR_MESSAGE);
        }

        
        
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//
        
        
        
        //INICIANDO BOT TESOURO 
        try {

            Robot robo = new Robot();
            //tempo do click
            String timeClick = clickDelay.getSelectedItem().toString();
            int convertClick = Integer.parseInt(clickDelay.getSelectedItem().toString());
            robo.setAutoDelay(convertClick);
            int mimir = 78000 ;

            //tempo do descanso
            String descansoTime = timeDescanso.getSelectedItem().toString();
            int convertDescanso = Integer.parseInt(timeDescanso.getSelectedItem().toString());

            //INICIAR 1080p
            if (cxReso1.isSelected ())
            if (tesouroBox.isSelected()){
                for (;;) {

                    //TRABALHAR
                    robo.mouseMove(1800,950);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(880, 250);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(1086, 190);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(800, 380);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);

                    //USUARIO SELECECIONA TEMPO
                    for(int x = 1; x <= convertDescanso ; ++x){

                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //CLICK DESCONECT
                        for (int Y =0; Y <=1; ++Y ){
                            //FASE1
                            robo.mouseMove(900, 730);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE2
                            robo.mouseMove(900, 890);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE3
                            robo.mouseMove(1050, 740);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE4
                            robo.mouseMove(1840, 540);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE5
                            robo.mouseMove(800, 380);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        }
                        //DESCANCO 1 MINUTOS
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(mimir);

                        //ANTIDESCONECT
                        //SAI
                        robo.mouseMove(40, 60);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(800, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(10000 );

                        //SAI
                        robo.mouseMove(40, 60);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(800, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //FASE1
                        robo.mouseMove(900, 730);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE2
                        robo.mouseMove(900, 890);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //FASE3
                        robo.mouseMove(1050, 740);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE4
                        robo.mouseMove(1840, 540);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE5
                        robo.mouseMove(800, 390);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    }
                    // voltar menu principal
                    robo.mouseMove(40, 60);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                }
            }
            

            //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            
            

            //RESOLUÇÃO 720P

            if (cxReso2.isSelected())
            if (tesouroBox.isSelected()){
                for(;;) {

                    //TRABALHAR
                    robo.mouseMove(1200,650);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(550, 180);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(700,120);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(500, 380);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);

                    //USUARIO SELECECIONA TEMPO
                    for(int x = 1; x <= convertDescanso ; ++x){

                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //CLICK DESCONECT
                        for (int Y =0; Y <=1; ++Y ){
                            //FASE1
                            robo.mouseMove(600, 500);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE2
                            robo.mouseMove(600, 590);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE3
                            robo.mouseMove(650, 500);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE4
                            robo.mouseMove(1180, 540);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE5
                            robo.mouseMove(500, 380);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        }
                        //DESCANCO 1 MINUTOS
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(mimir);

                        //ANTIDESCONECT
                        //SAI
                        robo.mouseMove(50, 40);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(10000 );

                        //SAI
                        robo.mouseMove(50, 40);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        robo.mouseMove(600, 500);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE2
                        robo.mouseMove(600, 590);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE3
                        robo.mouseMove(650, 500);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE4
                        robo.mouseMove(1180, 540);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE5
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    }
                    // voltar menu principal
                    robo.mouseMove(40, 60);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                }

            }
            
            

        } catch (AWTException ex) {
            Logger.getLogger(ClassMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClassMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                
        //INICIANDO BOT AMAZON 
        
        
        try {

            Robot robo = new Robot();
            //tempo do click
            String timeClick = clickDelay.getSelectedItem().toString();
            int convertClick = Integer.parseInt(clickDelay.getSelectedItem().toString());
            robo.setAutoDelay(convertClick);
            int mimir = 78000 ;

            //tempo do descanso
            String descansoTime = timeDescanso.getSelectedItem().toString();
            int convertDescanso = Integer.parseInt(timeDescanso.getSelectedItem().toString());

            //INICIAR 1080p
            if (cxReso1.isSelected ()){
            if (amazonBox.isSelected())
                for (;;) {

                    //TRABALHAR
                    robo.mouseMove(1800,950);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    
                    robo.mouseMove(880, 250);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(1086, 190);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(1000, 580);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);

                    //USUARIO SELECECIONA TEMPO
                    for(int x = 1; x <= convertDescanso ; ++x){

                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //CLICK DESCONECT
                        for (int Y =0; Y <=1; ++Y ){
                            //FASE1
                            robo.mouseMove(900, 730);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE2
                            robo.mouseMove(900, 890);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE3
                            robo.mouseMove(1050, 740);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE4
                            robo.mouseMove(1840, 540);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE5
                            robo.mouseMove(1000, 580);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        }
                        //DESCANCO 1 MINUTOS
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(mimir);

                        //ANTIDESCONECT
                        //SAI
                        robo.mouseMove(40, 60);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(955, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(10000 );

                        //SAI
                        robo.mouseMove(40, 60);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(1000, 580);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //FASE1
                        robo.mouseMove(900, 730);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE2
                        robo.mouseMove(900, 890);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //FASE3
                        robo.mouseMove(1050, 740);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE4
                        robo.mouseMove(1840, 540);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE5
                        robo.mouseMove(800, 390);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    }
                    // voltar menu principal
                    robo.mouseMove(40, 60);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                }
            }
            

            //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            
            

            //RESOLUÇÃO 720P

            if (cxReso2.isSelected())
            if (tesouroBox.isSelected()){
                for(;;) {

                    //TRABALHAR
                    robo.mouseMove(1200,650);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(550, 180);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(700,120);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    robo.mouseMove(500, 380);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);

                    //USUARIO SELECECIONA TEMPO
                    for(int x = 1; x <= convertDescanso ; ++x){

                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        //CLICK DESCONECT
                        for (int Y =0; Y <=1; ++Y ){
                            //FASE1
                            robo.mouseMove(600, 500);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE2
                            robo.mouseMove(600, 590);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE3
                            robo.mouseMove(650, 500);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE4
                            robo.mouseMove(1180, 540);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                            //FASE5
                            robo.mouseMove(500, 380);
                            robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        }
                        //DESCANCO 1 MINUTOS
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(mimir);

                        //ANTIDESCONECT
                        //SAI
                        robo.mouseMove(50, 40);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        Thread.sleep(10000 );

                        //SAI
                        robo.mouseMove(50, 40);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //ENTRA
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        robo.mouseMove(600, 500);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE2
                        robo.mouseMove(600, 590);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE3
                        robo.mouseMove(650, 500);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE4
                        robo.mouseMove(1180, 540);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        //FASE5
                        robo.mouseMove(500, 380);
                        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    }
                    // voltar menu principal
                    robo.mouseMove(40, 60);
                    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                }

            }
            
            

        } catch (AWTException ex) {
            Logger.getLogger(ClassMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClassMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void cxReso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxReso2ActionPerformed
        // TODO add your handling code here:
        cxReso1.setSelected(false);
    }//GEN-LAST:event_cxReso2ActionPerformed

    private void cxReso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxReso1ActionPerformed
        // TODO add your handling code here:
        cxReso2.setSelected(false);
    }//GEN-LAST:event_cxReso1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new ajudabomber().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ajudamenu().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void timeDescansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeDescansoActionPerformed
        // TODO add your handling code here:
        //clickdescanso

    }//GEN-LAST:event_timeDescansoActionPerformed

    private void clickDelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickDelayActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_clickDelayActionPerformed

    private void tesouroBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesouroBoxActionPerformed
        // TODO add your handling code here:
         amazonBox.setSelected(false);

    }//GEN-LAST:event_tesouroBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox amazonBox;
    private javax.swing.JComboBox<String> clickDelay;
    private javax.swing.JCheckBox cxReso1;
    private javax.swing.JCheckBox cxReso2;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton parar_aplicacao;
    private javax.swing.JCheckBox tesouroBox;
    private javax.swing.JComboBox<String> timeDescanso;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
