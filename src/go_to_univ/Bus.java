package go_to_univ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Bus extends Ending{

	void bus() {
        JFrame frm = new JFrame("Go to PKNU");
        
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("음악을 듣는다.");
        JButton btn2 = new JButton("안 듣는다.");
 
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        JLabel label = new JLabel();
        label.setBounds(10, 50, 330, 50);
        label.setText("휴, 탔어. 음악이나 들으면서 가 볼까?");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        

        //버튼 이벤트 설정
        btn1.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("음악을 듣다가 내려야 할 역을 지나쳐 늦었다.","네 번째(1) 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
    		E.ending();
    		frm.dispose();
        });
 
        btn2.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("교통 체증으로 버스를 타고 가다 늦었다.","네 번째(2) 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
    		E.ending();
    		frm.dispose();
        });
 
        frm.setVisible(true);
	}
}
