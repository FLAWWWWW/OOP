package practice_02;

public class Problem3 {
    public static void main(String[] args){
        Time t = new Time(23, 5, 6);

        System.out.print(t.toUniversal() + "\n");
        System.out.print(t.toStandart() + "\n");

        Time t2 = new Time(4, 24, 33);

        t.add(t2);

        System.out.print(t.toUniversal() + "\n");
        System.out.print(t.toStandart() + "\n");
    }
}

class Time{
    int hour;
    int minute;
    int second;

    Time(int h, int m, int s){
        if((h <= 24 && m < 60 && s < 60) && (h >= 0 && m >= 0 && s >= 0)){
            hour = h;
            minute = m;
            second = s;
        }
    }

    String toUniversal(){
        String result = "";
        // int uni_hour = hour + 12;

        // if(hour >= 12){
        //     result += hour + ":" + minute + ":" + second;
        // }
        // if(uni_hour <= 24){
        //     //uni_hour += hour + 12;
        //     if(uni_hour == 24) uni_hour = 0;
            
        //     result += uni_hour + ":" + minute + ":" + second;
        // }

        result += hour + ":" + minute + ":" + second;

        return result;
    }

    String toStandart(){
        String result = "";
        if(hour >= 12){
            int stan_hour = hour - 12;

            result += stan_hour + ":" + minute + ":" + second + " PM";
        }
        else{
            result += hour + ":" + minute + ":" + second + " AM";
        }
        return result;
    }

    void add(Time t){
        if(this.hour + t.hour > 24) this.hour += t.hour - 24;
        else this.hour += t.hour;

        if(this.minute + t.minute >= 60) {
            this.minute += t.minute - 60;
            this.hour++;
        }
        else this.minute += t.minute;

        if(this.second + t.second >= 60) {
            this.second += t.second - 60;
            this.minute++;
        }
        else this.second += t.second;
    }
}