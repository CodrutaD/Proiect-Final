import Procesor.*;
import Memorie.*;

public class Laptop {

    private String _brand;
    private String _model;
    private IProcesor _procesor_tip;
    private RAM _ram;
    private PlacaVideo _placa_video;
    private IROM _irom;

    public Laptop()
    {
        this._procesor_tip= new Intel() ;
        this._ram= new RAM();
        this._irom =new HDD();
        this._placa_video= new PlacaVideo();
        this._brand="N/A";
        this._model="N/A";
    }
    public Laptop(IProcesor procesor, RAM ram,IROM memorie,PlacaVideo placa_video , String brand, String model)
    {
        if(procesor instanceof Intel)
        {
            this._procesor_tip= new Intel() ;
            this._procesor_tip= procesor;
        }
        else
        {
            if(procesor instanceof AMD)
            {
                this._procesor_tip= new AMD() ;
                this._procesor_tip= procesor;
            }
            else
            {
                System.out.println("Nu ati introdus procesorul corect");
            }
        }

        this._ram= new RAM();
        this._ram= ram;

        if(memorie instanceof HDD)
        {
            this._irom= new HDD();
            this._irom= memorie;
        }
        else
        {
            if(memorie instanceof SSD)
            {
                this._irom= new SSD();
                this._irom= memorie;
            }
            else
            {
                System.out.println("Nu ati intordus memoria corect");
            }
        }
        this._placa_video= new PlacaVideo();
        this._placa_video= placa_video;
        this._irom= new HDD();
        this._irom= memorie;
        this._brand=brand;
        this._model=model;
    }
    public String getBrandModel()
    {
        StringBuffer sb= new StringBuffer();
        sb.append(this._brand);
        sb.append(" ");
        sb.append(this._model);
        return sb.toString();
    }
    public String getProcesor()
    {
            return this._procesor_tip.toString();
    }
    public String getRAM()
    {
        return this._ram.toString();
    }
    public String getROM()
    {
        return this._irom.toString();
    }
    public String getPlacaVideo()
    {
        return this._placa_video.toString();
    }
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append(this._procesor_tip.toString());
        sb.append(System.lineSeparator());
        sb.append(this._ram.toString());
        sb.append(System.lineSeparator());
        sb.append(this._irom.toString());
        sb.append(System.lineSeparator());
        sb.append(this._placa_video.toString());

        return sb.toString();
    }
}

