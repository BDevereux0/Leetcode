package org.example.binarySearch;

public class FirstBadVersion extends VersionControl{
    static int bad = 2;

    //getting the wrong output on leetcode but the correct here.
    //Questions to answer tomorrow: Why is it version >= bad
    //why do i return leftPoint and not rightPoint?
    //

    @Override
    public boolean isBadVersion(int version) {
        return version >= bad;
    }

    public int firstBadVersion(int n) {
        if (n==1){
            return 1;
        }

        int leftPoint = 1;
        int rightPoint = n;

        while (leftPoint <= rightPoint){
            int midPoint = leftPoint + (rightPoint - leftPoint)/2;
            if (isBadVersion(midPoint)){
                rightPoint = midPoint - 1;
            }else{
                leftPoint = midPoint + 1;
            }
        }

        return leftPoint;
    }



    public static void main(String[] args) {
        FirstBadVersion fbv = new FirstBadVersion();
        System.out.println(fbv.firstBadVersion(5));
    }


}
