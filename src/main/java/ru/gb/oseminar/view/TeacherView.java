package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;

import ru.gb.oseminar.data.Teacher;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());



    @Override
    public void sendOnConsole(List<Teacher> List) {
        for(Teacher user: List){
             logger.info(user.toString());
        }
    }
    
}
