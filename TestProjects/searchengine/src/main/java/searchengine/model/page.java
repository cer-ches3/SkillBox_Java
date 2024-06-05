package searchengine.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "site_id")
    private int siteId;

    @NotNull
    @Column(name = "path")
	private String path;

    @NotNull
    @Column(name = "code")
	private int code;

    @NotNull
    @Column(name = "content")
	private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
