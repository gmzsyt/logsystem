 enum LogLevel
{
    Trace,
    Debug,
    Info,
    Warning,
    Error,
    Fatal;
    public static LogLevel getLogLevel(int level){
        switch (level){
            case 1:
                return LogLevel.Trace;
            case 2:
                return LogLevel.Debug;
            case 3:
                return LogLevel.Info;
            case 4:
                return LogLevel.Warning;
            case 5:
                return LogLevel.Error;
            case 6:
                return LogLevel.Fatal;
            default:
                return null;
        }
    }
}
