import javax.swing.*;
import java.awt.Font;
/**
 * @auther Jack D
 * @date 2019/11/12  23:55
 */

public class JTextFieldDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Java文本框组件示例");
        JPanel jp = new JPanel();
        JTextField jTextField = new JTextField();  //创建文本框
        jTextField.setText("简单文本框");
        JTextField jTextField2 = new JTextField(28);
        jTextField2.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
        jTextField2.setText("指定长度和字体的文本框");
        JTextField jTextField3=new JTextField(30);
        jTextField3.setText("居中对齐");
        jTextField3.setHorizontalAlignment(JTextField.CENTER);    //居中对齐

        jp.add(jTextField);
        jp.add(jTextField2);
        jp.add(jTextField3);

        jFrame.add(jp);
        jFrame.setBounds(300,200,400,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
