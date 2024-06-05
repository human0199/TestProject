public class Array {
    public static void main(String[] args) {
        int num =9;

        int[] nums = new int[5];
        nums[0] =9;
        nums[3]=10;
        nums[4] = nums[0] +nums[3];
        System.out.println(nums[4]);
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        int[] numbers ={9,6,3,2,5,4,9};
        System.out.println(numbers[6]);
        System.out.println(numbers.length);
        for(int i =0; i<numbers.length;i++);
        System.out.println(numbers[4]);
    }
}
