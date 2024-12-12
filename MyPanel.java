import javax.swing.*;
import java.awt.*;

/**
 * MyPanel 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyPanel extends JPanel
{
    public MyPanel()
    {
        setLayout(new GridLayout(2, 1, 10, 10));

        JButton startButton = new JButton("게임 시작");
        JButton exitButton = new JButton("종료");

        startButton.addActionListener(new MyListener("게임 시작"));
        exitButton.addActionListener(new MyListener("종료"));

        add(startButton);
        add(exitButton);
    }
}