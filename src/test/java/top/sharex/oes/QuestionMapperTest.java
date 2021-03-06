package top.sharex.oes;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.sharex.oes.dao.QuestionMapper;
import top.sharex.oes.entity.Question;

import java.util.List;

/**
 * @author danielyang
 * @Date 2017/11/9 17:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("top.sharex.oes.dao")
public class QuestionMapperTest {
    @Autowired
    QuestionMapper mapper;

    @Test
    public void testSelectByPoolIdAndType() {

        List<Question> questions = mapper.selectByPoolIdAndType(1, (byte)0);
        System.out.println(new Gson().toJson(questions));
    }

}
