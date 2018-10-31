package giaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TongGUI extends JFrame implements ActionListener{
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblTong;
	JTextField tfTong;
	JButton btnTinhTong;
	public TongGUI() 
	{
		lblSoN = new JLabel();
		lblSoN.setText("Nhập số N");
		tfSoN =  new JTextField(10);
		lblTong = new JLabel();
		lblTong.setText("Tổng");
		tfTong = new JTextField(10);
		btnTinhTong = new JButton();
		btnTinhTong.setText("Tính tổng");
		btnTinhTong.addActionListener(this);
		Container cont = this.getContentPane();
		setSize(500,500);
		cont.setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblTong);
		cont.add(tfTong);
		cont.add(btnTinhTong);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String SoN = tfSoN.getText();
		float n = Float.parseFloat(SoN);
		float Tong=0;
		for (float i=1;i<=n;i++)
		{
			Tong=Tong+1/i;
		}
		tfTong.setText(String.valueOf(Tong));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TongGUI obj = new TongGUI();
	}

}
