package go_to_univ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Go_to_Ending2 extends Ending {
	void semi_ending() {
    	//�ڹ� ������
        JFrame frm = new JFrame("Go to PKNU");
 
        frm.setSize(350, 300);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("������");
 
        btn1.setBounds(90, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        
        JLabel label = new JLabel();
        label.setBounds(10, 80, 330, 50);
        label.setText("�� �� �Ծ���. �߾� �� ���� ���� ����");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        
        //��ư �̺�Ʈ ����
        btn1.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("�� ������ �ؾ���. ������ �ϴ� �Ϸ簡 ������.","�� ��° �����Դϴ�. �� 4���� ������ �����մϴ�.");
        	E.ending();
        	frm.dispose();
        });

        frm.setVisible(true);
	}
}
