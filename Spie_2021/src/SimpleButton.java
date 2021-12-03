import javax.swing.*;
import util.ShowInFrame;
public class SimpleButton extends JPanel{

	JButton b=new JButton("pump it to heaven");
	JLabel l=new JLabel("0");
	
	JButton lo=new JButton("down");

	
	JButton r=new JButton("reset");

	
	SimpleButton() {
		add(b);
		add(lo);
		add(r);
		add(l);
		
	}
	
	public static void main(String[] args) {
		
		ShowInFrame.show(new SimpleButton());

	}

}
