package searchengine.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INTEGER", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "site_id", columnDefinition = "INTEGER", nullable = false)
    private Site site;

    @Column(name = "path", columnDefinition = "TEXT", nullable = false)
    private String path;

    @Column(name = "code", columnDefinition = "INTEGER", nullable = false)
    private Integer code;

    @Column(name = "content", columnDefinition = "MEDIUMTEXT",nullable = false)
    private String content;
}
