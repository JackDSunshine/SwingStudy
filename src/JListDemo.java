import javax.swing.*;

/**
 * @auther Jack D
 * @date 2019/11/13  0:43
 */

public class JListDemo {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("Java列表框组件示例");
        JPanel jPanel=new JPanel();    //创建面板
        JLabel jLabel=new JLabel("证件类型：");    //创建标签

        String[] items=new String[]{"身份证","驾驶证","军官证"};
        JList list=new JList(items);    //创建JList

        jPanel.add(jLabel);
        jPanel.add(list);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
