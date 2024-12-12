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

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        JButton startButton = new JButton("게임 시작");
        JButton exitButton = new JButton("종료");

        startButton.addActionListener(new MyListener("게임 시작"));
        exitButton.addActionListener(new MyListener("종료"));

        panel.add(startButton);
        panel.add(exitButton);

        add(panel);

        setVisible(true);
    }
}
