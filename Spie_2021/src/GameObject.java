interface GameObject extends Movable, Paintable {
	double getWidth();
	double getHeight();
	Vertex getPos();
	Vertex getDeltaPos();
	void setDeltaPos();
	boolean isLargerThan(GameObject that);
	boolean touches(GameObject that);
	
	
}
