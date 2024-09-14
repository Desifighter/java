package parivar;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.nio.file.WatchService;
// import java.util.*;

// class TestClass {
//     public static void main(String args[]) throws Exception {
//         // BufferedReader
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
//         int testcase = Integer.parseInt(br.readLine());
//         while (testcase-- > 0) {
//             int row = Integer.parseInt(br.readLine()), col = Integer.parseInt(br.readLine()), count = 0;
//             String[] bar = new String[row];
//             int gun[] = new int[row];
//             for (int i = 0; i < row; i++) {
//                 bar[i] = br.readLine();
//                 for (int j = 0; j < col; j++) {
//                     if (bar[i].charAt(j) == '#') {
//                         count++;
//                     }
//                 }
//                 gun[i] = count;
//                 count=0;
//             }
//             int temp = gun[0];
//             for (int i = 1; i < row; i++) {
//                 if (temp < gun[i]) {
//                     temp = gun[i];
//                 }
//             }
//             System.out.println(temp);

//         }
//     }
// }
