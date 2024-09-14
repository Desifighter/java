package parivar;
public class max_min_in_array {
    public static void main(String[] args) {
        int[] data={631,144134,1434,4143,1313};
        int min=data[0],max=data[0];
        for (int index = 0; index < data.length; index++) {
            
            if (min>data[index]) {
                min=data[index];
            }
            if (max<data[index]) {
                max=data[index];
            }
        }
        System.out.println("MIN = "+min+"MAX = "+max);

    }
}
