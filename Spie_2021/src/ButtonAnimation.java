import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;


public class ButtonAnimation extends JPanel{
	JButton b= new JButton("Push to move");
	MovablePanel mp =new MovablePanel();
	
	ButtonAnimation() {
		add(mp);
		add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {mp.doOnTick();}
			} ) ;
	}
	
	public static void main(String [] args) {
		ButtonAnimation p=new ButtonAnimation();
		p.mp.gos.add(new MovableImage("hexe.jpeg", 0,0,1,1));
		p.mp.gos.add(new MovableImage("biene.jpeg", 400, 400, -1, -1));
		ShowInFrame.show(p);
		
	}
}
