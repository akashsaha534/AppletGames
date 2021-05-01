import java.awt.*;
import java.awt.event.*;
public class MENU extends java.applet.Applet 
{
    Frame window;
    public void init() 
    {
        add(new Button("Open Window"));
        add(new Button("Close Window"));
        window = new MyFrame("A Popup Window");
        window.resize(150,150);
        //window.show();
    }
    public boolean action(Event evt, Object arg) 
    {
         String label = (String)arg;
        if (evt.target instanceof Button) 
        {
            if (label.equals("Open Window")) 
            {
                if (!window.isShowing())
                window.show();
            }
            else if (label == "Close Window") 
            {
                if (window.isShowing())
                window.hide();
            }
            return true;
        }
        else 
        return false;
    }
}
class MyFrame extends Frame 
{
    Label l;
    Dialog dl;
    TextField tf;
    Button b;
    MyFrame(String title) 
    {
        super(title);
        l=new Label(title);
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Colors");
        m.add(new MenuItem("Red"));
        m.add(new MenuItem("Blue"));
        m.add(new MenuItem("Green"));
        m.add(new MenuItem("-"));
        m.add(new CheckboxMenuItem("Reverse Text"));
        mb.add(m);
        Menu hm = new Menu("Help");
        mb.add(hm);
        mb.setHelpMenu(hm);
        m.add(new MenuItem("Set Text..."));
        dl = new Dialog(this,"Enter Text",true);
        dl.setLayout(new GridLayout(2,1,30,30));
        tf = new TextField(l.getText(),20);
        dl.add(tf);
        b=new Button("OK");
        dl.add(b);
        dl.resize(150,75);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
            	l.setText(tf.getText());
                setVisible(false);
            }
        });
        setMenuBar(mb);
        //...
    }
    public boolean action(Event evt, Object arg) 
    {
        if (evt.target instanceof Button) 
        {
        	String label=(String)arg;
            if (label.equals("OK")) 
            {
                l.setText(tf.getText());
                dl.hide();
            }
            return true;
        }
        else if (evt.target instanceof MenuItem) 
        {
        	String label = (String)arg;
            if (label.equals("Red")) 
            setBackground(Color.red);
            if (label.equals("Blue")) 
            setBackground(Color.blue);
            if (label.equals("Green")) 
            setBackground(Color.green);
            if (label.equals("Reverse Text")) 
            {
                if (getForeground() == Color.black)
                setForeground(Color.white);
                else 
                setForeground(Color.black);
            }
            if (label.equals("Set Text...")) 
            dl.show();
            return true;
        }
        else 
        return false;
    }
}