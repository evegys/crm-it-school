package kg.itschool.crm;

import kg.itschool.crm.dao.ManagerDao;
import kg.itschool.crm.dao.MentorDao;
import kg.itschool.crm.dao.daoutil.DaoContext;
import kg.itschool.crm.model.Manager;
import kg.itschool.crm.model.Mentor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ManagerDao managerDao = (ManagerDao) DaoContext.autowired("ManagerDao", "singleton");


//        for (Manager manager : managerDao.findAll()) {
//            System.out.println(manager);
//        }

        Iterator iterator = managerDao.findAll().iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

//        Random random = new Random();
//
//        int length = 15;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(12);
//        arrayList.add(13);
//        arrayList.add(123);
//        arrayList.add(12344);
//
//        Iterator iterator = arrayList.iterator();
//         while (iterator.hasNext()){
//             System.out.println(iterator.next());
//         }



    }
}
