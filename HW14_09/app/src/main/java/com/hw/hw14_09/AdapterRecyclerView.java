package com.hw.hw14_09;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by User on 21.06.2016.
 */
//Наш адаптер, мост между фабрикой клонов и выводом их на экран.
//Его методы будет дёргать LinearLayoutManager, назныченный вьюшке
//RecyclerView в методе onCreate нашей активити
public class AdapterRecyclerView extends RecyclerView.Adapter<PersonViewHolder> {
    private Context mContext;
    private ArrayList listperson;

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    //Создаёт пустую view и оборачивает её в PersonViewHolder.

    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new PersonViewHolder(view);
    }

    public AdapterRecyclerView(ArrayList listperson, Context mContext)
    {
        this.listperson = listperson;
        this.mContext = mContext;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position)
    //Обращается к методу холдера при выводе нового элемента списка на экран,
    //передавая ему актуальный объект модели для разбора и представления
    {
        Person person=(Person)listperson.get(position);

        ImageView imageview=holder.getPhoto();
        Picasso .with(mContext)
                .load(person.getIimage())
                .into(imageview);

        holder.getfName() .setText(person.getFname());
        holder.getlName().setText(person.getLname());
    }

    @Override
    public int getItemCount()
    {
        return listperson.size();
    }//Возвращает размер хранилища моделей

}

