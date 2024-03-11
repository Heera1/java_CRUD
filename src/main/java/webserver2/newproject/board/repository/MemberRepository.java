package webserver2.newproject.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webserver2.newproject.board.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
//    Optional<Member> findByEmail(String email);
//    Optional<Member> findByNickname(String email);
}
