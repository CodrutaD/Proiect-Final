package Procesor;

import java.util.ArrayList;

public class Intel implements IProcesor{
    public static final String INTEL_CORE_I3= "Intel Core I3";
    public static final String INTEL_CORE_I5= "Intel Core I5";
    public static final String INTEL_CORE_I7= "Intel Core I7";
    private String _model;
    private int _numar_nuclee;
    private int _frecventa;
    private String _suport_memorie;

    public Intel()
    {   this._model="N/A";
        this._numar_nuclee=0;
        this._frecventa=0;
        this._suport_memorie="N/A";
    }

    public Intel( String model, int numar_nuclee, int frecventa, String suport_memorie)
    {
        if(!model.equals(INTEL_CORE_I3) && !model.equals(INTEL_CORE_I5) && !model.equals(INTEL_CORE_I7))
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
        if(!model.equals(INTEL_CORE_I3) && !model.equals(INTEL_CORE_I5) && !model.equals(INTEL_CORE_I7))
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
        sb.append("Procesor  model:  ");
        sb.append(this._model);
        sb.append("  cu numar de nuclee ");
        sb.append(this._numar_nuclee);
        sb.append(" , cu frecventa de ");
        sb.append(this._frecventa);
        sb.append("si suport de memorie ");
        sb.append(this._suport_memorie);
        return sb.toString();
    }
}
