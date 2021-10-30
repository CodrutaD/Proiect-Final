public class PlacaVideo {
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
        this._brand="N/A";
    }
    public PlacaVideo(int tech_fabr, int capacitate_memorie, int frecventa_memorie, String brand, String tip_memorie){
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

    public void setTip_memorie(String tip_memorie){
        this._tip_memorie=tip_memorie;
    }

    public String getTip_memorie()
    {
        return this._tip_memorie;
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

