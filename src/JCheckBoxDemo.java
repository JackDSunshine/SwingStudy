import javax.swing.*;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/13  0:22
 */

public class JCheckBoxDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("流行编程语言有：");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));

        JCheckBox chkbox1 = new JCheckBox("C#",true); //创建制定文本和状态的复选框
        JCheckBox chkbox2=new JCheckBox("C++");    //创建指定文本的复选框
        JCheckBox chkbox3=new JCheckBox("Java");    //创建指定文本的复选框
        JCheckBox chkbox4=new JCheckBox("Python");    //创建指定文本的复选框
        JCheckBox chkbox5=new JCheckBox("PHP");    //创建指定文本的复选框
        JCheckBox chkbox6=new JCheckBox("Perl");    //创建指定文本的复选框

        jPanel.add(jLabel);
        jPanel.add(chkbox1);
        jPanel.add(chkbox2);
        jPanel.add(chkbox3);
        jPanel.add(chkbox4);
        jPanel.add(chkbox5);
        jPanel.add(chkbox6);

        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
