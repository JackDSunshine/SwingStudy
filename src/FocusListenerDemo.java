import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @auther Jack D
 * @date 2019/11/13  21:45
 */

public class FocusListenerDemo extends JFrame {
    JLabel label;

    public FocusListenerDemo() {
        setTitle("焦点事件监听器示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        label = new JLabel(" ");
        label.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        contentPane.add(label, BorderLayout.SOUTH);

        JTextField txtfield1 = new JTextField();    //创建文本框
        txtfield1.setFont(new Font("黑体", Font.BOLD, 16));    //修改字体样式
        txtfield1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // 获取焦点时执行此方法
                label.setText("文本框获得焦点，正在输入内容");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // 失去焦点时执行此方法
                label.setText("文本框失去焦点，内容输入完成");
            }
        });
        contentPane.add(txtfield1);
    }

    public static void main(String[] args){
        FocusListenerDemo frame=new FocusListenerDemo();
        frame.setVisible(true);
    }

}
