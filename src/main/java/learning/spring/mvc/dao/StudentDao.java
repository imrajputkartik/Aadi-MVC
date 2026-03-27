package learning.spring.mvc.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import learning.spring.mvc.model.Student;

@Repository
public class StudentDao {

    private final HibernateTemplate template;

    public StudentDao(HibernateTemplate template) {
        this.template = template;
    }

    public void save(Student s){ template.save(s); }

    public List<Student> getAll(){
        return template.loadAll(Student.class);
    }

    public Student getById(int id){
        return template.get(Student.class,id);
    }

    public void delete(int id){
        Student s = template.get(Student.class,id);
        template.delete(s);
    }

    public void update(Student s){
        template.update(s);
    }
}