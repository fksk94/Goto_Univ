package go_to_univ;
import javax.swing.*;
import java.awt.event.*;
 
public class Start extends Ending {
	
	void start() {
    	//자바 프레임
        JFrame frm = new JFrame("Go to PKNU");
        
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("시작하기");
        JButton btn2 = new JButton("종료하기");
 
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        JLabel label = new JLabel();
        label.setBounds(30, 80, 274, 50);
        label.setText("↓↓↓↓↓↓↓  시작하기   ↓↓↓↓↓↓↓");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        
        //버튼 이벤트 설정
        btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton btn1 = (JButton) e.getSource();
				if(btn1.getText().equals("따라간다.")) {
		        	Ending E = new Ending();
		        	E.text_set("같이 카페가서 이야기하다 보니 다시 사귀게 되었다","세 번째 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("친구들과 함께")) {
		        	Go_to_Ending2 G = new Go_to_Ending2();
		        	G.semi_ending();
		        	frm.dispose();
				}
				if(btn1.getText().equals("수업을 짼다.")) {
		        	Ending E = new Ending();
		        	E.text_set("아 과제는 해야지. 과제를 하니 하루가 끝났다.","두 번째 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("음악을 듣는다.")) {
		        	Ending E = new Ending();
		        	E.text_set("지하철에서 내리다 발이 빠졌다. You Died.","첫 번째 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("지하철")) {
					btn1.setText("음악을 듣는다.");
					btn2.setText("안 듣는다.");
					label.setText("휴, 탔어. 음악이나 들으면서 가 볼까?");
				}
				if(btn1.getText().equals("시리얼")) {
			        label.setText("이제 학교 가 볼까? 음,, 둘 둥에 뭘 탈까?");
					btn1.setText("지하철");
					btn2.setText("버스");
				}
				if(btn1.getText().equals("시작하기")) {
					btn1.setText("시리얼");
					btn2.setText("밥");
					label.setText("학교가기 전이다. 밥을 뭐 먹지?");
				}

			}
		});
        
        btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton btn2 = (JButton) e.getSource();
				if(btn2.getText().equals("집에 간다.")) {
		        	Ending E = new Ending();
		        	E.text_set("아 과제는 해야지. 과제를 하니 하루가 끝났다.","두 번째 엔딩입니다. 총 4가지 엔딩이 존재합니다.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn2.getText().equals("당근 혼밥이지!")) {
					btn1.setText("따라간다.");
					btn2.setText("집에 간다.");
			        label.setText("혼밥하고 나왔는데 전 여(남)친이 보였다.");
				}
				if(btn2.getText().equals("수업을 듣는다.")) {
					btn1.setText("친구들과 함께");
					btn2.setText("당근 혼밥이지!");
			        label.setText("수업 안 졸고 열심히 들었어! 이제 밥 먹어야징~");
				}
				if(btn2.getText().equals("안 듣는다.")) {
					btn1.setText("수업을 짼다.");
					btn2.setText("수업을 듣는다.");
			        label.setText("왔는데 수업 듣기가 싫네;; 집으로 갈까?");
				}
				if(btn2.getText().equals("버스")) {
		        	Bus B = new Bus();
		        	B.bus();
		        	frm.dispose();
				}
				if(btn2.getText().equals("밥")) {
			        label.setText("이제 학교 가 볼까? 음,, 둘 둥에 뭘 탈까?");
					btn1.setText("지하철");
					btn2.setText("버스");
				}
				if(btn2.getText().equals("종료하기")) {
	        		frm.dispose();
				}

			}
		});
        frm.setVisible(true);
	}
	
    public static void main(String[] args){
    	
    	//폰트 설정 - 더페이스샵 잉크립퀴드체 : 없다면 default 값으로 바뀜.
    	Set_Font S = new Set_Font();
    	S.setting();

        Start St = new Start();
    	St.start();
 
    }
}