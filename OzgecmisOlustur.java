import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;
import java.io.FileOutputStream;

public class OzgecmisOlustur {

    public static void main(String[] args){
        System.out.println("PDF olusturma basliyor...");

        // PDF dökümanı oluşturur.
        Document document = new Document();

        try{
            // PDF dosyası oluşturulacak.
            PdfWriter.getInstance(document, new FileOutputStream("ozgecmis.pdf"));
            document.open();

            System.out.println("PDF dosyası acildi.");

            // Türkçe Karakter Desteği İçin
            // Lütfen bu font dosyasının yolunun doğru olduğundan emin olun!
            BaseFont bf = BaseFont.createFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            // Yazı Stillerini Tanımlamak İçin
            Font baslikFont = new Font(bf, 24, Font.BOLD);
            Font altBaslikFont = new Font(bf, 16, Font.BOLD);
            Font normalFont = new Font(bf, 12);
            Font kucukFont = new Font(bf , 10);

            System.out.println("Fontlar hazirlandi.");

            // Paragrafa başlık eklemek için
            Paragraph baslik = new Paragraph("ÖZGECMİŞ", baslikFont);
            baslik.setAlignment(Element.ALIGN_CENTER);
            baslik.setSpacingAfter(20);
            document.add(baslik);

            System.out.println("Baslik eklendi");



           // Fotoğraf Ekleme Bölümü


                // Fotoğrafı Image nesnesi olarak yüklüyoruz dosya adını belirterek.
                Image profilFotografi = Image.getInstance("fotograf.jpg");

                // Fotoğrafın boyutunu ayarlıyoruz
                profilFotografi.scaleAbsolute(100f, 100f);

                //Konumlandırma : Sağ üst köşeye yerleştirme.
                //Mutlak Konumlandırma: PDF sayfasının 450. x koordinatına ve 730. y koordinatına yerleştirir.
                profilFotografi.setAbsolutePosition(450f,730f);
                document.add(profilFotografi);

                System.out.println("Profil fotografı eklendi.");






            // Kişisel Bilgiler Bölümü
            Paragraph kisiBilgiBaslik = new Paragraph("KİŞİSEL BİLGİLER", altBaslikFont);
            kisiBilgiBaslik.setSpacingAfter(10);
            document.add(kisiBilgiBaslik);

            System.out.println("Kisisel bilgiler basliga eklendi.");

            // Kişisel Bilgiler
            document.add(new Paragraph("Ad Soyad: Selma Çalışkan", normalFont));
            document.add(new Paragraph("Doğum Tarihi: 23.12.2004", normalFont));
            document.add(new Paragraph("Telefon Numarası: 0111 111 11", normalFont));
            document.add(new Paragraph("E-posta: caliskan111@gmail.com", normalFont));

            System.out.println("Kisisel Bilgiler Eklendi");

            // Bölümler arasına boşluk eklemek için
            document.add(new Paragraph("\n"));

            // Kariyer Hedefi
            Paragraph kariyerBaslik = new Paragraph("Kariyer Hedefi", altBaslikFont);
            kariyerBaslik.setSpacingAfter(10);
            document.add(kariyerBaslik);

            document.add(new Paragraph(
                    "Yazilim mühendisliği alanında kendimi geliştirerek, " +
                            "yenilikçi projelerde yer almak ve modern teknolojilerle " +
                            "kullanıcı dostu uygulamalar geliştirmeyi ve siber güvenlik alanında uzmanlaşmayı hedefliyorum.",
                    normalFont
            ));

            document.add(new Paragraph("\n"));

            System.out.println("Kariyer hedefi eklendi.");

            // Eğitim Bilgileri
            Paragraph egitimBaslik = new Paragraph("Eğitim Bilgileri", altBaslikFont);
            egitimBaslik.setSpacingAfter(10);
            document.add(egitimBaslik);

            document.add(new Paragraph("2020-2024 | Yazılım Mühendisliği", normalFont));
            document.add(new Paragraph("Kırklareli Üniversitesi - Lisans", kucukFont));

            document.add(new Paragraph("\n"));

            document.add(new Paragraph("2016-2020 | Lise", normalFont));
            document.add(new Paragraph("Şehit Onbaşı Hakan Yutkun Anadolu Lisesi", kucukFont));

            document.add(new Paragraph("\n") );

            System.out.println("Egitim bilgileri eklendi.");

            // İş Deneyimi
            Paragraph deneyimBaslik = new Paragraph ("İş Deneyimi", altBaslikFont);
            deneyimBaslik.setSpacingAfter(10);
            document.add(deneyimBaslik);

            document.add(new Paragraph("Stajyer Yazılımcı | 2022 ( 3 ay )", normalFont));
            document.add(new Paragraph("Turk Telekom", kucukFont));
            document.add(new Paragraph("Web uygulamaları geliştirme", kucukFont));

            document.add(new Paragraph("Stajyer Yazılımcı | 2023 ( 2 ay )", normalFont));
            document.add(new Paragraph("Vodofone Data Engineering",kucukFont));
            document.add(new Paragraph("Veritabanı sistemlerini büyük veri altyapılarıyla entegrasyonunda görev alma.", kucukFont));

            document.add(new Paragraph("Tam Zamanlı Çalışan | 2024)", normalFont));
            document.add(new Paragraph("Turkcell Data Analyst ", normalFont));
            document.add(new Paragraph("Veri tabanında tutulan verilerin analizi.", kucukFont));

            document.add(new Paragraph("\n"));

            System.out.println("İş deneyimi eklendi");

            // Yetenekler
            Paragraph yeteneklerBaslik = new Paragraph("Teknik Yetenekler", altBaslikFont);
            yeteneklerBaslik.setSpacingAfter(10);
            document.add(yeteneklerBaslik);

            document.add(new Paragraph("Programlama Dilleri:", normalFont));
            document.add(new Paragraph("Java, Python, C, SQL", kucukFont));

            document.add(new Paragraph("\nTeknolojileri:", normalFont));
            document.add(new Paragraph("Git, MySQL, HTML/CSS" , kucukFont));

            document.add(new Paragraph("\n"));

            System.out.println("Yetenekler eklendi.");

            // Diller
            Paragraph dillerBaslik = new Paragraph("Yabancı Diller", altBaslikFont);
            dillerBaslik.setSpacingAfter(10);
            document.add(dillerBaslik);

            document.add(new Paragraph("İngilizce: Orta Seviye (B1)", normalFont));
            document.add(new Paragraph("Almanca: Başlangıç (A1)"));

            System.out.println("Diller eklendi.");

            // PDF'i kapatma
            document.close();
            System.out.println("PDF basariyla olusturuldu: ozgecmis.pdf");


        } catch (Exception e){
            System.out.println("HATA: PDF olusturulamadi!");
            e.printStackTrace();

            // Eğer dosya bulunamazsa/yüklenemezse hata mesajı verir
            System.err.println("Profil fotografi eklenirken hata olustu: " + e.getMessage());

        }
    } // main metodunu kapatır
} // OzgecmisOlustur sınıfını kapatır
