package com.slateblua.cs120dv;

import com.slateblua.cs120dv.core.Drawable;
import com.slateblua.cs120dv.core.Exportable;

import javax.swing.*;

public class JPlotter extends JFrame implements Exportable {

    // Most probably the superclass should be changed to JComponent or JPanel
    // We will see

    public static final int FRAME_WIDTH = 300;
    public static final int FRAME_HEIGHT = 300;

    public JPlotter(Drawable drawable) {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.pack();
        super.setVisible(true);
        // At the point it just shows a blank screen
    }

    public void plot() {

    }

    @Override
    public void export() {

    }
}
