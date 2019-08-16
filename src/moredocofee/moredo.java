/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moredocofee;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author John
 */
public class moredo extends javax.swing.JFrame {
 static final String server = "jdbc:mysql://localhost:3306/moredo";
    private PreparedStatement addempl = null;
    PreparedStatement pst = null;
    Connection con = null;
    ResultSet rs = null;
    byte[] rimage = null;
    public String employeeid = "";
    /**
     * Creates new form moredo
     */
    public moredo() {
        initComponents();
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
        jpLogin.setVisible(true);
        Find1.setVisible(false);
        jLabel9.setVisible(false);
        Findbtn.setVisible(false);
        Find.setVisible(false);
        jplist.setVisible(false);
        DBConnect();
    }

      private void DBConnect() {
        try {
            con = DriverManager.getConnection(
                    server, "root", ""
            );

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAddEmployee = new javax.swing.JPanel();
        btnAddEmployee = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        ind8 = new javax.swing.JPanel();
        ind7 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        ind6 = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        ind4 = new javax.swing.JPanel();
        txtAddress = new javax.swing.JTextField();
        ind3 = new javax.swing.JPanel();
        txtAge = new javax.swing.JTextField();
        ind2 = new javax.swing.JPanel();
        txtDatejoin = new javax.swing.JTextField();
        cbBlood = new javax.swing.JComboBox<>();
        cbGender = new javax.swing.JComboBox<>();
        cbdep = new javax.swing.JComboBox<>();
        jLabel162 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ind5 = new javax.swing.JPanel();
        txtsalary = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        ind9 = new javax.swing.JPanel();
        txteducation = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        cbemploye = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpLogin = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        txtUserPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpFindEmployee = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtSearchEmployee = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnFindEmployee = new javax.swing.JLabel();
        lbFnameFind = new javax.swing.JLabel();
        lbAgeFind = new javax.swing.JLabel();
        lbGenderFind = new javax.swing.JLabel();
        lbEmailFind = new javax.swing.JLabel();
        lbContactFind = new javax.swing.JLabel();
        lbAddressFind = new javax.swing.JLabel();
        lbQualifiFind = new javax.swing.JLabel();
        lbBloodFind = new javax.swing.JLabel();
        lbDateFind = new javax.swing.JLabel();
        txtFnameFind = new javax.swing.JLabel();
        txtAgeFind = new javax.swing.JLabel();
        txtGenderFind = new javax.swing.JLabel();
        txtEmailFind = new javax.swing.JLabel();
        txtContactFind = new javax.swing.JLabel();
        txtAddressFind = new javax.swing.JLabel();
        txtQualificationFind = new javax.swing.JLabel();
        txtBloodFind = new javax.swing.JLabel();
        txtDateFind = new javax.swing.JLabel();
        jfindphoto = new javax.swing.JLabel();
        lbphotofind = new javax.swing.JLabel();
        lbContactFind1 = new javax.swing.JLabel();
        txtsalaryfind = new javax.swing.JLabel();
        lbContactFind2 = new javax.swing.JLabel();
        txtlevelfind = new javax.swing.JLabel();
        lbContactFind3 = new javax.swing.JLabel();
        txttypefind = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteEmployee = new javax.swing.JLabel();
        lbContactFind4 = new javax.swing.JLabel();
        txtpermission = new javax.swing.JLabel();
        jpanelhome = new javax.swing.JPanel();
        Register = new javax.swing.JLabel();
        Find = new javax.swing.JLabel();
        Registerbtn = new javax.swing.JLabel();
        Findbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Find1 = new javax.swing.JLabel();
        jplist = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtblemployeetable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpAddEmployee.setBackground(new java.awt.Color(255, 255, 255));
        jpAddEmployee.setPreferredSize(new java.awt.Dimension(1094, 697));

        btnAddEmployee.setBackground(new java.awt.Color(111, 78, 55));
        btnAddEmployee.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddEmployee.setText("ADD");
        btnAddEmployee.setOpaque(true);
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(111, 78, 55));
        jLabel34.setText("ADD EMPLOYEE");

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(111, 78, 55));
        jLabel42.setText("Full Name");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(111, 78, 55));
        jLabel43.setText("Email");

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(111, 78, 55));
        jLabel44.setText("Contact Number");

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(111, 78, 55));
        jLabel45.setText("Departement");

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(111, 78, 55));
        jLabel46.setText("Address");

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(111, 78, 55));
        jLabel47.setText("Blood Group");

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(111, 78, 55));
        jLabel48.setText("Gender");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(111, 78, 55));
        jLabel49.setText("Age");

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(111, 78, 55));
        jLabel50.setText("Date of Joining");

        txtFname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFname.setBorder(null);
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        ind8.setBackground(new java.awt.Color(111, 78, 55));
        ind8.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind8Layout = new javax.swing.GroupLayout(ind8);
        ind8.setLayout(ind8Layout);
        ind8Layout.setHorizontalGroup(
            ind8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        ind8Layout.setVerticalGroup(
            ind8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        ind7.setBackground(new java.awt.Color(111, 78, 55));
        ind7.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind7Layout = new javax.swing.GroupLayout(ind7);
        ind7.setLayout(ind7Layout);
        ind7Layout.setHorizontalGroup(
            ind7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        ind7Layout.setVerticalGroup(
            ind7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setBorder(null);

        ind6.setBackground(new java.awt.Color(111, 78, 55));
        ind6.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind6Layout = new javax.swing.GroupLayout(ind6);
        ind6.setLayout(ind6Layout);
        ind6Layout.setHorizontalGroup(
            ind6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        ind6Layout.setVerticalGroup(
            ind6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtContact.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtContact.setBorder(null);

        ind4.setBackground(new java.awt.Color(111, 78, 55));
        ind4.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind4Layout = new javax.swing.GroupLayout(ind4);
        ind4.setLayout(ind4Layout);
        ind4Layout.setHorizontalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        ind4Layout.setVerticalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtAddress.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAddress.setBorder(null);

        ind3.setBackground(new java.awt.Color(111, 78, 55));
        ind3.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind3Layout = new javax.swing.GroupLayout(ind3);
        ind3.setLayout(ind3Layout);
        ind3Layout.setHorizontalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        ind3Layout.setVerticalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtAge.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAge.setBorder(null);

        ind2.setBackground(new java.awt.Color(111, 78, 55));
        ind2.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind2Layout = new javax.swing.GroupLayout(ind2);
        ind2.setLayout(ind2Layout);
        ind2Layout.setHorizontalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        ind2Layout.setVerticalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtDatejoin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDatejoin.setBorder(null);

        cbBlood.setBackground(new java.awt.Color(111, 78, 55));
        cbBlood.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cbBlood.setSelectedIndex(-1);

        cbGender.setBackground(new java.awt.Color(111, 78, 55));
        cbGender.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbGender.setSelectedIndex(-1);

        cbdep.setBackground(new java.awt.Color(111, 78, 55));
        cbdep.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbdep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head office", "Adminstrator", "Store manager", "Export room head", "Arival room head", "Reject room head", "Industrial manager" }));
        cbdep.setSelectedIndex(-1);
        cbdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdepActionPerformed(evt);
            }
        });

        jLabel162.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(111, 78, 55));
        jLabel162.setText("Upload Picture");

        jButton4.setBackground(new java.awt.Color(111, 78, 55));
        jButton4.setText("choose");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ind5.setBackground(new java.awt.Color(111, 78, 55));
        ind5.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind5Layout = new javax.swing.GroupLayout(ind5);
        ind5.setLayout(ind5Layout);
        ind5Layout.setHorizontalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        ind5Layout.setVerticalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtsalary.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsalary.setBorder(null);

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(111, 78, 55));
        jLabel51.setText("Salary");

        ind9.setBackground(new java.awt.Color(111, 78, 55));
        ind9.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout ind9Layout = new javax.swing.GroupLayout(ind9);
        ind9.setLayout(ind9Layout);
        ind9Layout.setHorizontalGroup(
            ind9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        ind9Layout.setVerticalGroup(
            ind9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txteducation.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txteducation.setBorder(null);

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(111, 78, 55));
        jLabel52.setText("Level of Education");

        cbemploye.setBackground(new java.awt.Color(111, 78, 55));
        cbemploye.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbemploye.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent", "Contrat" }));
        cbemploye.setSelectedIndex(-1);
        cbemploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbemployeActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(111, 78, 55));
        jLabel53.setText("Type of Employement");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/menu.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpAddEmployeeLayout = new javax.swing.GroupLayout(jpAddEmployee);
        jpAddEmployee.setLayout(jpAddEmployeeLayout);
        jpAddEmployeeLayout.setHorizontalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbdep, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ind5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ind4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120)
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel51)
                                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                                .addComponent(jLabel50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDatejoin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ind2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txteducation, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ind9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ind6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ind3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ind7, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                            .addComponent(txtEmail))
                                        .addGap(120, 120, 120))
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ind8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(103, 103, 103)))
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(182, 182, 182))))
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbemploye, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 287, Short.MAX_VALUE))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
        );
        jpAddEmployeeLayout.setVerticalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel34))
                .addGap(92, 92, 92)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(ind8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel42)))
                                    .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel48)))
                                .addGap(19, 19, 19)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel47)
                                                .addComponent(cbBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ind7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(ind6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel49)))
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(ind3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addComponent(txtDatejoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(ind2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel46)))))
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ind4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addGap(0, 0, 0)
                        .addComponent(ind5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(txteducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(ind9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbemploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel162)
                            .addComponent(jButton4)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(126, 126, 126)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jpAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 719));

        jpLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpLogin.setMinimumSize(new java.awt.Dimension(0, 0));
        jpLogin.setPreferredSize(new java.awt.Dimension(1094, 697));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(111, 78, 55));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password");

        txtUserId.setBackground(new java.awt.Color(111, 78, 55));
        txtUserId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUserId.setForeground(new java.awt.Color(204, 204, 204));
        txtUserId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserId.setBorder(null);
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        btnLogin.setBackground(new java.awt.Color(111, 78, 55));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        txtUserPass.setBackground(new java.awt.Color(111, 78, 55));
        txtUserPass.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUserPass.setForeground(new java.awt.Color(204, 204, 204));
        txtUserPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserPass.setBorder(null);
        txtUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPassActionPerformed(evt);
            }
        });

        jLabel6.setText("      © Moredocofe PLC");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(txtUserId)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(txtUserPass))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(42, 42, 42))
        );

        jpLogin.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 0, 600, 720));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/moredol.png"))); // NOI18N
        jpLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 585));

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 930, 719));

        jpFindEmployee.setBackground(new java.awt.Color(255, 255, 255));
        jpFindEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpFindEmployee.setPreferredSize(new java.awt.Dimension(1094, 697));
        jpFindEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpFindEmployeeMouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(111, 78, 55));
        jLabel35.setText("FIND EMPLOYEE");

        txtSearchEmployee.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSearchEmployee.setForeground(new java.awt.Color(111, 78, 55));
        txtSearchEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchEmployee.setText("Search By ID");
        txtSearchEmployee.setToolTipText("SEARCH");
        txtSearchEmployee.setBorder(null);
        txtSearchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchEmployeeMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(111, 78, 55));
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        btnFindEmployee.setBackground(new java.awt.Color(111, 78, 55));
        btnFindEmployee.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFindEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnFindEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFindEmployee.setText("Search");
        btnFindEmployee.setOpaque(true);
        btnFindEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFindEmployeeMouseEntered(evt);
            }
        });

        lbFnameFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbFnameFind.setForeground(new java.awt.Color(111, 78, 55));
        lbFnameFind.setText("Full Name");

        lbAgeFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbAgeFind.setForeground(new java.awt.Color(111, 78, 55));
        lbAgeFind.setText("Age");

        lbGenderFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbGenderFind.setForeground(new java.awt.Color(111, 78, 55));
        lbGenderFind.setText("Gender");

        lbEmailFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbEmailFind.setForeground(new java.awt.Color(111, 78, 55));
        lbEmailFind.setText("Email");

        lbContactFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbContactFind.setForeground(new java.awt.Color(111, 78, 55));
        lbContactFind.setText("Contact Number");

        lbAddressFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbAddressFind.setForeground(new java.awt.Color(111, 78, 55));
        lbAddressFind.setText("Address");

        lbQualifiFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbQualifiFind.setForeground(new java.awt.Color(111, 78, 55));
        lbQualifiFind.setText("Specification");

        lbBloodFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbBloodFind.setForeground(new java.awt.Color(111, 78, 55));
        lbBloodFind.setText("Blood Type");

        lbDateFind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbDateFind.setForeground(new java.awt.Color(111, 78, 55));
        lbDateFind.setText("Date of Joining");

        txtFnameFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFnameFind.setForeground(new java.awt.Color(102, 102, 102));
        txtFnameFind.setText("Yohannes yalew banjaw");
        txtFnameFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtAgeFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAgeFind.setForeground(new java.awt.Color(102, 102, 102));
        txtAgeFind.setText("52");
        txtAgeFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtGenderFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtGenderFind.setForeground(new java.awt.Color(102, 102, 102));
        txtGenderFind.setText("Male");
        txtGenderFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtEmailFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmailFind.setForeground(new java.awt.Color(102, 102, 102));
        txtEmailFind.setText("banjawjohn22@gmail.com");
        txtEmailFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtContactFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtContactFind.setForeground(new java.awt.Color(102, 102, 102));
        txtContactFind.setText("+251922864137");
        txtContactFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtAddressFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAddressFind.setForeground(new java.awt.Color(102, 102, 102));
        txtAddressFind.setText("Semit-st256");
        txtAddressFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtQualificationFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtQualificationFind.setForeground(new java.awt.Color(102, 102, 102));
        txtQualificationFind.setText("Doctor");
        txtQualificationFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtBloodFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBloodFind.setForeground(new java.awt.Color(102, 102, 102));
        txtBloodFind.setText("O+");
        txtBloodFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtDateFind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDateFind.setForeground(new java.awt.Color(102, 102, 102));
        txtDateFind.setText("12-12-2010");
        txtDateFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbphotofind.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbphotofind.setForeground(new java.awt.Color(111, 78, 55));
        lbphotofind.setText("Photo");

        lbContactFind1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbContactFind1.setForeground(new java.awt.Color(111, 78, 55));
        lbContactFind1.setText("Salary");

        txtsalaryfind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsalaryfind.setForeground(new java.awt.Color(102, 102, 102));
        txtsalaryfind.setText("+251922864137");
        txtsalaryfind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbContactFind2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbContactFind2.setForeground(new java.awt.Color(111, 78, 55));
        lbContactFind2.setText("Level of Education");

        txtlevelfind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtlevelfind.setForeground(new java.awt.Color(102, 102, 102));
        txtlevelfind.setText("+251922864137");
        txtlevelfind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbContactFind3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbContactFind3.setForeground(new java.awt.Color(111, 78, 55));
        lbContactFind3.setText("Type");

        txttypefind.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txttypefind.setForeground(new java.awt.Color(102, 102, 102));
        txttypefind.setText("+251922864137");
        txttypefind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/menu.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btnDeleteEmployee.setBackground(new java.awt.Color(111, 78, 55));
        btnDeleteEmployee.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteEmployee.setText("Delete");
        btnDeleteEmployee.setOpaque(true);
        btnDeleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEmployeeMouseClicked(evt);
            }
        });

        lbContactFind4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lbContactFind4.setForeground(new java.awt.Color(111, 78, 55));
        lbContactFind4.setText("No of permission Days left");

        txtpermission.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtpermission.setForeground(new java.awt.Color(102, 102, 102));
        txtpermission.setText("14");
        txtpermission.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFindEmployeeLayout = new javax.swing.GroupLayout(jpFindEmployee);
        jpFindEmployee.setLayout(jpFindEmployeeLayout);
        jpFindEmployeeLayout.setHorizontalGroup(
            jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbContactFind2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbContactFind1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbFnameFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbAgeFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbGenderFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbEmailFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbContactFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtContactFind, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtEmailFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtGenderFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtAgeFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtFnameFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtsalaryfind, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtlevelfind, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                        .addComponent(lbContactFind3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttypefind, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98)
                                .addComponent(lbAddressFind, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddressFind, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbDateFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbphotofind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                            .addGap(520, 520, 520)
                                            .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbQualifiFind, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbBloodFind, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFindEmployeeLayout.createSequentialGroup()
                                            .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(101, 101, 101)))
                                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                        .addComponent(lbContactFind4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpermission, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jfindphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBloodFind, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQualificationFind, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDateFind, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(10, 10, 10))
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                            .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                                .addComponent(txtSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                                .addGap(47, 47, 47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFindEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFindEmployeeLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(270, 270, 270)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFindEmployeeLayout.setVerticalGroup(
            jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFnameFind)
                    .addComponent(lbAddressFind)
                    .addComponent(txtFnameFind)
                    .addComponent(txtAddressFind))
                .addGap(22, 22, 22)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgeFind)
                    .addComponent(lbQualifiFind)
                    .addComponent(txtAgeFind)
                    .addComponent(txtQualificationFind))
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGenderFind)
                            .addComponent(lbBloodFind)
                            .addComponent(txtGenderFind)))
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtBloodFind)))
                .addGap(22, 22, 22)
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmailFind)
                            .addComponent(lbDateFind)
                            .addComponent(txtEmailFind))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFindEmployeeLayout.createSequentialGroup()
                        .addComponent(txtDateFind)
                        .addGap(18, 18, 18)))
                .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addComponent(jfindphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jpFindEmployeeLayout.createSequentialGroup()
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactFind)
                            .addComponent(txtContactFind)
                            .addComponent(lbphotofind))
                        .addGap(18, 18, 18)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactFind1)
                            .addComponent(txtsalaryfind))
                        .addGap(18, 18, 18)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactFind2)
                            .addComponent(txtlevelfind))
                        .addGap(18, 18, 18)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactFind3)
                            .addComponent(txttypefind, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpFindEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactFind4)
                            .addComponent(txtpermission, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        getContentPane().add(jpFindEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 930, 719));

        jpanelhome.setBackground(new java.awt.Color(255, 255, 255));

        Register.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Register.setText("Register Employee");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        Find.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Find.setText("Find Employees");
        Find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindMouseClicked(evt);
            }
        });

        Registerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/addemplo.png"))); // NOI18N
        Registerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterbtnMouseClicked(evt);
            }
        });

        Findbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/search.png"))); // NOI18N
        Findbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Findbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindbtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Employee Managment System");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 72)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/moredol.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/list.jpg"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        Find1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Find1.setText("List Employees");
        Find1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Find1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelhomeLayout = new javax.swing.GroupLayout(jpanelhome);
        jpanelhome.setLayout(jpanelhomeLayout);
        jpanelhomeLayout.setHorizontalGroup(
            jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelhomeLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(138, 138, 138)
                        .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                                .addComponent(Findbtn)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                                .addComponent(Find)
                                .addGap(70, 70, 70))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Find1)
                .addGap(382, 382, 382))
        );
        jpanelhomeLayout.setVerticalGroup(
            jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelhomeLayout.createSequentialGroup()
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Register))
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelhomeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Findbtn)
                                .addGap(27, 27, 27)
                                .addComponent(Find))
                            .addGroup(jpanelhomeLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)))))
                .addGap(26, 26, 26)
                .addComponent(Find1)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(jpanelhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 930, 720));

        jplist.setBackground(new java.awt.Color(255, 255, 255));

        jLabel127.setBackground(new java.awt.Color(255, 255, 255));
        jLabel127.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel127.setText("       List Of Employees");
        jLabel127.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jtblemployeetable.setAutoCreateRowSorter(true);
        jtblemployeetable.setBorder(new javax.swing.border.MatteBorder(null));
        jtblemployeetable.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtblemployeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Email", "Contact Number", "Departement", "Addres", "Blood Type", "Date of Joining", "Type", "Salary", "Education"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblemployeetable.setToolTipText("");
        jtblemployeetable.setDropMode(javax.swing.DropMode.ON);
        jtblemployeetable.setEditingColumn(0);
        jtblemployeetable.setEditingRow(0);
        jtblemployeetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblemployeetableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtblemployeetable);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moredocofee/menu.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton1.setText("Refersh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplistLayout = new javax.swing.GroupLayout(jplist);
        jplist.setLayout(jplistLayout);
        jplistLayout.setHorizontalGroup(
            jplistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplistLayout.createSequentialGroup()
                .addGroup(jplistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplistLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplistLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplistLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(377, 377, 377))
        );
        jplistLayout.setVerticalGroup(
            jplistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplistLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jplistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jplist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseClicked
        DBConnect();
        try {
            int result = 0;
            String rfname = this.txtFname.getText();
            String gender = "";
            String age = this.txtAge.getText();
            String email = this.txtEmail.getText();
            String contact = this.txtContact.getText();
            String dep = "";
            String address = this.txtAddress.getText();
            String blood = "";
            String datej = this.txtDatejoin.getText();
            String type = "";
            String salary = this.txtsalary.getText();
            String level = this.txteducation.getText();
            int permission = 14;

            if (cbGender.getSelectedIndex() == 0) {
                gender = "Male";
            } else {
                gender = "Female";
            }

            switch (cbBlood.getSelectedIndex()) {   //O+, O-, A+, A-, B+, B-, AB+, AB-
                case 0:
                blood = "O+";
                break;
                case 1:
                blood = "O-";
                break;
                case 2:
                blood = "A+";
                break;
                case 3:
                blood = "A-";
                break;
                case 4:
                blood = "B+";
                break;
                case 5:
                blood = "B-";
                break;
                case 6:
                blood = "AB+";
                break;
                case 7:
                blood = "AB-";
                break;

            } 
            switch (cbdep.getSelectedIndex()) {
                case 0:
                dep = "Head office";
                break;
                case 1:
                dep = "Adminstrator";
                break;
                case 2:
                dep = "Store manager";
                break;
                case 3:
                dep = "Export room head";
                break;
                case 4:
                dep = "Arival room head";
                break;
                case 5:
                dep = "Reject room head";
                break;
                case 6:
                dep = "Industrial manager";
                break;

            }
            switch (cbemploye.getSelectedIndex()) {
                case 0:
                type = "Permanent";
                break;
                case 1:
                type = "Contrat";
                break;
            }

            addempl = con.prepareStatement(
                " insert into employee (Name,Gender,Age,Email,"
                + "Contactno,Specification,Address,Blood,Datejoining,photo,Type,Salary,Level,permission)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
            );

            addempl.setString(1, rfname);
            addempl.setString(2, gender);
            addempl.setString(3, age);
            addempl.setString(4, email);
            addempl.setString(5, contact);
            addempl.setString(6, dep);
            addempl.setString(7, address);
            addempl.setString(8, blood);
            addempl.setString(9, datej);
            addempl.setBytes(10, rimage);
            addempl.setString(11, type);
            addempl.setString(12, salary);
            addempl.setString(13, level);
            addempl.setInt(14, permission);
   
            result = addempl.executeUpdate();
            
           try {
            java.sql.Statement sql = con.createStatement();
              ResultSet rs = null;
            rs = sql.executeQuery(
                    "select ID from employee "
                    + "where Name= " + "'" + txtFname.getText() + "'");
            while (rs.next()) {
                String ID = rs.getString("ID");
                JOptionPane.showMessageDialog(null, "Employee Successfully registerd! With ID number  " + ID);
            
            }
            }
         catch (SQLException e) {
        }
          
            
            addempl.close();
            addClear(); 
        } 
          
            catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Make sure that you entered all the fields");
        }
    }//GEN-LAST:event_btnAddEmployeeMouseClicked
private void addClear() {
        String s = "";
        txtAddress.setText(s);
        txtAge.setText(s);
        txtContact.setText(s);
        txtDatejoin.setText(s);
        txtEmail.setText(s);
        txtFname.setText(s);
        cbBlood.setSelectedIndex(-1);
        cbGender.setSelectedIndex(-1);
        cbdep.setSelectedIndex(-1);
        jLabel163.setText(s);
        cbemploye.setSelectedIndex(-1);
        txtsalary.setText(s);
        txteducation.setText(s);
    }

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void cbdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdepActionPerformed
    String aname;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FileFilter filter = new FileNameExtensionFilter("PNG", "JPEG", "BMP", "jpg");
        JFileChooser chooser = new JFileChooser("");
        chooser.addChoosableFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            aname = chooser.getSelectedFile().getAbsolutePath();
            jLabel163.setText(aname);
        }
        try {
            File image = new File(aname);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            rimage = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "File is not selected");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
      
             String sql = "select * from admin where name=? and password=?";
        try {

            PreparedStatement pstemployee = con.prepareStatement(sql);
            pstemployee.setString( 1, txtUserId.getText());
            pstemployee.setString(2, txtUserPass.getText());
            ResultSet result = pstemployee.executeQuery();

            if (result.next()) {
                jpLogin.setVisible(false);
        jpanelhome.setVisible(true);
        Findbtn.setVisible(true);
        Find.setVisible(true);
        Find1.setVisible(true);
        jLabel9.setVisible(true);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
            }
            else {
                txtUserPass.setText("");
                txtUserId.setText("");
                JOptionPane.showMessageDialog(null, "Please try again");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPassActionPerformed

    private void txtSearchEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchEmployeeMouseClicked
        txtSearchEmployee.setText("");
        jfindphoto.setIcon(new ImageIcon(""));
        
    }//GEN-LAST:event_txtSearchEmployeeMouseClicked

    private void btnFindEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindEmployeeMouseClicked
        try {
            
            int count = 0;
            employeeid = txtSearchEmployee.getText();
            java.sql.Statement sql = con.createStatement();
            rs = sql.executeQuery(
                "select Name,Gender,Age,Email,Contactno,Specification,Address,Blood,Datejoining,photo,Type,Salary,Level,permission"
                + " from employee "
                + "where ID= " + employeeid);
            while (rs.next()) {
                byte[] photo = rs.getBytes("Photo");
                txtFnameFind.setText(rs.getString("Name"));
                txtAgeFind.setText(rs.getString("Age"));
                txtEmailFind.setText(rs.getString("Email"));
                txtContactFind.setText(rs.getString("Contactno"));
                txtQualificationFind.setText(rs.getString("Specification"));
                txtDateFind.setText(rs.getString("Datejoining"));
                txtAddressFind.setText(rs.getString("Address"));
                txtGenderFind.setText(rs.getString("Gender"));
                txtBloodFind.setText(rs.getString("Blood"));
                txtQualificationFind.setText(rs.getString("Specification"));
                jfindphoto.setIcon(new ImageIcon(photo));
                txttypefind.setText(rs.getString("Type"));
                txtsalaryfind.setText(rs.getString("Salary"));
                txtlevelfind.setText(rs.getString("Level"));
                txtpermission.setText(rs.getString("permission"));
                count = count + 1;

            }
            if (count == 0) {
                
                JOptionPane.showMessageDialog(null, "ID Not Found!! ");
            } else if (count == 1) {
                hider(true);
            }
            rs.close();
            sql.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            hider(false);
        }
    }//GEN-LAST:event_btnFindEmployeeMouseClicked
 private void hider(boolean stat) {
        lbAddressFind.setVisible(stat);
        lbAgeFind.setVisible(stat);
        lbBloodFind.setVisible(stat);
        lbContactFind.setVisible(stat);
        lbDateFind.setVisible(stat);
        lbEmailFind.setVisible(stat);
        lbFnameFind.setVisible(stat);
        lbGenderFind.setVisible(stat);
        lbQualifiFind.setVisible(stat);
        txtAddressFind.setVisible(stat);
        txtAgeFind.setVisible(stat);
        txtContactFind.setVisible(stat);
        txtDateFind.setVisible(stat);
        txtEmailFind.setVisible(stat);
        txtFnameFind.setVisible(stat);
        txtGenderFind.setVisible(stat);
        txtQualificationFind.setVisible(stat);
        txtBloodFind.setVisible(stat);
        lbphotofind.setVisible(stat);
        jfindphoto.setVisible(stat);
    }


    private void jpFindEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFindEmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpFindEmployeeMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        jpLogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(true);
        jpFindEmployee.setVisible(false);
        jplist.setVisible(false);
    }//GEN-LAST:event_RegisterMouseClicked

    private void FindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindMouseClicked
        jpLogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(true);
        jplist.setVisible(false);
    }//GEN-LAST:event_FindMouseClicked

    private void RegisterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterbtnMouseClicked
        // TODO add your handling code here:
        jpLogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(true);
        jpFindEmployee.setVisible(false);
        jplist.setVisible(false);
    }//GEN-LAST:event_RegisterbtnMouseClicked

    private void FindbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindbtnMouseClicked
        // TODO add your handling code here:
       jpLogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(true);
        jplist.setVisible(false);
    }//GEN-LAST:event_FindbtnMouseClicked

    private void cbemployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbemployeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbemployeActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jpLogin.setVisible(false);
        jpanelhome.setVisible(true);
        Findbtn.setVisible(true);
        Find.setVisible(true);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
        Find1.setVisible(true);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jpLogin.setVisible(false);
        jpanelhome.setVisible(true);
        Findbtn.setVisible(true);
        Find.setVisible(true);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
        Find1.setVisible(true);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnDeleteEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseClicked
        // TODO add your handling code here:
        DBConnect();
         int option = JOptionPane.showConfirmDialog(rootPane,
                    "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                 try { 
           
            String query = "delete from employee where ID = '" + txtSearchEmployee.getText()+"'";
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Employee sucessfully deleted");
      
        
       } catch (SQLException ex) { 
         Logger.getLogger(moredo.class.getName()).log(Level.SEVERE, null, ex);
     }
                 txtFnameFind.setText("");
                 txtAgeFind.setText("");
                 txtGenderFind.setText("");
                 txtContactFind.setText("");
                 txtEmailFind.setText("");
                 txtsalaryfind.setText("");
                 txtlevelfind.setText("");
                 txttypefind.setText("");
                 txtAddressFind.setText("");
                 txtQualificationFind.setText("");
                 txtBloodFind.setText("");
                 txtDateFind.setText("");
                 jfindphoto.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_btnDeleteEmployeeMouseClicked
     public void paclear(){
     
               jtblemployeetable.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Gender",
                        "Age","Email","Contactno","Specification","Address","Blood","Datejoining","Type","Salary","Level","Permission"}));
           }
    private void LoadActive(){
    model1 = new DefaultTableModel();
      jtblemployeetable.setModel(model1);
      model1.addColumn("ID");
      model1.addColumn("Name");
      model1.addColumn("Gender");
      model1.addColumn("Age");
      model1.addColumn("Email");
      model1.addColumn("Contactno");
      model1.addColumn("Specification");
      model1.addColumn("Address");
      model1.addColumn("Blood");
      model1.addColumn("Datejoining");
      model1.addColumn("Type");
      model1.addColumn("Salary");
      model1.addColumn("Level");
      model1.addColumn("permission");
      
      try
            {
                java.sql.Statement sql=con.createStatement();
                rs=sql.executeQuery("SELECT ID,Name,Gender,Age,Email,Contactno,Specification,Address,Blood,Datejoining,photo,Type,Salary,Level,permission FROM employee;");
                ResultSetMetaData tb1=rs.getMetaData();
                int count= tb1.getColumnCount();
                DefaultTableModel mTableModel =(
                        (DefaultTableModel) jtblemployeetable.getModel());
                Object[] rows; 
                
                while(rs.next())
                {
                    rows=new Object[]
                    {
                        rs.getString("ID"),
                        rs.getString("Name"),
                        rs.getString("Gender"),
                        rs.getString("Age"),
                        rs.getString("Email"),
                        rs.getString("Contactno"),
                        rs.getString("Specification"),
                        rs.getString("Address"),
                        rs.getString("Blood"),
                        rs.getString("Datejoining"),
                        rs.getString("Type"),
                        rs.getString("Salary"),
                        rs.getString("Level"),
                        rs.getString("permission")
                        
                    };
                    mTableModel.addRow(rows);
                }
            }
                catch (SQLException sqlException)
                        {
                        sqlException.printStackTrace();
                        }
    }
    private void Find1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Find1MouseClicked
 pdisplayy jtRowData = new   pdisplayy();
    private void jtblemployeetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblemployeetableMouseClicked
        // TODO add your handling code here:

       int index = jtblemployeetable.getSelectedRow();
        TableModel model = jtblemployeetable.getModel();
        String ID = model.getValueAt (index, 0).toString();
        String Name = model.getValueAt (index, 1).toString();
        String Gender = model.getValueAt (index, 2).toString();
        String Age = model.getValueAt (index, 3).toString();
        String Email = model.getValueAt (index, 4).toString();
        String Contactno = model.getValueAt (index, 5).toString();
        String Specification = model.getValueAt (index, 6).toString();
        String Address = model.getValueAt (index, 7).toString();
        String Blood = model.getValueAt (index, 8).toString();
        String Datejoining = model.getValueAt (index, 9).toString();
        String Type = model.getValueAt (index, 10).toString();
        String Salary = model.getValueAt (index, 11).toString();
        String Level = model.getValueAt (index, 12).toString();
        String permission =model.getValueAt (index, 13).toString();
        
        try{
            java.sql.Statement sql=con.createStatement();
            rs=sql.executeQuery("SELECT * FROM employee Where ID ="+"'"+ID+"'");
            while(rs.next()){
        byte[] photo = rs.getBytes("Photo");
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jtRowData.setLocationRelativeTo(null);
        jtRowData.txtIDFind.setText(ID);
        jtRowData.txtFnameFind.setText(Name);
        jtRowData.txtGenderFind.setText(Gender);
        jtRowData.txtAgeFind.setText(Age);
        jtRowData.txtEmailFind.setText(Email );
        jtRowData.txtContactFind.setText(Contactno);
        jtRowData.txtQualificationFind.setText(Specification);
        jtRowData.txtAddressFind.setText(Address);
        jtRowData.txtBloodFind.setText(Blood);
        jtRowData.txtDateFind.setText(Datejoining);
        jtRowData.txttypefind.setText(Type);
        jtRowData.txtsalaryfind.setText(Salary);
        jtRowData.txtlevelfind.setText(Level);
        jtRowData.jfindphoto.setIcon(new ImageIcon(photo)); 
        jtRowData.txtpermission.setText(permission);
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
         
    }//GEN-LAST:event_jtblemployeetableMouseClicked
DefaultTableModel model1;
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jplist.setVisible(true);
        jpanelhome.setVisible(false);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
        jpLogin.setVisible(false);
        Find1.setVisible(false);
        jLabel9.setVisible(false);
        Findbtn.setVisible(false);
        Find.setVisible(false);

      model1 = new DefaultTableModel();
      jtblemployeetable.setModel(model1);
      model1.addColumn("ID");
      model1.addColumn("Name");
      model1.addColumn("Gender");
      model1.addColumn("Age");
      model1.addColumn("Email");
      model1.addColumn("Contactno");
      model1.addColumn("Specification");
      model1.addColumn("Address");
      model1.addColumn("Blood");
      model1.addColumn("Datejoining");
      model1.addColumn("Type");
      model1.addColumn("Salary");
      model1.addColumn("Level");
      model1.addColumn("Permission");
      
      try
            {
                java.sql.Statement sql=con.createStatement();
                rs=sql.executeQuery("SELECT ID,Name,Gender,Age,Email,Contactno,Specification,Address,Blood,Datejoining,photo,Type,Salary,Level,permission FROM employee;");
                
                    
                ResultSetMetaData tb1=rs.getMetaData();
                int count= tb1.getColumnCount();
                DefaultTableModel mTableModel =(
                        (DefaultTableModel) jtblemployeetable.getModel());
                Object[] rows; 
                
                while(rs.next())
                {
                    rows=new Object[]
                    {
                        rs.getString("ID"),
                        rs.getString("Name"),
                        rs.getString("Gender"),
                        rs.getString("Age"),
                        rs.getString("Email"),
                        rs.getString("Contactno"),
                        rs.getString("Specification"),
                        rs.getString("Address"),
                        rs.getString("Blood"),
                        rs.getString("Datejoining"),
                        rs.getString("Type"),
                        rs.getString("Salary"),
                        rs.getString("Level"),
                        rs.getString("permission")
                        
                    };
                    mTableModel.addRow(rows);
                }
            }
                catch (SQLException sqlException)
                        {
                        sqlException.printStackTrace();
                        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jplist.setVisible(false);
        jpLogin.setVisible(false);
        jpanelhome.setVisible(true);
        Findbtn.setVisible(true);
        Find.setVisible(true);
        jpAddEmployee.setVisible(false);
        jpFindEmployee.setVisible(false);
        Find1.setVisible(true);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnFindEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindEmployeeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindEmployeeMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        paclear();
        LoadActive();
        JOptionPane.showMessageDialog(null, "Employyes successfully Loaded");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(moredo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moredo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moredo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moredo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moredo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Find;
    private javax.swing.JLabel Find1;
    private javax.swing.JLabel Findbtn;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Registerbtn;
    private javax.swing.JLabel btnAddEmployee;
    private javax.swing.JLabel btnDeleteEmployee;
    private javax.swing.JLabel btnFindEmployee;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JComboBox<String> cbBlood;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbdep;
    private javax.swing.JComboBox<String> cbemploye;
    private javax.swing.JPanel ind2;
    private javax.swing.JPanel ind3;
    private javax.swing.JPanel ind4;
    private javax.swing.JPanel ind5;
    private javax.swing.JPanel ind6;
    private javax.swing.JPanel ind7;
    private javax.swing.JPanel ind8;
    private javax.swing.JPanel ind9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jfindphoto;
    private javax.swing.JPanel jpAddEmployee;
    private javax.swing.JPanel jpFindEmployee;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpanelhome;
    private javax.swing.JPanel jplist;
    public static javax.swing.JTable jtblemployeetable;
    private javax.swing.JLabel lbAddressFind;
    private javax.swing.JLabel lbAgeFind;
    private javax.swing.JLabel lbBloodFind;
    private javax.swing.JLabel lbContactFind;
    private javax.swing.JLabel lbContactFind1;
    private javax.swing.JLabel lbContactFind2;
    private javax.swing.JLabel lbContactFind3;
    private javax.swing.JLabel lbContactFind4;
    private javax.swing.JLabel lbDateFind;
    private javax.swing.JLabel lbEmailFind;
    private javax.swing.JLabel lbFnameFind;
    private javax.swing.JLabel lbGenderFind;
    private javax.swing.JLabel lbQualifiFind;
    private javax.swing.JLabel lbphotofind;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel txtAddressFind;
    private javax.swing.JTextField txtAge;
    private javax.swing.JLabel txtAgeFind;
    private javax.swing.JLabel txtBloodFind;
    private javax.swing.JTextField txtContact;
    private javax.swing.JLabel txtContactFind;
    private javax.swing.JLabel txtDateFind;
    private javax.swing.JTextField txtDatejoin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmailFind;
    private javax.swing.JTextField txtFname;
    private javax.swing.JLabel txtFnameFind;
    private javax.swing.JLabel txtGenderFind;
    private javax.swing.JLabel txtQualificationFind;
    private javax.swing.JTextField txtSearchEmployee;
    public javax.swing.JTextField txtUserId;
    private javax.swing.JPasswordField txtUserPass;
    private javax.swing.JTextField txteducation;
    private javax.swing.JLabel txtlevelfind;
    private javax.swing.JLabel txtpermission;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JLabel txtsalaryfind;
    private javax.swing.JLabel txttypefind;
    // End of variables declaration//GEN-END:variables
}
