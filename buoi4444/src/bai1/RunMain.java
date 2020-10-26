package bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong dieu hoa ");
        n = sc.nextInt();
        ArrayList<dieuHoa> dh = new ArrayList<>();
        for(int i=0;i<n;i++) {
            System.out.println("\t\t\t\tNHAP THONG TIN MAT HANG THU " + (i+1)) ;
            dieuHoa x = new dieuHoa();
            x.nhap();
            dh.add(x);
        }
        ArrayList<dieuHoa> gia = new ArrayList<>();
        String s = "Electrolux";
        int check = 0;
        for(int i=0;i<dh.size();i++)
            if(dh.get(i).getTenHangSanXuat().equals(s))
        {
            gia.add(dh.get(i));
            check =1;

        }
        if(check == 1)
        {
        float maxn = gia.get(0).getGiaBan();
            for(int i=1;i<gia.size();i++)
                if(maxn <gia.get(i).getGiaBan())
                {
                    maxn = gia.get(i).getGiaBan();
                }
            System.out.println("nhung mat hang Electrolux co gia thap nhat la :");
            for(int i=0;i<gia.size();i++)
                if(maxn == gia.get(i).getGiaBan())
                    System.out.println(gia.get(i));
        }
        else
        {
            System.out.println("\t\t\tKHONG CO MAT HANG Electrolux ");
        }
    }
}
