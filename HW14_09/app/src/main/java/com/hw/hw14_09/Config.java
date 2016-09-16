package com.hw.hw14_09;

import java.util.ArrayList;

/**
 * Created by Admin on 16.09.2016.
 */
public class Config {

    public final static String[] fNames = {"Oksana", "Ulay", "Lena"};
    public final static String[] lNames = {"Oli", "Hey", "Lay"};
    public final static String[] photos = {"http://s.spynet.ru/tru/pics5/20160118/podborka_vecher_02.jpg",
                                            "http://goodnewsanimal.ru/_nw/37/s00118217.jpg",
                                            "http://www.cats.abc64.ru/webgrasp/catslogo01-4.jpg"};
public ArrayList getPersonData()
    {
        ArrayList listperson = new ArrayList();
        for(int i = 0; i < fNames.length; i++)
        {
            listperson.add(new Person(photos[i],fNames[i],lNames[i]));


        }
        return listperson;
    }
}
