import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class joonis1{
	String nimetus;
	int lahtmeKoord;
	int suudmeKoord;
	
	public void joonista(String nimetus, int lahtmeKoord, int suudmeKoord) throws Exception{
		this.nimetus = nimetus;
		this.lahtmeKoord = lahtmeKoord;
		this.suudmeKoord = suudmeKoord;
		
		BufferedImage bi = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.createGraphics();
		
		String[] split = lahtmeKoord.split(".");
		lahtX = split[0];
		lahtY = split[1];
		
		split = suudmeKoord.split(".");
		suudX = split[0];
		suudY = split[1];
		g.setColor(Color.BLUE);
		g.drawLine(lahtX, lahtY, suudX, suudY);
		g.setColor(Color.RED);
		g.drawString(nimetus, Math.abs(suudX-lahtX), Math.abs(suudY-lahtY);
		ImageIO.write(bi, "png", new File("jõed.png"));
	}	
}