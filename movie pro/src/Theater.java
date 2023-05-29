import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Theater extends JFrame {
    private JPanel panel;
    private JLabel theaterLabel;

    public Theater() {
        setTitle("Cinema");
        setSize(1000, 500);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        theaterLabel = new JLabel();
        panel.add(theaterLabel);

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showTheaters() {
        ArrayList<String> theaterList = new ArrayList<>();
        theaterList.add("��ȭ�� ����");
        theaterList.add("����������");
        theaterList.add("�����̱���");
        theaterList.add("���̸��ó׸�");

        StringBuilder sb = new StringBuilder();
        for (String theater : theaterList) {
            sb.append(theater).append("<br>");
        }

        theaterLabel.setText("<html>" + sb.toString() + "</html>");
    }
}
