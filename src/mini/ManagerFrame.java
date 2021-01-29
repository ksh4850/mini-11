package mini;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ManagerFrame {
private JFrame frame;
	
	public ManagerFrame(JFrame frame) {
		
		this.frame = new JFrame();
		ImagePanel panel7 = new ImagePanel(new ImageIcon("src/Images/managerPage.png").getImage());
		frame.add(panel7);
		frame.pack();
		
		JLabel homeMemberL = new JLabel(MemberDB.listDB.get(MemberManager.memberNumber).getName()+"님 환영합니다.");
		homeMemberL.setFont(new Font("굴림", Font.BOLD, 28));
		homeMemberL.setForeground(Color.WHITE);
		homeMemberL.setBounds(196, 530, 362, 32);
		panel7.add(homeMemberL);
		
		
		JButton checkRevBtn = new JButton("");
		checkRevBtn.setForeground(Color.BLACK);
		checkRevBtn.setIcon(new ImageIcon("src/buttonImages/btnCheck.png"));
		checkRevBtn.setBounds(92, 630, 566, 60);
		panel7.add(checkRevBtn);
		checkRevBtn.addActionListener(new ActionListener() {	//예약하기 버튼
			public void actionPerformed(ActionEvent e) {
				
				frame.getContentPane().removeAll();
				ReservationFrame revframe = new ReservationFrame(frame);

			}
		});
		
		JButton managerLogoutBtn = new JButton("");
		managerLogoutBtn.setIcon(new ImageIcon("src/buttonImages/h로그아웃.jpg"));
		managerLogoutBtn.setBounds(101, 698, 154, 37);
		panel7.add(managerLogoutBtn);
		managerLogoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.getContentPane().removeAll();
				LoginFrame lf = new LoginFrame(frame);
				
			}
		});
		
}
}
