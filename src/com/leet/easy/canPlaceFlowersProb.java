package com.leet.easy;

public class canPlaceFlowersProb {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i ++) {
            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                count++;
                if(count == n)
                    return true;
            }
            else if(i+1 == flowerbed.length && flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                count++;
                if(count == n)
                    return true;
            }
            else {
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    count++;
                    if(count == n)
                        return true;
                }
            }
        }
        return false;
    }
	
	public static void main(String[] args){
		canPlaceFlowersProb obj = new canPlaceFlowersProb();
		int[] flowerbed = new int[] {1,0,0,0,1};
		System.out.println(obj.canPlaceFlowers(flowerbed, 2));
	}

}
