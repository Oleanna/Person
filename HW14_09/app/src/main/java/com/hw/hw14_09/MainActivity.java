package com.hw.hw14_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;  //ссылка на вьюшку из представления
    RecyclerView.LayoutManager layoutManager;
    AdapterRecyclerView adapter; //ссылка на адаптер, класс который связывает данные с элементами управления

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); //Заполняет лайаут Activity контейнером с виджетом RecyclerView
        setContentView(R.layout.activity_main); //Находит ссылку на контейнер - виджет
        Initialize();
    }

    private void Initialize()
    {
        rv = (RecyclerView)findViewById(R.id.recycle_view); //ссылка на контейнер

        Config cg = new Config();
        rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);//размещftn объекты на экране
        rv.setLayoutManager(layoutManager);
        //adapter = new AdapterRecyclerView(cg.getPersonData(), this); //Создаётся экземпляр адаптера и передаёся ему управление персон.
        rv.setAdapter(adapter);////Назначает адаптером экземпляр AdapterRecycleView
    }
}
