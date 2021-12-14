import javax.swing.*;

import util.ShowInFrame;

import java.awt.event.*;

public class Counter extends SimpleButton{
	int i=0;
	public Counter() {
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						i++;
						l.setText(""+i);
					}
				}
		);
		lo.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						i--;
						l.setText(""+i);
					}
				}
		);
		r.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						i=0;
						l.setText(""+i);
					}
				}
		);
	}
	
	
	public static void main(String[] args) {
		ShowInFrame.show(new Counter());
	}
}