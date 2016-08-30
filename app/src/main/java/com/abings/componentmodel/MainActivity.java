package com.abings.componentmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abings.componentmodel.Component.ConcreteComponent;
import com.abings.componentmodel.Component.ConcreteDecoratorA;
import com.abings.componentmodel.Component.ConcreteDecoratorB;
import com.abings.componentmodel.Component.ConcreteDecoratorC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConcreteComponent concreteComponent = new ConcreteComponent(this);
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(this);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(this);
        ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC(this);

        //穿衣服的过程，依次对对象进行扩展，装扮
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.show();

    }
}
