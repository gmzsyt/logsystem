public class UserLog extends Log {
    private int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


    @Override
    public String toString() {
        return "UserLog{" +
                "userID=" + userID +
                ", id=" + getId() +
                ", logType=" + getLogType() +
                ", logLevel=" + getLogLevel() +
                ", detail='" + getDetail() + '\'' +
                '}';
    }
}

