package Memorie;
public class RAM extends Memorie {

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
    @Override
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append("Memorie RAM de capacitate:");
        sb.append(super.getCapacitate());
        sb.append(" si de frecventa ");
        sb.append(super.getFrecventa());
        return sb.toString();
    }

}
