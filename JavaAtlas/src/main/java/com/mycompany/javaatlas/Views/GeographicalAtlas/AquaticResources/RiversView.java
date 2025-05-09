/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.javaatlas.Views.GeographicalAtlas.AquaticResources;

import Core.Services.*;
import com.mycompany.javaatlas.MainForm;
import com.mycompany.javaatlas.Views.GeographicalAtlas.AquaticResourcesView;

/**
 *
 * @author user
 */
public class RiversView extends javax.swing.JFrame {
    
    private String _address;
    private FileReaderService _fileReaderService = new FileReaderService();
    private RiversService _riversService = new RiversService();
 
    /** Creates new form RiversView */
    public RiversView() {
        _address = new MainForm().getAddress();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        contentScroll = new javax.swing.JScrollPane();
        content = new javax.swing.JTextArea();
        tableScroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        longestRivers = new javax.swing.JButton();
        deepestRivers = new javax.swing.JButton();
        riversInNorthAmerica = new javax.swing.JButton();
        riversInSouthAmerica = new javax.swing.JButton();
        riversInAustralia = new javax.swing.JButton();
        riversInAfrica = new javax.swing.JButton();
        riversInEurasia = new javax.swing.JButton();
        back = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        biggestRiversInUkraine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title.setText("Річки світу");

        content.setColumns(20);
        content.setRows(5);
        content.append(_fileReaderService.getFile(_address + "Resources/rivers.txt"));
        contentScroll.setViewportView(content);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableScroll.setViewportView(table);

        longestRivers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        longestRivers.setText("Найдовші");
        longestRivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longestRiversActionPerformed(evt);
            }
        });

        deepestRivers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deepestRivers.setText("Найбільш глубокі");
        deepestRivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepestRiversActionPerformed(evt);
            }
        });

        riversInNorthAmerica.setText("Річки в Північній Америці");
        riversInNorthAmerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riversInNorthAmericaActionPerformed(evt);
            }
        });

        riversInSouthAmerica.setText("Річки у Південній Америці");
        riversInSouthAmerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riversInSouthAmericaActionPerformed(evt);
            }
        });

        riversInAustralia.setText("Річки у Австралії");
        riversInAustralia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riversInAustraliaActionPerformed(evt);
            }
        });

        riversInAfrica.setText("Річки у Африці");
        riversInAfrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riversInAfricaActionPerformed(evt);
            }
        });

        riversInEurasia.setText("Річки у Єврвзії");
        riversInEurasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riversInEurasiaActionPerformed(evt);
            }
        });

        back.setText("Назад");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(_address + "Images/river1.jpg"));

        icon2.setIcon(new javax.swing.ImageIcon(_address + "Images/river2.jpg"));

        biggestRiversInUkraine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        biggestRiversInUkraine.setText("Найбільші на Україні");
        biggestRiversInUkraine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biggestRiversInUkraineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contentScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longestRivers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deepestRivers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(biggestRiversInUkraine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(riversInAustralia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riversInEurasia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(riversInSouthAmerica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riversInNorthAmerica, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riversInAfrica, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(430, 430, 430))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(riversInNorthAmerica)
                            .addComponent(riversInAfrica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(riversInSouthAmerica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(riversInAustralia)
                            .addComponent(riversInEurasia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(longestRivers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deepestRivers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(biggestRiversInUkraine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        //jLabel2.setIcon(new javax.swing.ImageIcon(adres+"atlas/картинки/ozero2.jpg"));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void longestRiversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longestRiversActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetLongestRivers();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_longestRiversActionPerformed

    private void deepestRiversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deepestRiversActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetDeepestRivers();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_deepestRiversActionPerformed

    private void riversInNorthAmericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riversInNorthAmericaActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetRiversInNorthAmerica();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_riversInNorthAmericaActionPerformed

    private void riversInSouthAmericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riversInSouthAmericaActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetRiversInSouthAmerica();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_riversInSouthAmericaActionPerformed

    private void riversInAustraliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riversInAustraliaActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetRiversInAustralia();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_riversInAustraliaActionPerformed

    private void riversInAfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riversInAfricaActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetRiversInAfrica();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_riversInAfricaActionPerformed

    private void riversInEurasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riversInEurasiaActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetRiversInEurasia();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_riversInEurasiaActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        var aquaticResources = new AquaticResourcesView();
        aquaticResources.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void biggestRiversInUkraineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biggestRiversInUkraineActionPerformed
        // TODO add your handling code here:
        var riversInfo = _riversService.GetBiggestRiversInUkraine();
        table.setModel(new javax.swing.table.DefaultTableModel(
            riversInfo.GetRiversList(),
            riversInfo.GetColumnNames()
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_biggestRiversInUkraineActionPerformed

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
            java.util.logging.Logger.getLogger(RiversView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiversView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiversView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiversView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiversView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton biggestRiversInUkraine;
    private javax.swing.JTextArea content;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JButton deepestRivers;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton longestRivers;
    private javax.swing.JButton riversInAfrica;
    private javax.swing.JButton riversInAustralia;
    private javax.swing.JButton riversInEurasia;
    private javax.swing.JButton riversInNorthAmerica;
    private javax.swing.JButton riversInSouthAmerica;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
