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
        int ground = 400;   // position of the ground line
        int xStart = 70;    // x-start of the ground line
        int xLimit = 520;   // x-limit of the ground line
        int n;
        Random gerador = new Random();

        myCanvas.setVisible(true);
        Scanner dados = new Scanner(System.in);
		System.out.println("Digite o numero de bolas");
		n= dados.nextInt();
		if(n<=0){
			System.out.println("ERRO! Quantidade invalida");
			return ;
		}
		BouncingBall ball[] = new BouncingBall[n];//(xStart, 50, 16, Color.blue, ground, myCanvas);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);
        int aux;
        // crate and show the balls
        for(int i=0;i<n;i++){
        	aux=gerador.nextInt(25);
    	     ball[i] = new BouncingBall(aux+i*20, 50, 16, Color.blue, ground, myCanvas);
    	}
        for(int i=0;i<n;i++){
       		ball[i].draw();
       	}

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        int cont=0;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            while(ball[cont].getXPosition()>=xLimit){
        	   // if(ball[cont].getXPosition() >= xLimit) {
        	        cont++;
        	        if(cont==n){
        	        	break;
        	        }
        	    //}
        	}
            for(int z=0;z<n;z++){
        	    ball[z].move();
        	}
        	if(cont==n){
        		finished=true;
        		break;
        	}
            // stop once ball has travelled a certain distance on x axis
            
        }
         for(int i=0;i<n;i++){
    	    ball[i].erase();
    	}
        
    }
    /**
    *Create a new rectangle
    */
    public void drawFrame(){
        int x = 20, y = 20;
        Dimension tamanho = new Dimension (myCanvas.getSize());
        Rectangle retangulo = new Rectangle(x, y, tamanho.width-(2*x), tamanho.height-(2*y));
        myCanvas.draw(retangulo);
    }
    
}
