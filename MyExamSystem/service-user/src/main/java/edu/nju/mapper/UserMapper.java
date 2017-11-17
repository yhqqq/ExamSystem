package edu.nju.mapper;

import edu.nju.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/11/17.
 */
public interface UserMapper {

    //resultype是这样用的吗
    @Select("SELECT * FROM user WHERE mailAddress = #{mailAddress}")
    @ResultType(User.class)
    public User getOneByAddress(String mailAddress);

    @Select("SELECT * FROM user WHERE userID = #{ID}")
    @ResultType(User.class)
    public User getOneByID(String ID);

    @Select("SELECT * FROM user WHERE userName = #{userName}")
    @ResultType(User.class)
    public User getOneByName(String userName);


    @Insert("INSERT INTO user(userName,mailAddress,password,identity)" +
            "VALUES(#{UserName},#{mailAddress},#{password},#{identity})")
    public int insert(User user);

    //TO-DO
    public int update(User user);

}
