package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import ru.gb.oseminar.data.Teacher;

public class TeacherServiсe implements UserService<Teacher>{
    private List<Teacher> teachers;


    public void TeacherService() {
        this.teachers = new ArrayList<>();
    }    

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        final Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
    public void editTeacher(Integer teacherId, String secondName,String firstname, String patronymic){
        for (Teacher teacher: teachers){ 
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSecondName(secondName);
                teacher.setFirstName(firstname);
                teacher.setPatronymic(patronymic);
            }
        }
    }    
}
