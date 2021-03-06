package com.company;

public class LuckySkyScraper {
    /*
    static public void floorList(int totalRealFloors){
        //loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloor " + realFloor + " fakeFloor " + fakeFloor);
            //add 1 to fakeFLoor, continue adding 1 as long as fakeFloor ends with 4 or 13
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }

     */
    static public int toRealFloor(int fakeFloorGoal){
        //loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if (fakeFloorGoal == fakeFloor) {
                return realFloor; //ends the loop and the method
            }
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; //couldnt find real floor number
    }

    static public int toFakeFloor(int realFloorGoal){
        //loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor < realFloorGoal; realFloor++){

            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return fakeFloor; //ends the loop and the method
    }
}
