package top.jianxiaopang.phone.dao;

import top.jianxiaopang.phone.pojo.Cpu;

import java.util.List;

public interface PortalDao {
	public List<String> selectGradeOfCpu();

	public List<Cpu> selectCpuByGrade(String grade);
}
