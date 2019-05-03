package draw.view;

import javax.swing.*;
import draw.controller.DrawController;

public class DrawPanel extends JPanel
{
	private DrawController app;
	
	public DrawPanel(DrawController app)
	{
		super();
		
		this.app = app;
	}
}
