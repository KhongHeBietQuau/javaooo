package bai3;

public class News implements INews {
    private int id;
    private String title,publishDate, author, content;
    private double averageRate;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void Display() {
        System.out.println("Id : " + id);
        System.out.println("title : " + title );
        System.out.println("publishDate : " + publishDate);
        System.out.println("author : " + author);
        System.out.println("content : " + content);

    }
    private int[] ratelist = new int[3];

    public int[] getRatelist() {
        return ratelist;
    }

    public void setRatelist(int[] ratelist) {
        this.ratelist = ratelist;
    }
    public void Calculate(){
        averageRate = (ratelist[0] + ratelist[1] + ratelist[2]) / 3;
        System.out.println("Average rate: " + averageRate);
    }
}
