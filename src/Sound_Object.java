import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Sound_Object extends Applet implements ActionListener
{
	AudioClip tune;
	Button play,loop,stop;
	public void init()
	{
		tune=getAudioClip(getDocumentBase(),"12.wav");
		play=new Button("PLAY");
		loop=new Button("LOOP");
		stop=new Button("STOP");
		tune.play();
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		
		add(play);
		add(loop);
		add(stop);
		
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==play)
			tune.play();
		if(a.getSource()==loop)
			tune.loop();
		if(a.getSource()==stop)
			tune.stop();
		repaint();
	}
}
