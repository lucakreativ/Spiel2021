

public class PaintableArrayPanel extends SizedPanel{

	Paintable[] ps;
	
	public PaintableArrayPanel(Paintable[] pa) {ps=pa;}
	
	public void PaintComponent(java.awt.Graphics g) {
		for (Paintable p:ps) p.paintTo(g);
	}
	
	public static void main(String[] args) {
		
	}
}
