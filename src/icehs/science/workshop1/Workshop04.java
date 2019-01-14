package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americanoPrice = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int cafelattePrice = getUserInput();
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagelPrice = getUserInput();
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheesePrice = getUserInput();
        
        System.out.println("�Ƹ޸�ī�� : " + Price(2000, americanoPrice));
        System.out.println("ī��� : " + Price(3000, cafelattePrice));
        System.out.println("���̱� : " + Price(1500, bagelPrice));
        System.out.println("ī��� : " + Price(500, creamcheesePrice));
        
        System.out.println("=======================");
        int totalPrice = Price(2000, americanoPrice) +
        			Price(3000, cafelattePrice) + 
        			Price(1500, bagelPrice) + 
        			Price(500, creamcheesePrice);
        int point = 0;
        if (totalPrice >= 30000) {
        	point = totalPrice * 2 / 100;
        }else if (totalPrice >= 12000) {
        	point = totalPrice / 100;
        }
        System.out.println("�� ���� �ݾ� : " + totalPrice);
        System.out.println("����Ʈ ���� : " + point);
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
    
    static int Price(int price, int cnt) {
    	return price * cnt;
    }
}
