package go_to_univ;
import javax.swing.*;
import java.awt.event.*;
 
public class Start extends Ending {
	
	void start() {
    	//�ڹ� ������
        JFrame frm = new JFrame("Go to PKNU");
        
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("�����ϱ�");
        JButton btn2 = new JButton("�����ϱ�");
 
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        JLabel label = new JLabel();
        label.setBounds(30, 80, 274, 50);
        label.setText("��������  �����ϱ�   ��������");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        
        //��ư �̺�Ʈ ����
        btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton btn1 = (JButton) e.getSource();
				if(btn1.getText().equals("���󰣴�.")) {
		        	Ending E = new Ending();
		        	E.text_set("���� ī�䰡�� �̾߱��ϴ� ���� �ٽ� ��Ͱ� �Ǿ���","�� ��° �����Դϴ�. �� 4���� ������ �����մϴ�.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("ģ����� �Բ�")) {
		        	Go_to_Ending2 G = new Go_to_Ending2();
		        	G.semi_ending();
		        	frm.dispose();
				}
				if(btn1.getText().equals("������ ²��.")) {
		        	Ending E = new Ending();
		        	E.text_set("�� ������ �ؾ���. ������ �ϴ� �Ϸ簡 ������.","�� ��° �����Դϴ�. �� 4���� ������ �����մϴ�.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("������ ��´�.")) {
		        	Ending E = new Ending();
		        	E.text_set("����ö���� ������ ���� ������. You Died.","ù ��° �����Դϴ�. �� 4���� ������ �����մϴ�.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn1.getText().equals("����ö")) {
					btn1.setText("������ ��´�.");
					btn2.setText("�� ��´�.");
					label.setText("��, ����. �����̳� �����鼭 �� ����?");
				}
				if(btn1.getText().equals("�ø���")) {
			        label.setText("���� �б� �� ����? ��,, �� �տ� �� Ż��?");
					btn1.setText("����ö");
					btn2.setText("����");
				}
				if(btn1.getText().equals("�����ϱ�")) {
					btn1.setText("�ø���");
					btn2.setText("��");
					label.setText("�б����� ���̴�. ���� �� ����?");
				}

			}
		});
        
        btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton btn2 = (JButton) e.getSource();
				if(btn2.getText().equals("���� ����.")) {
		        	Ending E = new Ending();
		        	E.text_set("�� ������ �ؾ���. ������ �ϴ� �Ϸ簡 ������.","�� ��° �����Դϴ�. �� 4���� ������ �����մϴ�.");
	        		E.ending();
	        		frm.dispose();
				}
				if(btn2.getText().equals("��� ȥ������!")) {
					btn1.setText("���󰣴�.");
					btn2.setText("���� ����.");
			        label.setText("ȥ���ϰ� ���Դµ� �� ��(��)ģ�� ������.");
				}
				if(btn2.getText().equals("������ ��´�.")) {
					btn1.setText("ģ����� �Բ�");
					btn2.setText("��� ȥ������!");
			        label.setText("���� �� ���� ������ �����! ���� �� �Ծ��¡~");
				}
				if(btn2.getText().equals("�� ��´�.")) {
					btn1.setText("������ ²��.");
					btn2.setText("������ ��´�.");
			        label.setText("�Դµ� ���� ��Ⱑ �ȳ�;; ������ ����?");
				}
				if(btn2.getText().equals("����")) {
		        	Bus B = new Bus();
		        	B.bus();
		        	frm.dispose();
				}
				if(btn2.getText().equals("��")) {
			        label.setText("���� �б� �� ����? ��,, �� �տ� �� Ż��?");
					btn1.setText("����ö");
					btn2.setText("����");
				}
				if(btn2.getText().equals("�����ϱ�")) {
	        		frm.dispose();
				}

			}
		});
        frm.setVisible(true);
	}
	
    public static void main(String[] args){
    	
    	//��Ʈ ���� - �����̽��� ��ũ������ü : ���ٸ� default ������ �ٲ�.
    	Set_Font S = new Set_Font();
    	S.setting();

        Start St = new Start();
    	St.start();
 
    }
}