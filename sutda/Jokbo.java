package sutda;

public class Jokbo {
	
	public void GetJokboscore(Player P) {
		
		int A = P.hand[0].month;
		int B = P.hand[1].month;
		boolean a = P.hand[0].Light;
		boolean b = P.hand[0].Light;
	
		
		if((A==3 && B==8 && a==true && b==true) || (A==8 && B==3 && a==true && b==true))
			P.Jokboscore = 35; //38��
		
		else if((A==1 && B==8 && a==true && b==true) || (A==8 && B==1 && a==true && b==true))
			P.Jokboscore = 31; //18��
		else if((A==1 && B==3 && a==true && b==true) || (A==3 && B==1 && a==true && b==true))
			P.Jokboscore = 30;   //13��
		
		else if((A==4 && B==9) || (A==9 && B==4))
			P.Jokboscore = 29; //49����
		else if((A==3 && B==7 && a== true) || (A==7 && B==3 && b== true))
			P.Jokboscore = 26; // ������
		else if(A==B)
			P.Jokboscore = A + 15; //��
		else if((A==1 && B==2) || (A==2 && B==1))
			P.Jokboscore = 14; //�˸�
		else if((A==1 && B==4) || (A==4 && B==1))
			P.Jokboscore = 14; //����
		else if((A==1 && B==9) || (A==9 && B==1))
			P.Jokboscore = 13; //����
		else if((A==1 && B==10) || (A==10 && B==1))
			P.Jokboscore = 12; //���
		else if((A==4 && B==10) || (A==10 && B==4))
			P.Jokboscore = 11; //���
		else if((A==4 && B==6) || (A==6 && B==4))
			P.Jokboscore = 10;	//����
		else 
			P.Jokboscore = (A+B)%10; //��
		
		}
	
}
// ������ �´� �̸��� ��°����ϰ� �Ұ�