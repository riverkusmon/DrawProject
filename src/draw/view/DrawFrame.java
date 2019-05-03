package draw.view;

import javax.swing.*;
import draw.controller.DrawController;

public class DrawFrame extends JFrame
{
	private static final long serialVersionUID = 3L;
	
	private DrawController app;
	private DrawAppPanel pane;
	
	public DrawFrame(DrawController app)
	{
		super();
		
		this.app = app;
		pane = new DrawAppPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 800);
		this.setContentPane(pane);
		this.setResizable(false);
		this.setVisible(true);
	}
}
