import javax.swing.*;

/**
 * @auther Jack D
 * @date 2019/11/5  1:14
 */

public class JlabelDemo {
    public static void main(String[] agrs){
        JFrame jFrame = new JFrame("Java标签组件示例");
        JPanel jPanel = new JPanel();
        JLabel label1 = new JLabel("普通标签");
        JLabel label2 = new JLabel();
        label2.setText("电泳setText方法");
        ImageIcon img = new ImageIcon("G:\\Project\\IDEA\\SwingStudy\\source\\money.jpg");
        JLabel label3 = new JLabel("开始理财",img,JLabel.CENTER);

        jPanel.add(label1);
        jPanel.add(label2);
        jPanel.add(label3);
        jFrame.add(jPanel);

        jFrame.setBounds(300,200,800,800);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
