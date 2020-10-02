package ehu.isad;

import java.util.Arrays;

public class BookDetails {
    private String publishers;
    private String key;
    private String source_records;
    private String created;
    private String title;
    private Integer number_of_pages;
    private Integer covers;
    private String local_id;
    private String isbn_13;
    private Integer isbn_10;
    private String last_modified;
    private Authors authors;
    private String works;
    private String type;


    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSource_records() {
        return source_records;
    }

    public void setSource_records(String source_records) {
        this.source_records = source_records;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(Integer number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public Integer getCovers() {
        return covers;
    }

    public void setCovers(Integer covers) {
        this.covers = covers;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    public String getIsbn_13() {
        return isbn_13;
    }

    public void setIsbn_13(String isbn_13) {
        this.isbn_13 = isbn_13;
    }

    public Integer getIsbn_10() {
        return isbn_10;
    }

    public void setIsbn_10(Integer isbn_10) {
        this.isbn_10 = isbn_10;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "BookDetails{" +
                "publishers='" + publishers + '\'' +
                ", key='" + key + '\'' +
                ", source_records='" + source_records + '\'' +
                ", created='" + created + '\'' +
                ", title='" + title + '\'' +
                ", number_of_pages=" + number_of_pages +
                ", covers=" + covers +
                ", local_id='" + local_id + '\'' +
                ", isbn_13='" + isbn_13 + '\'' +
                ", isbn_10=" + isbn_10 +
                ", last_modified='" + last_modified + '\'' +
                ", authors=" + authors +
                ", works='" + works + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

