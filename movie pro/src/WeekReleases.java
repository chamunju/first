import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeekReleases extends JFrame {
	private JPanel panel;
	private JLabel ReleasesLabel;

	public WeekReleases() {
		setTitle("Weekly Releases Movie");
		setSize(1000, 500);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());

		ReleasesLabel = new JLabel();
		panel.add(ReleasesLabel);

		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void showWeekReleases() {
		ArrayList<String> weekList = new ArrayList<>();
		weekList.add("Triangle of Sadness");
		weekList.add("Guardians of the Galaxy Vol. 2");
		weekList.add("The Little Mermaid");
		weekList.add("Suzume");
		
		for (String WeekReleases : weekList) {
			System.out.println(weekList);
			
			
		}
	}
}
