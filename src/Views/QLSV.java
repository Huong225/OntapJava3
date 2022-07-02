/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Student;
import Services.GradeDAO;
import Services.SvienDAO;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huong
 */
public class QLSV extends javax.swing.JFrame {

    /**
     * Creates new form QLSV
     */
    private Connection conn;
    private SvienDAO svienDAO;
    private DefaultTableModel model;
    private ArrayList<Student> listSV;
    private GradeDAO grade;
    String imageSV = null;
    int vitri = 0;

    public QLSV() {
        initComponents();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao;user=sa;password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.svienDAO = new SvienDAO();
        this.grade = new GradeDAO();
        this.model = (DefaultTableModel) tblSV.getModel();
        this.listSV = this.svienDAO.getListStudent();

        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        lblQLSV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        pnlImg = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();
        mnSystem = new javax.swing.JMenu();
        mniAboutUs = new javax.swing.JMenuItem();
        mniHelp = new javax.swing.JMenuItem();
        mnColor = new javax.swing.JMenu();
        mnItemRed = new javax.swing.JRadioButtonMenuItem();
        mnItemYellow = new javax.swing.JRadioButtonMenuItem();
        mnItemGreen = new javax.swing.JRadioButtonMenuItem();
        mnItemWhite = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        txtColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQLSV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQLSV.setForeground(new java.awt.Color(0, 0, 204));
        lblQLSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLSV.setText("QUẢN LÍ SINH VIÊN");

        jLabel2.setText("MÃ SV");

        jLabel3.setText("HỌ TÊN");

        jLabel4.setText("EMAIL");

        jLabel5.setText("SĐT");

        jLabel6.setText("GIỚI TÍNH");

        jLabel7.setText("ĐỊA CHỈ");

        buttonGroup1.add(rdbNam);
        rdbNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setText("Nữ");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        pnlImg.setBackground(new java.awt.Color(255, 255, 255));
        pnlImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlImg.setPreferredSize(new java.awt.Dimension(135, 153));
        pnlImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlImgMouseClicked(evt);
            }
        });

        lblImg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblImg.setMaximumSize(new java.awt.Dimension(0, 0));
        lblImg.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImg.setPreferredSize(new java.awt.Dimension(0, 0));
        lblImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlImgLayout = new javax.swing.GroupLayout(pnlImg);
        pnlImg.setLayout(pnlImgLayout);
        pnlImgLayout.setHorizontalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        pnlImgLayout.setVerticalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/new.png"))); // NOI18N
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/update.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "SĐT", "Giới tính", "Địa chỉ", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(35, 35, 35)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(rdbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPhone)
                                    .addComponent(txtEmail)
                                    .addComponent(txtName)
                                    .addComponent(txtMaSV)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(lblQLSV, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblQLSV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdbNam)
                    .addComponent(rdbNu))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnSave))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))))
                .addGap(18, 18, 18)
                .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        mnFile.setText("File");

        mniNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/new.png"))); // NOI18N
        mniNew.setText("New");
        mniNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        mnFile.add(mniNew);

        mniOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/open.png"))); // NOI18N
        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnFile.add(mniOpen);

        mniSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/save.png"))); // NOI18N
        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnFile.add(mniSave);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/exit.png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnFile.add(mniExit);

        MenuBar.add(mnFile);

        mnSystem.setText("System");

        mniAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/User.png"))); // NOI18N
        mniAboutUs.setText("About Us");
        mniAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutUsActionPerformed(evt);
            }
        });
        mnSystem.add(mniAboutUs);

        mniHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icon/Comment.png"))); // NOI18N
        mniHelp.setText("Help");
        mnSystem.add(mniHelp);

        MenuBar.add(mnSystem);

        mnColor.setText("Color");

        buttonGroup2.add(mnItemRed);
        mnItemRed.setSelected(true);
        mnItemRed.setText("Red");
        mnItemRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemRedActionPerformed(evt);
            }
        });
        mnColor.add(mnItemRed);

        buttonGroup2.add(mnItemYellow);
        mnItemYellow.setText("Yellow");
        mnItemYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemYellowActionPerformed(evt);
            }
        });
        mnColor.add(mnItemYellow);

        buttonGroup2.add(mnItemGreen);
        mnItemGreen.setText("Green");
        mnItemGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemGreenActionPerformed(evt);
            }
        });
        mnColor.add(mnItemGreen);

        buttonGroup2.add(mnItemWhite);
        mnItemWhite.setText("White");
        mnItemWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemWhiteActionPerformed(evt);
            }
        });
        mnColor.add(mnItemWhite);
        mnColor.add(jSeparator1);

        txtColor.setText("Text Color");
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        mnColor.add(txtColor);

        MenuBar.add(mnColor);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        addStudent();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        vitri = tblSV.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn hàng để xóa!");
            return;
        } else if (grade.getSearch(txtMaSV.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "Sinh viên đã có điểm vui lòng không xoá");
            return;
        } else {
            svienDAO.delete(txtMaSV.getText());
            listSV.remove(vitri);
            fillTable();
            clearForm();
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_mniNewActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        // TODO add your handling code here:
        addStudent();
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát hay không?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ret == JOptionPane.YES_OPTION) {
            Login logout = new Login();
            logout.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutUsActionPerformed
        // TODO add your handling code here:
        showAboutUs();
    }//GEN-LAST:event_mniAboutUsActionPerformed

    private void mnItemRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemRedActionPerformed
        // TODO add your handling code here:
        pnlMain.setBackground(Color.red);
    }//GEN-LAST:event_mnItemRedActionPerformed

    private void mnItemYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemYellowActionPerformed
        // TODO add your handling code here:
        pnlMain.setBackground(Color.yellow);
    }//GEN-LAST:event_mnItemYellowActionPerformed

    private void mnItemGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemGreenActionPerformed
        // TODO add your handling code here:
        pnlMain.setBackground(Color.green);
    }//GEN-LAST:event_mnItemGreenActionPerformed

    private void mnItemWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemWhiteActionPerformed
        // TODO add your handling code here:
        pnlMain.setBackground(Color.white);
    }//GEN-LAST:event_mnItemWhiteActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
        Color c = JColorChooser.showDialog(null, "Chọn màu", Color.white);
        lblQLSV.setForeground(c);
    }//GEN-LAST:event_txtColorActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        // TODO add your handling code here:
        try {
            vitri = tblSV.getSelectedRow();
            display(vitri);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void pnlImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImgMouseClicked
    }//GEN-LAST:event_pnlImgMouseClicked

    private void lblImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgMouseClicked
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser("C:\\Users\\Huong\\OneDrive\\Documents\\NetBeansProjects\\AssignmentJava3_huongltph17591\\src\\Views\\image\\");
        int kq = file.showOpenDialog(file);
        if (kq == JFileChooser.APPROVE_OPTION) {
            imageSV = file.getSelectedFile().getName();
            upImg(imageSV);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh...");
        }
    }//GEN-LAST:event_lblImgMouseClicked

    private boolean checkTrung() {
        for (Student x : this.listSV) {
            if (x.getMaSV().equals(this.txtMaSV.getText())) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại");
                this.txtMaSV.requestFocus();
                return false;
            }
        }
        return true;
    }

    public void clearForm() {
        txtMaSV.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        buttonGroup1.clearSelection();
        txtAddress.setText("");
        lblImg.setIcon(null);
    }

    public boolean checkForm() {
        if (txtMaSV.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mời nhập mã sinh viên!");
            txtMaSV.requestFocus();
            return false;
        } else if (txtName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mời nhập tên sinh viên!");
            txtName.requestFocus();
            return false;
        } else if (txtEmail.getText().trim().length() == 0 && !(txtEmail.getText()).matches("^\\w+@\\w+\\.(\\w)+$")) {
            JOptionPane.showMessageDialog(this, "Mời nhập đúng định dạng email!");
            txtEmail.requestFocus();
            return false;
        } else if (txtPhone.getText().trim().length() <= 0 || txtPhone.getText().trim().length() > 10) {
            JOptionPane.showMessageDialog(this, "Mời nhập đúng định dạng số điện thoại!");
            txtPhone.requestFocus();
            return false;
        } else if (!rdbNam.isSelected() && !rdbNu.isSelected()) {
            JOptionPane.showMessageDialog(this, "Mời nhập giới tính!");
            return false;
        } else if (txtAddress.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mời nhập địa chỉ!");
            txtAddress.requestFocus();
            return false;
        } else if (lblImg.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Mời chọn ảnh!");
            return false;
        }
        return true;
    }

    public void upImg(String imageSV) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Huong\\OneDrive\\Documents\\NetBeansProjects\\AssignmentJava3_huongltph17591\\src\\Views\\image\\" + imageSV);
        Image image = icon.getImage();
        ImageIcon icon1 = new ImageIcon(image.getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), image.SCALE_SMOOTH));
        lblImg.setIcon(icon1);
    }

    public void addStudent() {
        if (checkForm() == true && checkTrung() == true) {
            Student sv = new Student();
            sv.setMaSV(txtMaSV.getText());
            sv.setName(txtName.getText());
            sv.setEmail(txtEmail.getText());
            sv.setPhone(txtPhone.getText());
            if (rdbNam.isSelected() == true) {
                sv.setGender("0");
            } else {
                sv.setGender("1");
            }
            sv.setAddress(txtAddress.getText());
            sv.setImg(imageSV);

            this.listSV.add(sv);
            this.svienDAO.InsertSV(sv);
            fillTable();
        }
    }

    public void fillTable() {
        model.setRowCount(0);
        for (Student x : listSV) {
            model.addRow(new Object[]{
                x.getMaSV(), x.getName(), x.getEmail(), x.getPhone(), x.getGender(), x.getAddress(), x.getImg()});
        }
    }

    public void display(int vitri) {
        if (vitri >= 0) {
            Student st = listSV.get(vitri);
            txtMaSV.setText(st.getMaSV());
            txtName.setText(st.getName());
            txtEmail.setText(st.getEmail());
            txtPhone.setText(st.getPhone());
            if (st.getGender().equalsIgnoreCase("0")) {
                rdbNam.setSelected(true);
            } else {
                rdbNu.setSelected(true);
            }
            txtAddress.setText(st.getAddress());
            upImg(st.getImg());
            tblSV.setRowSelectionInterval(vitri, vitri);
        }
    }

    public void updateStudent() {
        try {
            vitri = tblSV.getSelectedRow();
            if (vitri == -1) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng cần update");
            } else {
                listSV.remove(vitri);

                Student sv = new Student();
                sv.setMaSV(txtMaSV.getText());
                sv.setName(txtName.getText());
                sv.setEmail(txtEmail.getText());
                sv.setPhone(txtPhone.getText());
                if (rdbNam.isSelected() == true) {
                    sv.setGender("0");
                } else {
                    sv.setGender("1");
                }
                sv.setAddress(txtAddress.getText());
                sv.setImg(imageSV);

                listSV.add(sv);
                this.svienDAO.UpdateSV(sv);
                fillTable();
                JOptionPane.showMessageDialog(this, "Update thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void showAboutUs() {
        String str = "Sinh viên: Lê Thị Hương \n";
        str += "Ngày sinh: 22/05/2002 \n";
        str += "Trường: Cao đẳng FPT Polytechnic \n";
        str += "Chuyên ngành: Ứng dụng phần mềm";
        JOptionPane.showMessageDialog(null, str, "Giới thiệu", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblQLSV;
    private javax.swing.JMenu mnColor;
    private javax.swing.JMenu mnFile;
    private javax.swing.JRadioButtonMenuItem mnItemGreen;
    private javax.swing.JRadioButtonMenuItem mnItemRed;
    private javax.swing.JRadioButtonMenuItem mnItemWhite;
    private javax.swing.JRadioButtonMenuItem mnItemYellow;
    private javax.swing.JMenu mnSystem;
    private javax.swing.JMenuItem mniAboutUs;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniHelp;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JMenuItem txtColor;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
