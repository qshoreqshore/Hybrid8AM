package others;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Loggs {

	static Logger l=Logger.getLogger(Loggs.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\Users\\apoorva\\Desktop\\log4j.properties");
		
		int a=20; int b=30;
		if(a<b)
			l.info("Pass");
		else
			l.error("Fail");
		
		
		
		

	}

}
