public class TransferRate {

    private double totalData;
    private double overHeadValue;


    TransferRate(double totalData, double overHeadValue) {
        this.overHeadValue = overHeadValue;
        this.totalData = totalData;
    }

    public double fromBytesToBits(double bytes) {
        return bytes * 8;
    }

    public double fromKiloBytesToBytes(double kiloBytes) {
        return kiloBytes * 1024;

    }
    public double totalDataAfterOverhead() {  //this method is used to take total value of data to be transferred and adds the overhead value to it.
        double x= totalData + ((overHeadValue / 100) * totalData);
        return fromGigaBytesToBytes(fromBytesToBits(x));
    }
public double kbsToBits(double kbs){
        return  kbs*1000;
}
public double mbsToBits(double mbs){
        return mbs*1000000;
}
    public double fromMegaBytesToBytes(double megaBytes) {
        return megaBytes * 1048576;
    }

    public double fromGigaBytesToBytes(double gigaBytes) {
        return gigaBytes * 1073741824;
    }


    public double fedEx(double hours) {
        return fromBytesToBits(fromGigaBytesToBytes(totalData)) / (hours * 60 * 60);
    }

    public double modemBestTransferRate(double bestTransferRate) { //transfer rate of modem is given in bps
        return totalDataAfterOverhead() / bestTransferRate;
    }

    public double modemWorstTransferRate(double worstTransferRate) {  //transfer rate of modem is given in bps
        return totalDataAfterOverhead() / worstTransferRate;
    }

    public double v90(double v90TransferRate) { //transfer rate of v90 is given in kbs
        return totalDataAfterOverhead() / kbsToBits(v90TransferRate);
    }

    public double t1Line(double t1LineTransferRate) { //transfer rate of t1 line is given in mbps
        return totalDataAfterOverhead() / mbsToBits(t1LineTransferRate);
    }

    public double ocTwelveFiberLine(double fiberLineRate) {//transfer rate of fiber line is given in mbps
        return totalDataAfterOverhead() / mbsToBits(fiberLineRate);
    }

    public double ethernet(double ethernetRate) {//transfer rate of ethernet is given in mbps
        return totalDataAfterOverhead() / mbsToBits(ethernetRate);
    }

    public double eightOtwoDotElevenN(double eightOtwoDotElevenNRate) {//transfer rate of eightOtwoDotElevenNRate is given in mbps
        return totalDataAfterOverhead() / mbsToBits(eightOtwoDotElevenNRate);
    }

    public double threeG(double threeGRate) {//transfer rate of threeGRate is given in mbps
        return totalDataAfterOverhead() / fromBytesToBits(fromMegaBytesToBytes(threeGRate));
    }

    public double fourG(double fourGRate) {//transfer rate of fourGRate is given in mbps
        return totalDataAfterOverhead() / fromBytesToBits(fromMegaBytesToBytes(fourGRate));
    }

    public double newHorizon(double newHorizonRate) { //transfer rate for new horizon probe is 1000bps and it takes 4 hours for the signals to reach to Earth
        return ((totalDataAfterOverhead() / newHorizonRate) + (4 * 60 * 60));
    }

    public void timeInDayHourMinSecFormat(double seconds) {
        final int SECONDS_IN_DAY = 86400;
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int second;

        if (seconds >= SECONDS_IN_DAY) {
            days = (int) seconds / SECONDS_IN_DAY;
            int firstReminder = (int) seconds % SECONDS_IN_DAY;

            if (firstReminder >= SECONDS_IN_HOUR) {
                hours = firstReminder / SECONDS_IN_HOUR;
                int secondReminder = firstReminder % SECONDS_IN_HOUR;

                if (secondReminder >= SECONDS_IN_MINUTE) {
                    minutes = secondReminder / SECONDS_IN_MINUTE;
                    second = secondReminder % SECONDS_IN_MINUTE;
                } else {
                    second = secondReminder;
                }
            } else if (firstReminder >= SECONDS_IN_MINUTE) {
                minutes = firstReminder / SECONDS_IN_MINUTE;
                second = firstReminder % SECONDS_IN_MINUTE;
            } else {
                second = firstReminder;
            }
        } else if (seconds < SECONDS_IN_DAY && seconds >= SECONDS_IN_HOUR) {
            hours = (int) seconds / SECONDS_IN_HOUR;
            int secondReminder = (int) seconds % SECONDS_IN_HOUR;

            if (secondReminder >= SECONDS_IN_MINUTE) {
                minutes = secondReminder / SECONDS_IN_MINUTE;
                second = secondReminder % SECONDS_IN_MINUTE;
            } else {
                second = secondReminder;
            }
        } else if (seconds < SECONDS_IN_HOUR && seconds >= SECONDS_IN_MINUTE) {
            minutes = (int) seconds / SECONDS_IN_MINUTE;
            second = (int) seconds % SECONDS_IN_MINUTE;
        } else {
            second = (int) seconds;
        }

        System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + second + " seconds");
    }



}
