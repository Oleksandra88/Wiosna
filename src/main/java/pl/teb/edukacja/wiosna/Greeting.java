package pl.teb.edukacja.wiosna;

public class Greeting {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private long id;
    private String content;

    public String getContent() {
        return content;
    }


}
