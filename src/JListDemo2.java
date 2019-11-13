import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * @auther Jack D
 * @date 2019/11/13  21:56
 */

public class JListDemo2 extends JFrame {
    JList list;
    JLabel label;
    public JListDemo2(){
        setTitle("监听列表项选择事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);

        JPanel contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        label=new JLabel(" ");
        contentPane.add(label,BorderLayout.SOUTH);

        JScrollPane scrollPane=new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);

        list=new JList();
        scrollPane.setViewportView(list);
        String[] listData=new String[7];
        listData[0]="《一点就通学Java》";
        listData[1]="《一点就通学PHP》";
        listData[2]="《一点就通学Visual Basic）》";
        listData[3]="《一点就通学Visual C++）》";
        listData[4]="《Java编程词典》";
        listData[5]="《PHP编程词典》";
        listData[6]="《C++编程词典》";
        list.setListData(listData);

        list.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e)
            {
                do_list_valueChanged(e);
            }

            private void do_list_valueChanged(ListSelectionEvent e) {
                label.setText("感谢您购买："+list.getSelectedValue());
            }
        });
    };
    public static void main(String[] args)
    {
        JListDemo2 frame=new JListDemo2();
        frame.setVisible(true);
    }
}
