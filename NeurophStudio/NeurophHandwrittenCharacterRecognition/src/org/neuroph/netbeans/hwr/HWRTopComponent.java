package org.neuroph.netbeans.hwr;



import org.neuroph.netbeans.hwr.components.DrawingListener;
import org.neuroph.netbeans.hwr.components.TreeManager;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Hashtable;
import java.util.Map;

import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
//import org.openide.util.ImageUtilities;
import org.netbeans.api.settings.ConvertAsProperties;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;

import org.neuroph.netbeans.hwr.wiz.HWRUtil;
import org.neuroph.netbeans.hwr.wiz.HWRecognitionManager;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;




/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.neuroph.netbeans.hwr//HWR//EN",
autostore = false)
public final class HWRTopComponent extends TopComponent implements LookupListener {

    private static HWRTopComponent instance;
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    private static final String PREFERRED_ID = "HWRTopComponent";
    
    private Map<TextAttribute, Object> styles = new Hashtable<TextAttribute, Object>();
    private Font font = new Font(Font.SERIF, Font.PLAIN, 20);
    
        private NeuralNetwork selectedNeuralNetwork;
    
    ArrayList<String> imageLabels = new ArrayList<String>();
    javax.swing.GroupLayout jImagePanelLayout;
 
   

    public HWRTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(HWRTopComponent.class, "CTL_HWRTopComponent"));
        setToolTipText(NbBundle.getMessage(HWRTopComponent.class, "HINT_HWRTopComponent"));
//        setIcon(ImageUtilities.loadImage(ICON_PATH, true));
       
        
    }

    public static void createTrainingSetFolder() {
        File f = new File(TreeManager.getPath());
        f.mkdir();
//        File f1 = new File("Letters/Training Set");
//        f1.mkdir();
    }

    private String[] formatOutput(String output) {
        return output.substring(1, output.length() - 1).split(", ");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recognitionPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        upperPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        acceptLetterButton = new javax.swing.JButton();
        discardLetterButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        probabilitiesList = new javax.swing.JList();
        botomPanel = new javax.swing.JPanel();
        bottomPanelII = new javax.swing.JPanel();
        recognizeLetterButton = new javax.swing.JButton();
        clearLetterButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        drawingPanelRecognition = new org.neuroph.netbeans.hwr.components.DrawingPanel();
        rightPanel = new javax.swing.JPanel();
        rightBotomPanel = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        networkField = new javax.swing.JTextField();

        recognitionPanel.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(250);

        leftPanel.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(180);
        jSplitPane2.setDividerSize(3);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setEnabled(false);

        upperPanel.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(acceptLetterButton, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.acceptLetterButton.text")); // NOI18N
        acceptLetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptLetterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(acceptLetterButton);

        org.openide.awt.Mnemonics.setLocalizedText(discardLetterButton, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.discardLetterButton.text")); // NOI18N
        discardLetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardLetterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(discardLetterButton);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jCheckBox1.text")); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);

        upperPanel.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        probabilitiesList.setModel(new javax.swing.DefaultListModel());
        probabilitiesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(probabilitiesList);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        upperPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setTopComponent(upperPanel);

        botomPanel.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(recognizeLetterButton, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.recognizeLetterButton.text")); // NOI18N
        recognizeLetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeLetterButtonActionPerformed(evt);
            }
        });
        bottomPanelII.add(recognizeLetterButton);

        org.openide.awt.Mnemonics.setLocalizedText(clearLetterButton, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.clearLetterButton.text")); // NOI18N
        clearLetterButton.setPreferredSize(new java.awt.Dimension(79, 23));
        clearLetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLetterButtonActionPerformed(evt);
            }
        });
        bottomPanelII.add(clearLetterButton);

        botomPanel.add(bottomPanelII, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jPanel3.border.title"))); // NOI18N
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentResized(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());
        DrawingListener dl = new DrawingListener(drawingPanelRecognition);
        drawingPanelRecognition.addMouseListener(dl);
        drawingPanelRecognition.addMouseMotionListener(dl);
        jPanel3.add(drawingPanelRecognition, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout drawingPanelRecognitionLayout = new javax.swing.GroupLayout(drawingPanelRecognition);
        drawingPanelRecognition.setLayout(drawingPanelRecognitionLayout);
        drawingPanelRecognitionLayout.setHorizontalGroup(
            drawingPanelRecognitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        drawingPanelRecognitionLayout.setVerticalGroup(
            drawingPanelRecognitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        jPanel3.add(drawingPanelRecognition, java.awt.BorderLayout.CENTER);

        botomPanel.add(jPanel3, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(botomPanel);

        leftPanel.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.BorderLayout());

        jSpinner1.setFocusable(false);
        jSpinner1.setPreferredSize(new java.awt.Dimension(50, 20));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner1KeyReleased(evt);
            }
        });
        rightBotomPanel.add(jSpinner1);

        org.openide.awt.Mnemonics.setLocalizedText(jToggleButton1, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jToggleButton1.text")); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        rightBotomPanel.add(jToggleButton1);

        org.openide.awt.Mnemonics.setLocalizedText(jToggleButton2, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jToggleButton2.text")); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        rightBotomPanel.add(jToggleButton2);

        org.openide.awt.Mnemonics.setLocalizedText(jToggleButton3, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jToggleButton3.text")); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        rightBotomPanel.add(jToggleButton3);

        rightPanel.add(rightBotomPanel, java.awt.BorderLayout.PAGE_END);

        jTextArea1.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        rightPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(rightPanel);

        recognitionPanel.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.jLabel1.text")); // NOI18N

        networkField.setEditable(false);
        networkField.setText(org.openide.util.NbBundle.getMessage(HWRTopComponent.class, "HWRTopComponent.networkField.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networkField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        recognitionPanel.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(recognitionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(recognitionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (evt.getActionCommand().equals("U")) {
            styles.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            jToggleButton3.setText(" U");
        } else {
            styles.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
            jToggleButton3.setText("U");
        }
        font = font.deriveFont(styles);
        jTextArea1.setFont(font);
}//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if (evt.getActionCommand().equals("I")) {
            styles.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
            jToggleButton2.setText(" I");
        } else {
            styles.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
            jToggleButton2.setText("I");
        }
        font = font.deriveFont(styles);
        jTextArea1.setFont(font);
}//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (evt.getActionCommand().equals("B")) {
            styles.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
            jToggleButton1.setText(" B");
        } else {
            styles.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
            jToggleButton1.setText("B");
        }
        font = font.deriveFont(styles);
        jTextArea1.setFont(font);
}//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jSpinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyReleased
        jSpinner1.setValue(20);
}//GEN-LAST:event_jSpinner1KeyReleased

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int i = Integer.parseInt(jSpinner1.getValue().toString());
        styles.put(TextAttribute.SIZE, i);
        font = font.deriveFont(styles);
        jTextArea1.setFont(font);
}//GEN-LAST:event_jSpinner1StateChanged

    private void jPanel3ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentResized
        drawingPanelRecognition.setPreferredSize(new Dimension(jPanel3.getWidth(), jPanel3.getHeight()));
}//GEN-LAST:event_jPanel3ComponentResized

    private void clearLetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLetterButtonActionPerformed
        drawingPanelRecognition.clearDrawingArea();
        ((DefaultListModel) probabilitiesList.getModel()).clear();
        new File("letter.png").delete();
}//GEN-LAST:event_clearLetterButtonActionPerformed

    private void recognizeLetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeLetterButtonActionPerformed


        HWRecognitionManager.getInstance().recognize(probabilitiesList, drawingPanelRecognition.getDrawnLetter(), jTextArea1, jCheckBox1);
        drawingPanelRecognition.clearDrawingArea();
        //        ((DefaultListModel) probabilitiesList.getModel()).clear();
        //
        //        OcrPlugin ocrPlugin = (OcrPlugin)activeNeuralNetwork.getPlugin(OcrPlugin.OCR_PLUGIN_NAME);
        //        HashMap recognitionResult = ocrPlugin.recognizeCharacterProbabilities(drawingPanelRecognition.getDrawnLetter());
        //
        //        String [] outputResult = formatOutput(recognitionResult.toString());
        //        DefaultListModel model = (DefaultListModel) probabilitiesList.getModel();
        //
        //        for (int i = 0; i < outputResult.length; i++) {
        //            model.addElement(outputResult[i]);
        //        }
        //
        //        probabilitiesList.setSelectedIndex(0);
        //        if (jCheckBox1.isSelected()) {
        //            String letter = model.getElementAt(0).toString().substring(0, 1);
        //            model.clear();
        //            jTextArea1.append(letter);
        //            drawingPanelRecognition.clearDrawingArea();
        //        }
}//GEN-LAST:event_recognizeLetterButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBox1ActionPerformed

    private void discardLetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardLetterButtonActionPerformed
        DefaultListModel model = (DefaultListModel) probabilitiesList.getModel();
        model.clear();
        drawingPanelRecognition.clearDrawingArea();
}//GEN-LAST:event_discardLetterButtonActionPerformed

    private void acceptLetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptLetterButtonActionPerformed
        if (probabilitiesList.getSelectedIndex() > -1) {
            DefaultListModel model = (DefaultListModel) probabilitiesList.getModel();
            String letter = model.getElementAt(probabilitiesList.getSelectedIndex()).toString().substring(0, 1);
            model.clear();
            jTextArea1.append(letter);
            drawingPanelRecognition.clearDrawingArea();
        } else {
            //todo
        }
}//GEN-LAST:event_acceptLetterButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptLetterButton;
    private javax.swing.JPanel botomPanel;
    private javax.swing.JPanel bottomPanelII;
    private javax.swing.JButton clearLetterButton;
    private javax.swing.JButton discardLetterButton;
    private org.neuroph.netbeans.hwr.components.DrawingPanel drawingPanelRecognition;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField networkField;
    private javax.swing.JList probabilitiesList;
    private javax.swing.JPanel recognitionPanel;
    private javax.swing.JButton recognizeLetterButton;
    private javax.swing.JPanel rightBotomPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    public static synchronized HWRTopComponent getDefault() {
        if (instance == null) {
            instance = new HWRTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the HWRTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized HWRTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(HWRTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof HWRTopComponent) {
            return (HWRTopComponent) win;
        }
        Logger.getLogger(HWRTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID
                + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // set selected network when this window is opened
        neuralNetResultSets = WindowManager.getDefault().findTopComponent("projectTabLogical_tc").getLookup().lookupResult(NeuralNetwork.class);
        // listen to selections in project view
        neuralNetResultSets.addLookupListener(this);
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    Object readProperties(java.util.Properties p) {
        if (instance == null) {
            instance = this;
        }
        instance.readPropertiesImpl(p);
        return instance;
    }

    private void readPropertiesImpl(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    Lookup.Result<NeuralNetwork> neuralNetResultSets;

    @Override
    public void resultChanged(LookupEvent le) {
        Lookup.Result r = (Lookup.Result) le.getSource();
        Collection c = r.allInstances();
        if (!c.isEmpty()) {
            Object item = c.iterator().next();
            
            if (item instanceof NeuralNetwork) {
                selectedNeuralNetwork = (NeuralNetwork) item;
                networkField.setText(selectedNeuralNetwork.getLabel());
                HWRecognitionManager.getInstance().setNeuralNetwork(selectedNeuralNetwork);
            }
        }
    }        
}

    

