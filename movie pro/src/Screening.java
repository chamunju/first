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
		
		JButton btn1 = new JButton("상영중 영화");
		JButton btn2 = new JButton("이번주 개봉작");
		JButton btn3 = new JButton("개봉예정작");
		JButton btn4 = new JButton("영화 예매하기");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		
		//상영 중 영화 
		now = new NowPlaying();
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//이번주 개봉작 
		weekReleases = new WeekReleases();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weekReleases.showWeekReleases();
				dispose();
				weekReleases.setVisible(true);
			}
		});
		
		
		//개봉예정작  
		upcoming = new UpcomingReleases();
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	    //영화 예매하기 ..일단 극장 리스트만
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
