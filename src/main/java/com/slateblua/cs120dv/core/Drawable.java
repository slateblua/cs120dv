package com.slateblua.cs120dv.core;

import java.awt.*;

public interface Drawable {
    void draw(Graphics plot);

    // Every chart type should include its own implementation to
    // draw itself using Graphics class from java.awt.*
    // Then, JPlotter calls the draw method, where passes
    // its own frame as an argument, so we get the chart
    // plotted on a JPlotter class
}
