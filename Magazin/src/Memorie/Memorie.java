package Memorie;

public class Memorie {
    private int _capacitate;
    private int _frecventa;

    public Memorie() {
        this._capacitate = 0;
        this._frecventa = 0;
    }
    public Memorie(int capacitate, int frecventa){
        this._capacitate=capacitate;
        this._frecventa=frecventa;
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

