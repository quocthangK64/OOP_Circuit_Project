package Components.RLCcomponents;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Capacitor extends RLCcomponent{
	
	public Capacitor(double spec, String name){
		super(spec, name);
	}

	@Override
	public Image getComponentImage(boolean connectType) {
		if(connectType == false)
			return new ImageIcon(Capacitor.class.getResource("/imgs/parallel/capacitor_Parallel.png")).getImage();
		else
			return new ImageIcon(Capacitor.class.getResource("/imgs/series/capacitor_Serie.png")).getImage();
	}
}
