package buoi4;


public class RunMain {
    public static void main(String[] args)
    {
        sinhVIen [] arr = new sinhVIen[2];
        for(int i=0;i<arr.length;i++){
            arr[i] = new sinhVIen();
            arr[i].InputInfor();
        }
        for(sinhVIen SinhVIen : arr){
            SinhVIen.HienThi();
        }
    }
}
