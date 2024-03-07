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
        // Hell knows how we're going to implement this
        // Tho we have a 700 pages book that talks about
        // implementing it,
        // Grammar of Graphics, we'll gonna also mention
        // it somewhere in README.md
        // Does anyone of TA's know how to configure
        // publishing to Maven Central and why did
        // they make it so complicated aaaaaaaaaaaa
    }
}
