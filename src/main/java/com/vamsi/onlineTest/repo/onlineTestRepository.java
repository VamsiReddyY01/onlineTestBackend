package com.vamsi.onlineTest.repo;
import com.vamsi.onlineTest.entity.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.vamsi.onlineTest.common.QuestionServiceConstants.FIND_QUESTIONS;

@org.springframework.stereotype.Repository
public interface onlineTestRepository extends CrudRepository<Question,Long> {
    @Query(value = FIND_QUESTIONS, nativeQuery = true)
    public List<Question> getQuestionsByTest(@Param("test") String test);
}
