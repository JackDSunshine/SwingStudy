import javax.swing.*;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/13  0:13
 */

public class JTextAreaDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jp = new JPanel();
        JTextArea jTextArea = new JTextArea("请输入内容",7,30);
        jTextArea.setLineWrap(true);  //设置自动换行
        jTextArea.setForeground(Color.BLACK); //设置组件的背景色

        JScrollPane jScrollPane = new JScrollPane(jTextArea);  //将文本放入滚动窗口
        Dimension size = jTextArea.getPreferredSize();  //获取文本域的首选大小
        jScrollPane.setBounds(110,90,size.width,size.height);

        jp.add(jScrollPane);    //将JScrollPane添加到JPanel容器中
        jFrame.add(jp);    //将JPanel容器添加到JFrame容器中
        jFrame.setBackground(Color.LIGHT_GRAY);
        jFrame.setSize(400,200);    //设置JFrame容器的大小
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
