package kg.itschool.crm;

import kg.itschool.crm.dao.ManagerDao;
import kg.itschool.crm.dao.MentorDao;
import kg.itschool.crm.dao.daoutil.DaoContext;
import kg.itschool.crm.model.Manager;
import kg.itschool.crm.model.Mentor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ManagerDao managerDao = (ManagerDao) DaoContext.autowired("ManagerDao", "singleton");

//        Manager managers = managerDao.findAll();
//
//        for (Manager manager : managers) {
//            System.out.println(manager);
//        }

        Random random = new Random();

        int length = 15;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < length ; i++) {
            arrayList.add(random.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            arrayList.remove(20);
        }

        arrayList.trimToSize();

        System.out.println(arrayList.size());

    }
}
