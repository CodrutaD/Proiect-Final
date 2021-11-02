package Memorie;

public class SSD   extends Memorie implements IROM{

    private double _dimensiune;
    private String  _brand;

    public SSD()
    {
        super();
        this._dimensiune=0.0;
    }
    public SSD(double dimensiune)
    {
        super();
        this._dimensiune=dimensiune;
    }
    public SSD(int capacitate, int frecventa, double dimensiune, String brand)
    {
        super(capacitate, frecventa);
        this._dimensiune= dimensiune;
        this._brand= brand;
    }
    public void setCapacitate(int capacitate){

        super.setCapacitate(capacitate);
    }

    public int getCapacitate(){
        return super.getCapacitate();
    }

    public void setFrecventa(int frecventa){
        super.setFrecventa(frecventa);
    }
    public int getFrecventa(){
        return super.getFrecventa();
    }
    public double getDimensiune(){
        return this._dimensiune;
    }
    public void setDimensiune(double dimensiune){
        this._dimensiune=dimensiune;
    }

    @Override
    public String toString()
    {   StringBuffer sb=new StringBuffer();
        sb.append("Memorie SSD brand ");
        sb.append(this._brand);
        sb.append(" de capacitate");
        sb.append(super.getCapacitate());
        sb.append(", frecventa de: ");
        sb.append(super.getFrecventa());
        sb.append(" si dimensiunea de: ");
        sb.append(this._dimensiune);
        return sb.toString();
    }
}

