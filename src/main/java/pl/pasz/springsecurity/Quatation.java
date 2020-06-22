package pl.pasz.springsecurity;

public class Quatation {

    private String content;
    private String author;


    public Quatation(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public Quatation() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
