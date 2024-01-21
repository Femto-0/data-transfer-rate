public class ApplicationClassForTransferRate {
    public static void main(String[] args) {
        TransferRate tr = new TransferRate(150, 5);
        tr.timeInDayHourMinSecFormat(tr.modemBestTransferRate(12000));
        tr.timeInDayHourMinSecFormat(tr.modemWorstTransferRate(3500));
        tr.timeInDayHourMinSecFormat(tr.v90(52));
        tr.timeInDayHourMinSecFormat(tr.t1Line(1.544));
        tr.timeInDayHourMinSecFormat(tr.fiberLine(622.06));
        tr.timeInDayHourMinSecFormat(tr.ethernet(1000));
        tr.timeInDayHourMinSecFormat(tr.eightOtwoDotElevenN(180));
        tr.timeInDayHourMinSecFormat(tr.threeG(2));
        tr.timeInDayHourMinSecFormat(tr.fourG(20));
        tr.timeInDayHourMinSecFormat(tr.newHorizon(1000));


        System.out.println("Total data: " + tr.totalDataAfterOverhead() + " bits");
        System.out.println("fedEx:" + tr.fedEx(19) + "bits/second");
        System.out.println("Best modem transfer in " + tr.modemBestTransferRate(12000) + " seconds");
        System.out.println("Worst modem transfer in " + tr.modemWorstTransferRate(3500) + " seconds");
        System.out.println("v90 in: " + tr.v90(52) + " seconds");
        System.out.println("t1 line in: " + tr.t1Line(1.544) + " seconds");
        System.out.println("fiber line in: " + tr.fiberLine(622.06) + " seconds");
        System.out.println("Ethernet in: " + tr.ethernet(1000) + " seconds");
        System.out.println("8202.11N in: " + tr.eightOtwoDotElevenN(180) + " seconds");
        System.out.println("3G in: " + tr.threeG(2) + " seconds");
        System.out.println("4G in: " + tr.fourG(20) + " seconds");
        System.out.println("New horizon in: " + tr.newHorizon(1000) + " seconds");


    }
}
