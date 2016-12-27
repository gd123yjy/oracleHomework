package cn.yjy.service.imp;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.repository.CollegeRepository;
import cn.yjy.service.CollegeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */
@Service
public class CollegeServiceImp implements CollegeService {

    private CollegeRepository collegeRepository;

    public CollegeServiceImp(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public Set<College> findAllCollege() {
        return collegeRepository.getAllCollege();
    }

    @Override
    public College findBasicCollegeInformation(Integer cno) {
        return collegeRepository.getBasicCollegeInformation(cno);
    }

    @Override
    public College findAllStudentInformation(Integer cno) {
        return collegeRepository.getAllCollegeInformation(cno);
    }

    @Override
    public Set<Student> findEnrollListOfCollege(Integer cno) {
        return collegeRepository.getStudentSet(cno);
    }
}
