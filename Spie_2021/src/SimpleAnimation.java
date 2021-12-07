import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;

public class SimpleAnimation extends MovableImage{
	
	Timer t =new Timer(30, new ActionListener() {
		public void actionPerformed(ActionEvent e) {doOnTick();}
	});
	
	SimpleAnimation(){t.start();}
	
	public static void main(String[] args) {
		MovablePanel p = new SimpleAnimation();
		p.mp.gos.add(new MovableImage("hexe.jpeg", 0,0,1,1));
		p.mp.gos.add(new MovableImage("biene.jpeg", 400, 400, -1, -1));
		ShowInFrame.show(p);
	}
	
}
