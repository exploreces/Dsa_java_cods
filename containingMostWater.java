public class containingMostWater {
// 2 pointers

    /*
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two
     *  endpoints of the ith line are (i, 0) and (i, height[i]).
        Find two lines that together with the x-axis form a container, such that the container contains the most water.
     */
    
        public int maxArea(int[] height) {
          int l =0;
          int r = height.length-1;
          int maxarea =0;
          while(l<r){
            int currentarea = Math.min(height[l],height[r])* (r-l);
            maxarea = Math.max(maxarea,currentarea);
          
    
          if(height[l]<height[r]){
           l++;
          }
          else{
            r--;
          }
        }
          return maxarea;
         
    
         
        }
    }
    

