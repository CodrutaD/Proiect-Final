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
        if(this._brand==null || this._model==null)
        {
            return "NULL";
        }
        StringBuffer sb= new StringBuffer();
        sb.append(this._brand);
        sb.append(" ");
        sb.append(this._model);
        return sb.toString();
    }
    public void setProcesor(IProcesor procesor)
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
    }
    public void setRAM( RAM ram)
    {
        this._ram=new RAM();
        this._ram=ram;
    }
    public void setPlacaVideo( PlacaVideo placavideo)
    {
        this._placa_video=new PlacaVideo();
        this._placa_video=placavideo;
    }
    public void setROM(IROM rom)
    {
        if(rom instanceof HDD)
        {
            this._irom= new HDD();
            this._irom= rom;
        }
        else
        {
            if(rom instanceof SSD)
            {
                this._irom= new SSD();
                this._irom= rom;
            }
            else
            {
                System.out.println("Nu ati intordus memoria corect");
            }
        }
    }
    public String getProcesor()
    {
        if(_procesor_tip==null)
        {
            return "NULL";
        }
        else
        {
            return this._procesor_tip.toString();
        }

    }
    public String getRAM()
    {
        if(_ram==null)
        {
            return "NULL";
        }
        else
        {
            return this._ram.toString();
        }

    }
    public String getROM()
    {
        if(_irom==null)
        {
            return "NULL";
        }
        else
        {
            return this._irom.toString();
        }

    }
    public String getPlacaVideo()
    {
        if(_placa_video==null)
        {
            return "NULL";
        }
        else
        {
            return this._placa_video.toString();
        }

    }
    public void golire() {
        this._procesor_tip = null;
        this._ram = null;
        this._irom = null;
        this._placa_video = null;
    }
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append("Laptop cu ");
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

