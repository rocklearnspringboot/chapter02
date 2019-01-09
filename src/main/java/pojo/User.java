package pojo;

public class User {
    private Long id;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String userName;

    public void setId(Long id) {
        this.id = id;
    }

    private String note;
}
