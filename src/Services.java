import java.util.HashMap;
import java.util.Scanner;

public class Services {
    private static Services instance;

    private Services() {
    }

    public static Services getInstance() {
        if (instance == null) {
            instance = new Services();
        }
        return instance;
    }

    HashMap<Integer, Log> logHashMap = new HashMap<>();

    public void createLog() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1 - User Log");
                System.out.println("2 - Dev Log");
                int choose = scanner.nextInt();
                if (choose == 1) {
                    UserLog userLog = createUserLog();
                    logHashMap.put(userLog.getId(), userLog);
                    break;
                } else if (choose == 2) {
                    DevLog devLog = createDevLog();
                    logHashMap.put(devLog.getId(), devLog);
                    break;
                } else {
                    System.out.println("1 veya 2 değerlerini girebilirsiniz");
                }
            }
            catch (Exception e ){
                System.out.println("1 veya 2 değerlerini girebilirsiniz");
            }

        }
    }
    private DevLog createDevLog() {
        DevLog devLog = getdevName();
        devLog.setId(getId());
        devLog.setLogType(getLogType());
        devLog.setLogLevel(getLogLevel());
        devLog.setDetail(getDetail());
        return devLog;
    }
    private UserLog createUserLog() {
        UserLog userLog = getUserid();
        userLog.setId(getId());
        userLog.setLogType(getLogType());
        userLog.setLogLevel(getLogLevel());
        userLog.setDetail(getDetail());
        return userLog;
    }
    private Integer getId() {
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Log ID giriniz");
                int id = scanner2.nextInt();
                if (!logHashMap.containsKey(id)) {
                    return id;
                }
                else if (logHashMap.containsKey(id)){
                    System.out.println("Bu id alınmış.");
                }
            }
            catch (Exception e){
                System.out.println("ID bir sayı olmalıdır.");
            }
        }
    }

    private LogType getLogType() {
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("tip giriniz ");
                System.out.println("1 - CREATED");
                System.out.println("2 - UPDATED");
                System.out.println("3 - DELETEED");
                System.out.println("4 - REED");
                System.out.println("5 - LOGİN");
                System.out.println("6 - LOGOUT");
                int type = scanner2.nextInt();
                if (type >= 1 && type <= 6) {
                    return LogType.getLogType(type);
                } else {
                    System.out.println("Menüden doğru seçim yapınız.");
                }
            }catch (Exception e ){
                System.out.println("Menüden dorğu seçim yapınız.");
            }
        }
    }


    private LogLevel getLogLevel() {
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Log level seçiniz.");
                System.out.println("1- TRACE ");
                System.out.println("2- DEBUG");
                System.out.println("3- INFO ");
                System.out.println("4- WARNING ");
                System.out.println("5- ERROR ");
                System.out.println("6- FATAL ");
                int level = scanner2.nextInt();
                if (level >= 1 && level <= 6) {
                    return LogLevel.getLogLevel(level);
                } else {
                    System.out.println("1 den 6'ya kadar seçim yapabilirsiniz.");
                }
            }catch (Exception e){
                System.out.println("Menüden doğru seçimi yapınız");
            }
        }
    }
    private String getDetail() {
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Detail giriniz");
                String detail = scanner2.nextLine();
                if (!logHashMap.containsKey(detail)) {
                    return detail;
                } else {
                    System.out.println("Tekrar deneyin");
                }
            }catch (Exception e){
                System.out.println("hata");
            }
        }
    }
    private UserLog getUserid() {
        while (true) {
            try {
                UserLog userLog = new UserLog();
                Scanner scanner = new Scanner(System.in);
                System.out.println("user için log id giriniz.");
                int userid = scanner.nextInt();
                userLog.setUserID(userid);
                return userLog;
            }catch (Exception e){
                System.out.println("Bir sayı değeri giriniz.");
            }
        }
    }
    private DevLog getdevName() {
        while (true) {
            try {
                DevLog devLog = new DevLog();
                Scanner scanner = new Scanner(System.in);
                String devName = scanner.nextLine();
                devLog.setDevName(devName);
                return devLog;
            }
            catch (Exception e){
                System.out.println("hata");
            }
            }
    }
    public void deleteLog() {
        boolean a = true;
        while (a) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Silmek istediğiniz log id yi seçiniz");
                int deleteID = scanner.nextInt();
                if (logHashMap.containsKey(deleteID)) {
                    logHashMap.remove(deleteID);
                    System.out.println("Silme işlemi başarılı.");
                    a = false;
                } else {
                    System.out.println("bu id'ye sahip log yok");
                }
            } catch (Exception ex) {
                System.out.println("Böyle bir ID'ye sahip log bulunamadı, dikkatli seçim yapınız");
                a = true;
            }
        }
    }
    public void update() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Güncellemek istediğiniz log ID'sini giriniz");
            int updatedID = scanner.nextInt();
            if (logHashMap.containsKey(updatedID)) {
                System.out.println("Güncellemek istediğiniz kısmı seçiniz \n 1 - log type \n  2 - log level \n 3 - details \n ");
                int updateChose = scanner.nextInt();
                if (updateChose == 1) {
                    Log log = logHashMap.get(updatedID);
                    log.setLogType(getLogType());
                    logHashMap.put(log.getId(), log);
                }
                if (updateChose == 2) {
                    Log log = logHashMap.get(updatedID);
                    log.setLogLevel(getLogLevel());
                    logHashMap.put(log.getId(), log);
                }
                if (updateChose == 3) {
                    Log log = logHashMap.get(updatedID);
                    log.setDetail(getDetail());
                    logHashMap.put(log.getId(), log);
                }
                break;
            } else {
                System.out.println("listede böyle bir id yok");
            }
        }
    }
    public void showLog() {
        System.out.println("Görüntülemek istediğniz logun id'si");
        Scanner scanner = new Scanner(System.in);
        int showLog = scanner.nextInt();

        logHashMap.containsKey(showLog);
        System.out.println(logHashMap.get(showLog).toString());
    }
    public void showLogs() {
        System.out.println("Görüntülemek istediğiniz logları seçiniz \n 1- TÜM LOGLAR \n 2- USER LOGLAR  \n 3- DEVELOPER LOGLAR ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        if (key == 1) {
            System.out.println(logHashMap.values());
        }

        if (key == 2) {
            for (int a : logHashMap.keySet()) {
                if (logHashMap.get(a) instanceof UserLog) {
                    System.out.println(logHashMap.get(a).toString());
                }
        }
        if (key == 3) {
            for (int a : logHashMap.keySet()) {
                if (logHashMap.get(a) instanceof DevLog) {
                    System.out.println(logHashMap.get(a).toString());
                }
            }
                 }
        }
    }
}







