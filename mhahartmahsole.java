/***************************************************************
 * File: mhaHartMahSole.java 
 * @shelzebub
 ***************************************************************/
package dataAndExpressions;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class mhaHartMahSole extends JApplet {
    /**********************
     * Drawing me. kappa.
     **********************/
    private static final long serialVersionUID = -904316628405194215L;
    
    public void paint (Graphics page) {
     
        final int mid = 200;
        final int top = 200;

        setBackground(Color.white); //initialize background color
        page.setColor(getBackground()); //
        page.fillRect(0, 0, getWidth(), getHeight());                                                   
        
        //face:
        final int faceDiam = 200;        
       
        page.setColor(new Color(143,255,0));
        page.fillOval(mid/2, top/2-17, faceDiam, faceDiam*15/20);//fill of face 
        page.setColor(Color.black);
        page.drawArc(mid/2, top/2-15, faceDiam, faceDiam*15/20, -13, 245);// head line
        page.drawArc(mid/2, top/2, faceDiam, faceDiam*2/3, 200, 150); //chin line
        
        //hair
        page.drawArc(mid/2, top/2-18, faceDiam, faceDiam*15/20, -3, 183);
        page.drawArc(mid/2, top/2-18, faceDiam, faceDiam*15/20, -3, 183);
        page.drawArc(mid/2, top/2-15, faceDiam, faceDiam*15/20, -3, 183);
        page.drawArc(mid/2, top/2-15, faceDiam, faceDiam*15/20, -3, 183);
        page.drawArc(mid/2, top/2-21, faceDiam, faceDiam*15/20, -3, 183);
        page.drawArc(mid/2, top/2-21, faceDiam, faceDiam*15/20, -3, 183);
        
        //cheeks:
        final int cheekDiam = 90;
        
        //cheekLeft:
        page.setColor(new Color(143,255,0));
        page.fillOval(mid/4+5, top-22, cheekDiam, cheekDiam*2/3);//fill left cheek
        page.setColor(Color.black);
        page.drawArc(mid/4+5, top-22, cheekDiam, cheekDiam*2/3, 80, 263);
        
        //cheekRight:
        page.setColor(new Color(143,255,0));
        page.fillOval(mid/4*5+5, top-22, cheekDiam, cheekDiam*2/3);//fill right cheek
        page.setColor(Color.black);
        page.drawArc(mid/4*5+5, top-22, cheekDiam, cheekDiam*2/3, 200, 263);       
        
        //mouth
        page.drawLine(mid/5*3+4, top,   mid/5*7-4, top); //lipTop
        page.setColor(new Color(183, 28, 0));//maroon
        page.setColor(Color.black);
        page.drawLine(mid/5*3+4, top+2, mid/5*7-4, top+2);
        page.setColor(new Color(183, 28, 0));
        page.drawLine(mid/5*3+4, top+1, mid/5*7-4, top+1); 
        page.drawLine(mid/5*3+4, top,   mid/5*7-4, top);         
        page.drawLine(mid/5*3+4, top-1, mid/5*7-4, top-1); 
        page.drawLine(mid/5*3+4, top-2, mid/5*7-4, top-2); 
        page.drawLine(mid/5*3+4, top-3, mid/5*7-4, top-3); 
        page.drawLine(mid/5*3+4, top-4, mid/5*7-4, top-4); 
        page.drawLine(mid/5*3+4, top-5, mid/5*7-4, top-5); 
        page.drawLine(mid/5*3+4, top-6, mid/5*7-4, top-6); 
        page.drawLine(mid/5*3+4, top-7, mid/5*7-4, top-7);    
        page.drawLine(mid/5*3+4, top-8, mid/5*7-4, top-8);
        page.setColor(Color.black);
        page.drawLine(mid/5*3+4, top-9, mid/5*7-4, top-9);
        
        page.setColor(new Color(183, 28, 0));//lipBot
        page.drawLine(mid/5*3+4, top+3, mid/5*7-4, top+3);     
        page.drawLine(mid/5*3+4, top+4, mid/5*7-4, top+4); 
        page.drawLine(mid/5*3+4, top+5, mid/5*7-4, top+5); 
        page.drawLine(mid/5*3+4, top+6, mid/5*7-4, top+6); 
        page.drawLine(mid/5*3+4, top+7, mid/5*7-4, top+7);    
        page.drawLine(mid/5*3+4, top+8, mid/5*7-4, top+8); 
        page.drawLine(mid/5*3+4, top+9, mid/5*7-4, top+9);         
        page.drawLine(mid/5*3+4, top+10, mid/5*7-4, top+10); 
        page.drawLine(mid/5*3+4, top+11, mid/5*7-4, top+11);     
        page.drawLine(mid/5*3+4, top+12, mid/5*7-4, top+12); 
        page.setColor(Color.black);
        page.drawLine(mid/5*3+4, top+13, mid/5*7-4, top+13); 
        
        //corners of mouth/outline
        page.setColor(Color.blue);
        final int cornerMouth = 11;
    
        page.setColor(new Color(183, 28, 0));
        page.fillArc(mid/5*3-2, top-9, cornerMouth+1, cornerMouth, 90, 180);//left bot
        page.fillArc(mid/5*3-2, top+2, cornerMouth+1, cornerMouth, 90, 180);//left top
       
        page.fillArc(mid/5*7-10, top-9, cornerMouth+1, cornerMouth, 270, 180);//right bot
        page.fillArc(mid/5*7-10, top+2, cornerMouth+1, cornerMouth, 270, 180);//right top
        
        page.setColor(Color.black);
        page.drawArc(mid/5*7-10, top-9, cornerMouth+1, cornerMouth, 270, 180);//right bot
        page.drawArc(mid/5*7-10, top+2, cornerMouth+1, cornerMouth, 270, 180);//right top
        page.drawArc(mid/5*3-2, top-9, cornerMouth+1, cornerMouth, 90, 180);//left bot
        page.drawArc(mid/5*3-2, top+2, cornerMouth+1, cornerMouth, 90, 180);//left top
       
        page.drawArc(mid/5*3-21, top-8, cornerMouth+7, cornerMouth+10, -55, 90);//arc cheek fat thingy
        page.drawArc(mid/5*7+3, top-8, cornerMouth+7, cornerMouth+10, 145, 90);//arc cheek fat thingy

        //nostrils
        final int nose = 10;
        
        page.setColor(Color.black);
        page.fillOval(mid-16, top-24, nose, nose);//left
        page.fillOval(mid+6, top-24, nose, nose);//right              
      
        //scelera 
        final int eyeLids = 55;
        page.setColor(Color.white);
        page.fillOval(mid-80, top-67, eyeLids, eyeLids);//left
        page.fillOval(mid+26, top-67, eyeLids, eyeLids);//right
    
        //eyes pupils
        final int eye = 53;
        page.setColor(Color.black);
        page.fillOval(mid-80, top-66, eye, eye);//left
        page.fillOval(mid+26, top-66, eye, eye);//right
        
        page.setColor(Color.white);
        page.fillOval(mid-55, top-34, 2, 2);//whites
        page.fillOval(mid-48, top-29, 4, 4);
        page.fillOval(mid-58, top-25, 3, 3);        
        page.fillOval(mid+60, top-28, 4, 4);
        page.fillOval(mid+45, top-30, 3, 3);
        page.fillOval(mid+47, top-25, 2, 2);

        //lids
        page.setColor(new Color(143,255,0));
        page.fillArc(mid-80, top-73, eyeLids, eyeLids, -10, 200);//left eyelid
        page.fillArc(mid+26, top-73, eyeLids, eyeLids, -10, 200);//right eyelid
        
        page.setColor(Color.black);
        page.drawArc(mid-82, top-62, eyeLids+4, eyeLids, -2, 180);//top left wrinkle
        page.drawArc(mid+24, top-62, eyeLids+4, eyeLids, -2, 180);// top right wrinkle
        
        page.drawArc(mid-80, top-67, eyeLids, eyeLids, 220, 100);//bot left wrinkle
        page.drawArc(mid+25, top-67, eyeLids, eyeLids, 220, 100);//bot right wrinkle
        
        page.drawArc(mid-80, top-65, eyeLids, eyeLids, 220, 90);//bot left wrinkle
        page.drawArc(mid+25, top-65, eyeLids, eyeLids, 220, 90);//bot right wrinkle        
    }
}
