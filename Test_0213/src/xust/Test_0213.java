package xust;

import java.util.Arrays;

/*
551. ѧ�����ڼ�¼ I
����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
'A' : Absent��ȱ��
'L' : Late���ٵ�
'P' : Present������
���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�

ʾ�� 1:
����: "PPALLP"
���: True

ʾ�� 2:
����: "PPALLL"
���: False
 */
/*
 * ������
 * �����ַ����������ַ�����'A'�ĵĸ���������'L'�ĸ�����������������'A'�ĵĸ�������1������'L'�ĸ�������2���򷵻�false,������ϣ�˵�����㽱�͵�����������true��
 */
//public class Test_0213 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String s = "PPALLL";
//		System.out.println(So.checkRecord(s));
//	}
//}
//class Solution {
//    public boolean checkRecord(String s) {
//    	int Acount = 0;
//    	int Continuity_Lcount = 0;
//        for(int i=0; i<s.length(); i++){
//        	if(s.charAt(i) == 'A'){
//        		Acount++;
//        		if(Acount > 1)
//                	return false;
//        	    Continuity_Lcount = 0;
//        	}
//        	else if(s.charAt(i) == 'P')
//        		Continuity_Lcount = 0;
//        	else{
//        		Continuity_Lcount++;
//        		if(Continuity_Lcount > 2)
//        			return false;
//        	}        		
//        }
//        return true;
//    }
//}
/*
557. ��ת�ַ����еĵ��� III
 ����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��

ʾ�� 1:

����: "Let's take LeetCode contest"
���: "s'teL ekat edoCteeL tsetnoc" 
ע�⣺���ַ����У�ÿ�������ɵ����ո�ָ��������ַ����в������κζ���Ŀո�
 */
/*
 * ������
 * �����ַ�����l��r�ֱ��ǵ��ʵĵ�����ĸ�͵��ʽ�������Ŀո񣬳�ʼl=0,r=0,rѰ�������ո���ֹͣ��l��r�ҵ�λ�ú󣬾Ϳ�����ת��������ˣ���ת��ϣ�l=r+1,r=r+1,ʹl��r��ָ������һ�����ʵ�����ĸ,�ظ����ϲ���ֱ������������
 * ��Ҫע����������ַ�������ֱ���޸��ַ�������������Ҫ�Ȱ��ַ�����Ϊ�ַ�������ִ�У�ִ����Ϻ���תΪ�ַ�����
 */
//public class Test_0213 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String s = "Let's take LeetCode contest";
//		System.out.println(So.reverseWords(s));
//	}
//}
//class Solution {
//    public String reverseWords(String s) {
//    	char[] S = s.toCharArray();
//        int l = 0;
//        int r = 0;
//        //�ҵ��ո��λ��
//        while(r < S.length){
//        	while(r < S.length && S[r] != ' '){
//        		r++;
//        	}
//        	int p = r;//��¼�Ҷ�
//        	//��ת����
//        	while(l < r-1){
//        		char temp = S[l];
//        		S[l] = S[r-1];
//        		S[r-1] = temp;
//        		l++;
//        		r--;
//        	}
//        	//l��r��ǵ���һ�����ʵ�����ĸ
//        	l=p+1;
//        	r=p+1;
//        }
//        return new String(S);
//    }
//}
/*
561. ������ I
��������Ϊ 2n ������, ��������ǽ���Щ���ֳ� n ��, ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô�1 �� n �� min(ai, bi) �ܺ����

ʾ�� 1:
����: [1,4,3,2]
���: 4
����: n ���� 2, ����ܺ�Ϊ 4 = min(1, 2) + min(3, 4).
��ʾ:
n ��������,��Χ�� [1, 10000].
�����е�Ԫ�ط�Χ�� [-10000, 10000].
 */
/*
 * ������
 * ��������ܺͣ����Ҫ�ڸ����������о������½ϴ����������������������ĸ�����϶��������£�����С�����������ĸ�����϶������£�����������м����У�
 * ���ǵ�ȻҪ���µڶ�����������Ϊ����������ڶ������������ڶ�С������С������
 * �Դ����ƣ�����ֻ��Ҫ���������������򣬰�˳��������ϣ��ͻ�õ�����ܺ͡�
 */
public class Test_0213 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] nums = {1,4,3,2};
		System.out.println(So.arrayPairSum(nums));
	}
}
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for(int i=0; i<nums.length; i+=2){
        	ret += nums[i];
        }
        return ret;
    }
}