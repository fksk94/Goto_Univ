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

        JButton btn1 = new JButton("������ ��´�.");
        JButton btn2 = new JButton("�� ��´�.");
 
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        JLabel label = new JLabel();
        label.setBounds(10, 50, 330, 50);
        label.setText("��, ����. �����̳� �����鼭 �� ����?");
        label.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(label);
        

        //��ư �̺�Ʈ ����
        btn1.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("������ ��ٰ� ������ �� ���� ������ �ʾ���.","�� ��°(1) �����Դϴ�. �� 4���� ������ �����մϴ�.");
    		E.ending();
    		frm.dispose();
        });
 
        btn2.addActionListener(event -> {
        	Ending E = new Ending();
        	E.text_set("���� ü������ ������ Ÿ�� ���� �ʾ���.","�� ��°(2) �����Դϴ�. �� 4���� ������ �����մϴ�.");
    		E.ending();
    		frm.dispose();
        });
 
        frm.setVisible(true);
	}
}
