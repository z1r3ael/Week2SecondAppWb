package com.example.android.week2secondappwb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*
        Жизненный цикл приложения в Android жёстко контролируется системой и зависит от нужд пользователя,
    доступных ресурсов и т. д. Например, пользователь хочет запустить браузер. Решение о запуске
    приложения принимает система. Хотя последнее слово и остаётся за системой, она подчиняется
    определённым заданным и логическим правилам, позволяющим определить, можно ли загрузить,
    приостановить приложение или прекратить его работу. Если в данный момент пользователь работает
    с определённым окном, система даёт приоритет соответствующему приложению. И наоборот, если
    окно невидимо и система решает, что работу приложения необходимо остановить, чтобы
    мобилизовать дополнительные ресурсы, будет прекращена работа приложения, имеющего более
    низкий приоритет. В Android ресурсы более ограниченны, поэтому Android более жёстко
    контролирует работу приложений.
        ОС Android использует иерархию по важности, чтобы определить, какие процессы оставить в
    живых или уничтожить. Понимание жизненного цикла и правильная реакция на изменения его состояния
    имеют решающее значение. Он позволяет создавать приложения с меньшим количеством ошибок,
    использовать меньше системных ресурсов Android и обеспечивать хорошее взаимодействие с пользователем.

    Примеры использования жизненного цикла в реальных приложениях:
    1) Если свернуть приложение YouTube во время просмотра видео, то видео ставится на паузу
    (предположу что в методах onPause и onStop) и приложению уделяется меньше ресурсов.
    2) В приложении Telegram список чатов и само содержание чата находится на разных экранах, но если
    зайти в Telegram в планшета, то на одном экране будет и список чатов и сразу содежримое чата. Это
    делают с помощью фрагментов и предполагаю используют их жизненные циклы(Не уверен что это подохдящий
    пример, но я имел виду что с помощью методов onAttach, onCreate и onCreateView фрагмент будет
    прикрепляться либо к одному экрану(планшеты), либо к разным(телефоны)).
    3) Если закрыть YouTube Music, то метод onDestroy разрушает приложении и музыка перестанет играть,
    что будет экономить ресурсы телефона.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "Activity 1 - onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "Activity 1 - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "Activity 1 - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "Activity 1 - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "Activity 1 - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "Activity 1 - onDestroy()");
    }
}