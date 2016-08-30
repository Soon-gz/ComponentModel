package com.abings.componentmodel.Component;

/**
 * Created by Shuwen on 2016/8/30.
 */
public abstract class Decorator implements Component{

    private Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null){
            component.show();
        }
    }
}
