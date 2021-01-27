package tn.esprit;
import org.apache.log4j.Logger;
 public class Calcul {
	private static final Logger logger= Logger.getLogger(Calcul.class);
	//-----------------------------------------------------------------
	
	
	public void getAllPrducts()
	{
	try{
	logger.info("In getAllPrducts() : ");
	logger.debug("Je vais lancer la divsion.");
	int i= 1/2;
	logger.debug("Je viens de lancer la divsion. "+ i);
	logger.debug("Je viens de finir l'opération X.");
	logger.info("Out getAllPrducts() without errors.");
	}
	catch(Exception e) { logger.error("Erreur dans getAllPrducts() : "+ e); }
	}
	//--------------------------------------------------------------------
	public int calculerSom(int a, int b) 
	{
		int res= 0; 
	    try{ logger.info("In calculerSom ("+ a+ ", "+ b+ ")");
	    res= a+ b;
	    logger.info("Out calculerSom() : "+ res);} 
	    catch(Exception e) 
	    {logger.error("Erreur : "+ e);} 
	    return res; }
		
	public int calculerDiff (int a, int b)
    {
    int res= 0;
    try{
    logger.info("In calculerDiff("+ a+ ", "+ b+ ")");
    res= a-b;
    logger.info("Out calculerDiff() : "+ res);
    }
    catch(Exception e) 
    { logger.error("Erreur : "+ e);
    }
    return res;
    }
	
	public int calculerDiv (int a, int b)
    {
    int res= 0;
   // try{
    logger.info("In calculerDiv("+ a+ ", "+ b+ ")");
    res= a/b;
    logger.info("Out calculerDiv() : "+ res);
   // }
  //catch(Exception e) 
   //{ 
	//   logger.error("Erreur : "+ e);
  //}
    return res;
    }
}