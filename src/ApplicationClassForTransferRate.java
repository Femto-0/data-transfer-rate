public class ApplicationClassForTransferRate {
    public static void main(String[] args) {
        TransferRate tr = new TransferRate(150, 5);
       System.out.print("modem best transfer in : "); tr.timeInDayHourMinSecFormat(tr.modemBestTransferRate(12000));
       System.out.println();
       System.out.print("modem worst case in: "); tr.timeInDayHourMinSecFormat(tr.modemWorstTransferRate(3500));
        System.out.println();
        System.out.print("v90 in: "); tr.timeInDayHourMinSecFormat(tr.v90(52));
        System.out.println();
        System.out.print("t1 line in: "); tr.timeInDayHourMinSecFormat(tr.t1Line(1.544));
        System.out.println();
        System.out.print("OC 12 fiber line in: "); tr.timeInDayHourMinSecFormat(tr.ocTwelveFiberLine(622.06));
        System.out.println();
        System.out.print("ethernet in: "); tr.timeInDayHourMinSecFormat(tr.ethernet(1000));
        System.out.println();
        System.out.print("802.11N in: ");tr.timeInDayHourMinSecFormat(tr.eightOtwoDotElevenN(180));
        System.out.println();
        System.out.print("3G in: "); tr.timeInDayHourMinSecFormat(tr.threeG(2));
        System.out.println();
        System.out.print("4G in: "); tr.timeInDayHourMinSecFormat(tr.fourG(20));
        System.out.println();
        System.out.print("new Horizon in: "); tr.timeInDayHourMinSecFormat(tr.newHorizon(1000));
        System.out.println("-------------------------------------------------------------------------");


        System.out.println("Total data: " + tr.totalDataAfterOverhead() + " bits");
        System.out.println();
        System.out.println("fedEx:" + tr.fedEx(19) + "bits/second");
        System.out.println();
        System.out.println("Best modem transfer in " + tr.modemBestTransferRate(12000) + " seconds");
        System.out.println();
        System.out.println("Worst modem transfer in " + tr.modemWorstTransferRate(3500) + " seconds");
        System.out.println();
        System.out.println("v90 in: " + tr.v90(52) + " seconds");
        System.out.println();
        System.out.println("t1 line in: " + tr.t1Line(1.544) + " seconds");
        System.out.println();
        System.out.println("oc 12 fiber line in: " + tr.ocTwelveFiberLine(622.06) + " seconds");
        System.out.println();
        System.out.println("Ethernet in: " + tr.ethernet(1000) + " seconds");
        System.out.println();
        System.out.println("8202.11N in: " + tr.eightOtwoDotElevenN(180) + " seconds");
        System.out.println();
        System.out.println("3G in: " + tr.threeG(2) + " seconds");
        System.out.println();
        System.out.println("4G in: " + tr.fourG(20) + " seconds");
        System.out.println();
        System.out.println("New horizon in: " + tr.newHorizon(1000) + " seconds");



    }
}
