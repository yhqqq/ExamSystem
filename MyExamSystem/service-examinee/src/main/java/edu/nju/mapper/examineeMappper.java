package edu.nju.mapper;

import edu.nju.entity.examinee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Created by NJU on 2017/11/10.
 */
@Repository
@Mapper
public interface examineeMappper {
    @Select("SELECT * FROM examinee WHERE userID = #{userID} and examID = #{examID}")
    examinee getexaminee(@Param("userID")int userID,@Param("examID")int examID);

    @Select("SELECT * FROM examinee WHERE userID = #{userID}")
    examinee[] getexamineeList(int userID);

    @Insert("INSERT INTO examinee (userID, examID, email, classID, state) VALUES (#{userID},#{examID},#{email},#{classID},'new')")
    void addExam(int userID,int examID,String email,int classID,String state);

    @Update("UPDATE examinee SET answerSheetID = #{answerSheetID} ,grade = #{grade}, state = #{state} WHERE userID = #{userID} and examID = #{examID} ")
    void updateExaminee(int userID,int examID,int answerSheetID,int grade,String state);

}
