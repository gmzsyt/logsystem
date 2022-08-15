import java.util.Scanner;

public class StartPage {
    int islem = 0;
    Services services= Services.getInstance();

    public void menu() {
        while (true){
            try {
                System.out.print("\n");
                System.out.println("MENÜ");
                System.out.println("** 1- Log Ekle**");
                System.out.println("** 2- Log Sil**");
                System.out.println("** 3- Log Güncelle**");
                System.out.println("** 4- Log Görüntüle **");
                System.out.println("** 5- Logları Görüntüle**");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Lütfen İşlem Seçiniz (1-5) ");
                islem = scanner.nextInt();
                if (islem >= 1 && islem <= 5) {
                    break;
                } else {
                    System.out.println("Lütfen menüye tekrar göz atın");
                }
            }
            catch (Exception exception){
                System.out.println("Tekrar deneyiniz ve menüden seçim yapınız");
            }

    }
        getServices();
    }
    public void getServices() {
        switch (islem) {
            case 1:
                services.createLog();
                otherProcess();
            case 2:
                services.deleteLog();
                otherProcess();
            case 3:
                services.update();
                otherProcess();
            case 4:
                services.showLog();
                otherProcess();
            case  5:
                services.showLogs();
                otherProcess();
        }
    }
    public void otherProcess() {
        System.out.println("Başka bir işlem yapmak istiyor musunuz ? \n 1- EVET \n 2- HAYIR");
        int again = 0;
        while (true) {
            try {
                while (true) {
                    Scanner sc = new Scanner(System.in);
                    again = sc.nextInt();
                    if (again == 1 || again == 2) {
                        break;
                    } else {
                        System.out.println("1 veya 2 sayılarını girebiliriniz");
                    }
                }
                break;
            } catch (Exception exception) {
                System.out.println("Lütfen 1 veya 2 değerlerinden birisini giriniz.");
            }
        }
        if (again == 1) {
        }
        if (again == 2) {
            System.exit(0);
        }
        menu();
    }

}
