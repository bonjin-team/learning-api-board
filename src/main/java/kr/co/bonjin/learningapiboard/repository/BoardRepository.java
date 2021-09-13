package kr.co.bonjin.learningapiboard.repository;

import kr.co.bonjin.learningapiboard.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
