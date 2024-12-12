import javax.swing.*;
import java.awt.*;

/**
 * MyFrame 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyFrame extends JFrame
{
    public MyFrame() {
        setTitle("학습용 게임");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}
