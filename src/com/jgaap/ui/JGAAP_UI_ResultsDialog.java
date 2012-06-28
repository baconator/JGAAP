/*
 * JGAAP -- a graphical program for stylometric authorship attribution
 * Copyright (C) 2009,2011 by Patrick Juola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JGAAP_UI_ResultsDialog.java
 *
 * Created on Apr 19, 2011, 2:35:09 PM
 */

package com.jgaap.ui;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Patrick Brennan
 */
public class JGAAP_UI_ResultsDialog extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    /** Creates new form JGAAP_UI_ResultsDialog */
    public JGAAP_UI_ResultsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Results_TabbedPane = new javax.swing.JTabbedPane();
        ClearTabs_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ClearTabs_Button.setText("Clear Tabs");
        ClearTabs_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTabs_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Results_TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(817, Short.MAX_VALUE)
                .addComponent(ClearTabs_Button)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Results_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearTabs_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearTabs_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTabs_ButtonActionPerformed
        Results_TabbedPane.removeAll();
    }//GEN-LAST:event_ClearTabs_ButtonActionPerformed

    public static String now()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    public void addResults(String note) {
        JTextArea TextArea = new JTextArea();
        TextArea.setText(note);
        final JScrollPane ScrollPane = new JScrollPane(TextArea);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	   public void run() { 
        	       ScrollPane.getVerticalScrollBar().setValue(0);
        	   }
        	}); 
        JPanel Panel = new JPanel();
        Panel.setLayout(new BorderLayout());
        Panel.add(ScrollPane, BorderLayout.CENTER);
        Results_TabbedPane.add(now(),Panel);
        Results_TabbedPane.setSelectedComponent(Panel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearTabs_Button;
    private javax.swing.JTabbedPane Results_TabbedPane;
    // End of variables declaration//GEN-END:variables

}
