package Procesor;
import java.util.ArrayList;

public interface IProcesor {

    public int getNumarNuclee();
    public void setNumarNuclee( int numar);
    public int getFrecventa();
    public void setFrecventa(int numar);
    public String getTip();
    public void setTip(String tip);
    public String toString();

}

public class IntelCore13 implements  IProcesor
{
    private int _numar_nuclee;
    private int _frecventa;
    private String _tip;

    public IntelCore13()
    {
        this._numar_nuclee=0;
        this._frecventa=0;
        this._tip="N/A";
    }

    public IntelCore13( int numar_nuclee, int frecventa, String tip)
    {
        this._numar_nuclee=numar_nuclee;
        this._frecventa=frecventa;
        this._tip=tip;
    }
    public int getNumarNuclee();
    public void setNumarNuclee( int numar);
    public int getFrecventa();
    public void setFrecventa(int numar);
    public String getTip();
    public void setTip(String tip);
    public String toString();
}

public class IntelCoreI5{
    
}

public class IntelCoreI7{
    
}

public class PlacaVideo{

    public static final String NVIDIA= "NVidia";
    public static final String AMD= "AMD";

    private String _brand;
    private int _tech_fabr;
    private String _tip_memorie;
    private int _capacitate_memorie;
    private int _frecventa_memorie;

public PlacaVideo(){
                this._tech_fabr=0;
                this._capacitate_memorie=0;
                this._frecventa_memorie=0;
				this._tip_memorie="N/A";
                this._brand=NVIDIA;
				this._brand=AMD;
}
public PlacaVideo(int _tech_fabr, int capacitate_memorie, int frecventa_memorie, String brand, String tip_memorie){
                this._tech_fabr=tech_fabr;
                this._capacitate_memorie=capacitate_memorie;
                this._frecventa_memorie=frecventa_memorie;
				this._tip_memorie=tip_memorie;
                this._brand=brand;
					
}
  public void setTech_fabr(int tech_fabr){
	  this._tech_fabr=tech_fabr;    
	  }

        public int getTech_fabr(){   
		return this._tech_fabr;  
		}
		
       public void setCapacitate_memorie(int capacitate_memorie){
	    this._capacitate_memorie=capacitate_memorie;  
	  }

        public int getCapacitate_memorie(){   
		return this._capacitate_memorie; 
		}

        public void setFrecventa_memorie(int frecventa_memorie){
			this._frecventa_memorie=frecventa_memorie;
			}

        public int getFrecventa_memorie(){ 
		return this._frecventa_memorie;  
			}
 
        public void setTip_memorie(int tip_memorie){
			this._tip_memorie=tip_memorie;
			}

        public int getTip_memorie()
            {   return this._tip_memorie;
			}
		public void setBrand(String brand){
	  this._brand=brand;   
	  }

        public String getBrand(){   
		return this._brand;  
		}	
			
		 public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Procesor de la: ");
                sb.append(this._brand);
                sb.append(" fabricat cu: ");
                sb.append(this._tech_fabr);
                sb.append(" cu frecventa:; ");
                sb.append(this._frecventa_memorie);
                sb.append(" capacitatea de: ");
                sb.append(this._capacitate_memorie);
                sb.append("tipul memoriei: ");
				sb.append(this._tip_memorie);
                return sb.toString();
			}

		
    public void setBrand(String brand)
    {
        this._brand=brand;
    }
    public void setBrand(int i)
    {
        if(i<0 || i>1)
        {
            System.out.println("Numarul introdus nu face parte din lista de optiuni");
        }
        else
        {
            if(i==0)    this._brand=NVIDIA;
            if(i==1)    this._brand=AMD;
        }
    }
    public String getBrand()
    {   return this._brand; }
}

public class Memorie {
    private int _capacitate;
    private int _frecventa;
	
	public Memorie(){
                this._capacitate=0;
                this._frecventa=0;
	public PlacaVideo(int tech_fabr, int capacitate_memorie){
                this._capacitate=capacitate;
                this._frecventa=frecventa;
				
     public void setCapacitate(int capacitate){
		 
	   this._capacitate=capacitate;   
	  }

        public int getCapacitate(){   
		return this._capacitate;  
		}
		
       public void setFrecventa(int frecventa){
	    this._frecventa=frecventa;  
	  }

        public int getFrecventa(){   
		return this._frecventa;
		}
	public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Capacitate de : ");
                sb.append(this._capacitate);
                sb.append(" si frecventa de: ");
                sb.append(this._frecventa);			
				return sb.toString();
			}

}

public class RAM extends Memorie{

    private String _tip;

    public RAM()
    {
        super();
        this._tip="N/A";
    }
    public RAM(int capacitate, int frecventa, String tip)
    {
        super(capacitate, frecventa);
        this._tip=tip;
    }
	 public void setCapacitate(int capacitate){
		 
	   this._capacitate=capacitate;   
	  }

        public int getCapacitate(){   
		return this._capacitate;  
		}
		
       public void setFrecventa(int frecventa){
	    this._frecventa=frecventa;  
	  }

        public int getFrecventa(){   
		return this._frecventa;
		}
	public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Capacitate de : ");
                sb.append(this._capacitate);
                sb.append(" si frecventa de: ");
                sb.append(this._frecventa);			
				return sb.toString();
			}
    
}
public class HDD extends Memorie{

    private double _dimensiune;
	
	public HDD()
	{
		this._dimensiune=0.0;
	}
	public HDD(double dimensiune)
	{
		this._dimensiune=dimensiune;
	}
	 {
        super(capacitate, frecventa);
        this._tip=tip;
    }
	 public void setCapacitate(int capacitate){
		 
	   this._capacitate=capacitate;   
	  }

        public int getCapacitate(){   
		return this._capacitate;  
		}
		
       public void setFrecventa(int frecventa){
	    this._frecventa=frecventa;  
	  }

        public int getDimensiune(){   
		return this._dimensiune;
		}
		 public void setDimensiune(double dimensiune){
	    this._dimensiune=dimensiune;  
	  }

        public int getFrecventa(){   
		return this._frecventa;
		}
	public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Capacitate de : ");
                sb.append(this._capacitate);
                sb.append(" frecventa de: ");
                sb.append(this._frecventa);	
                sb.append(" si dimensiunea de: ");
                sb.append(this._dimensiune);					
				return sb.toString();
			}
}
    public class SSD extends Memorie{

    private double _dimensiune;
	
	public SSD()
	{
		this._dimensiune=0.0;
	}
	public SSD(double dimensiune)
	{
		this._dimensiune=dimensiune;
	}
	 {
        super(capacitate, frecventa);
        this._tip=tip;
    }
	 public void setCapacitate(int capacitate){
		 
	   this._capacitate=capacitate;   
	  }

        public int getCapacitate(){   
		return this._capacitate;  
		}
		
       public void setFrecventa(int frecventa){
	    this._frecventa=frecventa;  
	  }

        public int getDimensiune(){   
		return this._dimensiune;
		}
		 public void setDimensiune(double dimensiune){
	    this._dimensiune=dimensiune;  
	  }

        public int getFrecventa(){   
		return this._frecventa;
		}
	public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Capacitate de : ");
                sb.append(this._capacitate);
                sb.append(" frecventa de: ");
                sb.append(this._frecventa);	
                sb.append(" si dimensiunea de: ");
                sb.append(this._dimensiune);					
				return sb.toString();
			}
}
