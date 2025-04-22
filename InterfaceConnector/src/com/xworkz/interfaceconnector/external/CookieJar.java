package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.Cookie;

public class CookieJar {
    private Cookie cookie;

    public CookieJar(Cookie cookie) {
        System.out.println("CookieJar with Cookie created");
        this.cookie = cookie;
    }

    public void store() {
        System.out.println("CookieJar is using cookie");
        if (cookie != null) {
            this.cookie.crumble();
        }
    }
}