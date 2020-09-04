package go_to_univ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Go_to_Ending2 extends Ending {
	void semi_ending() {
    	//자바 프레임
        JFrame frm = new JFrame("Go to PKNU");
 
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("집가기");
 
        btn1.setBounds(90, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        
        JLabel label = new JLabel();
        label.setBounds(10, 80, 330, 50);
        label.setText("아 잘 먹었다. 야야 난 집에 갈게 ㅂㅂ");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        
        //버튼 이벤트 설정
        btn1.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("아 과제는 해야지. 과제를 하니 하루가 끝났다.","두 번째 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
        	E.ending();
        	frm.dispose();
        });

        frm.setVisible(true);
	}
}
