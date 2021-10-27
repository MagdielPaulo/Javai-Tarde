package alarme;

import java.util.Enumeration;
import java.util.Vector;

class SensorSystem {
    private Vector listeners = new Vector();

    public void register(AlarmListener alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soundTheAlarm() {
        for (Enumeration<AlarmListener> e = listeners.elements(); e.hasMoreElements();) {
            ((AlarmListener) e.nextElement()).alarm();
        }
    }
}
