import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/13  0:48
 */

public class JListDemo1 extends JFrame {
    public JListDemo1()
    {
        setTitle("Java列表框组件示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置窗体退出时操作
        setBounds(100,100,300,200);    //设置窗体位置和大小

        JPanel jPanel=new JPanel();    //创建内容面板
        jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));    //设置面板的边框
        jPanel.setLayout(new BorderLayout(0, 0));    //设置内容面板为边界布局
        setContentPane(jPanel);    //应用内容面板

        JScrollPane jScrollPane=new JScrollPane();    //创建滚动面板
        jPanel.add(jScrollPane,BorderLayout.CENTER);    //将面板增加到边界布局中央

        JList jList=new JList();
        //限制只能选择一个元素
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jScrollPane.setViewportView(jList);    //在滚动面板中显示列表
        String[] listData=new String[12];    //创建一个含有12个元素的数组
        for (int i=0;i<listData.length;i++)
        {
            listData[i]="这是列表框的第"+(i+1)+"个元素~";    //为数组中各个元素赋值
        }
        jList.setListData(listData);    //为列表填充数据
    }
    public static void main(String[] args)
    {
        JListDemo1 frame=new JListDemo1();
        frame.setVisible(true);
    }
}
