import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @auther Jack D
 * @date 2019/11/13  21:25
 */

public class ActionListenerDemo extends JFrame {
    JList jList;
    JLabel jLabel;
    JButton jButton;
    int clicks = 0;

    public ActionListenerDemo(){
        setTitle("动作时间监听器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        jLabel=new JLabel(" ");
        jLabel.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
        contentPane.add(jLabel, BorderLayout.SOUTH);
        jButton=new JButton("我是普通按钮");    //创建JButton对象
        jButton.setFont(new Font("黑体",Font.BOLD,16));    //修改字体样式

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("按钮被点击了"+(clicks++)+"次");
            }
        });

        contentPane.add(jButton);
    }

    //处理单击事件的匿名类
/*    class jButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("按钮被点击了"+(clicks++)+"次");
        }
    }*/

    public static void main(String[] args){
        ActionListenerDemo frame=new ActionListenerDemo();
        frame.setVisible(true);
    }
}
