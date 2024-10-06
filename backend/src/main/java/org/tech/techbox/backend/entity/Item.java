package org.tech.techbox.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id // 주요 식별자 (primary key) 임을 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 엔티티의 식별자 값을 자동으로 생성, 증가
    private int id;

    // 해당 엔티티 클래스의 필드가 데이터베이스의 칼럼으로 매핑될 때,
    // 해당 칼럼의 제약 조건을 설정하는 어노테이션이다.
    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 15, nullable = false)
    private int price;

    @Column(length = 100, nullable = false)
    private String imgPath;
}
