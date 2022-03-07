import java.awt.*;
import javax.swing.*;


public class MathsTutor{
	JFrame frame = new JFrame("MathsTutor");

	public MathsTutor(int pWidth,int pHeight){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(pWidth,pHeight);

		Jlabel prompt = new JLabel("Welcome to Maths Tutor");
		JButton lessThan = new JButton("<");
		JButton equals = new JButton("=");
		JButton greaterThan = new JButton(">");
		JButton question = new JButton("Ask me a question!");

		JPanel panel = new JPanel();
		frame.setContentPane(panel);

		GridLayout MainLayout = new GridLayout(3,1);
		panel.setLayout(MainLayout);
		
		JPanel midPanel = new JPanel();
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();


		panel.add(topPanel);
		panel.add(midPanel);
		panel.add(bottomPanel);

		midPanel.add(lessThan);
		midPanel.add(greaterThan);
		midPanel.add(equals);

		topPanel.add(prompt);
		bottomPanel.add(question);


		frame.setVisible(true);
	}


	public String generateQuestion(){
		int[] nums;
		for (int i=0;i<4;i++){
			nums[i]=(int) Math.random()*10;
		}
		return "is"+Integer.toString(nums[0])+"+"+Integer.toString(nums[1])+"less than, equals to or greater than "+Integer.toString(nums[2])+"+"+Integer.toString(nums[3]);
	}
}