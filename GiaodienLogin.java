package giaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GiaodienLogin extends JFrame{
	JLabel lblUser;
	JTextField tfUser;
	JLabel lblPass;
	JPasswordField tfPass;
	JLabel lblGender;
	JRadioButton rdoNam;
	JRadioButton rdoNu;
	ButtonGroup bg;
	JComboBox cboHome;
	JButton btnRegis;
	public GiaodienLogin() 
	{
		lblUser = new JLabel();
		lblUser.setText("UserName");
		tfUser = new JTextField(10);
		lblPass = new JLabel("Password");
		tfPass = new JPasswordField(10);
		lblGender = new JLabel("Gender");
		rdoNam = new JRadioButton("Nam");
		rdoNu = new JRadioButton("Nữ");
		bg = new ButtonGroup();
		bg.add(rdoNam);
		bg.add(rdoNu);
		cboHome = new JComboBox();
		cboHome.addItem("Quảng Bình");		
		cboHome.addItem("Hà Nội");
		cboHome.addItem("Đà Nẵng");
		cboHome.addItem("Tp HCM");
		cboHome.addItem("Hà Tĩnh");
		btnRegis = new JButton("Regis");
		btnRegis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String gt ="";
				if(rdoNam.isSelected()==true) gt=rdoNam.getText();
				if(rdoNu.isSelected()== true) gt= rdoNu.getText();
				String home = (String) cboHome.getSelectedItem();
				JOptionPane.showMessageDialog(null,"UserName: "+tfUser.getText()+"\nPassword: "+tfPass.getText()+"\nGender: "+gt+"\nHome :"+home);
			}
		});
		Container cont = getContentPane();
		setSize(400,400);
		cont.setLayout(new FlowLayout());
		cont.add(lblUser);
		cont.add(tfUser);
		cont.add(lblPass);
		cont.add(tfPass);
		cont.add(lblGender);
		cont.add(rdoNam);
		cont.add(rdoNu);
		cont.add(cboHome);
		cont.add(btnRegis);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new GiaodienLogin();
	}

}
