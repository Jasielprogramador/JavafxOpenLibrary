package ehu.isad;

import java.util.Arrays;

public class Book {
    private String info_url;
    private String preview_url;
    private BookDetails details;

    public String getInfo_url() {
        return info_url;
    }

    public void setInfo_url(String info_url) {
        this.info_url = info_url;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public BookDetails getDetails() {
        return details;
    }

    public void setDetails(BookDetails details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "Book{" +
                "info_url='" + info_url + '\'' +
                ", preview_url='" + preview_url + '\'' +
                ", details=" + details +
                '}';
    }
}