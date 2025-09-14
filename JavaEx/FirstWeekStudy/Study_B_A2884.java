package JavaEx.FirstWeekStudy;
// 시간 계산기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study_B_A2884 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String time_str = null;
        int hour, minute = 0;
        
        while (true) {
            System.out.print("24시간제 시간 입력 : (TT:MM) ");
            time_str = br.readLine();

            if

        };









        do{
            for( ; ; ){
                
                if(time_str.length() != 5 || time_str.charAt(2) != ':'){
                    System.out.println("잘못된 입력입니다. 다시 입력해주시기 바랍니다.");
                }
                else{
                    break;
                }
            }

        StringTokenizer st = new StringTokenizer(time_str, ":");
        hour = Integer.parseInt(st.nextToken());
        minute = Integer.parseInt(st.nextToken());

        if (hour < 0 || hour > 24 || minute < 0 || minute >= 60){
            System.out.println("잘못된 입력입니다. 다시 입력해주시기 바랍니다.");
        }
        }
        while ((hour < 0 || hour > 24 || minute < 0 || minute >= 60));
        
        

        // String operator = null;
        // do{
        // System.out.print("계산할 연산자 입력 : ( + 혹은 - ) ");
        // operator = br.readLine();
        // if(!operator.equals("+") && !operator.equals("-")) {
        //     System.out.println("잘못된 입력입니다. 다시 입력해주시기 바랍니다.");
        // }
        // }while(!operator.equals("+") && !operator.equals("-"));
        // System.out.println("선택된 연산자 : " +operator);
        
        
        


        // System.out.print("계산할 24시간제 시간 입력 : (TT:MM) ");
        // String time_op = br.readLine();    
        

        
    } // main
} // class