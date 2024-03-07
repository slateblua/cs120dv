package com.slateblua.cs120dv.core;

import com.slateblua.cs120dv.Drawable;

import javax.swing.*;

public class JPlotter extends JFrame {

    public static final int FRAME_WIDTH = 300;
    public static final int FRAME_HEIGHT = 300;

    public JPlotter(Drawable drawable) {
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        // At the point it just shows a blank screen
    }

    public void plot() {

    }
}
