package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(4,18,19));
        System.out.println(canPack(0,21,20));
        System.out.println(canPack(5,0,20));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        int i = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else if (i <= goal){
            for (i = 0; i <= bigCount; i++){
                if ((i * 5) <= goal){
                    int bigBag = i * 5;
                    if (bigBag + smallCount >= goal){
                        return true;
                    }
                }
            }
        }
        return false;
    }


//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        int i = 0;
//        if (bigCount < 0 || smallCount < 0 || goal < 0){
//            return false;
//        }else if (i <= goal){
//            for (i = 0; i <= bigCount; i++){
//                if ((i * 5) <= goal){
//                    int bigBag = i * 5;
//                    int sum = bigBag + smallCount;
//                    if (sum >= goal){ //if the bigBag + smallCount is greater than the goal then you know that there are small bags to fit the goal
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}
