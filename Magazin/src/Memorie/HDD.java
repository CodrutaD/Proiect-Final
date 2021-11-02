package Memorie;

public class HDD extends Memorie implements IROM {

    private double _dimensiune;
    private String  _brand;

    public HDD()
    {
        this._dimensiune=0.0;
    }
    public HDD(double dimensiune)
    {
        this._dimensiune=dimensiune;
    }
    public HDD (int capacitate, int frecventa, double dimensiune, String brand)
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

    public double getDimensiune(){
        return this._dimensiune;
    }
    public void setDimensiune(double dimensiune){
        this._dimensiune=dimensiune;
    }

    public int getFrecventa(){
        return super.getFrecventa();
    }
    @Override
    public String toString()
    {   StringBuffer sb=new StringBuffer();
        sb.append("Memorie HDD brand ");
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
