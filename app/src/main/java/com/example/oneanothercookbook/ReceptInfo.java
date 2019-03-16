package com.example.oneanothercookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class ReceptInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept_info);
        //Создание интента для последующего импорта данных из другого активити
        Intent intent = getIntent();
//        //Создание строковой переменной для импорта данных,затем извлечение данных из интента.
        String receptJson = intent.getStringExtra("receptJson");
//        //Создание GSON'а для десериализации данных
        Gson gson = new Gson();
//        //Создание класса для импорта данных, затем десериализация
        ReceptBluda rb = gson.fromJson(receptJson,ReceptBluda.class);
//        //Поиск TextView по айди, для написания названия.
        TextView nazv = (TextView)findViewById(R.id.textViewNazv);
//        //Установка взятого текста в TextView
//            nazv.setText(rb.getNazvanie());
//
//        TextView opis = (TextView)findViewById(R.id.textViewOpisanie);
//        //Установка взятого текста в TextView
//        opis.setText(rb.getPolnoeOpisanie());



//                        ImageView image = (ImageView)findViewById(R.id.imageView);
//                        String id = rb.getId();
//                        if(id=="omlet"){
//                            image.setImageResource(R.drawable.omelette);
//                        }

    }


}
