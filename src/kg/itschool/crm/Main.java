package kg.itschool.crm;

import kg.itschool.crm.dao.ManagerDao;
import kg.itschool.crm.dao.daoutil.DaoFactory;
import kg.itschool.crm.model.Course;
import kg.itschool.crm.model.CourseFormat;
import kg.itschool.crm.model.Manager;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        CourseFormat bootCampFormat = new CourseFormat();
        bootCampFormat.setId(1L);
        bootCampFormat.setFormat("BOOTCAMP");
        bootCampFormat.setCourseDurationWeeks(12);
        bootCampFormat.setLessonDuration(LocalTime.of(3,0));
        bootCampFormat.setLessonsPerWeek(5);
        bootCampFormat.setOnline(false);

        CourseFormat ordinaryFormat = new CourseFormat();
        ordinaryFormat.setId(2L);
        ordinaryFormat.setFormat("ORDINARY");
        ordinaryFormat.setLessonsPerWeek(3);
        ordinaryFormat.setLessonDuration(LocalTime.of(1, 30));
        ordinaryFormat.setCourseDurationWeeks(28);
        ordinaryFormat.setOnline(true);

        Course javaCourse = new Course();
        javaCourse.setId(1L);
        javaCourse.setName("Java");
        javaCourse.setPrice(15000);
        javaCourse.setCourseFormat(bootCampFormat);

        Course pythonCourse = new Course();
        pythonCourse.setId(2L);
        pythonCourse.setName("Python");
        pythonCourse.setPrice(15000);
        pythonCourse.setCourseFormat(bootCampFormat);

        Course jsCourse = new Course();
        jsCourse.setId(3L);
        jsCourse.setName("JavaScript");
        jsCourse.setPrice(15000);
        jsCourse.setCourseFormat(bootCampFormat);

        Course sqlCourse = new Course();
        sqlCourse.setId(4L);
        sqlCourse.setName("SQL");
        sqlCourse.setPrice(10000);
        sqlCourse.setCourseFormat(ordinaryFormat);

        System.out.println(javaCourse);
        System.out.println(pythonCourse);
        System.out.println(jsCourse);
        System.out.println(sqlCourse);

    }
}
