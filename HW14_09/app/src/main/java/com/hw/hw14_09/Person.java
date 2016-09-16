package com.hw.hw14_09;

/**
 * Created by Admin on 16.09.2016.
 */
public class Person
{
    private String Iimage;
    private String fname;
    private String lname;

    public Person(String Iimage, String fname, String lname)
    {
        this.Iimage = Iimage;
        this.fname = fname;
        this.lname = lname;
    }

    public String getIimage()
    {
        return Iimage;
    }

    public void setIimage(String iimage)
    {
        this.Iimage = iimage;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

}