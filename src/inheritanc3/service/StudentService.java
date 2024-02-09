package inheritanc3.service;

import inheritanc3.entity.Student;

public class StudentService extends BaseInterface {
    Student []students = new Student[100];

    @Override
    public void create() {
        Student student = new Student();

    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void getOne() {
        super.getOne();
    }

    @Override
    public void getAll() {
        super.getAll();
    }

    @Override
    public void delete() {
        super.delete();
    }
}
