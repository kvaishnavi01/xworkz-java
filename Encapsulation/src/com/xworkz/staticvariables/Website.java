package com.xworkz.staticvariables;

public class Website {
        private static int activeUsers = 0;

        public Website() {
            activeUsers++;
        }

        public void logout() {
            activeUsers--;
        }

        public static int getActiveUsers() {
            return activeUsers;
        }
}
