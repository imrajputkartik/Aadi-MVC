package learning.spring.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learning.spring.mvc.dao.TeacherDao;
import learning.spring.mvc.model.Teacher;

@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherDao dao;

    public void save(Teacher t){ dao.save(t); }
    public List<Teacher> getAll(){ return dao.getAll(); }
    public Teacher get(int id){ return dao.getById(id); }
    public void delete(int id){ dao.delete(id); }
    public void update(Teacher t){ dao.update(t); }
}