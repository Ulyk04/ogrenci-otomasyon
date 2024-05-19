public class ogrenci {
    private int ogrenci;
    private String d1;
    private String d2;
    private String d3;
    private String d4;
    private String isim;

    public void setOgrenci(int no){
        this.ogrenci = no;
    }
    public void setDersler(String d , String e, String r , String s){
        d1 = d;
        d2 = e;
        d3 = r;
        d4 = s;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public int getOgrenci(){
        return this.ogrenci;
    }
    public String getDersler(){
        return "Aldigin dersler: " + d1 +" , "+ d2+" , "+ d3 + " , "+ d4 + ".";
    }
    public String getIsim(){
        return this.isim;
    }
}
