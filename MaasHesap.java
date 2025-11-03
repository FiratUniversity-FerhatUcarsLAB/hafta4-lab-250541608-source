
/*
 * Ad Soyad: [Halid HACBEKKUR]
 * Ogrenci No: [250541608]
 * Tarih: [03.11.2025]
 * Aciklama: [MaasHesap]
 */
import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.print("Calisan ad soyad: ");
        String ad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.println("\n====================================");
        System.out.println("           MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n%n", ad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas             : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("-------------------------------");
        System.out.printf("TOPLAM GELIR          : %.2f TL%n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("SGK (14%%)             : %.2f TL%n", sgk);
        System.out.printf("Gelir Vergisi (15%%)   : %.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi (0.76%%) : %.2f TL%n", damgaVergisi);
        System.out.println("-------------------------------");
        System.out.printf("TOPLAM KESINTI        : %.2f TL%n", toplamKesinti);

        System.out.println("\n------------------------------------");
        System.out.printf("NET MAAS              : %.2f TL%n", netMaas);
        System.out.printf("Kesinti Orani         : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc    : %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc     : %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");

        input.close();
    }
}
