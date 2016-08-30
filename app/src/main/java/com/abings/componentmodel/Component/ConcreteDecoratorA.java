package com.abings.componentmodel.Component;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Shuwen on 2016/8/30.
 */
public class ConcreteDecoratorA extends Decorator {
    private Context context;
    public ConcreteDecoratorA(Context context){
        this.context = context;
    }


    @Override
    public void show() {
        Toast.makeText(context, "穿内衣", Toast.LENGTH_SHORT).show();
        super.show();
    }
}
