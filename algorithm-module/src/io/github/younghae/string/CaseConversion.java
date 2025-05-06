package io.github.younghae.string;
import java.util.*;

public class CaseConversion {

//    대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


        public String solution(String str){
            String answer="";
            for(char x : str.toCharArray()){
                if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
                else answer+=Character.toLowerCase(x);

            }
            return answer;
        }

//     아스키 코드
//    public String solution(String str){
//        String answer="";
//        for(char x : str.toCharArray()){
//            if(x>=97 && x<=122) answer+=(char)(x-32);
//            else answer+=(char)(x+32);
//        }
//        return answer;
//    }


    public static void main(String[] args){
            CaseConversion T = new CaseConversion();
            Scanner kb = new Scanner(System.in);
            String str=kb.next();
            System.out.print(T.solution(str));
        }
    }
