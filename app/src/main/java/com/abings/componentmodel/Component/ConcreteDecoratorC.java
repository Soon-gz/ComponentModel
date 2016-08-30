package com.abings.componentmodel.Component;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Shuwen on 2016/8/30.
 */
public class ConcreteDecoratorC extends Decorator {

    private Context context;
    public ConcreteDecoratorC(Context context){
        this.context = context;
    }

    @Override
    public void show() {
        Toast.makeText(context, "化妆", Toast.LENGTH_SHORT).show();
        super.show();
    }
}
