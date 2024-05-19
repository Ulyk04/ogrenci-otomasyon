import java.util.Scanner;

public class kisi {

    private static personel Personel = new personel();
    private static ogrenci Ogrenci = new ogrenci();
    private static final lisans Lisans = new lisans();
    private static final unvan UNVAN = new unvan();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Hos geldiniz ne istersiniz:");
            System.out.println("1)Yeni bilgileri girmek-");
            System.out.println("2)Eski bilgileri almak-");
            System.out.println("3)Cikis");
            int bilgi = sc.nextInt();
            if(bilgi == 1){
                System.out.println("Ogrenciyseniz 1 , personelseniz 2 numarasi girin:");
                int n = sc.nextInt();
                System.out.println();

                if(n==1){
                    System.out.println("Lutfen isim ve soyisim girebilir misiniz");
                    String isim = sc.next();
                    Ogrenci.setIsim(isim);
                    System.out.println();

                    System.out.println("Lutfen ogrenci numaranizi girin:");
                    int numara = sc.nextInt();
                    Ogrenci.setOgrenci(numara);
                    System.out.println();

                    System.out.println("Lutfen lisans seviyenizi girin:");
                    int lisans = sc.nextInt();
                    Lisans.setLisans(lisans);
                    System.out.println();

                    System.out.println("Lutfen aldiginiz dersleri girin:");
                    System.out.print("1)");
                    String d1 = sc.next();
                    System.out.print("2)");
                    String d2 = sc.next();
                    System.out.print("3)");
                    String d3 = sc.next();
                    System.out.print("4)");
                    String d4 = sc.next();
                    Ogrenci.setDersler(d1 , d2 , d3 , d4);
                    System.out.println();
                }
                if(n==2){
                    System.out.println("Lutfen isim ve soyisim girebilir misiniz:");
                    String isim = sc.next();
                    Personel.setIsim(isim);
                    System.out.println();

                    System.out.println("Lutgen personel no girin:");
                    int numara = sc.nextInt();
                    Personel.setPersonel(numara);
                    System.out.println();

                    System.out.println("Lutfen unvan seviyenizi girin:");
                    String unvan = sc.next();
                    UNVAN.setUnvan(unvan);
                    System.out.println();
                }
            }
            if(bilgi == 2){
                System.out.println("1)Ogrenci-"  );
                System.out.println("2)Personel-");
                int s = sc.nextInt();
                System.out.println();
                if(s == 1){
                    System.out.println("Isim ve soyisim: " +  Ogrenci.getIsim());
                    System.out.println("Ogrenci no: " + Ogrenci.getOgrenci());
                    System.out.println("Lisans: " + Lisans.getLisans() );
                    System.out.println("Aldigi dersler: " + Ogrenci.getDersler() );
                    System.out.println();
                }
                if(s==2){
                    System.out.println("Isim ve soyisim: " +  Personel.getIsim());
                    System.out.println("Personel no: " + Personel.getPersonel());
                    System.out.println("Unvan: "+  UNVAN.getUnvan());
                    System.out.println();
                }
            }
            if(bilgi == 3){
                break;
            }
        }

    }
}
