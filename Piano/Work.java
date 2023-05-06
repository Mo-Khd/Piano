
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;

public class Work extends JPanel{

	static Rectangle2D.Double real1;
	static Rectangle2D.Double real2;
	static Rectangle2D.Double real3;
	static Rectangle2D.Double real4;
	static Rectangle2D.Double real5;
	static Rectangle2D.Double real6;
	static Rectangle2D.Double real7;
	static Rectangle2D.Double real8;
	static Rectangle2D.Double sreal1;
	static Rectangle2D.Double sreal2;
	static Rectangle2D.Double sreal3;
	static Rectangle2D.Double sreal4;
	static Rectangle2D.Double sreal5;
	BufferedImage music,music1,music2,music3;
	static Rectangle2D.Double madrid;
	static double y=0,y1=-900,y2=-3000,y3=-1500,y4=-1000,y5=-2000,y6=-2700,y7=-300,xx=0;
	static double sy=-5000,sy1=-3000,sy2=-1800,sy3=-4000,sy4=-500;
	static int speed=0;
	static double speedy=1.0;
	static int s=0,s1=0;


	Timer t1=new Timer(100,new t1());
	Timer t2=new Timer(100,new t1());
	Timer t3=new Timer(100,new t1());
	Timer t4=new Timer(100,new t1());
	Timer t5=new Timer(100,new t1());
	Timer t6=new Timer(100,new t1());
	Timer t7=new Timer(100,new t1());
	Timer t8=new Timer(100,new t1());

	Timer st1=new Timer(100,new t1());
	Timer st2=new Timer(100,new t1());
	Timer st3=new Timer(100,new t1());
	Timer st4=new Timer(100,new t1());
	Timer st5=new Timer(100,new t1());

	Color b1=Color.BLACK;
	Color b2=Color.BLACK;
	Color b3=Color.BLACK;
	Color b4=Color.BLACK;
	Color b5=Color.BLACK;

	Color w1=Color.WHITE;
	Color w2=Color.WHITE;
	Color w3=Color.WHITE;
	Color w4=Color.WHITE;
	Color w5=Color.WHITE;
	Color w6=Color.WHITE;
	Color w7=Color.WHITE;
	Color w8=Color.WHITE;




	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;

		setBackground(Color.PINK);
		real1=new Rectangle2D.Double(1,getHeight()-141,50,140);
		real2=new Rectangle2D.Double(52,getHeight()-141,50,140);
		real3=new Rectangle2D.Double(103,getHeight()-141,50,140);
		real4=new Rectangle2D.Double(154,getHeight()-141,50,140);
		real5=new Rectangle2D.Double(205,getHeight()-141,50,140);
		real6=new Rectangle2D.Double(256,getHeight()-141,50,140);
		real7=new Rectangle2D.Double(307,getHeight()-141,50,140);
		real8=new Rectangle2D.Double(358,getHeight()-141,50,140);

		sreal1=new Rectangle2D.Double(43,478,16,75);
		sreal2=new Rectangle2D.Double(94,478,16,75);
		sreal3=new Rectangle2D.Double(145,478,16,75);
		sreal4=new Rectangle2D.Double(247,478,16,75);
		sreal5=new Rectangle2D.Double(298,478,16,75);

		madrid=new Rectangle2D.Double(0,getHeight()-142,getWidth(),143);

		g2d.setColor(Color.BLACK);
		g2d.fill(madrid);
		g2d.setColor(w1);
		g2d.fill(real1);
		g2d.setColor(w2);
		g2d.fill(real2);
		g2d.setColor(w3);
		g2d.fill(real3);
		g2d.setColor(w4);
		g2d.fill(real4);
		g2d.setColor(w5);
		g2d.fill(real5);
		g2d.setColor(w6);
		g2d.fill(real6);
		g2d.setColor(w7);
		g2d.fill(real7);
		g2d.setColor(w8);
		g2d.fill(real8);
		g2d.setColor(b1);
		g2d.fill(sreal1);
		g2d.setColor(b2);
		g2d.fill(sreal2);
		g2d.setColor(b3);
		g2d.fill(sreal3);
		g2d.setColor(b4);
		g2d.fill(sreal4);
		g2d.setColor(b5);
		g2d.fill(sreal5);




		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font("Verdana", Font.BOLD, 20));
		g2d.drawString("Score :"+Integer.toString(s), 30, 30);
		g2d.drawString("Missed :"+Integer.toString(s1), 280, 30);
		g2d.setFont(new Font("Cooper", Font.PLAIN, 40));


		try
		{
		music = ImageIO.read(new File("1.png"));
		music1 = ImageIO.read(new File("2.png"));
		music2 = ImageIO.read(new File("3.png"));
		music3 = ImageIO.read(new File("4.png"));


		g2d.drawImage(music1, 15, (int) y-30,20,30,null);
		g2d.drawImage(music2, 65, (int) y1-30,20,40,null);
		g2d.drawImage(music1, 116, (int) y2-30,20,30,null);
		g2d.drawImage(music2, 173, (int) y3-30,20,40,null);
		g2d.drawImage(music, 220, (int) y4-30,20,30,null);
		g2d.drawImage(music2, 273, (int) y5-30,20,40,null);
		g2d.drawImage(music1, 320, (int) y6-30,20,30,null);
		g2d.drawImage(music, 370, (int) y7-30,20,30,null);

		g2d.drawImage(music3, 44, (int) sy-28,9,28,null);
		g2d.drawImage(music3, 96, (int) sy1-28,9,28,null);
		g2d.drawImage(music3, 147, (int) sy2-28,9,28,null);
		g2d.drawImage(music3, 250, (int) sy3-28,9,28,null);
		g2d.drawImage(music3, 300, (int) sy4-28,9,28,null);


		}

		catch (Exception ex){ ex.printStackTrace(); }


		if(speed==5){
		speedy=speedy+0.3;
		speed=0;
		}

		if(y>=getHeight()+30){
			y=0;s1++;}
		if(y1>=getHeight()+30){
			y1=-900;s1++;}
		if(y2>=getHeight()+30){
			y2=-3000;s1++;}
		if(y3>=getHeight()+30){
			y3=-1500;s1++;}
		if(y4>=getHeight()+30){
			y4=-1000;s1++;}
		if(y5>=getHeight()+30){
			y5=-2000;s1++;}
		if(y6>=getHeight()+30){
			y6=-2700;s1++;}
		if(y7>=getHeight()+30){
			y7=-300;s1++;}
		if(sy>=getHeight()+30){
			sy=-5000;s1++;}
		if(sy1>=getHeight()+30){
			sy1=-3000;s1++;}
		if(sy2>=getHeight()+30){
			sy2=-1800;s1++;}
		if(sy3>=getHeight()+30){
			sy3=-4000;s1++;}
		if(sy4>=getHeight()+30){
			sy4=-500;s1++;}


		if(s1==10)
		{
			Music.p.stop();
			Music.over.play();

			int option=JOptionPane.showConfirmDialog(null, "Score: "+s+"\nTry Again?", "Game Over! 10 Missed", JOptionPane.YES_OPTION);
			if(option==1){
				System.exit(1);
			}
			else{
				y=0;y1=-900;y2=-3000;y3=-1500;y4=-1000;y5=-2000;y6=-2700;y7=-300;xx=0;
				sy=-5000;sy1=-3000;sy2=-1800;sy3=-4000;sy4=-500;
				speed=0;
				speedy=1;
				s=0;s1=0;
				Piano.frame.setVisible(false);
				Piano.run();
			}
		}

		move();

		key h=new key();
		addKeyListener(h);
		mouse hh=new mouse();
		addMouseListener(hh);


		repaint();
		  try {
			Thread.sleep(12);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}



	public void move(){

			y+=speedy;
			y1+=speedy;
			y2+=speedy;y3+=speedy;y4+=speedy;y5+=speedy;y6+=speedy;y7+=speedy;
			sy+=speedy;sy1+=speedy;sy2+=speedy;sy3+=speedy;sy4+=speedy;


		}


	class t1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {


			w1=Color.WHITE;
			t1.stop();

			w2=Color.WHITE;
			t2.stop();

			w3=Color.WHITE;
			t3.stop();

			w4=Color.WHITE;
			t4.stop();

			w5=Color.WHITE;
			t5.stop();

			w6=Color.WHITE;
			t6.stop();

			w7=Color.WHITE;
			t7.stop();

			w8=Color.WHITE;
			t8.stop();

			b1=Color.BLACK;
			b2=Color.BLACK;
			b3=Color.BLACK;
			b4=Color.BLACK;
			b5=Color.BLACK;
			st1.stop();
			st2.stop();
			st3.stop();
			st4.stop();
			st5.stop();


			}

		}



	class mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			//System.out.println(e.getPoint());
			xx=e.getY();
			if(e.getX()>1&&e.getX()<50){
				if(y<478&&y!=-30)
				Music.no.play();
				t1.start();
				w1=new Color(153,217,234);
				if(y>=478&&y<=getHeight()+20){

					Music.a.play();
					y=-30;
					speed++; s++;
				}

				}

			else if(e.getX()>52&&e.getX()<101){
				if(y1<478&&y1!=-800)
					Music.no.play();
				t2.start();
				w2=new Color(153,217,234);
				if(y1>=478&&y1<=getHeight()+20){
					Music.b.play();
					y1=-800;
					speed++; s++;
				}
			}

			else if(e.getX()>103&&e.getX()<152){
				if(y2<478&&y2!=-2900)
					Music.no.play();
				t3.start();
				w3=new Color(153,217,234);
				if(y2>=478&&y2<=getHeight()+20){
					Music.c.play();
					y2=-2900;
					speed++; s++;
				}
			}

			else if(e.getX()>154&&e.getX()<203){
				if(y3<478&&y3!=-1400)
					Music.no.play();
				t4.start();
				w4=new Color(153,217,234);
				if(y3>=478&&y3<=getHeight()+20){
					Music.d.play();
					y3=-1400;
					speed++; s++;
				}
			}

			else if(e.getX()>205&&e.getX()<254){
				if(y4<478&&y4!=-900)
					Music.no.play();
				t5.start();
				w5=new Color(153,217,234);
				if(y4>=478&&y4<=getHeight()+20){
					Music.e.play();
					y4=-900;
					speed++; s++;
				}
			}

			else if(e.getX()>256&&e.getX()<305){
				if(y5<478&&y5!=-1900)
					Music.no.play();
				t6.start();
				w6=new Color(153,217,234);
				if(y5>=478&&y5<=getHeight()+20){
					Music.f.play();
					y5=-1900;
					speed++; s++;
				}
			}

			else if(e.getX()>307&&e.getX()<356){
				if(y6<478&&y6!=-2600)
					Music.no.play();
				t7.start();
				w7=new Color(153,217,234);
				if(y6>=478&&y6<=getHeight()+20){
					Music.g.play();
					y6=-2600;
					speed++; s++;
				}
			}

			else if(e.getX()>358&&e.getX()<407){
				if(y7<478&&y7!=-250)
					Music.no.play();
				t8.start();
				w8=new Color(153,217,234);
				if(y7>=478&&y7<=getHeight()+20){
					Music.a.play();
					y7=-250;
					speed++; s++;
				}
			}

			else if(e.getX()>=43&&e.getX()<=59){
				if(sy<478&&sy!=-4800)
					Music.no.play();
				st1.start();
				b1=new Color(153,217,234);
				if(sy>=478&&sy<=581){
					Music.bb.play();
					sy=-4800;
					speed++; s++;
				}
			}

			else if(e.getX()>=94&&e.getX()<=110){
				if(sy1<478&&sy1!=-2900)
					Music.no.play();
				st2.start();
				b2=new Color(153,217,234);
				if(sy1>=478&&sy1<=581){
					Music.ch.play();
					sy1=-2900;
					speed++; s++;
				}
			}

			else if(e.getX()>=145&&e.getX()<=161){
				if(sy2<478&&sy2!=-1700)
					Music.no.play();
				st3.start();
				b3=new Color(153,217,234);
				if(sy2>=478&&sy2<=581){
					Music.eb.play();
					sy2=-1700;
					speed++; s++;
				}
			}

			else if(e.getX()>=247&&e.getX()<=263){
				if(sy3<478&&sy3!=-3900)
					Music.no.play();
				st4.start();
				b4=new Color(153,217,234);
				if(sy3>=478&&sy3<=581){
					Music.fh.play();
					sy3=-3900;
					speed++; s++;
				}
			}

			else if(e.getX()>=298&&e.getX()<=314){
				if(sy4<478&&sy4!=-450)
					Music.no.play();
				st5.start();
				b5=new Color(153,217,234);
				if(sy4>=478&&sy4<=581){
					Music.gh.play();
					sy4=-450;
					speed++; s++;
				}
			}





		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}


	public void addNotify() {
        super.addNotify();
        requestFocus();
    }

class key extends KeyAdapter{

		public void keyPressed(KeyEvent e){

			if (e.getKeyCode() == KeyEvent.VK_A)
			{

				if(y<478&&y!=-30)
					Music.no.play();
					t1.start();
					w1=new Color(153,217,234);
					if(y>=478&&y<=getHeight()+20){

						Music.a.play();
						y=-30;
						speed++; s++;
					}


			}

			else if (e.getKeyCode() == KeyEvent.VK_S)
			{

				if(y1<478&&y1!=-800)
					Music.no.play();
				t2.start();
				w2=new Color(153,217,234);
				if(y1>=478&&y1<=getHeight()+20){
					Music.b.play();
					y1=-800;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_D)
			{

				if(y2<478&&y2!=-2900)
					Music.no.play();
				t3.start();
				w3=new Color(153,217,234);
				if(y2>=478&&y2<=getHeight()+20){
					Music.c.play();
					y2=-2900;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_F)
			{

				if(y3<478&&y3!=-1400)
					Music.no.play();
				t4.start();
				w4=new Color(153,217,234);
				if(y3>=478&&y3<=getHeight()+20){
					Music.d.play();
					y3=-1400;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_G)
			{

				if(y4<478&&y4!=-900)
					Music.no.play();
				t5.start();
				w5=new Color(153,217,234);
				if(y4>=478&&y4<=getHeight()+20){
					Music.e.play();
					y4=-900;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_H)
			{

				if(y5<478&&y5!=-1900)
					Music.no.play();
				t6.start();
				w6=new Color(153,217,234);
				if(y5>=478&&y5<=getHeight()+20){
					Music.f.play();
					y5=-1900;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_J)
			{

				if(y6<478&&y6!=-2600)
					Music.no.play();
				t7.start();
				w7=new Color(153,217,234);
				if(y6>=478&&y6<=getHeight()+20){
					Music.g.play();
					y6=-2600;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_K)
			{

				if(y7<478&&y7!=-250)
					Music.no.play();
				t8.start();
				w8=new Color(153,217,234);
				if(y7>=478&&y7<=getHeight()+20){
					Music.a.play();
					y7=-250;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_W)
			{

				if(sy<478&&sy!=-4800)
					Music.no.play();
				st1.start();
				b1=new Color(153,217,234);
				if(sy>=478&&sy<=581){
					Music.bb.play();
					sy=-4800;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_E)
			{

				if(sy1<478&&sy1!=-2900)
					Music.no.play();
				st2.start();
				b2=new Color(153,217,234);
				if(sy1>=478&&sy1<=581){
					Music.ch.play();
					sy1=-2900;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_R)
			{

				if(sy2<478&&sy2!=-1700)
					Music.no.play();
				st3.start();
				b3=new Color(153,217,234);
				if(sy2>=478&&sy2<=581){
					Music.eb.play();
					sy2=-1700;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_Y)
			{

				if(sy3<478&&sy3!=-3900)
					Music.no.play();
				st4.start();
				b4=new Color(153,217,234);
				if(sy3>=478&&sy3<=581){
					Music.fh.play();
					sy3=-3900;
					speed++; s++;
				}


			}

			else if (e.getKeyCode() == KeyEvent.VK_U)
			{

				if(sy4<478&&sy4!=-450)
					Music.no.play();


				st5.start();
				b5=new Color(153,217,234);
				if(sy4>=478&&sy4<=581){
					Music.gh.play();
					sy4=-450;
					speed++; s++;
				}


			}

		}

	}

}
