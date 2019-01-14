package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computerScore = getUserInput();
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double javaScore = getUserInput();
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double mathScore = getUserInput();
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double operaScore = getUserInput();
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badmintonScore = getUserInput();
        
        System.out.println( "==============================" );
        
        double total = computerScore + javaScore + mathScore + operaScore + badmintonScore;
        double ave = total / 5; 
        
        System.out.println( "������ " + ave + "�� �Դϴ�." );
        
        if(ave>=3.7 &&
           computerScore >= 2.5 && 
           javaScore >= 2.5 &&
           mathScore >= 2.5 &&
           operaScore >= 2.5 &&
           badmintonScore >= 2.5) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�.");
        	
        }
        
    }
    
    public static double getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Double.parseDouble( inputString );
    }
}
