import util.*;
import java.awt.event.*;

public class MouseControlledAnimation extends AnimationPanel{
	GameObject controlled;
	
	MouseControlledAnimation(GameObject contr){
		controlled=contr;
		gos.add(controlled);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Vertex delta=new Vertex(e.getX(), e.getY());
				delta.addMod(controlled.getPos().skalarMult(-1));
				delta.addMod(new Vertex(-controlled.getWidth()/2, -controlled.getHeight()/2));
				double factor=controlled.getDeltaPos().length()/delta.length();
				delta.skalarMultMod(factor);
				controlled.setDeltaPos(delta);
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		MovablePanel p = new MouseControlledAnimation(new MovableImage("hexe.png",-200,-200,1,1));
		p.gos.add(new MovableImage("biene.png",400,400,-1,-1));
		ShowInFrame.show(p);
	}
}
