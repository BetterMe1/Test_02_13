package xust;

import java.util.Arrays;

/*
551. 学生出勤记录 I
给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
'A' : Absent，缺勤
'L' : Late，迟到
'P' : Present，到场
如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
你需要根据这个学生的出勤记录判断他是否会被奖赏。

示例 1:
输入: "PPALLP"
输出: True

示例 2:
输入: "PPALLL"
输出: False
 */
/*
 * 分析：
 * 遍历字符串，计算字符串中'A'的的个数和连续'L'的个数，遍历过程中若'A'的的个数大于1或连续'L'的个数大于2，则返回false,遍历完毕，说明满足奖赏的条件，返回true。
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
557. 反转字符串中的单词 III
 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
/*
 * 分析：
 * 遍历字符串，l、r分别标记单词的的首字母和单词结束后面的空格，初始l=0,r=0,r寻找遇到空格则停止，l、r找到位置后，就可以逆转这个单词了，逆转完毕，l=r+1,r=r+1,使l、r又指向了下一个单词的首字母,重复如上操作直到遍历结束。
 * 需要注意的是由于字符串不能直接修改字符，所以我们需要先把字符串改为字符数组再执行，执行完毕后再转为字符串。
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
//        //找到空格的位置
//        while(r < S.length){
//        	while(r < S.length && S[r] != ' '){
//        		r++;
//        	}
//        	int p = r;//记录右端
//        	//逆转单词
//        	while(l < r-1){
//        		char temp = S[l];
//        		S[l] = S[r-1];
//        		S[r-1] = temp;
//        		l++;
//        		r--;
//        	}
//        	//l、r标记到下一个单词的首字母
//        	l=p+1;
//        	r=p+1;
//        }
//        return new String(S);
//    }
//}
/*
561. 数组拆分 I
给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

示例 1:
输入: [1,4,3,2]
输出: 4
解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
提示:
n 是正整数,范围在 [1, 10000].
数组中的元素范围在 [-10000, 10000].
 */
/*
 * 分析：
 * 计算最大总和，因此要在给出的数据中尽量留下较大的数，由于最大数不管与哪个数组合都不会留下，而最小的数不管与哪个数组合都会留下，因此在两个中间数中，
 * 我们当然要留下第二大的数，组合为（最大数，第二大数），（第二小数，最小数）。
 * 以此类推，我们只需要将给出的数据排序，按顺序两两组合，就会得到最大总和。
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