package com.codegym.task.task37.task3710.decorators;

import com.codegym.task.task37.task3710.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setBorderColor(Shape shape){
        System.out.format("Setting the border color for %s to red.", shape.getClass().getSimpleName());
    }

    @Override
    public void draw() {
        setBorderColor(decoratedShape);
        decoratedShape.draw();
    }
}
