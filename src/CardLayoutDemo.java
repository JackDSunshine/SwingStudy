import javax.swing.*;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/5  1:05
 */

public class CardLayoutDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("布局管理器学习");
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel cards = new JPanel(new CardLayout());

        jPanel1.add(new JButton("登录按钮"));
        jPanel1.add(new JButton("注册按钮"));
        jPanel1.add(new JButton("找回密码按钮"));
        jPanel2.add(new JTextField("用户名文本框",20));
        jPanel2.add(new JTextField("密码文本框",20));
        jPanel2.add(new JTextField("验证码文本框",20));
        cards.add(jPanel1,"cards1");
        cards.add(jPanel2,"cards2");

        CardLayout cardLayout =(CardLayout)(cards.getLayout());
        cardLayout.show(cards,"cards2");

        jFrame.add(cards);
        jFrame.setBounds(300,200,400,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
