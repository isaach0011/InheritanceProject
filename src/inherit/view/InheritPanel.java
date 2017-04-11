package inherit.view;

import javax.swing.*;
import inherit.controller.InheritController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class InheritPanel extends JPanel
{
	private InheritController baseController;
	private InheritFrame baseFrame;
	private SpringLayout baseLayout;
	
	public InheritPanel(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.gray);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
