package org.tech.techbox.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tech.techbox.backend.entity.Item;

import java.util.List;

// 해당 인터페이스가 스프링의 데이터 접근 계층(Data Access Layer)의 컴포넌트임을 선언.
// 간단하게 말 하자면 "레파지토리"를 의미.
// JpaRepository<엔티티, 엔티티 PK속성> 인터페이스 : 스프링 데이터 JPA에서 제공하는 CRUD 메서드를 상속받아 사용할 수 있는 인터페이스임.
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    // Id값으로 엔티티 하나를 조회한다.
    List<Item> findAllByIdIn(List<Integer> ids);
}
