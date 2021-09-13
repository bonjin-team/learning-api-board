package kr.co.bonjin.learningapiboard.entity;

import lombok.*;

import javax.persistence.*;

@Builder // builder 를 사용할수 있게 합니다.
@Entity // jpa entity 임을 알립니다.
@Getter // 필드값의 getter 를 자동으로 생성합니다.
@Setter
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성합니다. (JPA 필수)
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성합니다.
@ToString
@Table(name = "board") // 'board' 테이블과 매핑됨을 명시
public class Board {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content", length = 1000)
    private String content;
}
