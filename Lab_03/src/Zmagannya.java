public class Zmagannya {
    private String namecom;
    private int kilkcomand;



    public void setnamecom(String snamecom) {
        namecom=snamecom;
    }

    private int kilkosobzmag;

    private int kilsport;
    private int kilkcomandzmag;

    private String pibtrener;
    public void setpib(String pib)
    {
        pibtrener=pib;
    }
    public void setkilkcom(int kilkcom)
    {
        kilkcomand=kilkcom;
    }
public void setkilksport(int kilksp)
{
    kilsport=kilksp;
}
    
    public void setKilkosobzmag(int kosobzmag)

    {
        kilkosobzmag=kosobzmag;
    }
    public void setKilkkomzmag(int komzmag)

    {
        kilkcomandzmag=komzmag;
    }
    public  Zmagannya(){
        namecom="Металіст";
        kilsport=15;
        kilkosobzmag=20;
        kilkcomand=30;
    }

}
