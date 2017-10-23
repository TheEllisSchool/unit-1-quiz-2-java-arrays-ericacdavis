package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {16,58,81,14,7,2,27,1,8,499};
		int sorted= nums.length;
		while(sorted> 0) {	
			int max = nums[0];
			int maxIndex = 0;
			
				
		//find the highest number and move it to the end
			for (int i=0; i < sorted; i++) {
			if(nums[i]> max){
			max= nums[i];
			maxIndex = i;
			}
		}
		int hold = nums[sorted-1];
		nums[sorted-1]= max;
		nums[maxIndex]= hold;
				
		sorted--;
		}
		System.out.println("Here is your list sorted from least to greatest: ");
		for (int i=0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
		int range = nums[nums.length -1] - nums[0];
		System.out.println("The range of your numbers is: " + range);
	}
}
