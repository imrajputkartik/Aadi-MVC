package learning.spring.mvc.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import learning.spring.mvc.model.Teacher;

@Repository
public class TeacherDao {

    private final HibernateTemplate template;

    public TeacherDao(HibernateTemplate template) {
        this.template = template;
    }

    public void save(Teacher t){ template.save(t); }

    public List<Teacher> getAll(){
        return template.loadAll(Teacher.class);
    }

    public Teacher getById(int id){
        return template.get(Teacher.class,id);
    }

    public void delete(int id){
        Teacher t = template.get(Teacher.class,id);
        template.delete(t);
    }

    public void update(Teacher t){
        template.update(t);
    }
}