package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Highlighter;

public class CreamHighlighter implements Highlighter {
    public CreamHighlighter() {
        System.out.println("CreamHighlighter created");
    }

    @Override
    public void shimmer() {
        System.out.println("Shimmering with CreamHighlighter");
    }
}