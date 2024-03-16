/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu
 */

package Tubes.Dump;

import Tubes.View.NasabahView;
import Tubes.services.FileNasabahService;
import Tubes.services.FileNasabahServiceImpl;

import java.io.IOException;

public class MainNasabah {
    public static void main(String[] args) throws IOException {
        FileNasabahService fileNasabahService = new FileNasabahServiceImpl();
        NasabahView nasabahView = new NasabahView(fileNasabahService);

        nasabahView.NasabahView();
    }
}
