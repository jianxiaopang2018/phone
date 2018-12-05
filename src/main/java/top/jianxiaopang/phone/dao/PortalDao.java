package top.jianxiaopang.phone.dao;

import org.apache.ibatis.annotations.Param;
import top.jianxiaopang.phone.pojo.Cpu;
import top.jianxiaopang.phone.pojo.ReturnPhone;

import java.util.HashMap;
import java.util.List;

public interface PortalDao {
	public List<String> selectGradeOfCpu();

	public List<Cpu> selectCpuByGrade(String grade);

	public List<ReturnPhone> selectPhoneByCategory(@Param("hashMap")HashMap hashMap);
}
