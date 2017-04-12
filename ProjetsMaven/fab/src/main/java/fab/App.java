package fab;

import java.io.*;
import java.util.*;
import com.opencsv.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World mon gars!" );
        System.out.println("Le max est de "+ max(4,5));
	int monmax = 0;
	try {
    	CSVReader reader = new CSVReader(new FileReader("data.csv"),',');
    	List<String[]> myEntries = reader.readAll();
        for(String[] s : myEntries)
        {
		for(String nb : s)
		{
			System.out.println("Nombre lu : "+ nb);
                	monmax = max(monmax, Integer.parseInt(nb));

		}
        }
        System.out.println("Mon max : " + monmax);
	
	}
	catch(Exception e)
	{
		System.out.println("Erreu" + e.getMessage());
	}
    }
    
    public static int max(int a, int b)
    {
    	return a > b ? a : b;
    	//return a; //le stagiaire est par la
    }
}
