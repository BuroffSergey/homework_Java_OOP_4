package ru.gb.oseminar.controller;

import java.time.LocalDate;
import java.util.List;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.view.TeacherView;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        teacherService.editTeacher(teacherId,surname,firstname,patronymic);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
