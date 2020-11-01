package com.AddressBookManagement;

import java.util.Comparator;

public class ZipComparator implements  Comparator<Person> {



    @Override
    public int compare(Person o1, Person o2)
    {
        if (o1.getAddress().get(0).getZip() < o2.getAddress().get(0).getZip())
           return -1;

        if (o1.getAddress().get(0).getZip() > o2.getAddress().get(0).getZip())
            return 1;

        else
            return 0;
    }
}

