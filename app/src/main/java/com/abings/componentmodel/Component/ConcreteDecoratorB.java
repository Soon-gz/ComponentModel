package com.abings.componentmodel.Component;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Shuwen on 2016/8/30.
 */
public class ConcreteDecoratorB extends Decorator {

    private Context context;
    public ConcreteDecoratorB(Context context){
        this.context = context;
    }

    @Override
    public void show() {
        Toast.makeText(context, "穿外套", Toast.LENGTH_SHORT).show();
        super.show();
    }
}
