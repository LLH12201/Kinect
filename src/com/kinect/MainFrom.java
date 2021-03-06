package com.kinect;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.dao.SqlHelper;
import com.face.FaceReg;
import com.item.PersonItem;
import com.picutils.Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stone
 */
public class MainFrom extends javax.swing.JFrame {
	String imgFile = null;

	/**
	 * Creates new form NewJFrame1
	 */
	public MainFrom(String picPath) {
		this.imgFile = picPath;
		Utils utils = new Utils(picPath);
		initComponents();
		Icon icon = new ImageIcon(picPath);
		jl_pic.setIcon(icon);
	}

	private MainFrom() {
		initComponents(); // To change body of generated methods, choose Tools |
							// Templates.
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		this.setTitle("人脸识别");
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jSeparator2 = new javax.swing.JSeparator();
		jl_pic = new javax.swing.JLabel();
		jl_pic_re = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jl_name = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jl_sex = new javax.swing.JLabel();
		jl_addr = new javax.swing.JLabel();
		jb_query = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jmt_open = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		jmt_close = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jmt_add = new javax.swing.JMenuItem();
		jSeparator3 = new javax.swing.JPopupMenu.Separator();
		jmt_del = new javax.swing.JMenuItem();
		jSeparator4 = new javax.swing.JPopupMenu.Separator();
		jmt_update = new javax.swing.JMenuItem();
		jSeparator5 = new javax.swing.JPopupMenu.Separator();
		jmt_query = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jmt_about = new javax.swing.JMenuItem();

		jMenuItem2.setText("jMenuItem2");

		jMenu3.setText("jMenu3");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jl_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jl_pic_re.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jl_pic_re.setText("嫌疑人图片");
		jl_pic_re.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel3.setText("捕捉到的人脸");

		jLabel4.setText("嫌疑人信息");

		jLabel5.setText("姓名");
		jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jl_name.setText("空");

		jLabel7.setText("性别");
		jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel8.setText("地址");
		jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jl_sex.setText("空");

		jl_addr.setText("空");

		jb_query.setText("查询数据库");
		jb_query.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_queryActionPerformed(evt);
			}
		});

		jMenu1.setText("文件");

		jmt_open.setText("打开");
		jmt_open.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_openActionPerformed(evt);
			}
		});
		jMenu1.add(jmt_open);
		jMenu1.add(jSeparator1);

		jmt_close.setText("关闭");
		jmt_close.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_closeActionPerformed(evt);
			}
		});
		jMenu1.add(jmt_close);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("编辑");

		jmt_add.setText("增加可疑人员");
		jmt_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_addActionPerformed(evt);
			}
		});
		jMenu2.add(jmt_add);
		jMenu2.add(jSeparator3);

		jmt_del.setText("删除可疑人员");
		jmt_del.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_delActionPerformed(evt);
			}
		});
		jMenu2.add(jmt_del);
		jMenu2.add(jSeparator4);

		jmt_update.setText("修改可疑人员");
		jmt_update.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_updateActionPerformed(evt);
			}
		});
		jMenu2.add(jmt_update);
		jMenu2.add(jSeparator5);

		jmt_query.setText("查询具体信息");
		jmt_query.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_queryActionPerformed(evt);
			}
		});
		jMenu2.add(jmt_query);

		jMenuBar1.add(jMenu2);

		jMenu4.setText("帮助");

		jmt_about.setText("关于");
		jmt_about.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmt_aboutActionPerformed(evt);
			}
		});
		jMenu4.add(jmt_about);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(71, 71, 71).addComponent(jLabel3))
								.addGroup(layout.createSequentialGroup().addGap(50, 50, 50)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jb_query).addComponent(jl_pic,
														javax.swing.GroupLayout.PREFERRED_SIZE, 125,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel7)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jl_sex))
												.addGroup(layout.createSequentialGroup().addComponent(jLabel5)
														.addGap(51, 51, 51).addComponent(jl_name)))
										.addGroup(
												layout.createSequentialGroup().addComponent(jLabel8).addGap(51, 51, 51)
														.addComponent(jl_addr, javax.swing.GroupLayout.PREFERRED_SIZE,
																170, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
								.addGroup(layout.createSequentialGroup().addGap(83, 83, 83)
										.addComponent(jl_pic_re, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4).addGap(165, 165, 165)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jl_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(64, 64, 64))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap()
												.addComponent(jl_pic_re, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(41, 41, 41).addComponent(jLabel4).addGap(18, 18, 18)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jl_name))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jl_sex).addComponent(jb_query))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(jl_addr))
						.addContainerGap(38, Short.MAX_VALUE)));

		jl_pic.getAccessibleContext().setAccessibleName("jLpic");
		jl_pic_re.getAccessibleContext().setAccessibleName("jLDataPic");
		jl_name.getAccessibleContext().setAccessibleName("jLname");
		jl_sex.getAccessibleContext().setAccessibleName("jLsex");
		jl_addr.getAccessibleContext().setAccessibleName("jLaddress");
		jb_query.getAccessibleContext().setAccessibleName("jBquery");

		pack();
	}// </editor-fold>

	private void jmt_openActionPerformed(java.awt.event.ActionEvent evt) {
		// 创建文件打开对话框
		JFileChooser jfc = new JFileChooser("E:\\faceImage\\temp");
		// 创建jpg、gif文件类型过滤器
		FileFilter filterJpeg = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
		FileFilter filterGif = new FileNameExtensionFilter("GIF file", "gif");
		// 删除默认的文件后缀类型过滤器
		jfc.removeChoosableFileFilter(jfc.getFileFilter());
		// 为文件对话框设置后缀过滤器
		jfc.addChoosableFileFilter(filterJpeg);
		jfc.addChoosableFileFilter(filterGif);
		// 显示文件对话框
		jfc.showDialog(this, "确认");
		// 获取图片文件路径
		try {
			String path = jfc.getSelectedFile().getAbsolutePath();
			// 创建图标对象
			imgFile = path;
			Icon icon = new ImageIcon(path);
			jl_pic.setIcon(icon);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			jfc.cancelSelection();
		}
		// 将标签添加进滚动窗体中

	}

	private void jb_queryActionPerformed(java.awt.event.ActionEvent evt) {
		FaceReg test = new FaceReg();
		SqlHelper sqlHelper = new SqlHelper();
		int index = test.Recognizer(imgFile);
		if (index > 0) {
			PersonItem person = sqlHelper.findPerson(index);
			Icon piIcon = new ImageIcon(person.getHeadUrl());
			jl_pic_re.setIcon(piIcon);
			jl_name.setText(person.getName());
			jl_sex.setText(person.getSex());
			jl_addr.setText("<html>"+person.getAddress()+"</html>");
		} else {
			JOptionPane.showMessageDialog(this, "数据库没有此人信息", "提示", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void jmt_closeActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jmt_addActionPerformed(java.awt.event.ActionEvent evt) {
		JfAddPerson jfAddPerson = new JfAddPerson();
		jfAddPerson.show();
	}

	private void jmt_delActionPerformed(java.awt.event.ActionEvent evt) {
		JfDelPerson jfDelPerson = new JfDelPerson();
		jfDelPerson.show();
	}

	private void jmt_updateActionPerformed(java.awt.event.ActionEvent evt) {
		String personId = JOptionPane.showInputDialog(this, "编号");
		try {
			if (!personId.equals("")) {
				JfUpdatePerson jfUpdatePerson = new JfUpdatePerson(personId);
				jfUpdatePerson.show();
			} else {
				JOptionPane.showMessageDialog(this, "请输入编号", "提示", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e) {
		}
	}

	private void jmt_queryActionPerformed(java.awt.event.ActionEvent evt) {
		String personId = JOptionPane.showInputDialog(this, "编号");
		try {
			if (!personId.equals("")) {
				SqlHelper sqlHelper = new SqlHelper();
				PersonItem person = sqlHelper.findPerson(personId);
				if (person != null) {
					jl_name.setText(person.getName());
					jl_sex.setText(person.getSex());
					jl_addr.setText(person.getAddress());
					Icon icon = new ImageIcon(person.getHeadUrl());
					jl_pic_re.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(this, "数据库没有此人信息", "提示", JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(this, "请输入编号", "提示", JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception e) {
		}
	}

	private void jmt_aboutActionPerformed(java.awt.event.ActionEvent evt) {

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
//	public static void main(String args[]) {
//		/* Set the Nimbus look and feel */
//		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
//		// code (optional) ">
//		/*
//		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
//		 * default look and feel. For details see
//		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
//		 * html
//		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
//		// </editor-fold>
//
//		/* Create and display the form */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new MainFrom().setVisible(true);
//			}
//		});
//	}

	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JPopupMenu.Separator jSeparator3;
	private javax.swing.JPopupMenu.Separator jSeparator4;
	private javax.swing.JPopupMenu.Separator jSeparator5;
	private javax.swing.JButton jb_query;
	private javax.swing.JLabel jl_addr;
	private javax.swing.JLabel jl_name;
	private javax.swing.JLabel jl_pic;
	private javax.swing.JLabel jl_pic_re;
	private javax.swing.JLabel jl_sex;
	private javax.swing.JMenuItem jmt_about;
	private javax.swing.JMenuItem jmt_add;
	private javax.swing.JMenuItem jmt_close;
	private javax.swing.JMenuItem jmt_del;
	private javax.swing.JMenuItem jmt_open;
	private javax.swing.JMenuItem jmt_query;
	private javax.swing.JMenuItem jmt_update;
	// End of variables declaration
}
