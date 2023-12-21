package org.choongang.repositories;

import org.choongang.entities.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByUserId(String userId);

    List<Member> findByUserNmContaining(String keyword);

}
