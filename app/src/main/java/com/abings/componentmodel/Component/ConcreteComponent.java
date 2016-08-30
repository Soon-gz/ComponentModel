package com.abings.componentmodel.Component;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Shuwen on 2016/8/30.
 */
public class ConcreteComponent implements Component {

    private Context context;
    public ConcreteComponent(Context context){
        this.context = context;
    }

    @Override
    public void show() {
        Toast.makeText(context, "装扮的美女", Toast.LENGTH_SHORT).show();
    }
}
