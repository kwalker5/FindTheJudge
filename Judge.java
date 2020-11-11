//Kate Walker
public class Judge {
    public static int findJudge(int N, int[][] trust) {//function to find the judge
        int[] townTrust = new int[N];//array to store who trusts in the town
        int[] townTrusted = new int[N];//array to store who is trusted

        for(int i = 0; i < trust.length; i++){//loop through the given array

            int a = trust[i][0];//set an int a to the array at i and 0
            int b = trust[i][1];//set an int b to the array at i and 1

            townTrust[a - 1]++;//set the trust array at a-1 and increment
            townTrusted[b - 1]++;//set the trust array at b-1 and increment

        }
        for(int i = 0; i < N; i++){//loop through from 0 to N
            if(townTrust[i] == 0 && townTrusted[i] == N - 1)//if the trust at i equals 0 and the trusted at i equals N-1
                return i + 1;//return i +1
        }
        return -1;//if no judge return -1
    }

    public static void main(String[] args) {
        int trust[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};//set the trust array
        int n = findJudge(4,trust);//set int n to the result of findJudge with n and the trust array
        int trust2[][] = {{1, 3}, {2, 3}, {3, 1}};//set second array
        int n2= findJudge(3,trust2);//set int n2 to the result of findJudge with n2 and the trust2 array
        //print results
        if(n== -1){
            System.out.println(n + ", there is no judge in first town");
        }
        else{
            System.out.println("The judge in the first town is: " + n);
        }
        if(n2== -1){
            System.out.println(n2 + ", there is no judge in the second town");
        }
        else{
            System.out.println("The judge in the second town is: " + n2);
        }


    }
}
