public class DevLog extends Log {
     private String devName;

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    @Override
    public String toString() {
        return "DevLog{" +
                "devName='" + devName + '\'' +
                ", id=" + getId() +
                ", logType=" + getLogType() +
                ", logLevel=" + getLogLevel() +
                ", detail='" + getDetail() + '\'' +
                '}';
    }
}
