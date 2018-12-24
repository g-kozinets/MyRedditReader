package bsuir.coursach.gleb.myredditreader.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "entry", strict = false)
public class Entry implements Serializable {

    public Entry(){};
    public Entry(String id, String content, Author author, String title, String updated) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.title = title;
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "\n EntryContents{" +
                "id='" + id + '\'' +
                ", content='" + content.substring(40, 50)+"..." + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", updated='" + updated + '\'' +
                '}' + "\n ================================================================================= \n";
    }

    @Element(name = "id")
    private String id;

    @Element(name = "content")
    private String content;

    @Element(required = false, name = "author")
    private Author author;

    @Element(name = "title")
    private String title;

    @Element(name = "updated")
    private String updated;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
