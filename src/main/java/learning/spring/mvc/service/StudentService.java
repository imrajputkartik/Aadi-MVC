package learning.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import learning.spring.mvc.dao.StudentDao;
import learning.spring.mvc.model.Student;


@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentDao dao;

    public void save(Student s){ dao.save(s); }
    public List<Student> getAll(){ return dao.getAll(); }
    public Student get(int id){ return dao.getById(id); }
    public void delete(int id){ dao.delete(id); }
    public void update(Student s){ dao.update(s); }
}