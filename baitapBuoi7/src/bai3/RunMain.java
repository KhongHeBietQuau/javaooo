package bai3;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<News> a = new ArrayList<>();
        int choose;
        while(true)
        {
            System.out.println("chon 1 so : ");
            System.out.println("1: Insert news");
            System.out.println("2: View ");
            System.out.println("3: Everage rate");
            System.out.println("4: Exit ");
            choose  = sc.nextInt();
            if(choose == 1)
            {
                News x = new News();
                System.out.println("ID : ");
                x.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Input your tille : ");
                x.setTitle(sc.nextLine());
                System.out.println("Input publishDate: ");
                x.setPublishDate(sc.nextLine());
                System.out.println("Input author: ");
                x.setAuthor(sc.nextLine());
                System.out.println("Input Content: ");
                x.setContent(sc.nextLine());
                int[] y = new int[3];
                System.out.println("tham so thu nhat : ");
                y[0] = sc.nextInt();
                System.out.println("tham so thu 2 : ");
                y[1] = sc.nextInt();
                System.out.println("tham so thu 3 : ");
                y[2] = sc.nextInt();
                x.setRatelist(y);
                a.add(x);
            }
            else if(choose == 2)
            {
                for(int i=0;i<a.size();i++)
                {
                    System.out.println("News thu " + i+ " : ");
                    a.get(i).Display();
                }
            }
            else if(choose == 3)
            {
                for(int i=0;i<a.size();i++)
                {
                    System.out.println("NEWS thu " + i  );
                    a.get(i).Calculate();
                    a.get(i).Display();
                }
            }
            else if(choose== 4) break;
        }
    }
}
