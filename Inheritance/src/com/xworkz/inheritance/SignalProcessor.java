package com.xworkz.inheritance;

public class SignalProcessor {
    public void process(Signal signal) {
        signal.transmit();
        signal.receive();
        signal.encode();
        signal.decode();
        signal.analyze();

        if (signal instanceof WirelessSignal) {
            WirelessSignal ws = (WirelessSignal) signal;
            ws.boost();
        }
    }
}
