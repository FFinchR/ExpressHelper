package Express.mapper;

import Express.model.po.FeedBackPo;
import Express.model.po.FeedBackPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface FeedBackPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int insert(FeedBackPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int insertSelective(FeedBackPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    List<FeedBackPo> selectByExample(FeedBackPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    FeedBackPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FeedBackPo record, @Param("example") FeedBackPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FeedBackPo record, @Param("example") FeedBackPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FeedBackPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FeedBackPo record);
}