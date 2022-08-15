import java.util.LinkedList;
import java.util.Scanner;

public class Log {
    // Constructor

    private Integer id;
    private LogType logType;
    private LogLevel logLevel;
    private String detail;

    public Integer getId() {
        return id;
    }

    public Log setId(Integer id) {
        this.id = id;
        return this;
    }

    public LogType getLogType() {
        return logType;
    }

    public Log setLogType(LogType logType) {
        this.logType = logType;
        return this;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public Log setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Log setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", logType=" + logType +
                ", logLevel=" + logLevel +
                ", detail='" + detail + '\'' +
                '}';
    }
}

