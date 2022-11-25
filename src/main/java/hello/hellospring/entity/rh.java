package hello.hellospring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity  // Table
@Data
public class rh { // Object --> Table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx; // PK , 자동증가컬럼
    private String title;
    private String writer;
    private String content;

    @Column(columnDefinition = "datetime default now()")
    private Date indate; // now()
    @Column(columnDefinition = "int default 0")
    private Long count;
}
