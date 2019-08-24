class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int water;
        while( ptr2 > ptr1 ){
            water = Math.max(maxWater,(ptr2-ptr1)*Math.min(height[ptr1],height[ptr2]));
            if( water > maxWater ){
                maxWater = water;
            }
            if( height[ptr1] > height[ptr2] ){
                ptr2--;
            }
            else {
                ptr1++;
            }
        }
        return maxWater;
    }

    public int maxArea1(int[] height) {
        int maxWater = 0;
        int water;
        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                water = (j-i)*Math.min(height[i],height[j]);
                if( water > maxWater ){
                    maxWater = water;
                }
            }
        }
        return maxWater;
    }
    
    
}