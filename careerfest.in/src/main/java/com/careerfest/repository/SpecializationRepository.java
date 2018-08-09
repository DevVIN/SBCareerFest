package com.careerfest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.careerfest.model.Specilization;

public interface SpecializationRepository extends CrudRepository<Specilization, Long>{
	List<Specilization>	findByCoursename(String coursename);
	/*@Query("select specilizationIn from Specilization specilizationIn where Course.courseId=:parentCatId")
	public List<Specilization> getSpecilization(@Param("parentCatId") Integer parentCatId);
	*/
	//@EntityGraph(value="Course.specilizations",type = EntityGraphType.FETCH)
	//public List<Specilization> findByCourseId(Integer id);
}
