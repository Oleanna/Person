package com.hw.hw14_09;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 16.09.2016.
 */
/*Этот класс содержит ссылки на элементы виджетов,
    которые он наполнит данными из объекта модели.
    */
public class PersonViewHolder extends RecyclerView.ViewHolder {
    private ImageView photo;
    private TextView fName;
    private TextView lName;

    public PersonViewHolder(View itemview)
    {
        super(itemview);
        photo = (ImageView)itemview.findViewById(R.id.img_view);
        fName = (TextView) itemview.findViewById(R.id.txt_firsname);
        lName = (TextView) itemview.findViewById(R.id.txt_lastname);
    }

    public TextView getfName()
    {
        return fName;
    }

    public TextView getlName()
    {
        return lName;
    }

    public ImageView getPhoto()
    {
        return photo;
    }


}
