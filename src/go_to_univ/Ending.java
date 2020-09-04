package go_to_univ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Ending {
	private String T1;
	private String T2;
	
	void text_set(String A, String B) {
		T1 = A;
		T2 = B;
	}
	
	void ending() {
    	//자바 프레임
        JFrame frm = new JFrame("Go to PKNU");
 
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("처음으로");
        JButton btn2 = new JButton("종료하기");
 
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        JLabel label = new JLabel();
        label.setBounds(10, 50, 330, 50);
        label.setText(T1);
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        
        JLabel label2 = new JLabel();
        label2.setBounds(10, 100, 330, 50);
        label2.setText(T2);
        label2.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label2);
        
        //버튼 이벤트 설정
        btn1.addActionListener(event -> {
        	Start S = new Start();
        	S.start();
        	frm.dispose();
        });
 
        btn2.addActionListener(event -> {
        	frm.dispose();
        });
 
        frm.setVisible(true);
	}
}
