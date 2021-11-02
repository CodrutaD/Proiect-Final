package Procesor;

public class AMD implements IProcesor{
    public static final String RYZEN3= "AMD Ryzen 3";
    public static final String RYZEN5= "AMD Ryzen 5";
    public static final String RYZEN7= "AMD Ryzen 7";
    public static final String RYZEN9= "AMD Ryzen 9";
    private String _model;
    private int _numar_nuclee;
    private int _frecventa;
    private String _suport_memorie;

    public AMD()
    {   this._model="N/A";
        this._numar_nuclee=0;
        this._frecventa=0;
        this._suport_memorie="N/A";
    }

    public AMD( String model, int numar_nuclee, int frecventa, String suport_memorie)
    {
        if(!model.equals(RYZEN3) && !model.equals(RYZEN5) && !model.equals(RYZEN7) && !model.equals(RYZEN9))
        {
            System. out.println("Nu ati setat procesorul corespunzator");
        }
        else
        {
            this._model= model;
            this._numar_nuclee=numar_nuclee;
            this._frecventa=frecventa;
            this._suport_memorie=suport_memorie;
        }
    }

    public String getModel()
    {
        return this._model;
    }

    public void setModel(String model)
    {
        if(!model.equals(RYZEN3) && !model.equals(RYZEN5) && !model.equals(RYZEN7) && !model.equals(RYZEN9))
        {
            System. out.println("Nu ati setat procesorul corespunzator");
        }
        this._model= model;
    }
    public int getNumarNuclee()
    {
        return _numar_nuclee;
    }
    public void setNumarNuclee( int numar)
    {
        this._numar_nuclee=numar;
    }
    public int getFrecventa()
    {
        return this._frecventa;
    }
    public void setFrecventa(int frecventa)
    {
        this._frecventa= frecventa;
    }
    public String getSuportMemorie()
    {
        return this._suport_memorie;
    }
    public void setSuportMemorie(String suport_memorie)
    {
        this._suport_memorie= suport_memorie;
    }
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append("Procesor model ");
        sb.append(this._model);
        sb.append(" cu numar de nuclee ");
        sb.append(this._numar_nuclee);
        sb.append(" , cu frecventa de ");
        sb.append(this._frecventa);
        sb.append(" si suport de memorie ");
        sb.append(this._suport_memorie);
        return sb.toString();
    }
}
