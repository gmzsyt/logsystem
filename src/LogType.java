public enum LogType
{
    Created(1),
    Updated(2),
    Deleted(3),
    Read(4),
    Login(5),
    Logout(6);

    private LogType(int type) {
        this.type = type;
    }

    private int type;

    public static LogType getLogType(int type) {
        switch (type) {
            case 1:
                return LogType.Created;
            case 2:
                return LogType.Updated;
            case 3:
                return LogType.Deleted;
            case 4:
                return LogType.Read;
            case 5:
                return LogType.Login;
            case 6:
                return LogType.Logout;
            default:
                return null;
        }
    }
}
