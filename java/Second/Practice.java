
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practice extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    Practice() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEE");
        dateFormat=new SimpleDateFormat("dd MMMMM, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setOpaque(true);
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.BOLD,34));

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTimer();
    }

    public void setTimer() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Practice();
    }
}//import java.util.Scanner;
//public class Practice{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int k=sc.nextInt();
//		int a;
//		for(int i=1;i<=k;i++)
//		{
//			for(int j=i;j>=1;j--)
//			{
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
//	}
//}

//===============================================================
//L16
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Practice{
//	public static void main(String[] args) throws IOException {
//		InputStreamReader tc=new InputStreamReader(System.in);
//		BufferedReader sc=new BufferedReader(tc);
//		String name=sc.readLine();
//
//		
//		System.out.println(name);
//	}
//}

//+++++++++++++++++++++++++++++++++++++++++++++++++++
//L16
//import java.util.*;
//public class Practice{
//	public static void main(String[] args) {
//		Scanner sh=new Scanner(System.in);
//		System.out.println("enter two number for addtion ");
//		int a=sh.nextInt();
//		int b=sh.nextInt();
//		System.out.println(a+b);
//		
//	}
//}