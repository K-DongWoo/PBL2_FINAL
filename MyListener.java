import java.awt.event.*;

/**
 * MyListener 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyListener implements ActionListener
{
    private String push;

    public MyListener(String push)
    {
        this.push = push;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (push == "게임 시작")
        {
            System.out.println("게임을 시작합니다!");
        } else if (push == "종료")
        {
            System.exit(0);
        }
    }
}