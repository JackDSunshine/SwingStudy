import javax.swing.*;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/5  0:41
 */

public class JFrameStudy extends JFrame {
    public JFrameStudy() throws HeadlessException {
        setTitle("Java 第一个GUI程序");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口可关闭
        JLabel jLabel = new JLabel("这是使用Java创建的窗口"); //创建一个标签
        Container container = getContentPane(); //获取当前窗口的内容窗格；
        container.add(jLabel);
        setVisible(true);
    }

    public static void main(String[] args){
        //new JFrameStudy();
        JFrame jFrame = new JFrame("Java第二个GUI程序");
        jFrame.setBounds(300,100,400,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("这是放在Jpane上的标签");
        jPanel.add(jLabel);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
