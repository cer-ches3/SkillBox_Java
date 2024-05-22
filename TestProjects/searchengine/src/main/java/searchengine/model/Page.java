package searchengine.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",columnDefinition = "INT", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "site_id", columnDefinition = "INT", nullable = false)
    private Site site;

    @Column(name = "path", columnDefinition = "TEXT", nullable = false)
	private String path;

    @Column(name = "code", columnDefinition = "INT", nullable = false)
	private int code;

    @Column(name = "content", columnDefinition = "MEDIUMTEXT",nullable = false)
	private String content;
}
