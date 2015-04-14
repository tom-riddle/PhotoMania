
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.geom.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicMenuUI.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicMenuUI.*;
public class PhotoMania extends JFrame {
private final int HISTORY_SIZE = 20;
    private static int currentImageIndex = 0;
    private static int mainSliderPrevValue = 50;
    private static char currentAction = ' ';
    private boolean isHistoryFull = false;
    /** Creates new form PhotoMania */
    public PhotoMania() {
        operating_function();
    }
 public void operating_function() {
        jPanel60 = new JPanel();
        jButton60 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel60.setBackground(new Color(235, 250, 18));
        jPanel60.setName("jPanel60"); // NOI18N
        jButton60.setIcon(new ImageIcon("C:\\Users\\Cyclops\\Pictures\\1_l.jpg")); // NOI18N
        //jButton60.setText("Click Here");
        jButton60.setName("jButton60"); // NOI18N
        jButton60.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }});
        GroupLayout jPanel60Layout = new GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jButton60, GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE));
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton60, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE)));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
        //
    }
  private void jButton60ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
         jPanel60.setVisible(false);
         initComponents();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jSlider1 = new JSlider();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem4 = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem9 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenuItem21 = new JMenuItem();
        jMenuItem14 = new JMenuItem();
        jMenuItem19 = new JMenuItem();
        jMenuItem17 = new JMenuItem();
        jMenuItem20 = new JMenuItem();
        jMenuItem18 = new JMenuItem();
        jMenuItem16 = new JMenuItem();
        jMenuItem23 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem13 = new JMenuItem();
        jMenuItem7 = new JMenuItem();
        jMenuItem15 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem11 = new JMenuItem();
        jMenuItem24 = new JMenuItem();
        jMenuItem26 = new JMenuItem();
        jMenu7 = new JMenu();
        jMenuItem30 = new JMenuItem();
        jMenuItem31 = new JMenuItem();
        jMenuItem32 = new JMenuItem();
        jMenuItem33 = new JMenuItem();
        jMenu6 = new JMenu();
        jMenuItem25 = new JMenuItem();
        jMenuItem27 = new JMenuItem();
        jMenuItem28 = new JMenuItem();
        jMenuItem29 = new JMenuItem();
        jMenuItem34 = new JMenuItem();
        jMenu5 = new JMenu();
        jMenuItem8 = new JMenuItem();
        jMenuItem10 = new JMenuItem();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(155, 153, 255));
        setForeground(new Color(155, 153, 255));
        jScrollPane1.setName("jScrollPane1"); // NOI18N
        jLabel1.setBackground(new Color(153, 255, 255));
        jLabel1.setName("jLabel1"); // NOI18N
        jScrollPane1.setViewportView(jLabel1);
        jPanel1.setBackground(new Color(204, 204, 204));
        jPanel1.setForeground(new Color(255, 204, 204));
        jPanel1.setName("jPanel1"); // NOI18N
        jSlider1.setEnabled(false);
        jSlider1.setName("jSlider1"); // NOI18N
        jSlider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }});
        jLabel2.setFont(new Font("Times New Roman", 1, 12));
        jLabel2.setText("Adjust Value");
        jLabel2.setName("jLabel2"); // NOI18N

        jButton1.setFont(new Font("Times New Roman", 1, 12));
        jButton1.setText("Apply");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setName("jPanel2"); // NOI18N
        jLabel4.setFont(new Font("Times New Roman", 1, 12));
        jLabel4.setText("Product Version : PhotoMania 1.0");
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel5.setFont(new Font("Times New Roman", 1, 12));
        jLabel5.setText("License Type : Free");
        jLabel5.setName("jLabel5"); // NOI18N
        jLabel6.setFont(new Font("Times New Roman", 1, 14));
        jLabel6.setText("PhotoMania");
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel7.setFont(new Font("Times New Roman", 1, 12));
        jLabel7.setText("Product ID : Digital Image Processing 1.0");
        jLabel7.setName("jLabel7"); // NOI18N
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(54, Short.MAX_VALUE)));
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(81, 81, 81)));
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(204, 204, 204)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE)));
        jMenuBar1.setName("jMenuBar1"); // NOI18N
        jMenuBar1.setBackground(Color.WHITE);
        jMenu1.setText("File");
        jMenu1.setFont(new Font("Segoe UI", 1, 12));
        jMenu1.setName("jMenu1"); // NOI18N
jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }});
        jMenu1.add(jMenuItem1);
jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }});
        jMenu1.add(jMenuItem2);
jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }});
        jMenu1.add(jMenuItem3);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Edit");
        jMenu2.setFont(new Font("Segoe UI", 1, 12));
        jMenu2.setName("jMenu2"); // NOI18N
jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Reset");
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }});
        jMenu2.add(jMenuItem4);
        jMenuBar1.add(jMenu2);
        jMenu3.setText("Effects");
        jMenu3.setFont(new Font("Segoe UI", 1, 12));
        jMenu3.setName("jMenu3"); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }});
        jMenuItem9.setForeground(new Color(51, 0, 51));
        jMenuItem9.setText("GreyImage");
        jMenuItem9.setName("jMenuItem9"); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);}});
        jMenu3.add(jMenuItem9);
        jMenuItem5.setForeground(new Color(51, 0, 51));
        jMenuItem5.setText("Invert");
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem5);
        jMenuItem21.setForeground(new Color(51, 0, 51));
        jMenuItem21.setText("EdgeDetect");
        jMenuItem21.setName("jMenuItem21"); // NOI18N
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem21);
        jMenuItem14.setForeground(new Color(51, 0, 51));
        jMenuItem14.setText("RedEyeView");
        jMenuItem14.setName("jMenuItem14"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem14);
        jMenuItem19.setText("Brightness");
        jMenuItem19.setName("jMenuItem19"); // NOI18N
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem19);
        jMenuItem17.setText("GreenEyeView");
        jMenuItem17.setName("jMenuItem17"); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem17);
        jMenuItem20.setText("Blur");
        jMenuItem20.setName("jMenuItem20"); // NOI18N
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem20);
        jMenuItem18.setText("BlueEyeView");
        jMenuItem18.setName("jMenuItem18"); // NOI18N
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem18);

        jMenuItem16.setText("Sharpen");
        jMenuItem16.setName("jMenuItem16"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem16);
        jMenuItem23.setText("Custom");
        jMenuItem23.setName("jMenuItem23"); // NOI18N
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }});
        jMenu3.add(jMenuItem23);
        jMenuBar1.add(jMenu3);
        jMenu4.setText("Transform");
        jMenu4.setFont(new Font("Segoe UI", 1, 12));
        jMenu4.setName("jMenu4"); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }});
        jMenuItem13.setText("HorizontalStretch");
        jMenuItem13.setName("jMenuItem13"); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem13);
        jMenuItem7.setText("HorizontalMirror");
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem7);
        jMenuItem15.setText("VerticalStretch");
        jMenuItem15.setName("jMenuItem15"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem15);
        jMenuItem6.setText("VerticalMirror");
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem6);
        jMenuItem11.setText("Rotate-180 deg");
        jMenuItem11.setName("jMenuItem11"); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem11);
        jMenuItem24.setText("Rotate-45 deg");
        jMenuItem24.setName("jMenuItem24"); // NOI18N
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem24);
        jMenuItem26.setText("Shear");
        jMenuItem26.setName("jMenuItem26"); // NOI18N
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem26);
        jMenu7.setText("ZoomIn");
        jMenu7.setName("jMenu7"); // NOI18N
        jMenuItem30.setText("250%");
        jMenuItem30.setName("jMenuItem30"); // NOI18N
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }});
        jMenu7.add(jMenuItem30);
        jMenuItem31.setText("300%");
        jMenuItem31.setName("jMenuItem31"); // NOI18N
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }});
        jMenu7.add(jMenuItem31);
        jMenuItem32.setText("350%");
        jMenuItem32.setName("jMenuItem32"); // NOI18N
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }});
        jMenu7.add(jMenuItem32);
        jMenuItem33.setText("400%");
        jMenuItem33.setName("jMenuItem33"); // NOI18N
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }});
        jMenu7.add(jMenuItem33);
        jMenu4.add(jMenu7);
        jMenu6.setText("ZoomOut");
        jMenu6.setName("jMenu6"); // NOI18N
        jMenuItem25.setText("200%");
        jMenuItem25.setName("jMenuItem25"); // NOI18N
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }});
        jMenu6.add(jMenuItem25);
        jMenuItem27.setText("150%");
        jMenuItem27.setName("jMenuItem27"); // NOI18N
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }});
        jMenu6.add(jMenuItem27);
        jMenuItem28.setText("100%");
        jMenuItem28.setName("jMenuItem28"); // NOI18N
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }});
        jMenu6.add(jMenuItem28);
        jMenuItem29.setText("50%");
        jMenuItem29.setName("jMenuItem29"); // NOI18N
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }});
        jMenu6.add(jMenuItem29);
        jMenu4.add(jMenu6);
        jMenuItem34.setText("Central Crop");
        jMenuItem34.setName("jMenuItem34"); // NOI18N
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }});
        jMenu4.add(jMenuItem34);
        jMenuBar1.add(jMenu4);
        jMenu5.setText("About");
        jMenu5.setFont(new Font("Segoe UI", 1, 12));
        jMenu5.setName("jMenu5"); // NOI18N
        jMenuItem8.setText("Help");
        jMenuItem8.setName("jMenuItem8"); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }});
        jMenu5.add(jMenuItem8);
        jMenuItem10.setText("About");
        jMenuItem10.setName("jMenuItem10"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }});
        jMenu5.add(jMenuItem10);
        jMenuBar1.add(jMenu5);
        setJMenuBar(jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE));
        pack();
    }// </editor-fold>                        
    private void jMenuItem1ActionPerformed(ActionEvent evt) {                                           
       JFileChooser jfcOpen = new JFileChooser("C:\\");
         jfcOpen.showOpenDialog(this);
         File input = jfcOpen.getSelectedFile();
         //ImageIcon img;
         try
         {
             image=ImageIO.read(input);
             image1=ImageIO.read(input);
             image2=ImageIO.read(input);
         }
         catch(IOException e1)
         {
             e1.printStackTrace();
         }
         jLabel1.setIcon(new ImageIcon(image.getScaledInstance( -1, -1, BufferedImage.SCALE_DEFAULT)));
          repaint();
          jScrollPane1.getViewport().add(jLabel1);
          repaint();
        // TODO add your handling code here:
    }                                          
    private void jMenuItem3ActionPerformed(ActionEvent evt) {                                           
        System.exit(0);
        // TODO add your handling code here:
    }                                          
    private void jMenuItem4ActionPerformed(ActionEvent evt) {                                           
         image=image1;
        jLabel1.setIcon(new ImageIcon(image1.getScaledInstance( -1, -1, BufferedImage.SCALE_DEFAULT)));
          repaint();
          jScrollPane1.getViewport().add(jLabel1);
          repaint();
        //reset TODO add your handling code here:
    }                                          
    private void jMenuItem2ActionPerformed(ActionEvent evt) {                                           
         BufferedImage bi =image;
         JFileChooser jfcSave = new JFileChooser("c:\\");
         jfcSave.showSaveDialog(this);//getMyImage(image); // retrieve image
         File outputfile = jfcSave.getSelectedFile();
        try
         {
             ImageIO.write(bi,"jpg",outputfile);
         }
         catch(IOException e1)
         {
             e1.printStackTrace();
         }
        //save TODO add your handling code here:
    }                                          
    private void jMenu4ActionPerformed(ActionEvent evt) {                                       
        currentAction='I';
        //setMenuItemEnabled(false);
        previewImage = scaleImage(imageWorkQueue[nextImageIndex(0)],50,60);
        displayImage(previewImage);
        //scaling TODO add your handling code here:
}                                      
    private void jMenuItem7ActionPerformed(ActionEvent evt) {                                           
        currentAction='I';
        //setMenuItemEnabled(false);
        previewImage = flipHorizontal(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
}                                          
    private void jMenuItem6ActionPerformed(ActionEvent evt) {                                           
        currentAction='I';
        //setMenuItemEnabled(false);
        previewImage = flipVertical(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
}                                          
    private void jMenuItem11ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = flip180deg(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;// TODO add your handling code here:
    }                                           
    private void jMenuItem13ActionPerformed(ActionEvent evt) {                                            
      currentAction='I';
        previewImage = HorizontalStrech(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem15ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = VerticalStrech(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jSlider1StateChanged(ChangeEvent evt) {                                      
       int SliderValueDifference = ((JSlider)evt.getSource()).getValue() - mainSliderPrevValue;
        previewImage = imageWorkQueue[nextImageIndex(0)];
        previewImage =image;
        switch(currentAction)
        {
            case 'B': // Brightness
                if(SliderValueDifference > 0)
                {
                    for(int i=0; i < SliderValueDifference; i++)
                    {
                        previewImage = brightenImage(previewImage);
                    }
                }
                else if(SliderValueDifference < 0)
                {
                    for(int i=SliderValueDifference; i < 0; i++)
                    {
                        previewImage = darkenImage(previewImage);
                    }
                }
                break;
        }
        displayImage(previewImage);
        mainSliderPrevValue = ((JSlider)evt.getSource()).getValue();
        // TODO add your handling code here:
    }                                     
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        jSlider1.setEnabled(false);
        if(currentAction != ' ')
        {
            jSlider1.setEnabled(false);
        }
        currentAction = ' ';
        // save current change to history
        imageWorkQueue[nextImageIndex(1)] = previewImage;
        image=previewImage;
        //Apply button action performed
        // TODO add your handling code here:
    }                                        
    private void jMenuItem25ActionPerformed(ActionEvent evt) {                                            
       currentAction='I';
        previewImage = nezoom200(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem29ActionPerformed(ActionEvent evt) {                                            
       currentAction='I';
        previewImage = nezoom50(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem28ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = nezoom100(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem27ActionPerformed(ActionEvent evt) {                                            
       currentAction='I';
        previewImage = nezoom150(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem30ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = pezoom250(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem31ActionPerformed(ActionEvent evt) {                                            
       currentAction='I';
        previewImage = pezoom300(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem32ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = pezoom350(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem33ActionPerformed(ActionEvent evt) {                                            
       currentAction='I';
        previewImage = pezoom400(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem34ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        //setMenuItemEnabled(false);
        previewImage = crop(imageWorkQueue[nextImageIndex(0)],50,60);
        displayImage(previewImage);
        // TODO add your handling code here:
    }                                           
    private void jMenuItem24ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = flip45deg(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem26ActionPerformed(ActionEvent evt) {                                            
        currentAction='I';
        previewImage = Shear(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
    }                                           
    private void jMenuItem8ActionPerformed(ActionEvent evt) {                                           
        jScrollPane1.setVisible(false);
        jLabel1.setVisible(false);
        jPanel1.setVisible(false);
        hp();
        // TODO add your handling code here:
    }                                          
    private void jMenuItem10ActionPerformed(ActionEvent evt) {                                            
        jScrollPane1.setVisible(false);
        jLabel1.setVisible(false);
        jPanel1.setVisible(false);
        ab();
        // TODO add your handling code here:
    }                                           
    private void jMenu3ActionPerformed(ActionEvent evt) {                                       
        // TODO add your handling code here:
}                                      
    private void jMenuItem23ActionPerformed(ActionEvent evt) {                                            
        currentAction='b';
        //setMenuItemEnabled(false);
        previewImage = Custom(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        image=image2;
        // TODO add your handling code here:
}                                           
    private void jMenuItem16ActionPerformed(ActionEvent evt) {                                            
        currentAction='S';
        //setMenuItemEnabled(false);
        previewImage = Sharpen(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
}                                           
    private void jMenuItem18ActionPerformed(ActionEvent evt) {                                            
        BufferedImage img = image;
        Color col;
        for (int x = 0; x < img.getWidth(); x++) { //width
            for (int y = 0; y < img.getHeight(); y++) { //height
                int RGBA = img.getRGB(x, y); //gets RGBA data for the specific pixel
                col = new Color(RGBA, true); //get the color data of the specific pixel
                col = new Color(1,1,Math.abs(col.getBlue() - 255)); //Swaps values
                img.setRGB(x, y, col.getRGB()); //set the pixel to the altered colors
            }
        }
        Graphics2D gg = img.createGraphics();
        gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
        image=img;
        repaint();

        // TODO add your handling code here:
}                                           
    private void jMenuItem20ActionPerformed(ActionEvent evt) {                                            
        currentAction='b';
        //setMenuItemEnabled(false);
        previewImage = Blur(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        image=image2;
        // TODO add your handling code here:
}                                           
    private void jMenuItem17ActionPerformed(ActionEvent evt) {                                            
        BufferedImage img = image;
        Color col;
        for (int x = 0; x < img.getWidth(); x++) { //width
            for (int y = 0; y < img.getHeight(); y++) { //height
                int RGBA = img.getRGB(x, y); //gets RGBA data for the specific pixel
                col = new Color(RGBA, true); //get the color data of the specific pixel
                col = new Color(1,Math.abs(col.getGreen() - 255),1); //Swaps values
                img.setRGB(x, y, col.getRGB()); //set the pixel to the altered colors
            }
        }
        Graphics2D gg = img.createGraphics();
        gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance( -1, -1, BufferedImage.SCALE_DEFAULT)));
        image=img;
        repaint();
        // TODO add your handling code here:
}                                           
    private void jMenuItem19ActionPerformed(ActionEvent evt) {                                            
        jSlider1.setEnabled(true);
        setMainSliderValues(0,10,20);
        currentAction = 'B';
        //Brightness
        // TODO add your handling code here:
}                                           
    private void jMenuItem14ActionPerformed(ActionEvent evt) {                                            
        BufferedImage img = image;
        Color col;
        for (int x = 0; x < img.getWidth(); x++) { //width
            for (int y = 0; y < img.getHeight(); y++) { //height
                int RGBA = img.getRGB(x, y); //gets RGBA data for the specific pixel
                col = new Color(RGBA, true); //get the color data of the specific pixel
                col = new Color(Math.abs(col.getRed() - 255),1,1); //Swaps values
                img.setRGB(x, y, col.getRGB()); //set the pixel to the altered colors
            }
        }
        Graphics2D gg = img.createGraphics();
        gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance( -1, -1, BufferedImage.SCALE_DEFAULT)));
        image=img;
        repaint();
        // TODO add your handling code here:
}                                           
    private void jMenuItem21ActionPerformed(ActionEvent evt) {                                            
        currentAction='b';
        //setMenuItemEnabled(false);
        previewImage = EdgeDetect(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        image=image2;
        // TODO add your handling code here:
}                                           
    private void jMenuItem5ActionPerformed(ActionEvent evt) {                                           
        // double image_width = jLabel1.getWidth();
        //double image_height = jLabel1.getHeight();
        //BufferedImage bimg = null;
        BufferedImage img = image;
        Color col;
        for (int x = 0; x < img.getWidth(); x++) { //width
            for (int y = 0; y < img.getHeight(); y++) { //height
                int RGBA = img.getRGB(x, y); //gets RGBA data for the specific pixel
                col = new Color(RGBA, true); //get the color data of the specific pixel
                col = new Color(Math.abs(col.getRed() - 255),
                        Math.abs(col.getGreen() - 255), Math.abs(col.getBlue() - 255)); //Swaps values
                img.setRGB(x, y, col.getRGB()); //set the pixel to the altered colors
            }
        }
        Graphics2D gg = img.createGraphics();
        gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance( -1, -1, BufferedImage.SCALE_DEFAULT)));
        repaint();
        // TODO add your handling code here:
}                                          
    private void jMenuItem9ActionPerformed(ActionEvent evt) {                                           
        currentAction='I';
        //setMenuItemEnabled(false);
        previewImage = grayImage(imageWorkQueue[nextImageIndex(0)]);
        displayImage(previewImage);
        image=previewImage;
        // TODO add your handling code here:
}                                          
    private void hp()
    {
         jPanel50 = new JPanel();
        jLabel50 = new JLabel();
        jLabel51 = new JLabel();
        jLabel52 = new JLabel();
        jLabel53 = new JLabel();
        jLabel54 = new JLabel();
        jLabel56 = new JLabel();
        jLabel57 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea50 = new JTextArea();
        jButton50 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel50.setBackground(new Color(235, 250, 18));
        jPanel50.setName("jPanel50"); // NOI18N
        jLabel50.setIcon(new ImageIcon("C:\\Users\\Cyclops\\Pictures\\digital_image_processing.jpg")); // NOI18N
        jLabel50.setText("Welcome to the Help section!");
        jLabel50.setName("jLabel50"); // NOI18N
        jLabel51.setFont(new Font("Berlin Sans FB", 3, 11)); // NOI18N
        jLabel51.setText("Control ShortCuts");
        jLabel51.setName("jLabel51"); // NOI18N
        jLabel52.setText("Loading an image : Ctrl+O");
        jLabel52.setName("jLabel52"); // NOI18N
        jLabel53.setText("Exit : Ctrl+E");
        jLabel53.setName("jLabel53"); // NOI18N
        jLabel54.setText("For saving : Ctrl+S");
        jLabel54.setName("jLabel54"); // NOI18N
        jLabel56.setText("PRODUCT CENTRE");
        jLabel56.setName("jLabel56"); // NOI18N
        jLabel57.setText("CMC,Preet Vihar");
        jLabel57.setName("jLabel57"); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N
        jTextArea50.setColumns(20);
        jTextArea50.setRows(5);
        jTextArea50.setText("Notes Here");
        jTextArea50.setName("jTextArea50"); // NOI18N
        jScrollPane1.setViewportView(jTextArea50);
        jButton50.setText("BACK");
        jButton50.setName("jButton50"); // NOI18N
        jButton50.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }});
        GroupLayout jPanel50Layout = new GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()                .addGroup(jPanel50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56))
                .addGap(949, 949, 949))
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 787, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
            .addComponent(jLabel50, GroupLayout.PREFERRED_SIZE, 925, GroupLayout.PREFERRED_SIZE)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()                .addGroup(jPanel50Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jButton50)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 610, Short.MAX_VALUE)
                        .addComponent(jLabel51))
                    .addComponent(jLabel52))
                .addGap(287, 287, 287)));
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel50, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)                .addGroup(jPanel50Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addComponent(jButton50))
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGap(17, 17, 17)));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel50, GroupLayout.PREFERRED_SIZE, 925, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE)));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel50, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }
    private void jButton50ActionPerformed(ActionEvent evt) {
        jPanel50.setVisible(false);
        initComponents();
        // TODO add your handling code here:
    }
   private void ab() {
        jPanel30 = new JPanel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jLabel37 = new JLabel();
        jLabel38 = new JLabel();
        jLabel39 = new JLabel();
        jLabel40 = new JLabel();
        jLabel41 = new JLabel();
        jLabel42 = new JLabel();
        jScrollPane30 = new JScrollPane();
        jTextArea30 = new JTextArea();
        jLabel43 = new JLabel();
        jButton30 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel30.setBackground(new Color(235, 250, 18));
        jPanel30.setForeground(new Color(68, 251, 36));
        jPanel30.setName("jPanel30"); // NOI18N
        jLabel32.setIcon(new ImageIcon("C:\\Users\\Cyclops\\Pictures\\digital_image_processing.jpg")); // NOI18N
        jLabel32.setText("Welcome to the About section");
        jLabel32.setName("jLabel32"); // NOI18N
        jLabel33.setText("Product Id : Digital Image Processing 1.0");
        jLabel33.setName("jLabel33"); // NOI18N
        jLabel34.setText("Product Version: PhotoMania 1.0");
        jLabel34.setName("jLabel34"); // NOI18N
        jLabel35.setText("License Type : Free");
        jLabel35.setName("jLabel35"); // NOI18N
        jLabel36.setText("Developers  : ");
        jLabel36.setName("jLabel36"); // NOI18N
        jLabel37.setText("Anurag Upadhyaya");
        jLabel37.setName("jLabel37"); // NOI18N
        jLabel38.setText("Ekas Preet Singh");
        jLabel38.setName("jLabel38"); // NOI18N
        jLabel39.setText("Puneet");
        jLabel41.setText("Developing Centre:");
        jLabel41.setName("jLabel41"); // NOI18N
        jLabel42.setText("CMC,Preet Vihar");
        jLabel42.setName("jLabel42"); // NOI18N
        jScrollPane30.setName("jScrollPane30"); // NOI18N
        jTextArea30.setColumns(20);
        jTextArea30.setRows(5);
        jTextArea30.setText("It is a desktop based application.This project aims at creating various\neffects for processing an image of any format such as .jpg, .gif etc. \nOur objective is to give a clear outlook about the various operations \nor effects that can give to an image to change its original look. We \nselect this topic as our project by acquiring motivations from various \nexisting software’s such as Windows Picture Management likewise.We use \njava net beans as a supporting software while commencing this project.The pixel grabber function in java helps\nto grab each image into its pixel level.");
        jTextArea30.setName("jTextArea30"); // NOI18N
        jScrollPane30.setViewportView(jTextArea30);
        jLabel43.setBackground(new Color(255, 255, 51));
        jLabel43.setForeground(new Color(255, 0, 51));
        jLabel43.setText("    ABOUT");
        jLabel43.setBorder(BorderFactory.createCompoundBorder());
        jLabel43.setName("jLabel43"); // NOI18N
        jButton30.setText("BACK");
        jButton30.setName("jButton30"); // NOI18N
        jButton30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }});
        GroupLayout jPanel30Layout = new GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()                .addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 1039, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel35))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(374, 374, 374)        .addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createSequentialGroup()                               .addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel36))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)                                .addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)))))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel43, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jScrollPane30, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton30))
                .addContainerGap(160, Short.MAX_VALUE)));
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jButton30)
                .addGap(17, 17, 17)
                .addComponent(jLabel33)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }
    private void jButton30ActionPerformed(ActionEvent evt) {
        jPanel30.setVisible(false);
        initComponents();
        // TODO add your handling code here:
}   
public BufferedImage shear(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getShearInstance(3.2,3.2);
        tx.translate(1.2,1.2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }

    public BufferedImage crop(BufferedImage img, int scalex, int scaley)
    {
    img=image2;
        AffineTransform tx = new AffineTransform();
        tx.scale(1.5,1.5);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        float data[] = {0.10f, 0.10f, 0.10f,0.10f, 0.20f, 0.10f,0.10f, 0.10f, 0.10f };
     Kernel kernel = new Kernel(3, 3, data);
      ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    //image=image1;
    return image2;
    }
    public BufferedImage pezoom400(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(1.2, 1.2);
        tx.translate(1.2, 1.2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage pezoom350(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(1.2, 1.2);
        tx.translate(1.2, 1.2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage pezoom250(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(1.2, 1.2);
        tx.translate(1.2, 1.2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage pezoom300(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(1.4, 1.4);
        tx.translate(1.4, 1.4);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage nezoom200(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(0.8, 0.8);
        tx.translate(0.8,0.8);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
        public BufferedImage nezoom150(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(0.6, 0.6);
        tx.translate(0.6,0.6);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage nezoom100(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(0.4, 0.4);
        tx.translate(0.4,0.4);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }    
    public BufferedImage nezoom50(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(0.2, 0.2);
        tx.translate(0.2,0.2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage ef(BufferedImage img)
    {
       img=image;
    float data[] = {0.0f, -1.0f,0.0f, -1.0f,4.f,1.0f,0.0f, -1.0f,0.0f};
     Kernel kernel = new Kernel(3, 3, data);
      ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    return image2;
    }
    public BufferedImage Custom(BufferedImage img)
    {
       img=image;
        float data[] = { 0.5f, 0.5f, 0.5f, 0.5f,0.5f, 0.5f,0.5f, 0.5f, 0.5f };
       
        Kernel kernel = new Kernel(3, 3, data);
        ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    return image2;
    }
    public BufferedImage EdgeDetect(BufferedImage img)
    {
        img = image;
        float data[] = { 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f,
        -1.0f };

    Kernel kernel = new Kernel(3, 3, data);
    ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    //image=image1;
    return image2;
    }
    public BufferedImage Sharpen(BufferedImage img)
    {
        img = image;
        float data[] = { -1.0f, -1.0f, -1.0f, -1.0f, 9.0f, -1.0f, -1.0f, -1.0f,
        -1.0f };
    Kernel kernel = new Kernel(3, 3, data);
    ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    //image=image1;
    return image2;
    }
    public BufferedImage Blur(BufferedImage img)
    {
       img=image;
        float data[] = { 0.0625f, 0.125f, 0.0625f, 0.125f,0.25f, 0.125f,
        0.0625f, 0.125f, 0.0625f };
        Kernel kernel = new Kernel(3, 3, data);
        ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,
        null);
    convolve.filter(img, image2);
    return image2;
    }
    private void  setMainSliderValues(int min, int value, int max)
    {
        jSlider1.setMinimum(min);
        jSlider1.setValue(value);
        jSlider1.setMaximum(max);
        mainSliderPrevValue = value;
    }
     public BufferedImage brightenImage(BufferedImage img)
    {
        for (int x = 0; x < img.getWidth(); x++)
        { //width
            for (int y = 0; y < img.getHeight(); y++)
            { //height
                Color color = new Color(img.getRGB(x, y));
                Color brighter = color.brighter();
                img.setRGB(x, y, brighter.getRGB());
            }
        }
        return img;
    }
    // Decrease brightness
    public BufferedImage darkenImage(BufferedImage img)
    {
        for (int x = 0; x < img.getWidth(); x++)
        {
            for (int y = 0; y < img.getHeight(); y++)
            {
                Color color = new Color(img.getRGB(x, y));
                Color brighter = color.darker();
                img.setRGB(x, y, brighter.getRGB());
            }
        }
        return img;
    }
    public BufferedImage grayImage(BufferedImage img)
    {
         img = image;
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ColorConvertOp op = new ColorConvertOp(cs, null);
        img = op.filter(img, null);
        return img;
    }
     public BufferedImage scaleImage(BufferedImage img, int scalex, int scaley)
    {
        AffineTransform tx = new AffineTransform();
        tx.scale(scalex, scaley);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        img = op.filter(img, null);
        return img;
    }
     public BufferedImage Image(BufferedImage img, int scalex, int scaley)
    {
        AffineTransform tx = new AffineTransform();
        tx.scale(scalex, scaley);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        img = op.filter(img, null);
        return img;
    }
    public BufferedImage loadImage(String url)
    {
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage();
        // Create empty BufferedImage, sized to Image
        BufferedImage buffImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Draw Image into BufferedImage
        Graphics g = buffImage.getGraphics();
        g.drawImage(img, 0, 0, null);
        return buffImage;
    }
    //Display a Buffered Image on Jlabel
    public void displayImage(BufferedImage img)
    {
        Graphics2D gg = img.createGraphics();
        gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
        repaint();
        image=img;
    }
   public BufferedImage flipVertical(BufferedImage img)
    {
        img = image;
        AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
        tx.translate(0, -img.getHeight(null));
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage flipHorizontal(BufferedImage img)
    {
       img = image;
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-img.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage flip180deg(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(-1, -1);
        tx.translate(-img.getWidth(null),-img.getHeight(null));
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage flip45deg(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getRotateInstance(1,0.2);
        tx.translate(80,10);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage Shear(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getShearInstance(1,0.1);
        tx.translate(80,10);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage HorizontalStrech(BufferedImage img)
    {
       img = image;
        AffineTransform tx = AffineTransform.getScaleInstance(-3, 1);
        tx.translate(-img.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage VerticalStrech(BufferedImage img)
    {
       img = image;
        AffineTransform tx = AffineTransform.getScaleInstance(1, 3);
        tx.translate(0,0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public BufferedImage zoomin(BufferedImage img)
    {
        img=image;
        AffineTransform tx = AffineTransform.getScaleInstance(-2, 2);
        tx.translate(-img.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);
        return img;
    }
   public int nextImageIndex(int i)
    {
        if(imageWorkQueue.length < HISTORY_SIZE)
        {
            currentImageIndex+=i;
        }
        else if(currentImageIndex == HISTORY_SIZE-1)
        {
            currentImageIndex = 0;
            isHistoryFull=true;
        }
        else
        {
            currentImageIndex+=i;
            isHistoryFull=true;
        }
        return currentImageIndex;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhotoMania().setVisible(true);
            }});
    }
    // Variables declaration - do not modify                     
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenu jMenu7;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem10;
    private JMenuItem jMenuItem11;
    private JMenuItem jMenuItem13;
    private JMenuItem jMenuItem14;
    private JMenuItem jMenuItem15;
    private JMenuItem jMenuItem16;
    private JMenuItem jMenuItem17;
    private JMenuItem jMenuItem18;
    private JMenuItem jMenuItem19;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem20;
    private JMenuItem jMenuItem21;
    private JMenuItem jMenuItem23;
    private JMenuItem jMenuItem24;
    private JMenuItem jMenuItem25;
    private JMenuItem jMenuItem26;
    private JMenuItem jMenuItem27;
    private JMenuItem jMenuItem28;
    private JMenuItem jMenuItem29;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem30;
    private JMenuItem jMenuItem31;
    private JMenuItem jMenuItem32;
    private JMenuItem jMenuItem33;
    private JMenuItem jMenuItem34;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JMenuItem jMenuItem8;
    private JMenuItem jMenuItem9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JSlider jSlider1;
    // End of variables declaration                   
     private JLabel l6;
    private JPanel p1;
    private JButton b2;
    BufferedImage image=null;
    BufferedImage image1=null;
    BufferedImage image2=null;
    BufferedImage originalImage = null;
    BufferedImage previewImage = null;
    BufferedImage[] imageWorkQueue = new BufferedImage[30];
    private JButton jButton30;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JPanel jPanel30;
    private JScrollPane jScrollPane30;
    private JTextArea jTextArea30;
    private JButton jButton50;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JPanel jPanel50;
    private JScrollPane jScrollPane50;
    private JTextArea jTextArea50;
     private JButton jButton60;
    private JPanel jPanel60;

}

