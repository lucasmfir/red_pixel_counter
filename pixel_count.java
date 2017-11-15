
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class contaPixels {

	public static void main(String[] args) throws IOException{
	    BufferedImage img = null;
	    File file = null;
	    
	    //lê a imagem dada
	    try{
	      file = new File("img/img.png");//coloque aqui o caminho da imagem
	      img = ImageIO.read(file);
	    }catch(IOException e){
	      System.out.println(e);
	    }

	    //captura dimensões da imagem para que todos os pixels possam ser varridos
	    int width = img.getWidth();
	    int height = img.getHeight();
	    
	    //inicializa contador dos pixels vermelhos
	    int count_red = 0;
	    
	    //laços para varrer toda a imagem, verificando pixel a pixel seu RGB
	    for(int y = 0; y < height; y++){
	      for(int x = 0; x < width; x++){  
	    	Color p = new Color(img.getRGB(x, y)) ; 
	    	int r = p.getRed();
	    	int g = p.getGreen();
	    	int b = p.getBlue();
	        
	    	//verificação do RGB do pixel para ver se é vermelho
	        if(r > 250 && g == 0 && b == 0){
	        	count_red++;
	        } 
	      }
	    }
	    
	    //imprime valores encontrados
	    System.out.println("Pixels vermelhos: "+ count_red);
	  }
	}