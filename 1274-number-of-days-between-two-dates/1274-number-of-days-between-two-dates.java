class Solution {
   boolean isleap(int y){
        if((y%4==0 && y%100 !=0) || (y % 400 == 0)){
            return true;
        }
        return false;
    }
    
    int count(int d, int m, int y){
        int days = 0;
        for(int i=1; i<y; i++){
            if(isleap(i)){
                days += 366;
            }
            else{
                days += 365;
            }
        }
        
        for(int i=1; i<m; i++){
            if(i == 2){
                if(isleap(y)){
                    days += 29;
                }
                else{
                    days += 28;
                }
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11){
                days += 30;
            }
            else{
                days += 31;
            }
        }
        
        days += d;
        
        return days;
    }
    public int daysBetweenDates(String date1, String date2) {
       int year1 = Integer.parseInt(date1.substring(0, 4));
       int year2 = Integer.parseInt(date2.substring(0, 4));
       int month1 = Integer.parseInt(date1.substring(5,7));
       int month2 = Integer.parseInt(date2.substring(5,7));
       int day1 = Integer.parseInt(date1.substring(8,date1.length()));
       int day2 = Integer.parseInt(date2.substring(8,date2.length()));
       int days1 = count(day1,month1,year1);
       int days2 = count(day2,month2,year2);
       return Math.abs(days1-days2);

    }
}