public class Container {
    public static void main(String[] args) {
        int max=0;
        int[] nums = {3,4,1,6,8,1,8};
        for(int i=0;i<nums.length;i++)
            for(int j=i;j<nums.length;j++){
        int length=j-i;
        int width=Math.min(nums[i],nums[j]);
        int area=length*width;
        max=Math.max(max, area);
    }
    System.out.println(max);
    }
}
