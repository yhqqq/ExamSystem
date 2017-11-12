package edu.nju.mapper.provider;

import edu.nju.entity.Exam;

import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

/**
 * Created by 69401 on 2017/11/12.
 */
public class ExamProvider {

    private static final String TABLE_NAME="exam";

    public String getByExamID(Map<String,Object> para){

        long examID = (long)para.get("examID");
        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("examID = #{examID,javaType=long,jdbcType=BIGINT}");
        return SQL();
    }

    public String insert(Map<String,Object> para){

        Exam exam = (Exam)para.get("exam");
        if(exam!=null){
            BEGIN();
            INSERT_INTO(TABLE_NAME);
            VALUES("single_num","#{exam.single_num,javaType=int,jdbcType=INTEGER}");
            VALUES("multiple_num","#{exam.multiple_num,javaType=int,jdbcType=INTEGER}");
            VALUES("completion_num","#{exam.completion_num,javaType=int,jdbcType=INTEGER}");
            VALUES("single_score","#{exam.single_score,javaType=int,jdbcType=INTEGER}");
            VALUES("multiple_score","#{exam.multiple_score,javaType=int,jdbcType=INTEGER}");
            VALUES("completion_score","#{exam.completion_score,javaType=int,jdbcType=INTEGER}");
            VALUES("starttime","#{exam.starttime,javaType=date,jdbcType=TIMESTAMP}");
            VALUES("endtime","#{exam.endtime,javaType=date,jdbcType=TIMESTAMP}");
            VALUES("courseID","#{exam.courseID,javaType=long,jdbcType=INTEGER}");
        }
        return SQL();

    }

    public String getByCourseID(Map<String,Object> para) {

        long courseID = (long)para.get("courseID");
        BEGIN();
        SELECT("*");
        FROM(TABLE_NAME);
        WHERE("courseID = #{courseID,javaType=long,jdbcType=INTEGER}");
        return SQL();

    }
}
