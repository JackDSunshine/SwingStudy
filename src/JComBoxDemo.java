import javax.swing.*;

/**
 * @auther Jack D
 * @date 2019/11/13  0:38
 */

public class JComBoxDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("证件类型");

        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("--请选择--");    //向下拉列表中添加一项
        jComboBox.addItem("身份证");
        jComboBox.addItem("驾驶证");
        jComboBox.addItem("军官证");

        jPanel.add(jLabel);
        jPanel.add(jComboBox);
        jFrame.add(jPanel);
        jFrame.setBounds(300,200,400,100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
