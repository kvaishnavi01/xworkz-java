package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Highlighter;

public class MakeupCounter {
    private Highlighter highlighter;

    public MakeupCounter(Highlighter highlighter) {
        System.out.println("MakeupCounter with Highlighter created");
        this.highlighter = highlighter;
    }

    public void apply() {
        System.out.println("MakeupCounter is using highlighter");
        if (highlighter != null) {
            this.highlighter.shimmer();
        }
    }
}