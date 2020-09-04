package go_to_univ;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

class Set_Font {
	void setting() {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("´õÆäÀÌ½º¼¥ À×Å©¸³ÄûµåÃ¼", Font.PLAIN, 17));
        }
	}
}
