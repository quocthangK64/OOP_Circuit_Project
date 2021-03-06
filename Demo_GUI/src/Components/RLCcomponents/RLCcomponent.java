package Components.RLCcomponents;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import Components.Component;
import guiWindows.drawcircuit.SpecSetting;

public abstract class RLCcomponent extends Component {

	RLCcomponent(double spec, String name) {
		super(spec, name);
		// TODO Auto-generated constructor stub
	}
	
	public void drawComponent(Graphics2D g2D, double startX, boolean connectType) {
		if(connectType == false) {
			Image image = getComponentImage(connectType);
			AffineTransform at = AffineTransform.getTranslateInstance((double)startX-image.getWidth(null)*SpecSetting.parallelImageScale/2, (double)SpecSetting.Height/2-image.getHeight(null)*(double)SpecSetting.parallelImageScale/2);
			at.scale(SpecSetting.parallelImageScale, SpecSetting.parallelImageScale);
			g2D.drawImage(image, at, null);
			g2D.drawString(this.name, (int)startX, (int)SpecSetting.Height/2-image.getHeight(null)*(int)SpecSetting.parallelImageScale/2);
		}
		else if(connectType == true){
			Image image = getComponentImage(connectType);
			AffineTransform at = AffineTransform.getTranslateInstance((double)startX, (double)SpecSetting.serieupperYlocation-image.getHeight(null)*(double)SpecSetting.parallelImageScale/2 + SpecSetting.serieComponentOffSetWithScale);
			at.scale(SpecSetting.serieImageScale, SpecSetting.serieImageScale);
			g2D.drawImage(image, at, null);
			g2D.drawString(this.name, (int)startX+(int)SpecSetting.serieComponentWidth/2, (int)((double)SpecSetting.serieupperYlocation-image.getHeight(null)*(double)SpecSetting.parallelImageScale/2));
		}
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            