// import java.util.ArrayList;
// import java.util.Arrays;

// import javax.lang.model.element.ExecutableElement;
// import javax.print.StreamPrintService;

// public class Lesson2Exercise {
//     public static void main(String[] args) {
//         double targetSpeed = 0.5;
//         rampUp(targetSpeed);
//         clamp(-2.0, -1.0, 1.0);
//         ArrayList<Integer> intList = new ArrayList<Integer>();
//         for (int i=0;i<5;i++){
//             intList.add(2*i);
//         }
//         int ab=0;
//         for (int i=0;i<5;i++){
//             ab+=intList.get(i);
//         }
//         System.out.println(ab/5);
        
//     }
//     public static void rampUp(double ababla) {
//         double i = 0.0;
//         double plusSpeed = 0.1;
//         while(true) {
//             i+=plusSpeed;
//             System.out.printf("%.1f%n",i);
//             if(i>=ababla){
//                 break;
//             }
//         }   
//     }
//     public static void clamp(double value, double min, double max) {
//         if(value >= max){
//             System.out.println(max);
//         }
//         else if(value <= min){
//             System.out.println(min);
//         }
//         else{
//             System.out.println(value);
//         }
        
//     }
// }
