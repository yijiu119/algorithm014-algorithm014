using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 三数之和
{
    class Program
    {
        public static IList<IList<int>> ThreeSum(int[] nums)
        {
            IList<IList<int>> res = new List<IList<int>>();
            
            Array.Sort(nums);
            
            for(int i=0;i<nums.Length;i++)
            {
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.Length - 1;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                while(left<right&&left<nums.Length&&right>0)
                {
                    IList<int> arr = new List<int>();
                    if (nums[left]+nums[right]==target)
                    {
                        arr.Add(nums[i]);
                        arr.Add(nums[left]);
                        arr.Add(nums[right]);
                        res.Add(arr);
                        left++;
                        right--;
                        while (left < right && nums[left - 1] == nums[left]) left++;
                        while (left < right && nums[right +1] == nums[right]) right--;
                    }
                    else if(nums[left] + nums[right]>target)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }

            }
            return res;


        }
        static void Main(string[] args)
        {
            IList<IList<int>> Three = ThreeSum(new int[] { -1, 0, 1, 2, -1, -4 });
            Console.ReadLine();
        }
    }
}
