import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event_handling extends Applet implements ActionListener
{
	Label nameInput,genderInput,ageLevel;
	TextField nameField;
	CheckboxGroup genderGroup;
	Button submit;
	Choice ageInput;
	
	String name,gender;
	int age;
	
	public void init()
	{
		setSize(300,300);
		nameInput=new Label("Enter your name: ");
		genderInput=new Label("Select your gender: ");
		ageLevel=new Label("Select your age: ");
		nameField=new TextField(20);
		genderGroup=new CheckboxGroup();
		ageInput=new Choice();
		//ageInput.addItem("Select");
		ageInput.addItem("15");
		ageInput.addItem("16");
		ageInput.addItem("17");
		ageInput.addItem("18");
		ageInput.addItem("19");
		submit=new Button("Submit");
		add(nameInput);
		add(nameField);
		add(genderInput);
		add(new Checkbox("MALE",genderGroup,true));
		add(new Checkbox("FEMALE",genderGroup,false));
		add(ageLevel);
		add(ageInput);
		add(submit);
		nameField.addActionListener(this);
		submit.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		if(name.length()<=0)
		{
			g.setColor(Color.red);
			g.drawString("PLEASE ENTER A NAME", 20, 130);
			g.setColor(Color.black);
		}
		if(name!=null)
		g.drawString("NAME: "+name, 20, 150);
		if(gender!=null)
		g.drawString("GENDER: "+gender, 20, 170);
		if(age!=0)
		g.drawString("AGE: "+age, 20, 190);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		name=nameField.getText();
		gender=genderGroup.getSelectedCheckbox().getLabel();
		age=Integer.parseInt(ageInput.getSelectedItem());
		repaint();
	}
	
}
