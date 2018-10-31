package giaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tongcanbac2GUI extends JFrame implements ActionListener {
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblKQ;
	JTextField tfKQ;
	JButton btnTinh;
	public Tongcanbac2GUI()
	{
		lblSoN = new JLabel();
		lblSoN.setText("Nhập N");
		tfSoN = new JTextField(10);
		lblKQ = new JLabel();
		lblKQ.setText("Kết quả");
		tfKQ = new JTextField(10);
		btnTinh = new JButton();
		btnTinh.setText("Tính tổng");
		btnTinh.addActionListener(this);
		Container cont = this.getContentPane();
		setSize(500, 500);
		cont.setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblKQ);
		cont.add(tfKQ);
		cont.add(btnTinh);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String SoN = tfSoN.getText();
		float n = Float.parseFloat(SoN);
		float Tong=0;
		for (float i=1;i<=n;i++)
		{
			Tong+=Math.sqrt(i);
		}
		tfKQ.setText(String.valueOf(Tong));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tongcanbac2GUI obj = new Tongcanbac2GUI();
	}

}
