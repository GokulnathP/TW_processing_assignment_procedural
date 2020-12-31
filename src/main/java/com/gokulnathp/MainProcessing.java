package com.gokulnathp;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class MainProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 50;
    private final List<Integer> xPosition = Arrays.asList(0, 0, 0, 0);

    public static void main(String[] args) {
        PApplet.main(MainProcessing.class, args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for (int ballNumber = 1; ballNumber <= 4; ballNumber++) {
            Integer xAxis = xPosition.get(ballNumber - 1);
            int yAxis = (ballNumber) * HEIGHT / 5;
            drawBall(ballNumber, xAxis, yAxis);
        }
    }

    private void drawBall(int ballNumber, int xAxis, Integer yAxis) {
        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
        xPosition.set(ballNumber - 1, xAxis + ballNumber);
    }
}
