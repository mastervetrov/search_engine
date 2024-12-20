package searchengine.model;

import jakarta.persistence.*;
import jakarta.persistence.Index;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "page", indexes = {
        @Index(name = "idx_path", columnList = "path")
})
@Getter
@Setter
public class PageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false)
    SiteEntity site;
    @Column(name = "path", columnDefinition = "TEXT", nullable = false)
    String path;
    @Column(name = "code", nullable = false)
    Integer code;
    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    String content;
}
