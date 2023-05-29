import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screening extends JFrame{
	private Theater theater;
	private WeekReleases weekReleases;
	private UpcomingReleases upcoming;
	private NowPlaying now;
	
	public Screening() {
		JPanel panel = new JPanel();
		setTitle("Cinema");
		setSize(1000, 500);
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("�긽�쁺以�");
		JButton btn2 = new JButton("�씠踰덉＜ 媛쒕큺�옉");
		JButton btn3 = new JButton("媛쒕큺�삁�젙�옉");
		JButton btn4 = new JButton("�쁺�솕 �삁留ㅽ븯湲�");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		
		//�쁽�옱 �긽�쁺以묒씤 �쁺�솕 紐⑸줉 
		now = new NowPlaying();
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//�씠踰덉＜ 媛쒕큺�옉 
		weekReleases = new WeekReleases();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weekReleases.showWeekReleases();
				dispose();
				weekReleases.setVisible(true);
			}
		});
		
		
		//媛쒕큺�삁�젙�옉 紐⑸줉 
		upcoming = new UpcomingReleases();
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	    //�쁺�솕 �삁留� -> �씪�떒 洹뱀옣... 
		theater = new Theater(); 
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                theater.showTheaters();
                dispose();
                theater.setVisible(true);
            }
        });
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		Screening s = new Screening(); 
	}
}
