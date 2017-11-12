package edu.nju.mapper.provider;

import edu.nju.entity.Question;
import org.apache.ibatis.annotations.Param;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

/**
 * Created by 69401 on 2017/11/12.
 */
public class QuestionProvider {

    private static final String TABLE_NAME="question";

    public String getByCourseID(Map<String,Object> para){

        long courseID = (long)para.get("courseID");
        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("courseID = #{courseID,javaType=long,jdbcType=INTEGER}");
        return SQL();
    }

    public String insert(Map<String,Object> para){

        List<Question> list = (List<Question>)para.get("list");
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO "+TABLE_NAME+" ");
        sb.append("(courseID, type, c_answer, ex_answer1, ex_answer2, ex_answer3, ex_answer4, ex_answer5, content) ");
        sb.append("VALUES ");
        MessageFormat mf = new MessageFormat("(#'{'list[{0}].courseID}, #'{'list[{0}].type}, #'{'list[{0}].c_answer}, " +
                "#'{'list[{0}].ex_answer1}, #'{'list[{0}].ex_answer2}, #'{'list[{0}].ex_answer3}, #'{'list[{0}].ex_answer4}, " +
                "#'{'list[{0}].ex_answer5}, #'{'list[{0}].content})");
        for (int i = 0; i < list.size(); i++) {
            sb.append(mf.format(new Object[]{i}));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();

    }

    public String getByCourseIDAndType(Map<String,Object> para){

        long courseID = (long)para.get("courseID");
        int type = (int)para.get("type");

        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("courseID = #{courseID,javaType=long,jdbcType=INTEGER} and type = #{type,javaType=int,jdbcType=INTEGER}");
        return SQL();
    }

}
