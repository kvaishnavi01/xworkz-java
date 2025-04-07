package com.xworkz.inheritance;

public class LibraryManager {
    public void manage(Library library) {
        library.open();
        library.issueBook();
        library.returnBook();
        library.readBook();
        library.close();

        if (library instanceof VirtualLibrary) {
            VirtualLibrary vlib = (VirtualLibrary) library;
            vlib.downloadEbook();
        }
    }
}
