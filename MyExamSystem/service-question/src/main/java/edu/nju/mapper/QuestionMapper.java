package edu.nju.mapper;

import edu.nju.entity.Question;
import edu.nju.mapper.provider.QuestionProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by 69401 on 2017/11/10.
 */
public interface QuestionMapper {

    @SelectProvider(type = QuestionProvider.class,method = "getByCourseID")
    public List<Question> getByCourseID(@Param("courseID")long courseID);

    @SelectProvider(type = QuestionProvider.class,method = "insert")
    public Boolean insert(@Param("list")List<Question> list);

    @Select("SELECT * FROM question")
    public List<Question> getAll();

    @SelectProvider(type = QuestionProvider.class,method = "getByCourseIDAndType")
    public List<Question> getByCourseIDAndType(@Param("courseID")long courseID,@Param("type")int type);
}
