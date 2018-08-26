import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Scanner;
import java.util.Random;
/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
    	Dimension dimaux; // to calculate a dimensions 
    	dimaux=myCanvas.getSize();
    	Random gerador = new Random();
        int ground = 400-gerador.nextInt(100);   // position of the ground line
        int xStart = 150;    // x-start of the ground line
        int xLimit = dimaux.width - 150;   // x-limit of the ground line
        int n; // numbers of balls
     
        myCanvas.setVisible(true);
        Scanner dados = new Scanner(System.in);
		System.out.println("Digite o numero de bolas");
		n= dados.nextInt();
		if(n<=0){
			System.out.println("ERRO! Quantidade invalida");
			return ;
		}
		BouncingBall ball[] = new BouncingBall[n]; 

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);
        // crate and show the balls
        int aux;
        Color cor;
        for(int i=0;i<n;i++){
        	aux=gerador.nextInt(25);
        	cor = getColor(aux);
    	    ball[i] = new BouncingBall(xStart + aux+i*20, (dimaux.height/2)-aux*10, 16, cor, ground, myCanvas);
    		ball[i].draw();
    	}
       	
        boolean ballfinished[] =  new boolean[n];
        boolean finished = false;
        int cont=0;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            if(ball[cont].getXPosition()>=xLimit){ 
        	  	ball[cont].erase();
        	   	ballfinished[cont]=true;
        	        cont++;
        	        if(cont==n){
        	        	break;
        	        }
        	}
            for(int z=0;z<n;z++){
            	if(ballfinished[z]==false){
        		    ball[z].move();
        		}
        	}
        	if(cont>=n){
        		finished=true;
        		break;
        	}
            // stop once ball has travelled a certain distance on x axis   
        }
        return;
    }
    /**
    *Create a new rectangle
    */
    public void drawFrame(){
        Dimension tamanho = new Dimension (myCanvas.getSize());
        Rectangle retangulo = new Rectangle(20, 20, tamanho.width-(2*20), tamanho.height-(2*20));
        myCanvas.draw(retangulo);
    }
    /**
    *Get a random color to balls
    */
    public Color getColor(int a){
    	switch(a%7){
    		case 0:
    			return Color.black;
    		case 1:
    			return Color.blue;
    		case 2:
    			return Color.cyan;
    		case 3:
    			return Color.darkGray;
    		case 4:
    			return Color.gray;
    		case 5:
    			return Color.green;
    		case 6:
    			return Color.pink;
    	}
    	return Color.black;
    }
}
