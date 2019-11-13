package SampeTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @auther Jack D
 * @date 2019/11/13  22:17
 */

public class SampeDemo {
    private JPanel jPanel = new JPanel();
    private JComboBox jComboBox = new JComboBox();  //创建下拉列表
    private JLabel jLabel = new JLabel("添加新星座");
    private JLabel showInfo = new JLabel();    //用于显示信息
    private JTextField jTextField = new JTextField(16);//用于输入信息
    private JButton jButtonAdd = new JButton("新增");
    private JButton jButtonDel = new JButton("删除");

    public SampeDemo() {
        JFrame jFrame = new JFrame();
        jComboBox.addItem("--请选择--");    //向下拉列表中添加一项
        jComboBox.addItem("巨蟹座");
        jComboBox.addItem("狮子座");
        jComboBox.addItem("双鱼座");

        jPanel.add(jComboBox);
        jPanel.add(jComboBox);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButtonAdd);
        jPanel.add(jButtonDel);

        jFrame.add(jPanel);

        jButtonAdd.addActionListener(new MyActionListener());
        jButtonDel.addActionListener(new MyActionListener());

        jComboBox.addItemListener(new MyItemListener());

        jFrame.setBounds(300, 200, 600, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            String str = e.getItem().toString();
            jPanel.add(showInfo);
            showInfo.setText("您选择的星座是："+str);
        }
    }

    // 监听添加和删除按钮事件
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String command=e.getActionCommand();
            //添加按钮处理
            if(command.equals("新增"))
            {
                if(jTextField.getText().length()!=0)
                {
                    jComboBox.addItem(jTextField.getText());    //添加项
                    jPanel.add(showInfo);
                    showInfo.setText("添加成功，新增了："+jTextField.getText());
                }
                else
                {
                    jPanel.add(showInfo);
                    showInfo.setText("请输入要添加星座");
                }
            }
            //删除按钮处理
            if(command.equals("删除"))
            {
                if(jComboBox.getSelectedIndex()!=-1)
                {
                    //先获得要删除的项的值
                    String strDel=jComboBox.getSelectedItem().toString();
                    jComboBox.removeItem(strDel);    //删除项
                    jPanel.add(showInfo);
                    showInfo.setText("删除成功，删除了："+strDel);
                }
                else
                {
                    jPanel.add(showInfo);
                    showInfo.setText("请选择要删除的星座");
                }
            }
        }
    }

    public static void main(String[] args) {
        new SampeDemo();    //调用构造方法
    }
}



